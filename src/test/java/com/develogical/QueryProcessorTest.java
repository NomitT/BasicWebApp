package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Timon"));
    }

    @Test
    public void testPlus() throws Exception{
        assertThat(queryProcessor.process("what is 2 plus 40"), containsString("42"));
    }

    @Test
    public void testLargest() throws Exception{
        assertThat(queryProcessor.process("largest: 20, 328, 15, 100, 10, 0, -2, 5"), containsString("328"));
    }
}

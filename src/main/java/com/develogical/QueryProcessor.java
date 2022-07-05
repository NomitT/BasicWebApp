package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("tum")) {
            return "The TUM is an excellent university in Munich, Bavaria" +
                    "\n Established in 1868, its one of the largest Universitys in Germany " +
                    "\n Way better than the LMU ;D";
        }
        else if (query.toLowerCase().contains("name")) {
            return "Timon";
        }
        return "";
    }
}

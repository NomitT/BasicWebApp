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
        else if(query.toLowerCase().contains("plus")){
            String[] splited = query.split("\\s+");
            int result = Integer.parseInt(splited[splited.length-1]) + Integer.parseInt(splited[splited.length-3]);
            return ""+result;
        }
        else if(query.toLowerCase().contains("multiplied")){
            String[] splited = query.split("\\s+");
            int result = Integer.parseInt(splited[splited.length-1]) * Integer.parseInt(splited[splited.length-3]);
            return ""+result;
        }
        else if(query.toLowerCase().contains("largest")){
            try {
                String[] split = query.split(":");
                String[] splitTwo = split[1].split(",");
                int[] numbers = new int[splitTwo.length];

//                for (int k = 0; k < splitTwo.length; k++) {
//                    if (splitTwo[k].contains("w")) numbers[k] = 0;
//                    numbers[k] = Integer.parseInt(splitTwo[k]);
//                }

                int result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (result < numbers[i]) result = numbers[i];
                }

                return "" + result;
            }
            catch(Exception e){
                return "";
            }
        }
        return "";
    }
}

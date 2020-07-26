package com.ruofei.util;

public class ETLUtil {

    public static String oriString2ETLString(String ori) {

        StringBuilder etlString = new StringBuilder();

        String[] fileds = ori.split("\t");

        if (fileds.length < 9) return null;

        fileds[3] = fileds[3].replace(" ", "");

        for (int i = 0; i < fileds.length; i++) {

            if (i < 9) {
                if (i == fileds.length - 1) {
                    etlString.append(fileds[i]);
                } else {
                    etlString.append(fileds[i] + "\t");
                }
            } else {
                if (i == fileds.length - 1) {
                    etlString.append(fileds[i]);
                } else {
                    etlString.append(fileds[i] + "&");
                }
            }
        }

        return etlString.toString();
    }
}

package com.example.kudu.flume.sink.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonStr2Map {

    public static Map<String, String> jsonStr2Map(String jsonStr) {
        Map<String, String> resultMap = new HashMap<>();
        Pattern pattern = Pattern.compile("(\"\\w+\"):(\"[^\"]+\")");
        Matcher m = pattern.matcher(jsonStr);
        String[] strs = null;
        while (m.find()) {
            strs = m.group().split(":");
            if(strs != null && strs.length == 2) {
                resultMap.put(strs[0].replaceAll("\"", "").trim(), strs[1].trim().replaceAll("\"", ""));
            }
        }
        return resultMap;
    }
}

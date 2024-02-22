package org.example;

import java.io.IOException;

public class CurrencyCourse {
   Url urlString = new Url();
     CurrencyCourse(String data) throws IOException {
        String url = buildUrl(data);
        String page = urlString.Url(url);
        int startIndex = page.lastIndexOf("<Value>");
        int endIndex = page.lastIndexOf("</Value>");
        String courseStr = page.substring(startIndex + 7, endIndex);
        System.out.println("Курс на " + data + " число " + courseStr);
    }
    private static String buildUrl(String data) {
        String start = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=";
        String day = data;
        String end = "/11/2020";
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(start);
        builder.append(day);
        builder.append(end);
        return builder.toString();
    }
}
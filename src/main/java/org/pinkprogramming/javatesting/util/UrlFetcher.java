package org.pinkprogramming.javatesting.util;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class UrlFetcher {
    public static Document fetchPage(String url) throws IOException {
        var doc = Jsoup.connect(url).get();
        return doc;
    }
}

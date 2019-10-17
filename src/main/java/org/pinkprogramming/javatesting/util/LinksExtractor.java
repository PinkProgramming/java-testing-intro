package org.pinkprogramming.javatesting.util;

import java.util.List;
import java.util.stream.Collectors;
import org.jsoup.nodes.Document;

public class LinksExtractor {
    public static List<String> extractLinks(Document doc) {
        var links = doc.select("a[href]");
        return links
            .stream()
            .map(link -> link.attr("href"))
            .filter(link -> link.startsWith("http"))
            .collect(Collectors.toList());
    }
}

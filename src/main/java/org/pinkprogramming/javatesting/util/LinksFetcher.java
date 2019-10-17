package org.pinkprogramming.javatesting.util;

import java.io.IOException;
import java.util.List;

public class LinksFetcher {
    public List<String> getLinksFrom(String url) throws IOException {
        var document = UrlFetcher.fetchPage(url);
        var links = LinksExtractor.extractLinks(document);

        return links;
    }
}

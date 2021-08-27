package com.web.app.cn.meilisearch;

import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.Config;
import com.meilisearch.sdk.Index;

/**
 * @author jon
 * @date 2021年08月27日 22:40
 */


public class Main {
    public static void main(String[] args) throws Exception {
        final String documents = "["
                + "{\"book_id\": 123, \"title\": \"Pride and Prejudice\"},"
                + "{\"book_id\": 456, \"title\": \"Le Petit Prince\"},"
                + "{\"book_id\": 1, \"title\": \"Alice In Wonderland\"},"
                + "{\"book_id\": 1344, \"title\": \"The Hobbit\"},"
                + "{\"book_id\": 4, \"title\": \"Harry Potter and the Half-Blood Prince\"},"
                + "{\"book_id\": 2, \"title\": \"The Hitchhiker\'s Guide to the Galaxy\"}"
                + "]";

        Client client = new Client(new Config("http://192.168.247.129:7700"));
        Index index = client.index("post");
        index.addDocuments(documents);
    }




}

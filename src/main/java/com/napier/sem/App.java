package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        //connect to MongoDB uysing port 27000
        MongoClient mongoClient = new MongoClient("localhost", 27000);

        //get or create database
        MongoDatabase database = mongoClient.getDatabase("mydb");

        //get collection from the database
        MongoCollection<Document> collection = database.getCollection("test");

        //create a document to be stored
        Document doc = new Document("name", "Rosalyn Crothers")
                .append("class", "Software Engineering Methods")
                .append("year", "2021")
                .append("result", new Document("CW", 95).append("EX",85));

        //add the document to the collection
        collection.insertOne(doc);

        //check the document in the collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}

import com.mongodb.*;
import com.mongodb.client.*;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Test 1
        ConnectionString connectionUri = new ConnectionString("mongodb+srv://supluca2:supluca2@supluca-cluster.tluspsf.mongodb.net/?retryWrites=true&w=majority");

        MongoClient client = MongoClients.create(
                MongoClientSettings.builder()
                        .applyConnectionString(connectionUri)
                        .applicationName("baenis").build());

        MongoDatabase database = client.getDatabase("people");

        MongoCollection<Document> collection = database.getCollection("people");





        // Test 2
//        String mongoClientUri = "mongodb+srv://supluca2:supluca2@supluca-cluster.tluspsf.mongodb.net/?retryWrites=true&w=majority";
//
//        try(MongoClient mongoClient = MongoClients.create(mongoClientUri)) {
//            MongoDatabase database = mongoClient.getDatabase("people");
//
//            try {
//                Bson command = new BsonDocument("ping", new BsonInt64(1));
//                Document commandResult = database.runCommand(command);
//                System.out.println("Connected successfully to server.");
//            } catch (MongoException me) {
//                System.err.println("An error occurred while attempting to run a command: " + me);
//            }
//
//            try {
//                MongoCollection<Document> collection = database.getCollection("people");
////                try (MongoCursor<Document> cur = collection.find().iterator()) {
////
////                    while (cur.hasNext()) {
////
////                        var doc = cur.next();
////                        var cars = new ArrayList<>(doc.values());
////
////                        System.out.printf("%s: %s%n", cars.get(1), cars.get(2));
////                    }
////                }
//
//                FindIterable<Document> allData = collection.find();
//                Iterator it = allData.iterator();
//                while(it.hasNext()){
//                    System.out.println(it.next());
//                }
//
//
//            } catch (MongoException me) {
//                System.err.println("An error occurred while attempting to run a command: " + me);
//            }
//
//        }

    }
}

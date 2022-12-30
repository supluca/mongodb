import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

import java.util.Iterator;

public class JavaCrud {

    public static void main(String[] args) {

        System.out.println("Hoi");
    }

    public String writeToMongo(String document, String mongoCollection) {

        String log = "Writing to database.";

        ConnectionString connectionUri = new ConnectionString("mongodb+srv://supluca2:supluca2@supluca-cluster.tluspsf.mongodb.net/?retryWrites=true&w=majority");

        // Database connection
        MongoClient client = MongoClients.create(
                MongoClientSettings.builder()
                        .applyConnectionString(connectionUri)
                        .applicationName("baenis").build());

        // Select database
        MongoDatabase database = client.getDatabase("people");

        // Select collection
        MongoCollection<Document> collection = database.getCollection("people");

        String data = "";

        Document dataToInsert = new Document("firstname", "lastname");
        InsertOneResult result = collection.insertOne(dataToInsert);
        System.out.println("Result: " + result);


        // Read data from database and write to console
//        FindIterable<Document> allData = collection.find();
//        Iterator it = allData.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        return log;
    }
}

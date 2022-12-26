import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.CreateViewOptions;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String mongoClientUri = "mongodb+srv://supluca2:supluca2@supluca-cluster.tluspsf.mongodb.net/?retryWrites=true&w=majority";
        try(MongoClient mongoClient = MongoClients.create(mongoClientUri)) {
            MongoDatabase database = mongoClient.getDatabase("people");

            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to run a command: " + me);
            }
        }


    }

    public static void mongoReader(String[] args) {

    }
}

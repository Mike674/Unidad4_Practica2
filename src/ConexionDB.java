import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author GX505DT
 */
public class ConexionDB {
    
    ConnectionString connectionString = new ConnectionString("mongodb+srv://mikeadmin:1234@cluster0.df16y.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("U4_Practica2");
    
    public MongoDatabase obtenerDB(){
        return database;
    }
}

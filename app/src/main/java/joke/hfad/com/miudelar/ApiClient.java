package joke.hfad.com.miudelar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//import okhttp3.logging.HttpLoggingInterceptor;

public class ApiClient {

    public static final String BASE_URL = /*"https://jsonplaceholder.typicode.com"*/"http://tsi-diego.eastus.cloudapp.azure.com:8080/miudelar-server/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

package joke.hfad.com.miudelar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.util.SortedList;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InscripcionACarrera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion_acarrera);

        final Spinner spinner = (Spinner) findViewById(R.id.carreras);

        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<List<DtCarrera>> c = apiService.getAllCarreras();
        c.enqueue(new Callback<List<DtCarrera>>() {
            @Override
            public void onResponse(Call<List<DtCarrera>> call, Response<List<DtCarrera>> response) {

                List<DtCarrera> carreras = new ArrayList<DtCarrera>();
                carreras = response.body();
                //recyclerView.setAdapter(new AlbumsAdapter(albums, R.layout.list_item_album, getApplicationContext()));

                List<String> listaCarreras = new ArrayList<String>();

                for (DtCarrera c : carreras){
                    listaCarreras.add(c.getNombre());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, listaCarreras);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner.setAdapter(adapter);

                /*for(Album a : albums){
                    text.append("ID: " + a.getId() + "\n");
                    text.append("UserID: " + a.getUserId() + "\n");
                    text.append("Title: " + a.getTitle() + "\n\n");
                }*/
                //Log.d(TAG, "Number of movies received: " + albums.size());
                Toast.makeText(getApplicationContext(), "Se ha descargado el JSON con exito!", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Cantidad de registros recibidos: " + carreras.size(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<DtCarrera>> call, Throwable t) {
                // Log error here since request failed
                //Log.e(TAG, t.toString());
                Toast.makeText(getApplicationContext(), "Ha ocurrido un error mientras se realizaba la peticion", Toast.LENGTH_LONG).show();
            }
        });
    }
}

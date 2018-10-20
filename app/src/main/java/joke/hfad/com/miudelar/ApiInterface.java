package joke.hfad.com.miudelar;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    /*@GET("/albums/{id}")
    public Call<Album> getAlbumWithID(@Path("id") int id);

    @GET("/albums/")
    public Call<List<Album>> getAllAlbums();

    @POST("/albums")
    public Call<Album> albumData(@Body Album data);*/

    /*@GET("/admin/usuario")
    public Call<List<DtUsuario>> getAllUsuarios();*/

    @GET("director/carrera/")
    public Call<List<DtCarrera>> getAllCarreras();


    /*@POST("/albums")
    public Call<Album> albumData(@Body Album data);*/
}

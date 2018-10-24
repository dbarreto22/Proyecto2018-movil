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

    /*@GET("director/carrera/")
    public Call<List<DtCarrera>> getAllCarreras();*/
    
    @GET("director/carrera/")
    public Call<List<DtCarrera>> getAllCarreras(@Header("Authorization") String authorization);
    
    @POST("estudiante/inscripcionCarrera")
    public Call<> inscripcionCarrera(@Header("Authorization") String authorization, @Body String inscripcionCarreraDatos);
        
    @POST("estudiante/inscripcionCurso")
    public Call<> inscripcionCurso(@Header("Authorization") String authorization, @Body String inscripcionCursoDatos);
        
    @POST("estudiante/inscripcionExamen")
    public Call<> inscripcionExamen(@Header("Authorization") String authorization, @Body String inscripcionExamenDatos);
    
    //@GET("estudiante/consultarCalificaciones/{cedula}/{idAsig_Carrera}
    //public Call<List<>> getCalificaciones(@Header("Authorization") String authorization, @Path("cedula") String cedula, @Path("idAsig_Carrera") Long idAsig_Carrera);

    /*@GET("estudiante/albums/{id}")
    public Call<Album> albumData(@Body Album data);*/
}

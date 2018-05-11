package com.rsalas.labcalificadomunidenuncias.Services;

import com.rsalas.labcalificadomunidenuncias.Models.Denuncia;

import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/**
 * Created by Alumno on 11/05/2018.
 */

public interface ApiService {
    String API_BASE_URL = "https://labcalificadomunidenuncias-rodrigoxxman.c9users.io";

    @GET("api/v1/denuncias")
    Call<List<Denuncia>> getDenuncias();

}

package com.sanjay.lovepicsupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by User on 1/9/2018.
 */

public interface Api {




    @Multipart
    @POST("api/saracasam/")
    Call<MyResponse> uploadImage(@Part MultipartBody.Part file,
                                 @Part("imagename") RequestBody imagename,
                                 @Part("description") RequestBody description,
                                 @Part("file") RequestBody name);

}



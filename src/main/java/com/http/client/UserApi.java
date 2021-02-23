package com.http.client;

import com.common.ResultMsg;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import retrofit2.http.*;

import java.util.Map;

@Sign
@RetrofitClient(baseUrl = "${http.base.url}",poolName = "test1")
public interface UserApi {

    /**
     * @Query
     * @QueryMap
     * @QueryName
     * @param id
     * @return
     */
    @POST(value = "get/info/{id}")
    public ResultMsg getInfo(@Path(value = "id") String id);

    @GET(value = "get/info/{id}")
    public ResultMsg getList(@QueryMap Map<String,Object> map, @Path(value = "id") String id);
}

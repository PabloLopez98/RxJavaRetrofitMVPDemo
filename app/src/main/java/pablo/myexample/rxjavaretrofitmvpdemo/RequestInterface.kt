package pablo.myexample.rxjavaretrofitmvpdemo

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RequestInterface {

    @GET("photos/{input}")
    fun getTheData(@Path("input") input: String): Observable<Data>
}
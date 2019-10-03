package kami.com.latihanrxjava.network;

import java.util.List;

import io.reactivex.Single;
import kami.com.latihanrxjava.network.model.Contact;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("contacts.php")
    Single<List<Contact>> getContacts(@Query("source") String source, @Query("search") String query);
}

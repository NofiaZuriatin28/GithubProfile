package id.ac.polbeng.nofiazuriatin.githubprofile.services

import id.ac.polbeng.nofiazuriatin.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Header

interface GithubUserService {
    @GET("users/{login}")
    fun loginUser(
        @Header("Authorization") token: String,
        @Path("login") userLogin: String

    ): Call<GithubUser>
}


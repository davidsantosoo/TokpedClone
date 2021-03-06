package com.hfad.tokopediaclone.core.data.source.remote

import com.hfad.tokopediaclone.core.data.source.model.AlamatToko
import com.hfad.tokopediaclone.core.data.source.remote.network.ApiService
import com.hfad.tokopediaclone.core.data.source.remote.request.CreateTokoRequest
import com.hfad.tokopediaclone.core.data.source.remote.request.LoginRequest
import com.hfad.tokopediaclone.core.data.source.remote.request.RegisterRequest
import com.hfad.tokopediaclone.core.data.source.remote.request.UpdateProfileRequest
import com.hfad.tokopediaclone.util.getTokoId
import okhttp3.MultipartBody

class RemoteDataSource(val api : ApiService) {

    suspend fun login(data: LoginRequest) = api.login(data)
    suspend fun register(data: RegisterRequest) = api.register(data)
    suspend fun updateProfile(data: UpdateProfileRequest) = api.updateProfile(data.id, data)
    suspend fun uploadUser(id : Int? = null, fileImage: MultipartBody.Part? = null) = api.uploadUser(id, fileImage)
    suspend fun createToko(data:CreateTokoRequest) = api.createToko(data)
    suspend fun getUser(id:Int? = null) = api.getUser(id)
    suspend fun getAlamatToko() = api.getAlamatToko(getTokoId())
    suspend fun createAlamatToko(data: AlamatToko) = api.createAlamatToko(data)
    suspend fun updateAlamatToko(data: AlamatToko) = api.updateAlamatToko(data.id, data)
    suspend fun deleteAlamatToko(id : Int?) = api.deleteAlamatToko(id)


}
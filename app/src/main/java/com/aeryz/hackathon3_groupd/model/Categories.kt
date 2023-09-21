package com.aeryz.hackathon3_groupd.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Categories(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val imgUrl: String
) : Parcelable

package com.example.recyclerviews

import android.os.Parcelable
import  kotlinx.android.parcel.Parcelize

@Parcelize
data class TitleCreate(val id: String, val nameList: String,val color:Int) : Parcelable
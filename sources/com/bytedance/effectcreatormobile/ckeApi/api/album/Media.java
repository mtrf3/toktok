package com.bytedance.effectcreatormobile.ckeapi.api.album;

import Y.IDCreatorS58S0000000_42;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes34.dex */
public class Media implements Parcelable {
    public static final Parcelable.Creator<Media> CREATOR = new IDCreatorS58S0000000_42(0);
    public String extension;
    public int id;
    public int mediaType;
    public String name;
    public String parentDir;
    public String path;
    public long size;
    public long time;
    public Uri uri;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Media(Parcel parcel) {
        this.path = parcel.readString();
        this.name = parcel.readString();
        this.extension = parcel.readString();
        this.time = parcel.readLong();
        this.mediaType = parcel.readInt();
        this.size = parcel.readLong();
        this.id = parcel.readInt();
        this.parentDir = parcel.readString();
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.name);
        parcel.writeString(this.extension);
        parcel.writeLong(this.time);
        parcel.writeInt(this.mediaType);
        parcel.writeLong(this.size);
        parcel.writeInt(this.id);
        parcel.writeString(this.parentDir);
        parcel.writeParcelable(this.uri, i);
    }

    public Media(String str, String str2, long j, int i, long j2, int i2, String str3) {
        this.path = str;
        this.name = str2;
        if (!TextUtils.isEmpty(str2) && str2.indexOf(".") != -1) {
            this.extension = str2.substring(str2.lastIndexOf("."), str2.length());
        } else {
            this.extension = "null";
        }
        this.time = j;
        this.mediaType = i;
        this.size = j2;
        this.id = i2;
        this.parentDir = str3;
    }
}

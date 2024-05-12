package com.ss.android.ugc.aweme.mediachoose.helper;

import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class MediaAudio implements Parcelable {
    public static final Parcelable.Creator<MediaAudio> CREATOR = new IDCreatorS57S0000000_15(8);
    public String album;
    public long albumID;
    public String artist;
    public String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MediaAudio() {
    }

    public MediaAudio(Parcel parcel) {
        this.artist = parcel.readString();
        this.name = parcel.readString();
        this.album = parcel.readString();
        this.albumID = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.artist);
        parcel.writeString(this.name);
        parcel.writeString(this.album);
        parcel.writeLong(this.albumID);
    }
}

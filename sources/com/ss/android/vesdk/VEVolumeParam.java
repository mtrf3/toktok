package com.ss.android.vesdk;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEVolumeParam implements Parcelable {
    public static final Parcelable.Creator<VEVolumeParam> CREATOR = new IDCreatorS56S0000000_14(28);
    public float bgmPlayVolume;
    public boolean enhanceSysPlayVolume;
    public int trackIndex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEVolumeParam() {
        this.trackIndex = -1;
        this.bgmPlayVolume = -1.0f;
    }

    public VEVolumeParam(Parcel parcel) {
        boolean z;
        this.trackIndex = -1;
        this.bgmPlayVolume = -1.0f;
        this.bgmPlayVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enhanceSysPlayVolume = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bgmPlayVolume);
        parcel.writeByte(this.enhanceSysPlayVolume ? (byte) 1 : (byte) 0);
    }
}

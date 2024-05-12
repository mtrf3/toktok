package com.ss.android.vesdk;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEARCoreParam implements Parcelable {
    public static final Parcelable.Creator<VEARCoreParam> CREATOR = new IDCreatorS56S0000000_14(15);
    public boolean enableARCore;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEARCoreParam() {
    }

    public boolean isEnableARCore() {
        return this.enableARCore;
    }

    public VEARCoreParam(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableARCore = z;
    }

    public void setEnableARCore(boolean z) {
        this.enableARCore = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.enableARCore ? (byte) 1 : (byte) 0);
    }
}

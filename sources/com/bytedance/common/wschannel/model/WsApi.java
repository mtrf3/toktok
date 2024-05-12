package com.bytedance.common.wschannel.model;

import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class WsApi implements Parcelable {
    public static final Parcelable.Creator<WsApi> CREATOR = new IDCreatorS57S0000000_15(3);
    public int method;
    public int service;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
    }
}

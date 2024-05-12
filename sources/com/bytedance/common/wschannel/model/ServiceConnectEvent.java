package com.bytedance.common.wschannel.model;

import X.C77800Ug8;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class ServiceConnectEvent implements Parcelable {
    public static final Parcelable.Creator<ServiceConnectEvent> CREATOR = new IDCreatorS54S0000000_11(4);
    public final int mChannelId;
    public final boolean mConnected;
    public final String mLogInfo;
    public final int mServiceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceConnectEvent{mChannelId=");
        LIZ.append(this.mChannelId);
        LIZ.append(", mServiceId=");
        LIZ.append(this.mServiceId);
        LIZ.append(", mConnected=");
        LIZ.append(this.mConnected);
        LIZ.append(", mLogInfo='");
        return C77800Ug8.LIZJ(LIZ, this.mLogInfo, '\'', '}', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mChannelId);
        parcel.writeInt(this.mServiceId);
        parcel.writeByte(this.mConnected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mLogInfo);
    }

    public ServiceConnectEvent(int i, int i2, String str, boolean z) {
        this.mChannelId = i;
        this.mServiceId = i2;
        this.mConnected = z;
        this.mLogInfo = str;
    }
}

package com.ss.android.vesdk.filterparam;

import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;

/* loaded from: classes15.dex */
public class VEAudioMetricsFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioMetricsFilterParam> CREATOR = new IDCreatorS56S0000000_14(35);
    public String samiModelPath;
    public String samiParam;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioMetricsFilterParam() {
        this.filterName = "audio metrics filter";
        this.samiModelPath = "";
        this.samiParam = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioSamiFilterParam{filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        LIZ.append(this.filterName);
        LIZ.append(", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", samiModelPath=");
        LIZ.append(this.samiModelPath);
        LIZ.append(", samiParam=");
        return q.LIZIZ(LIZ, this.samiParam, '}', LIZ);
    }

    public VEAudioMetricsFilterParam(Parcel parcel) {
        super(parcel);
        this.samiModelPath = parcel.readString();
        this.samiParam = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.samiModelPath);
        parcel.writeString(this.samiParam);
    }
}

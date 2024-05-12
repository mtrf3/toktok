package com.ss.android.vesdk.filterparam;

import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;

/* loaded from: classes15.dex */
public class VEAudioNoiseFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioNoiseFilterParam> CREATOR = new IDCreatorS56S0000000_14(36);
    public boolean enable;
    public String modelPath;
    public float noiseMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioNoiseFilterParam() {
        this.filterName = "audio noise";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioNoiseFilterParam{filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        LIZ.append(this.filterName);
        LIZ.append(", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", noiseMode=");
        LIZ.append(this.noiseMode);
        LIZ.append(", modelPath=");
        return q.LIZIZ(LIZ, this.modelPath, '}', LIZ);
    }

    public VEAudioNoiseFilterParam(Parcel parcel) {
        super(parcel);
        this.noiseMode = parcel.readFloat();
        this.modelPath = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.noiseMode);
        parcel.writeString(this.modelPath);
    }
}

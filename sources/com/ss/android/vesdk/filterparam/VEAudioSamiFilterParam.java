package com.ss.android.vesdk.filterparam;

import X.C48339Iy7;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEAudioSamiFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioSamiFilterParam> CREATOR = new IDCreatorS56S0000000_14(37);
    public boolean enable;
    public String samiModelPath;
    public String samiParam;
    public int samiType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioSamiFilterParam() {
        this.enable = true;
        this.filterName = "audio sami filter";
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
        LIZ.append(", samiType=");
        LIZ.append(this.samiType);
        LIZ.append(", samiParam=");
        LIZ.append(this.samiParam);
        LIZ.append(", enable=");
        return C48339Iy7.LIZJ(LIZ, this.enable, '}', LIZ);
    }

    public VEAudioSamiFilterParam(Parcel parcel) {
        super(parcel);
        this.enable = true;
        this.samiModelPath = parcel.readString();
        this.samiType = parcel.readInt();
        this.samiParam = parcel.readString();
        this.enable = parcel.readByte() != 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.samiModelPath);
        parcel.writeInt(this.samiType);
        parcel.writeString(this.samiParam);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
    }
}

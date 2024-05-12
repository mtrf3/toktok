package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEVideoStableFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoStableFilterParam> CREATOR = new IDCreatorS56S0000000_14(66);
    public int height;
    public String ptsMatrix;
    public String videoStabMatrix;
    public int width;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEVideoStableFilterParam() {
        this.filterName = "video stable filter";
        this.filterType = 27;
        this.filterDurationType = 1;
        this.ptsMatrix = "";
        this.videoStabMatrix = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoStableFilterParam{ptsMatrix=");
        LIZ.append(this.ptsMatrix);
        LIZ.append(", videoStabMatrix='");
        Q89.LIZIZ(LIZ, this.videoStabMatrix, '\'', ", filterType=");
        LIZ.append(this.filterType);
        LIZ.append('\'');
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append('\'');
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append('\'');
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public VEVideoStableFilterParam(Parcel parcel) {
        super(parcel);
        this.ptsMatrix = parcel.readString();
        this.videoStabMatrix = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.ptsMatrix);
        parcel.writeString(this.videoStabMatrix);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}

package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;

/* loaded from: classes15.dex */
public class VEAmazingFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEAmazingFilterParam> CREATOR = new IDCreatorS56S0000000_14(30);
    public String algorithmResultDir;
    public int amazingEngineType;
    public int flag;
    public int order;
    public String param;
    public String path;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAmazingFilterParam() {
        this.filterName = "amzing filter";
        this.filterType = 22;
        this.path = "";
        this.param = "";
        this.algorithmResultDir = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAmazingFilterParam{order=");
        LIZ.append(this.order);
        LIZ.append(", path='");
        Q89.LIZIZ(LIZ, this.path, '\'', ", param='");
        Q89.LIZIZ(LIZ, this.param, '\'', ", amazingEngineType=");
        LIZ.append(this.amazingEngineType);
        LIZ.append(", flag =");
        LIZ.append(this.flag);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append(", algorithmResultDir=");
        return q.LIZIZ(LIZ, this.algorithmResultDir, '}', LIZ);
    }

    public VEAmazingFilterParam(Parcel parcel) {
        super(parcel);
        this.order = parcel.readInt();
        this.path = parcel.readString();
        this.param = parcel.readString();
        this.amazingEngineType = parcel.readInt();
        this.flag = parcel.readInt();
        this.algorithmResultDir = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.order);
        parcel.writeString(this.path);
        parcel.writeString(this.param);
        parcel.writeInt(this.amazingEngineType);
        parcel.writeInt(this.flag);
        parcel.writeString(this.algorithmResultDir);
    }
}

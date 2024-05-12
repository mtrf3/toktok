package com.ss.android.vesdk.filterparam;

import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class VEColorHslFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorHslFilterParam> CREATOR = new IDCreatorS56S0000000_14(45);
    public ArrayList<HslParam> hslParamArrayList;
    public int type;
    public int version;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEColorHslFilterParam() {
        this.filterName = "color_adjust_hsl";
        this.filterType = 36;
        this.filterDurationType = 1;
        this.hslParamArrayList = new ArrayList<>();
        this.version = 1;
        this.type = 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEColorHslFilterParam{, version = ");
        LIZ.append(this.version);
        LIZ.append("]");
        LIZ.append('\'');
        LIZ.append(", type = ");
        LIZ.append(this.type);
        LIZ.append("]");
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public VEColorHslFilterParam(Parcel parcel) {
        super(parcel);
        this.version = parcel.readInt();
        this.type = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.version);
        parcel.writeInt(this.type);
    }
}

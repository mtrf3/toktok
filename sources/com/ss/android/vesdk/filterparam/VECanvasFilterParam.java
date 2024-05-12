package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.V0N;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VECanvasFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VECanvasFilterParam> CREATOR = new IDCreatorS56S0000000_14(43);
    public int color;
    public boolean enableAntialiasing;
    public int gradientBottomColor;
    public int gradientTopColor;
    public int height;
    public String imagePath;
    public int radius;
    public int sourceType;
    public int width;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VECanvasFilterParam() {
        this.filterName = "color_canvas";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.sourceType = SourceType.COLOR.ordinal();
        this.color = -16777216;
        this.radius = 0;
        this.imagePath = "";
        this.width = -1;
        this.height = -1;
        this.enableAntialiasing = false;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECanvasFilterParam{sourceType=");
        LIZ.append(this.sourceType);
        LIZ.append(", color=");
        LIZ.append(this.color);
        LIZ.append(", radius=");
        LIZ.append(this.radius);
        LIZ.append(", imagePath='");
        Q89.LIZIZ(LIZ, this.imagePath, '\'', ", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", enableAntialiasing=");
        LIZ.append(this.enableAntialiasing);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    /* loaded from: classes3.dex */
    public enum SourceType {
        COLOR,
        VIDEOFRAME,
        IMAGE,
        GRADIENT_COLOR;

        public static SourceType valueOf(String str) {
            return (SourceType) V0N.LJJJ(SourceType.class, str);
        }
    }

    public VECanvasFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.sourceType = parcel.readInt();
        this.color = parcel.readInt();
        this.radius = parcel.readInt();
        this.imagePath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableAntialiasing = z;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.sourceType);
        parcel.writeInt(this.color);
        parcel.writeInt(this.radius);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.enableAntialiasing ? 1 : 0);
    }
}

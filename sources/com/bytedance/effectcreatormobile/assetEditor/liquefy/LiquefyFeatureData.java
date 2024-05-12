package com.bytedance.effectcreatormobile.assetEditor.liquefy;

import X.C93433aQn;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class LiquefyFeatureData extends F9E implements Parcelable {
    public static final Parcelable.Creator<LiquefyFeatureData> CREATOR = new C93433aQn();
    public final double centerX;
    public final double centerY;
    public final boolean followFace;
    public final double height;
    public final float horizontalDistortion;
    public final String mainTransformName;
    public final Boolean mainVisible;
    public final boolean mirror;
    public final double rotate;
    public final Boolean subVisible;
    public final float verticalDistortion;
    public final double width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.followFace), Boolean.valueOf(this.mirror), Float.valueOf(this.horizontalDistortion), Float.valueOf(this.verticalDistortion), Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.centerX), Double.valueOf(this.centerY), Double.valueOf(this.rotate), this.mainTransformName, this.mainVisible, this.subVisible};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.followFace ? 1 : 0);
        parcel.writeInt(this.mirror ? 1 : 0);
        parcel.writeFloat(this.horizontalDistortion);
        parcel.writeFloat(this.verticalDistortion);
        parcel.writeDouble(this.width);
        parcel.writeDouble(this.height);
        parcel.writeDouble(this.centerX);
        parcel.writeDouble(this.centerY);
        parcel.writeDouble(this.rotate);
        parcel.writeString(this.mainTransformName);
        Boolean bool = this.mainVisible;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.subVisible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public LiquefyFeatureData(boolean z, boolean z2, float f, float f2, double d, double d2, double d3, double d4, double d5, String str, Boolean bool, Boolean bool2) {
        this.followFace = z;
        this.mirror = z2;
        this.horizontalDistortion = f;
        this.verticalDistortion = f2;
        this.width = d;
        this.height = d2;
        this.centerX = d3;
        this.centerY = d4;
        this.rotate = d5;
        this.mainTransformName = str;
        this.mainVisible = bool;
        this.subVisible = bool2;
    }
}

package com.ss.android.vesdk;

import X.EnumC62422cg;
import Y.IDCreatorS46S0000000_1;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class VEBitmapWithInfo implements Parcelable {
    public static final Parcelable.Creator<VEBitmapWithInfo> CREATOR = new IDCreatorS46S0000000_1(1);
    public Bitmap bitmap;
    public int colorPrimary;
    public int colorSpace;
    public int colorTransfer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEBitmapWithInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorPrimary = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public VEBitmapWithInfo(Bitmap bitmap) {
        this.bitmap = bitmap;
        EnumC62422cg enumC62422cg = EnumC62422cg.UNKNOWN;
        this.colorSpace = enumC62422cg.ordinal();
        this.colorPrimary = enumC62422cg.ordinal();
        this.colorTransfer = enumC62422cg.ordinal();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorPrimary);
        parcel.writeInt(this.colorTransfer);
        parcel.writeParcelable(this.bitmap, i);
    }

    public void setColorInfo(int i, int i2, int i3) {
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }

    public VEBitmapWithInfo(Bitmap bitmap, int i, int i2, int i3) {
        this.bitmap = bitmap;
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }
}

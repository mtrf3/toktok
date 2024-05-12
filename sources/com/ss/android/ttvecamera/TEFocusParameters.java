package com.ss.android.ttvecamera;

import X.X1D;
import Y.IDCreatorS57S0000000_15;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new IDCreatorS57S0000000_15(6);
    public Rect mActiveSize;
    public Rect mCropSize;
    public int mMaxRegionsAE;
    public int mMaxRegionsAF;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("active size is:");
        LIZ.append(this.mActiveSize.toString());
        LIZ.append(" crop size is: ");
        LIZ.append(this.mCropSize.toString());
        LIZ.append("  max AF regions is: ");
        LIZ.append(this.mMaxRegionsAF);
        LIZ.append("  max AE regions is: ");
        LIZ.append(this.mMaxRegionsAE);
        return X1D.LIZIZ(LIZ);
    }

    public TEFocusParameters() {
    }

    public TEFocusParameters(Parcel parcel) {
        this.mActiveSize = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.mMaxRegionsAF = parcel.readInt();
        this.mMaxRegionsAE = parcel.readInt();
        this.mCropSize = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mActiveSize, i);
        parcel.writeInt(this.mMaxRegionsAF);
        parcel.writeInt(this.mMaxRegionsAE);
        parcel.writeParcelable(this.mCropSize, i);
    }
}

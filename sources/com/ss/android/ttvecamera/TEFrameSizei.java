package com.ss.android.ttvecamera;

import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class TEFrameSizei implements Parcelable {
    public static final Parcelable.Creator<TEFrameSizei> CREATOR = new IDCreatorS54S0000000_11(59);
    public int height;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TEFrameSizei() {
        this.width = 720;
        this.height = 1280;
    }

    public final int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.width);
        LIZ.append("x");
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public TEFrameSizei(Parcel parcel) {
        this.width = 720;
        this.height = 1280;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        if (this.width != tEFrameSizei.width || this.height != tEFrameSizei.height) {
            return false;
        }
        return true;
    }

    public TEFrameSizei(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}

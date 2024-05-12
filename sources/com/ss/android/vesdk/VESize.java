package com.ss.android.vesdk;

import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class VESize implements Parcelable {
    public static final Parcelable.Creator<VESize> CREATOR = new IDCreatorS54S0000000_11(65);
    public int height;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isValid() {
        if (this.width > 0 && this.height > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.width);
        LIZ.append("*");
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public VESize(Parcel parcel) {
        this.width = 720;
        this.height = 1280;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VESize)) {
            return false;
        }
        VESize vESize = (VESize) obj;
        if (this.width != vESize.width || this.height != vESize.height) {
            return false;
        }
        return true;
    }

    public VESize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}

package com.ss.android.ttvecamera;

import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes12.dex */
public class TEFrameRateRange implements Parcelable {
    public static final Parcelable.Creator<TEFrameRateRange> CREATOR = new IDCreatorS54S0000000_11(58);
    public int fpsUnitFactor;
    public int max;
    public int min;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (this.min * 65537) + 1 + this.max;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(this.min / this.fpsUnitFactor);
        LIZ.append(", ");
        LIZ.append(this.max / this.fpsUnitFactor);
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public TEFrameRateRange(Parcel parcel) {
        this.fpsUnitFactor = 1;
        this.min = parcel.readInt();
        this.max = parcel.readInt();
        this.fpsUnitFactor = parcel.readInt();
    }

    public static int LIZ(List<int[]> list) {
        if (list.size() <= 0 || ((int[]) ListProtector.get(list, 0))[1] <= 1000) {
            return 1;
        }
        return 1000;
    }

    public final int[] LIZIZ(int i) {
        int i2 = this.min;
        int i3 = this.fpsUnitFactor;
        return new int[]{(i2 / i3) * i, (this.max / i3) * i};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TEFrameRateRange)) {
            return false;
        }
        TEFrameRateRange tEFrameRateRange = (TEFrameRateRange) obj;
        if (this.min != tEFrameRateRange.min || this.max != tEFrameRateRange.max) {
            return false;
        }
        return true;
    }

    public TEFrameRateRange(int i, int i2) {
        this.fpsUnitFactor = 1;
        this.min = i;
        this.max = i2;
        this.fpsUnitFactor = i2 > 1000 ? 1000 : 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        parcel.writeInt(this.fpsUnitFactor);
    }
}

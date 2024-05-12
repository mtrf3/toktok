package com.ss.android.vesdk;

import X.V0N;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public enum ROTATE_DEGREE implements Parcelable {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;

    public static final Parcelable.Creator<ROTATE_DEGREE> CREATOR = new IDCreatorS51S0000000_7(24);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static int[] toIntArray(ROTATE_DEGREE[] rotate_degreeArr) {
        if (rotate_degreeArr == null) {
            return null;
        }
        int length = rotate_degreeArr.length;
        int[] iArr = new int[rotate_degreeArr.length];
        for (int i = 0; i < length; i++) {
            ROTATE_DEGREE rotate_degree = rotate_degreeArr[i];
            if (rotate_degree == null) {
                iArr[i] = 0;
            } else {
                iArr[i] = rotate_degree.ordinal();
            }
        }
        return iArr;
    }

    public static ROTATE_DEGREE valueOf(String str) {
        return (ROTATE_DEGREE) V0N.LJJJ(ROTATE_DEGREE.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}

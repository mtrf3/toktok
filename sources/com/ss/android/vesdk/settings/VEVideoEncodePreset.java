package com.ss.android.vesdk.settings;

import X.V0N;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public enum VEVideoEncodePreset implements Parcelable {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;

    public static final Parcelable.Creator<VEVideoEncodePreset> CREATOR = new IDCreatorS57S0000000_15(14);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static VEVideoEncodePreset valueOf(String str) {
        return (VEVideoEncodePreset) V0N.LJJJ(VEVideoEncodePreset.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}

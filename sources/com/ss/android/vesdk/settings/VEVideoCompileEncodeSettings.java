package com.ss.android.vesdk.settings;

import X.X1D;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class VEVideoCompileEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoCompileEncodeSettings> CREATOR = new IDCreatorS57S0000000_15(13);
    public boolean enableHwBufferEncode;
    public boolean isSupportHWEncoder;
    public VEVideoHWEncodeSettings mHWEncodeSetting;
    public VEVideoSWEncodeSettings mSWEncodeSetting;
    public boolean useHWEncoder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoCompileEncodeSettings() {
        this.mHWEncodeSetting = new VEVideoHWEncodeSettings();
        this.mSWEncodeSetting = new VEVideoSWEncodeSettings();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoCompileEncodeSettings{useHWEncoder=");
        LIZ.append(this.useHWEncoder);
        LIZ.append(", isSupportHWEncoder=");
        LIZ.append(this.isSupportHWEncoder);
        LIZ.append(", mHWEncodeSetting=");
        LIZ.append(this.mHWEncodeSetting);
        LIZ.append(", mSWEncodeSetting=");
        LIZ.append(this.mSWEncodeSetting);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public VEVideoCompileEncodeSettings(Parcel parcel) {
        boolean z;
        this.mHWEncodeSetting = new VEVideoHWEncodeSettings();
        this.mSWEncodeSetting = new VEVideoSWEncodeSettings();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useHWEncoder = z;
        this.isSupportHWEncoder = parcel.readByte() != 0;
        this.mHWEncodeSetting = (VEVideoHWEncodeSettings) parcel.readParcelable(VEVideoHWEncodeSettings.class.getClassLoader());
        this.mSWEncodeSetting = (VEVideoSWEncodeSettings) parcel.readParcelable(VEVideoSWEncodeSettings.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.useHWEncoder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mHWEncodeSetting, i);
        parcel.writeParcelable(this.mSWEncodeSetting, i);
    }
}

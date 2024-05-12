package com.ss.android.vesdk.settings;

import X.X1D;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import defpackage.b0;

/* loaded from: classes16.dex */
public class VEVideoSWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoSWEncodeSettings> CREATOR = new IDCreatorS57S0000000_15(17);
    public int mBitrateMode;
    public int mBps;
    public int mByteVC1Crf;
    public int mCrf;
    public double mFHDCrfRatio;
    public int mGop;
    public double mHFpsOffset;
    public long mMaxRate;
    public int mPreset;
    public int mProfile;
    public double mQPOffset;
    public double mSDCrfRatio;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoSWEncodeSettings() {
        this.mCrf = 15;
        this.mHFpsOffset = -1.0d;
        this.mByteVC1Crf = 22;
        this.mSDCrfRatio = 1.0d;
        this.mFHDCrfRatio = 1.0d;
        this.mBps = 4000000;
        this.mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
        this.mPreset = VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mMaxRate = 15000000L;
        this.mGop = 35;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoSWEncodeSettings{mCrf=");
        LIZ.append(this.mCrf);
        LIZ.append(", mBps=");
        LIZ.append(this.mBps);
        LIZ.append(", mBitrateMode=");
        LIZ.append(this.mBitrateMode);
        LIZ.append(", mPreset=");
        LIZ.append(this.mPreset);
        LIZ.append(", mProfile=");
        LIZ.append(this.mProfile);
        LIZ.append(", mMaxRate=");
        LIZ.append(this.mMaxRate);
        LIZ.append(", mGop=");
        return b0.LIZJ(LIZ, this.mGop, '}', LIZ);
    }

    public VEVideoSWEncodeSettings(Parcel parcel) {
        this.mCrf = 15;
        this.mHFpsOffset = -1.0d;
        this.mByteVC1Crf = 22;
        this.mSDCrfRatio = 1.0d;
        this.mFHDCrfRatio = 1.0d;
        this.mBps = 4000000;
        this.mBitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
        this.mPreset = VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mMaxRate = 15000000L;
        this.mGop = 35;
        this.mCrf = parcel.readInt();
        this.mQPOffset = parcel.readDouble();
        this.mHFpsOffset = parcel.readDouble();
        this.mByteVC1Crf = parcel.readInt();
        this.mSDCrfRatio = parcel.readDouble();
        this.mFHDCrfRatio = parcel.readDouble();
        this.mPreset = parcel.readInt();
        this.mProfile = parcel.readInt();
        this.mMaxRate = parcel.readLong();
        this.mBps = parcel.readInt();
        this.mBitrateMode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCrf);
        parcel.writeDouble(this.mQPOffset);
        parcel.writeDouble(this.mHFpsOffset);
        parcel.writeInt(this.mByteVC1Crf);
        parcel.writeDouble(this.mSDCrfRatio);
        parcel.writeDouble(this.mFHDCrfRatio);
        parcel.writeInt(this.mPreset);
        parcel.writeInt(this.mProfile);
        parcel.writeLong(this.mMaxRate);
        parcel.writeInt(this.mBps);
        parcel.writeInt(this.mBitrateMode);
    }
}

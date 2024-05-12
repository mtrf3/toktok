package com.ss.android.vesdk.settings;

import X.X1D;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes16.dex */
public class VEVideoHWEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoHWEncodeSettings> CREATOR = new IDCreatorS57S0000000_15(16);
    public double m2K_bitrate_ratio;
    public double m4K_bitrate_ratio;
    public long mBitrate;
    public int mCodecType;
    public double mFullHd_bitrate_ratio;
    public int mGop;
    public double mH_fps_bitrate_ratio;
    public double mHevc_bitrate_ratio;
    public double mHp_bitrate_ratio;
    public int mProfile;
    public double mSd_bitrate_ratio;
    public double transition_bitrate_ratio;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoHWEncodeSettings() {
        this.mBitrate = 6000000L;
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mHp_bitrate_ratio = 0.75d;
        this.mFullHd_bitrate_ratio = 1.0d;
        this.mSd_bitrate_ratio = 1.0d;
        this.mH_fps_bitrate_ratio = 1.0d;
        this.transition_bitrate_ratio = 1.0d;
        this.m2K_bitrate_ratio = 1.0d;
        this.m4K_bitrate_ratio = 1.0d;
        this.mHevc_bitrate_ratio = 1.0d;
        this.mGop = 35;
        this.mCodecType = 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoHWEncodeSettings{mBitrate=");
        LIZ.append(this.mBitrate);
        LIZ.append(", mProfile=");
        LIZ.append(this.mProfile);
        LIZ.append(", mHp_bitrate_ratio=");
        LIZ.append(this.mHp_bitrate_ratio);
        LIZ.append(", mFullHd_bitrate_ratio=");
        LIZ.append(this.mFullHd_bitrate_ratio);
        LIZ.append(", mSd_bitrate_ratio=");
        LIZ.append(this.mSd_bitrate_ratio);
        LIZ.append(", mH_fps_bitrate_ratio=");
        LIZ.append(this.mH_fps_bitrate_ratio);
        LIZ.append(", transition_bitrate_ratio=");
        LIZ.append(this.transition_bitrate_ratio);
        LIZ.append(", m2KbitrateRatio=");
        LIZ.append(this.m2K_bitrate_ratio);
        LIZ.append(", m4KbiterateRatio=");
        LIZ.append(this.m4K_bitrate_ratio);
        LIZ.append(", mHevc_bitrate_ratio=");
        LIZ.append(this.mHevc_bitrate_ratio);
        LIZ.append(", mGop=");
        LIZ.append(this.mGop);
        LIZ.append(", mCodecType=");
        return b0.LIZJ(LIZ, this.mCodecType, '}', LIZ);
    }

    public VEVideoHWEncodeSettings(Parcel parcel) {
        this.mBitrate = 6000000L;
        this.mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.mHp_bitrate_ratio = 0.75d;
        this.mFullHd_bitrate_ratio = 1.0d;
        this.mSd_bitrate_ratio = 1.0d;
        this.mH_fps_bitrate_ratio = 1.0d;
        this.transition_bitrate_ratio = 1.0d;
        this.m2K_bitrate_ratio = 1.0d;
        this.m4K_bitrate_ratio = 1.0d;
        this.mHevc_bitrate_ratio = 1.0d;
        this.mGop = 35;
        this.mCodecType = 0;
        this.mBitrate = parcel.readLong();
        this.mProfile = parcel.readInt();
        this.mHp_bitrate_ratio = parcel.readDouble();
        this.mFullHd_bitrate_ratio = parcel.readDouble();
        this.mSd_bitrate_ratio = parcel.readDouble();
        this.mH_fps_bitrate_ratio = parcel.readDouble();
        this.mHevc_bitrate_ratio = parcel.readDouble();
        this.mGop = parcel.readInt();
        this.transition_bitrate_ratio = parcel.readDouble();
        this.m2K_bitrate_ratio = parcel.readDouble();
        this.m4K_bitrate_ratio = parcel.readDouble();
        this.mCodecType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mBitrate);
        parcel.writeInt(this.mProfile);
        parcel.writeDouble(this.mHp_bitrate_ratio);
        parcel.writeDouble(this.mFullHd_bitrate_ratio);
        parcel.writeDouble(this.mSd_bitrate_ratio);
        parcel.writeDouble(this.mH_fps_bitrate_ratio);
        parcel.writeDouble(this.mHevc_bitrate_ratio);
        parcel.writeInt(this.mGop);
        parcel.writeDouble(this.transition_bitrate_ratio);
        parcel.writeDouble(this.m2K_bitrate_ratio);
        parcel.writeDouble(this.m4K_bitrate_ratio);
        parcel.writeInt(this.mCodecType);
    }
}

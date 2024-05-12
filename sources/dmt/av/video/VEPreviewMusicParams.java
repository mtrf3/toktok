package dmt.av.video;

import X.Q89;
import X.X1D;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.b0;

/* loaded from: classes3.dex */
public class VEPreviewMusicParams implements Parcelable {
    public static final Parcelable.Creator<VEPreviewMusicParams> CREATOR = new IDCreatorS47S0000000_2(7);
    public double avgLoudness;
    public int bgmDelay;
    public double bgmLoudness;
    public Boolean changeTone;
    public boolean isFastImport;
    public boolean isMusicIllegal;
    public boolean isSoundLoop;
    public int mDuration;
    public int mInPoint;
    public String mPath;
    public int mShootDuration;
    public float mVolume;
    public String musicId;
    public String musicName;
    public int muteEnd;
    public int muteStart;
    public int pageType;
    public double peakLoudness;
    public float previewStartTime;
    public Float soundSpeed;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEPreviewMusicParams() {
        this.soundSpeed = Float.valueOf(1.0f);
        this.changeTone = Boolean.TRUE;
        this.pageType = 1;
        this.isFastImport = false;
        this.bgmLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.peakLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.avgLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.mVolume = 1.0f;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEPreviewMusicParams{mPath='");
        Q89.LIZIZ(LIZ, this.mPath, '\'', ", mInPoint=");
        LIZ.append(this.mInPoint);
        LIZ.append(", mDuration=");
        LIZ.append(this.mDuration);
        LIZ.append(", mVolume=");
        LIZ.append(this.mVolume);
        LIZ.append(", previewStartTime=");
        LIZ.append(this.previewStartTime);
        LIZ.append(", bgmdelay=");
        return b0.LIZJ(LIZ, this.bgmDelay, '}', LIZ);
    }

    public VEPreviewMusicParams(Parcel parcel) {
        boolean z;
        boolean z2;
        this.soundSpeed = Float.valueOf(1.0f);
        this.changeTone = Boolean.TRUE;
        this.pageType = 1;
        this.isFastImport = false;
        this.bgmLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.peakLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.avgLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.mPath = parcel.readString();
        this.mInPoint = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mVolume = parcel.readFloat();
        this.musicId = parcel.readString();
        this.musicName = parcel.readString();
        this.soundSpeed = Float.valueOf(parcel.readFloat());
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.changeTone = Boolean.valueOf(z);
        this.pageType = parcel.readInt();
        this.previewStartTime = parcel.readFloat();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isFastImport = z2;
        this.muteStart = parcel.readInt();
        this.muteEnd = parcel.readInt();
        this.isSoundLoop = parcel.readByte() == 1;
        this.bgmDelay = parcel.readInt();
        this.bgmLoudness = parcel.readDouble();
        this.peakLoudness = parcel.readDouble();
        this.avgLoudness = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPath);
        parcel.writeInt(this.mInPoint);
        parcel.writeInt(this.mDuration);
        parcel.writeFloat(this.mVolume);
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicName);
        parcel.writeFloat(this.soundSpeed.floatValue());
        parcel.writeInt(this.changeTone.booleanValue() ? 1 : 0);
        parcel.writeInt(this.pageType);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeInt(this.isFastImport ? 1 : 0);
        parcel.writeInt(this.muteStart);
        parcel.writeInt(this.muteEnd);
        parcel.writeByte(this.isSoundLoop ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.bgmDelay);
        parcel.writeDouble(this.bgmLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.avgLoudness);
    }
}

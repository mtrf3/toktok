package com.ss.android.vesdk;

import X.C74221TAz;
import X.EnumC63976P8y;
import X.EnumC84107Wzf;
import X.V0N;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes15.dex */
public class VEDisplaySettings implements Parcelable {
    public static final Parcelable.Creator<VEDisplaySettings> CREATOR = new IDCreatorS56S0000000_14(25);
    public long mBgColor;
    public VESize mCamOutSize;
    public VESize mCanvasSize;
    public float mDisplayRatio;
    public EnumC63976P8y mDisplayRatioMode;
    public int mDisplayRotation;
    public VEDisPlayEffect mEffect;
    public float mEffectIntensity;
    public int mEffectRotation;
    public EnumC84107Wzf mFitMode;
    public boolean mFlipX;
    public boolean mFlipY;
    public boolean mForceAdaptSurfaceSize;
    public VESize mLayoutSize;
    public VESize mRenderSize;
    public int mRotation;
    public int mTranslateX;
    public int mTranslateY;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes15.dex */
    public static final class Builder {
        public final VEDisplaySettings mVEPreviewRaidoSettings;

        public Builder() {
            this.mVEPreviewRaidoSettings = new VEDisplaySettings();
        }

        public VEDisplaySettings build() {
            return this.mVEPreviewRaidoSettings;
        }

        public Builder(VEDisplaySettings vEDisplaySettings) {
            this.mVEPreviewRaidoSettings = vEDisplaySettings;
        }

        public Builder setBackgroundColor(long j) {
            this.mVEPreviewRaidoSettings.mBgColor = j;
            return this;
        }

        public Builder setCamOutSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mCamOutSize = vESize;
            return this;
        }

        public Builder setCanvasSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mCanvasSize = vESize;
            return this;
        }

        public Builder setDisplayEffect(VEDisPlayEffect vEDisPlayEffect) {
            this.mVEPreviewRaidoSettings.mEffect = vEDisPlayEffect;
            return this;
        }

        public Builder setDisplayEffectIntensity(float f) {
            this.mVEPreviewRaidoSettings.mEffectIntensity = f;
            return this;
        }

        public Builder setDisplayLayoutSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mLayoutSize = vESize;
            return this;
        }

        public Builder setDisplayRatio(float f) {
            this.mVEPreviewRaidoSettings.mDisplayRatio = f;
            return this;
        }

        public Builder setDisplayRatioMode(EnumC63976P8y enumC63976P8y) {
            this.mVEPreviewRaidoSettings.mDisplayRatioMode = enumC63976P8y;
            return this;
        }

        public Builder setDisplayRotation(int i) {
            this.mVEPreviewRaidoSettings.mDisplayRotation = i;
            return this;
        }

        public Builder setEffectRotation(int i) {
            this.mVEPreviewRaidoSettings.mEffectRotation = i;
            return this;
        }

        public Builder setFitMode(EnumC84107Wzf enumC84107Wzf) {
            this.mVEPreviewRaidoSettings.mFitMode = enumC84107Wzf;
            return this;
        }

        public Builder setFlipX(boolean z) {
            this.mVEPreviewRaidoSettings.mFlipX = z;
            return this;
        }

        public Builder setFlipY(boolean z) {
            this.mVEPreviewRaidoSettings.mFlipY = z;
            return this;
        }

        public Builder setForceAdaptSurfaceSize(boolean z) {
            this.mVEPreviewRaidoSettings.mForceAdaptSurfaceSize = z;
            return this;
        }

        public Builder setRenderSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mRenderSize = vESize;
            return this;
        }

        public Builder setRotation(int i) {
            this.mVEPreviewRaidoSettings.mRotation = i;
            return this;
        }

        public Builder setTranslateX(int i) {
            this.mVEPreviewRaidoSettings.mTranslateX = i;
            return this;
        }

        public Builder setTranslateY(int i) {
            this.mVEPreviewRaidoSettings.mTranslateY = i;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mTranslateX), Integer.valueOf(this.mTranslateY), Boolean.valueOf(this.mFlipX), Boolean.valueOf(this.mFlipY), this.mFitMode, Integer.valueOf(this.mRotation), Integer.valueOf(this.mEffectRotation), Integer.valueOf(this.mDisplayRotation), Long.valueOf(this.mBgColor), Float.valueOf(this.mDisplayRatio), this.mDisplayRatioMode, this.mRenderSize, this.mLayoutSize, this.mCamOutSize, Boolean.valueOf(this.mForceAdaptSurfaceSize), this.mEffect, Float.valueOf(this.mEffectIntensity));
    }

    public VEDisplaySettings() {
        this.mFitMode = EnumC84107Wzf.SCALE_MODE_CENTER_INSIDE;
        this.mLayoutSize = new VESize(0, 0);
        this.mCamOutSize = new VESize(0, 0);
        this.mForceAdaptSurfaceSize = false;
        this.mCanvasSize = new VESize(0, 0);
        this.mEffect = VEDisPlayEffect.NONE;
        this.mEffectIntensity = 0.0f;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEDisplaySettings{mTranslateX=");
        LIZ.append(this.mTranslateX);
        LIZ.append(", mTranslateY=");
        LIZ.append(this.mTranslateY);
        LIZ.append(", mFlipX=");
        LIZ.append(this.mFlipX);
        LIZ.append(", mFlipY=");
        LIZ.append(this.mFlipY);
        LIZ.append(", mFitMode=");
        LIZ.append(this.mFitMode);
        LIZ.append(", mRotation=");
        LIZ.append(this.mRotation);
        LIZ.append(", mBgColor=");
        LIZ.append(this.mBgColor);
        LIZ.append(", mDisplayRatio=");
        LIZ.append(this.mDisplayRatio);
        LIZ.append(", mDisplayRatioMode=");
        LIZ.append(this.mDisplayRatioMode);
        LIZ.append(", mRenderSize=");
        LIZ.append(this.mRenderSize);
        LIZ.append(", mLayoutSize=");
        LIZ.append(this.mLayoutSize);
        LIZ.append(", mEffect=");
        LIZ.append(this.mEffect);
        LIZ.append(", mEffectIntensity=");
        return C74221TAz.LIZLLL(LIZ, this.mEffectIntensity, '}', LIZ);
    }

    public long getBackgroundColor() {
        return this.mBgColor;
    }

    public VESize getCamOutSize() {
        return this.mCamOutSize;
    }

    public VESize getCanvasSize() {
        return this.mCanvasSize;
    }

    public VEDisPlayEffect getDisplayEffect() {
        return this.mEffect;
    }

    public float getDisplayRatio() {
        return this.mDisplayRatio;
    }

    public EnumC63976P8y getDisplayRatioMode() {
        return this.mDisplayRatioMode;
    }

    public int getDisplayRotation() {
        return this.mDisplayRotation;
    }

    public float getEffectIntensity() {
        return this.mEffectIntensity;
    }

    public int getEffectRotation() {
        return this.mEffectRotation;
    }

    public EnumC84107Wzf getFitMode() {
        return this.mFitMode;
    }

    public boolean getFlipX() {
        return this.mFlipX;
    }

    public boolean getFlipY() {
        return this.mFlipY;
    }

    public VESize getLayoutSize() {
        return this.mLayoutSize;
    }

    public VESize getRenderSize() {
        return this.mRenderSize;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getTranslateX() {
        return this.mTranslateX;
    }

    public int getTranslateY() {
        return this.mTranslateY;
    }

    public boolean isForceAdaptSurfaceSize() {
        return this.mForceAdaptSurfaceSize;
    }

    /* loaded from: classes12.dex */
    public enum VEDisPlayEffect {
        NONE,
        GAUSSIAN_BLUR;

        public static VEDisPlayEffect valueOf(String str) {
            return (VEDisPlayEffect) V0N.LJJJ(VEDisPlayEffect.class, str);
        }
    }

    public VEDisplaySettings(Parcel parcel) {
        EnumC84107Wzf enumC84107Wzf;
        this.mFitMode = EnumC84107Wzf.SCALE_MODE_CENTER_INSIDE;
        this.mLayoutSize = new VESize(0, 0);
        this.mCamOutSize = new VESize(0, 0);
        this.mForceAdaptSurfaceSize = false;
        this.mCanvasSize = new VESize(0, 0);
        this.mEffect = VEDisPlayEffect.NONE;
        this.mEffectIntensity = 0.0f;
        this.mTranslateX = parcel.readInt();
        this.mTranslateY = parcel.readInt();
        this.mFlipX = parcel.readBoolean();
        this.mFlipY = parcel.readBoolean();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            enumC84107Wzf = null;
        } else {
            enumC84107Wzf = EnumC84107Wzf.values()[readInt];
        }
        this.mFitMode = enumC84107Wzf;
        this.mRotation = parcel.readInt();
        this.mEffectRotation = parcel.readInt();
        this.mDisplayRotation = parcel.readInt();
        this.mBgColor = parcel.readInt();
        this.mDisplayRatio = parcel.readFloat();
        int readInt2 = parcel.readInt();
        this.mDisplayRatioMode = readInt2 != -1 ? EnumC63976P8y.values()[readInt2] : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VEDisplaySettings vEDisplaySettings = (VEDisplaySettings) obj;
        if (this.mTranslateX == vEDisplaySettings.mTranslateX && this.mTranslateY == vEDisplaySettings.mTranslateY && this.mFlipX == vEDisplaySettings.mFlipX && this.mFlipY == vEDisplaySettings.mFlipY && this.mRotation == vEDisplaySettings.mRotation && this.mEffectRotation == vEDisplaySettings.mEffectRotation && this.mDisplayRotation == vEDisplaySettings.mDisplayRotation && this.mBgColor == vEDisplaySettings.mBgColor && Float.compare(vEDisplaySettings.mDisplayRatio, this.mDisplayRatio) == 0 && this.mForceAdaptSurfaceSize == vEDisplaySettings.mForceAdaptSurfaceSize && Float.compare(vEDisplaySettings.mEffectIntensity, this.mEffectIntensity) == 0 && this.mFitMode == vEDisplaySettings.mFitMode && this.mDisplayRatioMode == vEDisplaySettings.mDisplayRatioMode && this.mRenderSize.equals(vEDisplaySettings.mRenderSize) && this.mLayoutSize.equals(vEDisplaySettings.mLayoutSize) && this.mCamOutSize.equals(vEDisplaySettings.mCamOutSize) && this.mEffect == vEDisplaySettings.mEffect) {
            return true;
        }
        return false;
    }

    public /* synthetic */ VEDisplaySettings(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14) {
        this();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeInt(this.mTranslateX);
        parcel.writeInt(this.mTranslateY);
        parcel.writeBoolean(this.mFlipX);
        parcel.writeBoolean(this.mFlipY);
        EnumC84107Wzf enumC84107Wzf = this.mFitMode;
        int i2 = -1;
        if (enumC84107Wzf == null) {
            ordinal = -1;
        } else {
            ordinal = enumC84107Wzf.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.mRotation);
        parcel.writeInt(this.mEffectRotation);
        parcel.writeInt(this.mDisplayRotation);
        parcel.writeLong(this.mBgColor);
        parcel.writeFloat(this.mDisplayRatio);
        EnumC63976P8y enumC63976P8y = this.mDisplayRatioMode;
        if (enumC63976P8y != null) {
            i2 = enumC63976P8y.ordinal();
        }
        parcel.writeInt(i2);
    }
}

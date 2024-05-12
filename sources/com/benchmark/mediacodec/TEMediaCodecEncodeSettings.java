package com.benchmark.mediacodec;

import X.X1D;

/* loaded from: classes19.dex */
public class TEMediaCodecEncodeSettings {
    public int mBitRate;
    public int mBitRateMode;
    public int mChangeFPSIndex;
    public int mColorRange;
    public int mColorStandard;
    public int mColorTransfer;
    public int mEncodeProfile;
    public int mFrameRate;
    public int mHeight;
    public int mIFrameInternal;
    public int mInputColorFormat;
    public String mMimeType;
    public boolean mOffBFrame;
    public int mWidth;

    public boolean useSurfaceInput() {
        if (this.mInputColorFormat == 2130708361) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mimeType: ");
        LIZ.append(this.mMimeType);
        LIZ.append(", mInputColorFormat: ");
        LIZ.append(this.mInputColorFormat);
        LIZ.append(", mFrameRate");
        LIZ.append(this.mFrameRate);
        LIZ.append(", mIFrameInternal: ");
        LIZ.append(this.mIFrameInternal);
        LIZ.append(", mBitRate: ");
        LIZ.append(this.mBitRate);
        LIZ.append(", mBitRateMode: ");
        LIZ.append(this.mBitRateMode);
        LIZ.append(", mEncodeProfile: ");
        LIZ.append(this.mEncodeProfile);
        LIZ.append(", width: ");
        LIZ.append(this.mWidth);
        LIZ.append(", height: ");
        LIZ.append(this.mHeight);
        LIZ.append(",colorRange: ");
        LIZ.append(this.mColorRange);
        LIZ.append(", colorStandard: ");
        LIZ.append(this.mColorStandard);
        LIZ.append(", colorTransfer: ");
        LIZ.append(this.mColorTransfer);
        return X1D.LIZIZ(LIZ);
    }

    public int getBitRate() {
        return this.mBitRate;
    }

    public int getBitRateMode() {
        return this.mBitRateMode;
    }

    public int getChangeFPSIndex() {
        return this.mChangeFPSIndex;
    }

    public int getColorRange() {
        return this.mColorRange;
    }

    public int getColorStandard() {
        return this.mColorStandard;
    }

    public int getColorTransfer() {
        return this.mColorTransfer;
    }

    public int getEncodeProfile() {
        return this.mEncodeProfile;
    }

    public int getFrameRate() {
        return this.mFrameRate;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getIFrameInternal() {
        return this.mIFrameInternal;
    }

    public int getInputColorFormat() {
        return this.mInputColorFormat;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isOffBFrame() {
        return this.mOffBFrame;
    }
}

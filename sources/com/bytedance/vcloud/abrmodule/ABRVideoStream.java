package com.bytedance.vcloud.abrmodule;

/* loaded from: classes9.dex */
public class ABRVideoStream implements IVideoStream {
    public int mBandWidth;
    public String mCodec;
    public int mFrameRate;
    public int mHeight;
    public int mRealBitrate;
    public int mResolution;
    public int mSegmentDuration;
    public String mStreamId = "";
    public int mSupportSR;
    public int mWidth;

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public float getFrameRate() {
        return this.mFrameRate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getBandwidth() {
        return this.mBandWidth;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getCodec() {
        return this.mCodec;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getRealBitrate() {
        return this.mRealBitrate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getResolution() {
        return this.mResolution;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getSegmentDuration() {
        return this.mSegmentDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getStreamId() {
        return this.mStreamId;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getSupportSR() {
        return this.mSupportSR;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getWidth() {
        return this.mWidth;
    }

    public void setBandWidth(int i) {
        this.mBandWidth = i;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setFrameRate(int i) {
        this.mFrameRate = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setRealBitrate(int i) {
        this.mRealBitrate = i;
    }

    public void setResolution(int i) {
        this.mResolution = i;
    }

    public void setSegmentDuration(int i) {
        this.mSegmentDuration = i;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }

    public void setSupportSR(int i) {
        this.mSupportSR = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }
}

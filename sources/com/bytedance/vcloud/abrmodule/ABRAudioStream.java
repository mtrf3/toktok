package com.bytedance.vcloud.abrmodule;

/* loaded from: classes9.dex */
public class ABRAudioStream implements IAudioStream {
    public int mBandWidth;
    public String mCodec;
    public int mRealBitrate;
    public int mSampleRate;
    public int mSegmentDuration;
    public String mStreamId = "";

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getBandwidth() {
        return this.mBandWidth;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getCodec() {
        return this.mCodec;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getRealBitrate() {
        return this.mRealBitrate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IAudioStream
    public int getSampleRate() {
        return this.mSampleRate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getSegmentDuration() {
        return this.mSegmentDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getStreamId() {
        return this.mStreamId;
    }

    public void setBandWidth(int i) {
        this.mBandWidth = i;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setRealBitrate(int i) {
        this.mRealBitrate = i;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }

    public void setSegmentDuration(int i) {
        this.mSegmentDuration = i;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}

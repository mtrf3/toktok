package com.ss.ttlivestreamer.core.codec;

import com.ss.ttlivestreamer.core.engine.VideoEncoder;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;
import defpackage.a1;

/* loaded from: classes12.dex */
public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    public VideoEncoderFactory mHWFacotry = new HardwareVideoEncoderFactory();

    private native VideoEncoder nativeDefaultCreateVideoEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
        this.mHWFacotry.release();
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public String GetSupportedFormats() {
        return a1.LJ(this.mHWFacotry.GetSupportedFormats(), ":", nativeDefaultGetSupportedFormats());
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        VideoEncoder CreateVideoEncoder = this.mHWFacotry.CreateVideoEncoder(str, z);
        if (CreateVideoEncoder == null) {
            return nativeDefaultCreateVideoEncoder(str, z);
        }
        return CreateVideoEncoder;
    }
}

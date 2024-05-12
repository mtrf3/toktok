package com.ss.bytertc.engine.video.builder;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class GLTextureVideoFrameBuilder {
    public final DirectBufferVideoFrame frame;

    public VideoFrame build() {
        return this.frame;
    }

    public GLTextureVideoFrameBuilder(VideoPixelFormat videoPixelFormat) {
        this.frame = new DirectBufferVideoFrame(videoPixelFormat);
    }

    public GLTextureVideoFrameBuilder setColorSpace(ColorSpace colorSpace) {
        this.frame.setColorSpace(colorSpace);
        return this;
    }

    public GLTextureVideoFrameBuilder setEGLContext(EGLContext eGLContext) {
        this.frame.setEGLContext(eGLContext);
        return this;
    }

    public GLTextureVideoFrameBuilder setExternalDataInfo(ByteBuffer byteBuffer) {
        this.frame.setExternalDataInfo(byteBuffer);
        return this;
    }

    public GLTextureVideoFrameBuilder setHeight(int i) {
        this.frame.setHeight(i);
        return this;
    }

    public GLTextureVideoFrameBuilder setReleaseCallback(Runnable runnable) {
        this.frame.setReleaseCallback(runnable);
        return this;
    }

    public GLTextureVideoFrameBuilder setRotation(VideoRotation videoRotation) {
        this.frame.setRotation(videoRotation);
        return this;
    }

    public GLTextureVideoFrameBuilder setSupplementaryInfo(ByteBuffer byteBuffer) {
        this.frame.setSupplementaryInfo(byteBuffer);
        return this;
    }

    public GLTextureVideoFrameBuilder setTextureID(int i) {
        this.frame.setTextureID(i);
        return this;
    }

    public GLTextureVideoFrameBuilder setTextureMatrix(float[] fArr) {
        this.frame.setTextureMatrix(fArr);
        return this;
    }

    public GLTextureVideoFrameBuilder setTimeStampUs(long j) {
        this.frame.setTimeStampUs(j);
        return this;
    }

    public GLTextureVideoFrameBuilder setWidth(int i) {
        this.frame.setWidth(i);
        return this;
    }
}

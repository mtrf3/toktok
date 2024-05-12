package com.bytedance.realx.video.memory.bridge;

import android.opengl.EGLContext;
import com.bytedance.realx.video.FilterType;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.memory.RXVideoTextureMemory;
import com.bytedance.realx.video.memory.bridge.WebrtcTextureVideoMemory;

/* loaded from: classes33.dex */
public class WebrtcTextureVideoMemory extends RXVideoTextureMemory {
    public EGLContext eglContext;
    public RXVideoRotation rotation;
    public VideoFrame.TextureBuffer textureBuffer;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer != null) {
            textureBuffer.release();
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public int getHeight() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            return 0;
        }
        return textureBuffer.getHeight();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public long getNativeEGLContext() {
        EGLContext eGLContext = this.eglContext;
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public RXVideoRotation getRotation() {
        if (this.textureBuffer == null) {
            return RXVideoRotation.VIDEO_ROTATION_0;
        }
        return this.rotation;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXVideoScaleFilter getScaleFilter() {
        FilterType scaleFilter = this.textureBuffer.getScaleFilter();
        if (scaleFilter == null) {
            return RXVideoScaleFilter.kOpenGLOrigin;
        }
        return RXVideoScaleFilter.fromId(scaleFilter.toInt());
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getTextureId() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            return 0;
        }
        return textureBuffer.getTextureId();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public float[] getTextureMatrix() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            float[] fArr = new float[16];
            fArr[0] = 1.0f;
            fArr[5] = 1.0f;
            fArr[10] = 1.0f;
            fArr[15] = 1.0f;
            return fArr;
        }
        return textureBuffer.nativeGetTransFormMatrix();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXPixelFormat getTextureTarget() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            return null;
        }
        return RXPixelFormat.fromId(textureBuffer.getTypeGlTarget());
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledHeight() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            return 0;
        }
        return textureBuffer.getUnscaledHeight();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledWidth() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            return 0;
        }
        return textureBuffer.getUnscaledWidth();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public int getWidth() {
        VideoFrame.TextureBuffer textureBuffer = this.textureBuffer;
        if (textureBuffer == null) {
            return 0;
        }
        return textureBuffer.getWidth();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public RXVideoMemoryType getMemoryType() {
        return RXVideoMemoryType.kOPENGL_TEXTURE;
    }

    public WebrtcTextureVideoMemory(VideoFrame.TextureBuffer textureBuffer, EGLContext eGLContext, RXVideoRotation rXVideoRotation) {
        this.textureBuffer = textureBuffer;
        this.eglContext = eGLContext;
        this.rotation = rXVideoRotation;
        if (textureBuffer != null) {
            textureBuffer.retain();
        }
        setReleaseCallback(new Runnable() { // from class: X.ZV7
            @Override // java.lang.Runnable
            public final void run() {
                WebrtcTextureVideoMemory.this.lambda$new$0();
            }
        });
    }
}

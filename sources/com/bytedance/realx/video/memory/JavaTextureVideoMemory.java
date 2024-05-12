package com.bytedance.realx.video.memory;

import android.opengl.EGLContext;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;

/* loaded from: classes33.dex */
public class JavaTextureVideoMemory extends RXVideoTextureMemory {
    public EGLContext eglContext;
    public int height;
    public RXVideoRotation rotation;
    public RXVideoScaleFilter scaleFilter;
    public RXPixelFormat textureFormat;
    public int textureId;
    public float[] textureMatrix;
    public int unscaledHeight;
    public int unscaledWidth;
    public int width;

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public long getNativeEGLContext() {
        EGLContext eGLContext = this.eglContext;
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public float[] getTextureMatrix() {
        float[] fArr = this.textureMatrix;
        if (fArr == null) {
            float[] fArr2 = new float[16];
            fArr2[0] = 1.0f;
            fArr2[5] = 1.0f;
            fArr2[10] = 1.0f;
            fArr2[15] = 1.0f;
            return fArr2;
        }
        return fArr;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public EGLContext getEGLContext() {
        return this.eglContext;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public RXVideoMemoryType getMemoryType() {
        return RXVideoMemoryType.kOPENGL_TEXTURE;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public RXVideoRotation getRotation() {
        return this.rotation;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXVideoScaleFilter getScaleFilter() {
        return this.scaleFilter;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getTextureId() {
        return this.textureId;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXPixelFormat getTextureTarget() {
        return this.textureFormat;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledHeight() {
        return this.unscaledHeight;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledWidth() {
        return this.unscaledWidth;
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public int getWidth() {
        return this.width;
    }

    public JavaTextureVideoMemory(int i, int i2, RXVideoRotation rXVideoRotation, int i3, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.rotation = rXVideoRotation;
        this.textureId = i3;
        this.textureFormat = rXPixelFormat;
        this.textureMatrix = fArr;
        this.eglContext = eGLContext;
        this.scaleFilter = rXVideoScaleFilter;
    }

    public JavaTextureVideoMemory(int i, int i2, int i3, int i4, RXVideoRotation rXVideoRotation, int i5, RXPixelFormat rXPixelFormat, float[] fArr, EGLContext eGLContext, RXVideoScaleFilter rXVideoScaleFilter) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.rotation = rXVideoRotation;
        this.textureId = i5;
        this.textureFormat = rXPixelFormat;
        this.textureMatrix = fArr;
        this.eglContext = eGLContext;
        this.scaleFilter = rXVideoScaleFilter;
    }
}

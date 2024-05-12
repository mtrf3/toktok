package com.bytedance.realx.video.memory;

import android.opengl.EGLContext;
import com.bytedance.realx.video.RXPixelFormat;
import com.bytedance.realx.video.RXVideoMemoryType;
import com.bytedance.realx.video.RXVideoRotation;
import com.bytedance.realx.video.RXVideoScaleFilter;
import com.bytedance.realx.video.memory.NativeTextureVideoMemory;

/* loaded from: classes33.dex */
public class NativeTextureVideoMemory extends RXVideoTextureMemory {
    public long nativeHandle;

    public static native int nativeGetHeight(long j);

    public static native EGLContext nativeGetJavaEGLContext(long j);

    public static native long nativeGetNativeEGLContext(long j);

    public static native RXVideoRotation nativeGetRotation(long j);

    public static native RXVideoScaleFilter nativeGetScaleFilter(long j);

    public static native int nativeGetTextureId(long j);

    public static native float[] nativeGetTextureMatrix(long j);

    public static native RXPixelFormat nativeGetTextureTarget(long j);

    public static native int nativeGetUnscaledHeight(long j);

    public static native int nativeGetUnscaledWidth(long j);

    public static native RXVideoMemoryType nativeGetVideoMemoryType(long j);

    public static native int nativeGetWidth(long j);

    public static native void nativeReleaseTextureVideoMemory(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseTextureVideoMemory(j);
            this.nativeHandle = 0L;
        }
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public EGLContext getEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetJavaEGLContext(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetHeight(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public RXVideoMemoryType getMemoryType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetVideoMemoryType(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public long getNativeEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetNativeEGLContext(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public RXVideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXVideoScaleFilter getScaleFilter() {
        return nativeGetScaleFilter(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getTextureId() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTextureId(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public float[] getTextureMatrix() {
        long j = this.nativeHandle;
        if (j == 0) {
            float[] fArr = new float[16];
            fArr[0] = 1.0f;
            fArr[5] = 1.0f;
            fArr[10] = 1.0f;
            fArr[15] = 1.0f;
            return fArr;
        }
        return nativeGetTextureMatrix(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public RXPixelFormat getTextureTarget() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetTextureTarget(j);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledHeight() {
        return nativeGetUnscaledHeight(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoTextureMemory
    public int getUnScaledWidth() {
        return nativeGetUnscaledWidth(this.nativeHandle);
    }

    @Override // com.bytedance.realx.video.memory.RXVideoMemory
    public int getWidth() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetWidth(j);
    }

    public NativeTextureVideoMemory(long j) {
        this.nativeHandle = j;
        setReleaseCallback(new Runnable() { // from class: X.ZV4
            @Override // java.lang.Runnable
            public final void run() {
                NativeTextureVideoMemory.this.lambda$new$0();
            }
        });
    }
}

package com.ss.bytertc.engine.video.impl;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.video.FovVideoFrameInfo;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.NativeBufferVideoFrame;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class NativeBufferVideoFrame extends VideoFrame {
    public long nativeHandle;

    public static native void nativeFreeVideoFrame(long j);

    public static native CameraId nativeGetCameraId(long j);

    public static native ColorSpace nativeGetColorSpace(long j);

    public static native VideoContentType nativeGetContentType(long j);

    public static native EGLContext nativeGetEglContext(long j);

    public static native ByteBuffer nativeGetExternalDataInfo(long j);

    public static native FovVideoFrameInfo nativeGetFovTile(long j);

    public static native int nativeGetHeight(long j);

    public static native int nativeGetNumberOfPlanes(long j);

    public static native VideoPixelFormat nativeGetPixelFormat(long j);

    public static native ByteBuffer nativeGetPlaneData(long j, int i);

    public static native VideoRotation nativeGetRotation(long j);

    public static native ByteBuffer nativeGetSupplementaryInfo(long j);

    public static native int nativeGetTextureID(long j);

    public static native float[] nativeGetTextureMatrix(long j);

    public static native long nativeGetTimeStampUs(long j);

    public static native VideoFrameType nativeGetVideoFrameType(long j);

    public static native int nativeGetWidth(long j);

    public static native int nativegetPlaneStride(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeFreeVideoFrame(j);
            this.nativeHandle = 0L;
        }
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public CameraId getCameraId() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetCameraId(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ColorSpace getColorSpace() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetColorSpace(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoContentType getContentType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetContentType(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public EGLContext getEGLContext() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetEglContext(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getExternalDataInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetExternalDataInfo(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public FovVideoFrameInfo getFovTileInfo() {
        return nativeGetFovTile(this.nativeHandle);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoFrameType getFrameType() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetVideoFrameType(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getHeight() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetHeight(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getNumberOfPlanes() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetNumberOfPlanes(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoPixelFormat getPixelFormat() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetPixelFormat(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public VideoRotation getRotation() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetRotation(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getSupplementaryInfo() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetSupplementaryInfo(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getTextureID() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetTextureID(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public float[] getTextureMatrix() {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetTextureMatrix(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public long getTimeStampUs() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetTimeStampUs(j);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getWidth() {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativeGetWidth(j);
    }

    public NativeBufferVideoFrame(long j) {
        this.nativeHandle = j;
        setReleaseCallback(new Runnable() { // from class: X.ZW5
            @Override // java.lang.Runnable
            public final void run() {
                NativeBufferVideoFrame.this.lambda$new$0();
            }
        });
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public ByteBuffer getPlaneData(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetPlaneData(j, i);
    }

    @Override // com.ss.bytertc.engine.video.VideoFrame
    public int getPlaneStride(int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return 0;
        }
        return nativegetPlaneStride(j, i);
    }
}

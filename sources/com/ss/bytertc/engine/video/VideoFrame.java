package com.ss.bytertc.engine.video;

import android.opengl.EGLContext;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.VideoContentType;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.mediaio.RefObject;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public abstract class VideoFrame {
    public final RefObject refCount = new RefObject(new Runnable() { // from class: X.ZW4
        @Override // java.lang.Runnable
        public final void run() {
            VideoFrame.this.lambda$new$0();
        }
    });
    public Runnable userReleaseCallback;

    public abstract CameraId getCameraId();

    public abstract ColorSpace getColorSpace();

    public abstract VideoContentType getContentType();

    public abstract EGLContext getEGLContext();

    public abstract ByteBuffer getExternalDataInfo();

    public FovVideoFrameInfo getFovTileInfo() {
        return null;
    }

    public abstract VideoFrameType getFrameType();

    public abstract int getHeight();

    public abstract int getNumberOfPlanes();

    public abstract VideoPixelFormat getPixelFormat();

    public abstract ByteBuffer getPlaneData(int i);

    public abstract int getPlaneStride(int i);

    public abstract VideoRotation getRotation();

    public abstract ByteBuffer getSupplementaryInfo();

    public abstract int getTextureID();

    public abstract float[] getTextureMatrix();

    public abstract long getTimeStampUs();

    public abstract int getWidth();

    public synchronized boolean hasReleaseCallback() {
        boolean z;
        if (this.userReleaseCallback == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public synchronized void release() {
        RefObject refObject = this.refCount;
        if (refObject != null) {
            refObject.release();
        }
    }

    public synchronized void retain() {
        RefObject refObject = this.refCount;
        if (refObject != null) {
            refObject.retain();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        Runnable runnable = this.userReleaseCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public synchronized void setReleaseCallback(Runnable runnable) {
        this.userReleaseCallback = runnable;
    }
}

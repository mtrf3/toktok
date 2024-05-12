package com.ss.android.vesdk.video;

import X.C01R;
import X.C169706lK;
import X.C63897P5x;
import X.EnumC63901P6b;
import X.P3Y;
import X.P4Q;
import X.P61;
import X.P62;
import X.P6E;
import X.P6O;
import X.P6P;
import X.X1D;
import android.graphics.SurfaceTexture;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public class TEVideoDataInterface {
    public TECameraFrameSetting mCameraFrameSetting;
    public P6O mCapturePipeline;
    public C169706lK<P6O> mCapturePipelines;
    public long mHandler;
    public SurfaceTexture mSurfaceTexture;
    public C63897P5x mTextureHolder;

    private native void nativeCameraParam(long j, TECameraFrameSetting tECameraFrameSetting);

    private native long nativeCreateVideoDataInterface();

    private native void nativeInit(long j);

    private native void nativeReleaseVideoDataInterface(long j);

    public native void nativeNotifyFrameAvailable(long j);

    public void destroy() {
        try {
            this.mTextureHolder.LIZIZ();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("detachFromGLContext error: ");
            LIZ.append(e.getMessage());
            P4Q.LIZJ("TEVideoDataInterface", X1D.LIZIZ(LIZ));
        }
        this.mTextureHolder.LIZLLL(true);
        long j = this.mHandler;
        if (j != 0) {
            nativeReleaseVideoDataInterface(j);
            this.mHandler = 0L;
        }
    }

    public void getNextFrame() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        C63897P5x c63897P5x = this.mTextureHolder;
        SurfaceTexture surfaceTexture2 = c63897P5x.LIZIZ;
        if (surfaceTexture != surfaceTexture2) {
            if (surfaceTexture2 != null) {
                try {
                    c63897P5x.LIZIZ();
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("detachFromGLContext error: ");
                    LIZ.append(e.getMessage());
                    P4Q.LIZJ("TEVideoDataInterface", X1D.LIZIZ(LIZ));
                }
            }
            this.mTextureHolder.LIZIZ = this.mSurfaceTexture;
        }
        try {
            P6P p6p = (P6P) this.mCapturePipeline;
            C63897P5x c63897P5x2 = this.mTextureHolder;
            p6p.LJI = c63897P5x2.LIZ;
            c63897P5x2.LIZ();
            this.mTextureHolder.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("timestamp = ");
            LIZ2.append(this.mTextureHolder.LIZJ());
            P4Q.LIZ("TEVideoDataInterface", X1D.LIZIZ(LIZ2));
        } catch (Exception e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("updateTexImage error: ");
            LIZ3.append(e2.getMessage());
            P4Q.LIZJ("TEVideoDataInterface", X1D.LIZIZ(LIZ3));
        }
    }

    public void onGLEnvInited() {
        C63897P5x c63897P5x = this.mTextureHolder;
        c63897P5x.getClass();
        c63897P5x.LIZ = P62.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createOESTexture mSurfaceTextureID = ");
        C01R.LIZJ(LIZ, c63897P5x.LIZ, LIZ, "TextureHolder");
    }

    public TEVideoDataInterface() {
        this.mTextureHolder = new C63897P5x();
        this.mCapturePipelines = new C169706lK<>();
        this.mHandler = nativeCreateVideoDataInterface();
    }

    public long getTexImageTimeDelay() {
        return (long) (((System.nanoTime() / 1000000.0d) - this.mTextureHolder.LIZJ()) * 1000.0d);
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public TEVideoDataInterface(long j) {
        this.mTextureHolder = new C63897P5x();
        this.mCapturePipelines = new C169706lK<>();
        this.mHandler = j;
        nativeInit(j);
    }

    public void setCameraParams(P6E p6e) {
        P3Y p3y = p6e.LJII;
        int i = p3y.LIZLLL;
        if (p3y.LIZIZ == EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES) {
            int i2 = this.mTextureHolder.LIZ;
            TEFrameSizei tEFrameSizei = p3y.LIZ;
            this.mCameraFrameSetting = new TECameraFrameSetting(i2, 0, tEFrameSizei.width, tEFrameSizei.height, i, p6e.LIZIZ(), 0, p6e.LJII.LIZIZ.ordinal(), 0);
        }
        long j = this.mHandler;
        if (j != 0) {
            nativeCameraParam(j, this.mCameraFrameSetting);
        }
    }

    public void setCapturePipeline(P6O p6o) {
        this.mCapturePipeline = p6o;
        p6o.LIZJ = new P61(this);
    }
}

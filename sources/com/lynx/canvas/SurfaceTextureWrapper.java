package com.lynx.canvas;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes9.dex */
public class SurfaceTextureWrapper {
    public final SurfaceTexture LIZ;
    public Surface LIZIZ;

    public double getTimestamp() {
        SurfaceTexture surfaceTexture = this.LIZ;
        if (surfaceTexture != null) {
            long timestamp = surfaceTexture.getTimestamp();
            long abs = Math.abs(System.nanoTime() - timestamp);
            long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - timestamp);
            return r4 - Math.min(Math.min(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - timestamp));
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public void release() {
        SurfaceTexture surfaceTexture = this.LIZ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        Surface surface = this.LIZIZ;
        if (surface != null) {
            surface.release();
        }
    }

    public float[] updateTexture() {
        SurfaceTexture surfaceTexture = this.LIZ;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
            float[] fArr = new float[16];
            this.LIZ.getTransformMatrix(fArr);
            return fArr;
        }
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public SurfaceTextureWrapper(int i) {
        this.LIZ = new SurfaceTexture(i);
    }

    public static SurfaceTextureWrapper create(int i) {
        return new SurfaceTextureWrapper(i);
    }
}

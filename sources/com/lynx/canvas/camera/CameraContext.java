package com.lynx.canvas.camera;

import X.C03880Dg;
import X.C65300Pk0;
import X.O5Y;
import X.PPS;
import X.PPT;
import X.PPW;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.lynx.canvas.SurfaceTextureWrapper;
import java.io.IOException;

/* loaded from: classes12.dex */
public class CameraContext {
    public PPW LIZ;

    public static native void nativeOnCameraCallback(long j, CameraContext cameraContext, int i, int i2);

    public static native void nativeOnCameraErrorCallback(long j, String str);

    public void pause() {
        PPS pps = (PPS) this.LIZ;
        Camera camera = pps.LJ;
        if (camera == null) {
            return;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "993235234398672878");
        if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.stopPreview();
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
        }
        pps.LJ.lock();
    }

    public void play() {
        Camera camera = ((PPS) this.LIZ).LJ;
        if (camera == null) {
            return;
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "993235234398672878");
        if (c03880Dg.LIZJ(100102, "android/hardware/Camera", "startPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.startPreview();
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    public void release() {
        PPS pps = (PPS) this.LIZ;
        Camera camera = pps.LJ;
        if (camera != null) {
            PPT ppt = pps.LJII;
            if (ppt != null) {
                ppt.releaseCamera(camera);
            } else {
                C03880Dg c03880Dg = new C03880Dg(2);
                Object[] objArr = new Object[0];
                C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "993235234398672878");
                if (c03880Dg.LIZJ(100101, "android/hardware/Camera", "release", camera, objArr, "void", c65300Pk0).LIZ) {
                    c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, false);
                } else {
                    camera.release();
                    c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, true);
                }
            }
            pps.LJ = null;
        }
        this.LIZ = null;
    }

    public CameraContext(PPW ppw) {
        this.LIZ = ppw;
    }

    public void setupPreviewTexture(SurfaceTextureWrapper surfaceTextureWrapper) {
        PPW ppw = this.LIZ;
        SurfaceTexture surfaceTexture = surfaceTextureWrapper.LIZ;
        Camera camera = ((PPS) ppw).LJ;
        if (camera == null) {
            return;
        }
        try {
            camera.setPreviewTexture(surfaceTexture);
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setPreviewTexture exception:");
            LIZ.append(e.toString());
            O5Y.LJIILIIL("Camera default", X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void requestCamera(com.lynx.canvas.KryptonApp r10, long r11, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.camera.CameraContext.requestCamera(com.lynx.canvas.KryptonApp, long, java.lang.String, java.lang.String):void");
    }
}

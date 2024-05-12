package com.lynx.canvas;

import X.VE1;
import X.Z85;
import X.Z86;
import X.Z87;
import X.Z88;
import java.util.LinkedList;

/* loaded from: classes17.dex */
public class CanvasPermissionManager {
    public static native void nativeOnCameraPermissionResponse(long j, boolean z);

    public static native void nativeOnMicrophonePermissionResponse(long j, boolean z);

    public static void RequestCameraPermission(KryptonApp kryptonApp, long j) {
        CanvasPermissionManager canvasPermissionManager = kryptonApp.LJ;
        VE1 ve1 = VE1.CAMERA;
        Z85 z85 = new Z85(j);
        canvasPermissionManager.getClass();
        LIZ(kryptonApp, ve1, z85);
    }

    public static void RequestMicrophonePermission(KryptonApp kryptonApp, long j) {
        CanvasPermissionManager canvasPermissionManager = kryptonApp.LJ;
        VE1 ve1 = VE1.RECORD_AUDIO;
        Z86 z86 = new Z86(j);
        canvasPermissionManager.getClass();
        LIZ(kryptonApp, ve1, z86);
    }

    public static void LIZ(KryptonApp kryptonApp, VE1 ve1, Z88 z88) {
        boolean z;
        if (kryptonApp != null) {
            synchronized (kryptonApp) {
                if (kryptonApp.LIZIZ != 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                Z87 z87 = (Z87) kryptonApp.LIZLLL.get(Z87.class);
                if (z87 == null) {
                    z88.LIZ();
                    return;
                }
                new LinkedList().add(ve1);
                if (z87.LIZ()) {
                    z88.LIZ();
                } else {
                    z87.LIZIZ();
                }
            }
        }
    }
}

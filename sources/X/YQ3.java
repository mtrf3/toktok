package X;

import android.hardware.Camera;
import android.os.Build;

/* loaded from: classes16.dex */
public final class YQ3 implements Camera.ErrorCallback {
    public final /* synthetic */ YQ4 LIZ;

    public YQ3(YQ4 yq42) {
        this.LIZ = yq42;
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i, Camera camera) {
        String LIZIZ;
        int i2;
        if (new C03880Dg(2).LIZJ(100107, "com/ss/android/ttvecamera/TECamera1$1", "onError", this, new Object[]{Integer.valueOf(i), camera}, "void", new C65300Pk0(false, "(ILandroid/hardware/Camera;)V", "3958460556082944801")).LIZ) {
            return;
        }
        C87367YQp.LIZ("te_record_camera_err_ret", i);
        if (i == 100) {
            LIZIZ = "Camera server died!";
            i2 = -407;
        } else if (Build.VERSION.SDK_INT >= 23 && i == 2) {
            LIZIZ = C64.LIZIZ("Camera disconnected: ", i);
            i2 = -409;
        } else if (i == 1) {
            LIZIZ = C64.LIZIZ("Camera unknown error: ", i);
            i2 = -410;
        } else {
            C63922P6w.LJ("TECamera1", "Ignore camera error here: " + i);
            return;
        }
        C63922P6w.LIZIZ("TECamera1", LIZIZ);
        YQ4 yq42 = this.LIZ;
        yq42.LLLILZJ(yq42.LJIJ);
        YQ4 yq43 = this.LIZ;
        yq43.LJIIL = 0;
        YQV yqv = yq43.LIZLLL;
        if (yqv != null) {
            yqv.LIZLLL(yq43.LJJIJLIJ, 1, i2, LIZIZ);
        }
    }
}

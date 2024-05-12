package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;

/* renamed from: X.P6z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63925P6z {
    public static void LIZ(CameraDevice cameraDevice, Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("check privacy, Camera close, cameraDevice:");
        LIZ.append(cameraDevice);
        C63922P6w.LIZLLL("TECamera2PolicyAdapter", X1D.LIZIZ(LIZ));
        P7T.LIZ("TECamera2PolicyAdapter-closeCamera");
        try {
            P3O.LIZ(cert, new P70(cameraDevice));
        } catch (Exception e) {
            C63922P6w.LIZJ("TECamera2PolicyAdapter", "Exception occur:", e);
        }
        P7T.LIZIZ();
    }

    public static void LIZIZ(YQE yqe, CameraManager cameraManager, Handler handler, Cert cert, String str) {
        C63922P6w.LIZLLL("TECamera2PolicyAdapter", "check privacy, Camera open");
        P7T.LIZ("TECamera2PolicyAdapter-openCamera");
        try {
            P3O.LIZIZ(cert, new P71(cameraManager, str, yqe, handler));
        } catch (Q0C e) {
            C63922P6w.LIZJ("TECamera2PolicyAdapter", "Exception occur:", e);
        }
        P7T.LIZIZ();
    }
}

package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.AqS33S1300000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P72 {
    public static void LIZ(CameraDevice close, C78862UxG c78862UxG) {
        o.LJIIJ(close, "$this$close");
        OHW LJIIJJI = OUP.LJIIJJI(100201, c78862UxG, "camera_close2");
        C78929UyL.LIZIZ(LJIIJJI, "android/hardware/camera2/CameraDevice", "close()V", null);
        C39207Fa7.LIZ(LJIIJJI, new AqS177S0100000_11(close, 40));
    }

    public static void LIZIZ(CameraDevice.StateCallback stateCallback, CameraManager cameraManager, Handler handler, C78862UxG c78862UxG, String str) {
        OHW LJIIJJI = OUP.LJIIJJI(100206, c78862UxG, "camera_open2");
        C78929UyL.LIZIZ(LJIIJJI, "android/hardware/camera2/CameraManager", "openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V", C113554cx.LJJL(new OSZ("cameraId", str), new OSZ("callback", stateCallback), new OSZ("handler", handler)));
        C39207Fa7.LIZ(LJIIJJI, new AqS33S1300000_11(cameraManager, str, stateCallback, handler, 1));
    }
}

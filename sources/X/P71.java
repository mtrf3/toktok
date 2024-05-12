package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class P71 implements InterfaceC63834P3m<Object> {
    public final /* synthetic */ CameraManager LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ CameraDevice.StateCallback LIZJ;
    public final /* synthetic */ Handler LIZLLL;

    @Override // X.InterfaceC63834P3m
    public final Object invoke() {
        CameraManager cameraManager = this.LIZ;
        String str = this.LIZIZ;
        CameraDevice.StateCallback stateCallback = this.LIZJ;
        Handler handler = this.LIZLLL;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, stateCallback, handler};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V", "-1150157588594264645");
        if (c03880Dg.LIZJ(100206, "android/hardware/camera2/CameraManager", "openCamera", cameraManager, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c65300Pk0, false);
            return null;
        }
        cameraManager.openCamera(str, stateCallback, handler);
        c03880Dg.LIZIZ(100206, "android/hardware/camera2/CameraManager", "openCamera", null, objArr, cameraManager, c65300Pk0, true);
        return null;
    }

    public P71(CameraManager cameraManager, String str, YQE yqe, Handler handler) {
        this.LIZ = cameraManager;
        this.LIZIZ = str;
        this.LIZJ = yqe;
        this.LIZLLL = handler;
    }
}

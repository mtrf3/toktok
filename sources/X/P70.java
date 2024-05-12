package X;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes12.dex */
public final class P70 implements InterfaceC63834P3m<Object> {
    public final /* synthetic */ CameraDevice LIZ;

    @Override // X.InterfaceC63834P3m
    public final Object invoke() {
        CameraDevice cameraDevice = this.LIZ;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-1150157588594264645");
        if (c03880Dg.LIZJ(100201, "android/hardware/camera2/CameraDevice", "close", cameraDevice, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, false);
            return null;
        }
        cameraDevice.close();
        c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, true);
        return null;
    }

    public P70(CameraDevice cameraDevice) {
        this.LIZ = cameraDevice;
    }
}

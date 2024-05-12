package X;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes15.dex */
public final class VY4 extends CameraDevice.StateCallback {
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onDisconnected");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        if (new C03880Dg(2).LIZJ(100200, "com/ss/android/ttvecamera/armode/ArCoreManager$2", "onOpened", this, new Object[]{cameraDevice}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;)V", "5316746779613847452")).LIZ) {
            return;
        }
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onOpened");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        if (new C03880Dg(2).LIZJ(100207, "com/ss/android/ttvecamera/armode/ArCoreManager$2", "onError", this, new Object[]{cameraDevice, Integer.valueOf(i)}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;I)V", "5316746779613847452")).LIZ) {
            return;
        }
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onError");
    }
}

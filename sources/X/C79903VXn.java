package X;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.o;

/* renamed from: X.VXn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79903VXn extends CameraDevice.StateCallback {
    public final /* synthetic */ C79902VXm LIZ;

    public static void LIZ(CameraDevice cameraDevice) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "1447688769535428337");
        if (c03880Dg.LIZJ(100201, "android/hardware/camera2/CameraDevice", "close", cameraDevice, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, false);
        } else {
            cameraDevice.close();
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, true);
        }
    }

    public C79903VXn(C79902VXm c79902VXm) {
        this.LIZ = c79902VXm;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        o.LJIIIZ(cameraDevice, "cameraDevice");
        LIZ(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        if (new C03880Dg(2).LIZJ(100200, "com/ss/android/ugc/aweme/view/customview/NaviGLSurfaceView$setCameraHW$2", "onOpened", this, new Object[]{cameraDevice}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;)V", "1447688769535428337")).LIZ) {
            return;
        }
        o.LJIIIZ(cameraDevice, "cameraDevice");
        if (o.LJ(cameraDevice.getId(), this.LIZ.LJLZ)) {
            C79902VXm c79902VXm = this.LIZ;
            c79902VXm.LJLLL = cameraDevice;
            c79902VXm.getClass();
            try {
                CameraDevice cameraDevice2 = c79902VXm.LJLLL;
                o.LJI(cameraDevice2);
                cameraDevice2.createCaptureSession(C47261Igj.LJJIJ(c79902VXm.LJLJI), new VY3(c79902VXm), c79902VXm.LJLLJ);
            } catch (Exception e) {
                H78.LJ(e);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        if (new C03880Dg(2).LIZJ(100207, "com/ss/android/ugc/aweme/view/customview/NaviGLSurfaceView$setCameraHW$2", "onError", this, new Object[]{cameraDevice, Integer.valueOf(i)}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;I)V", "1447688769535428337")).LIZ) {
            return;
        }
        o.LJIIIZ(cameraDevice, "cameraDevice");
        LIZ(cameraDevice);
    }
}

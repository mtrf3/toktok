package X;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.google.ar.core.SharedCamera;

/* renamed from: X.aSX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93541aSX extends CameraDevice.StateCallback {
    public static final /* synthetic */ int LIZLLL = 0;
    public final /* synthetic */ Handler LIZ;
    public final /* synthetic */ CameraDevice.StateCallback LIZIZ;
    public final /* synthetic */ SharedCamera LIZJ;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.LIZ.post(new RunnableC93536aSS(this.LIZIZ, cameraDevice, 0));
        this.LIZJ.onDeviceClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.LIZ.post(new RunnableC93536aSS(this.LIZIZ, cameraDevice, (Object) null));
        this.LIZJ.onDeviceDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        if (new C03880Dg(2).LIZJ(100200, "com/google/ar/core/al", "onOpened", this, new Object[]{cameraDevice}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;)V", "-3607906922738218683")).LIZ) {
            return;
        }
        this.LIZJ.sharedCameraInfo.LIZ = cameraDevice;
        this.LIZ.post(new RunnableC93536aSS(this.LIZIZ, cameraDevice));
        this.LIZJ.onDeviceOpened(cameraDevice);
        SharedCamera sharedCamera = this.LIZJ;
        sharedCamera.sharedCameraInfo.LIZJ = sharedCamera.getGpuSurfaceTexture();
        SharedCamera sharedCamera2 = this.LIZJ;
        sharedCamera2.sharedCameraInfo.LIZLLL = sharedCamera2.getGpuSurface();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        if (new C03880Dg(2).LIZJ(100207, "com/google/ar/core/al", "onError", this, new Object[]{cameraDevice, Integer.valueOf(i)}, "void", new C65300Pk0(false, "(Landroid/hardware/camera2/CameraDevice;I)V", "-3607906922738218683")).LIZ) {
            return;
        }
        Handler handler = this.LIZ;
        final CameraDevice.StateCallback stateCallback = this.LIZIZ;
        handler.post(new Runnable(stateCallback, cameraDevice, i) { // from class: X.aSV
            public final CameraDevice.StateCallback LJLIL;
            public final CameraDevice LJLILLLLZI;
            public final int LJLJI;

            {
                this.LJLIL = stateCallback;
                this.LJLILLLLZI = cameraDevice;
                this.LJLJI = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    this.LJLIL.onError(this.LJLILLLLZI, this.LJLJI);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.LIZJ.close();
    }

    public C93541aSX(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.LIZJ = sharedCamera;
        this.LIZ = handler;
        this.LIZIZ = stateCallback;
    }
}

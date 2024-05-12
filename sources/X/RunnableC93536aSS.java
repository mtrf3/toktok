package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.aSS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final /* synthetic */ class RunnableC93536aSS implements Runnable {
    public final CameraDevice.StateCallback LJLIL;
    public final CameraDevice LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public RunnableC93536aSS(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraDevice;
    }

    public RunnableC93536aSS(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.LJLJI = 1;
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraDevice;
    }

    public RunnableC93536aSS(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, Object obj) {
        this.LJLJI = 2;
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int i = this.LJLJI;
            if (i != 0) {
                if (i != 1) {
                    this.LJLIL.onDisconnected(this.LJLILLLLZI);
                } else {
                    this.LJLIL.onClosed(this.LJLILLLLZI);
                }
            } else {
                this.LJLIL.onOpened(this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}

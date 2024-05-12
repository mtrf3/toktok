package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.aSc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final /* synthetic */ class RunnableC93546aSc implements Runnable {
    public final CameraCaptureSession.StateCallback LJLIL;
    public final CameraCaptureSession LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public RunnableC93546aSc(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraCaptureSession;
    }

    public RunnableC93546aSc(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, int i) {
        this.LJLJI = 1;
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraCaptureSession;
    }

    public RunnableC93546aSc(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, C93543aSZ c93543aSZ) {
        this.LJLJI = 4;
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraCaptureSession;
    }

    public RunnableC93546aSc(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, C93544aSa c93544aSa) {
        this.LJLJI = 3;
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraCaptureSession;
    }

    public RunnableC93546aSc(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Object obj) {
        this.LJLJI = 2;
        this.LJLIL = stateCallback;
        this.LJLILLLLZI = cameraCaptureSession;
    }

    public final void LIZ() {
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.LJLIL.onActive(this.LJLILLLLZI);
                        return;
                    } else {
                        this.LJLIL.onReady(this.LJLILLLLZI);
                        return;
                    }
                }
                this.LJLIL.onConfigureFailed(this.LJLILLLLZI);
                return;
            }
            this.LJLIL.onClosed(this.LJLILLLLZI);
            return;
        }
        this.LJLIL.onConfigured(this.LJLILLLLZI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

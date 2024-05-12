package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.Vbj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80075Vbj extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C80074Vbi LIZ;

    public C80075Vbj(C80074Vbi c80074Vbi) {
        this.LIZ = c80074Vbi;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onActive");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onClosed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onConfigureFailed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onConfigured");
        this.LIZ.LJIIIIZZ = System.currentTimeMillis();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        C63922P6w.LIZLLL(C80074Vbi.LJIIJ, "onReady");
    }
}

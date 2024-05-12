package X;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.ar.core.SharedCamera;

/* renamed from: X.aSe, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93548aSe extends CameraCaptureSession.StateCallback {
    public static final /* synthetic */ int LIZLLL = 0;
    public final /* synthetic */ Handler LIZ;
    public final /* synthetic */ CameraCaptureSession.StateCallback LIZIZ;
    public final /* synthetic */ SharedCamera LIZJ;

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.post(new RunnableC93546aSc(this.LIZIZ, cameraCaptureSession, (C93543aSZ) null));
        this.LIZJ.onCaptureSessionActive(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.post(new RunnableC93546aSc(this.LIZIZ, cameraCaptureSession, 0));
        this.LIZJ.onCaptureSessionClosed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.post(new RunnableC93546aSc(this.LIZIZ, cameraCaptureSession, (Object) null));
        this.LIZJ.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.post(new RunnableC93546aSc(this.LIZIZ, cameraCaptureSession));
        this.LIZJ.onCaptureSessionConfigured(cameraCaptureSession);
        SharedCamera sharedCamera = this.LIZJ;
        if (sharedCamera.sharedCameraInfo.LIZ != null) {
            sharedCamera.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.post(new RunnableC93546aSc(this.LIZIZ, cameraCaptureSession, (C93544aSa) null));
        this.LIZJ.onCaptureSessionReady(cameraCaptureSession);
    }

    public C93548aSe(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.LIZJ = sharedCamera;
        this.LIZ = handler;
        this.LIZIZ = stateCallback;
    }
}

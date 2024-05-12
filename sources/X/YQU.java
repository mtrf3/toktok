package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;

/* loaded from: classes16.dex */
public final class YQU extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ YQ8 LIZ;

    public YQU(YQ8 yq8) {
        this.LIZ = yq8;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.LIZ.LJJZ.open();
        C63922P6w.LIZLLL("TEImage2Mode", "onCaptureCompleted");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.LIZ.LJJZ.open();
        C63922P6w.LIZIZ("TEImage2Mode", "set flash failed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.LIZ.LJJZ.open();
        C63922P6w.LIZIZ("TEImage2Mode", "set flash request abort");
    }
}

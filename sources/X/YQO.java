package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;

/* loaded from: classes16.dex */
public final class YQO extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ YQ8 LIZ;

    public YQO(YQ8 yq8, int i, int i2) {
        this.LIZ = yq8;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Object obj = totalCaptureResult.get(TotalCaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        Object obj2 = totalCaptureResult.get(TotalCaptureResult.SENSOR_SENSITIVITY);
        Object obj3 = totalCaptureResult.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCaptureCompleted, aeExposure: ");
        LIZ.append(obj);
        LIZ.append(", iso: ");
        LIZ.append(obj2);
        LIZ.append(", exposureTime: ");
        LIZ.append(obj3);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("capture burst failed: ");
        LIZ.append(captureFailure.getReason());
        X1D.LIZIZ(LIZ);
        this.LIZ.getClass();
        throw null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        C63922P6w.LIZLLL("TEImage2Mode", "capture burst buffer last...");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.LIZ.LJII.LLIIII.getBoolean("enableShutterSound")) {
            this.LIZ.LJL.getClass();
        }
    }
}

package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes16.dex */
public final class YQL extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ YQ8 LIZ;

    public YQL(YQ8 yq8) {
        this.LIZ = yq8;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C63922P6w.LIZLLL("TEImage2Mode", "onCaptureCompleted, do capture done");
        this.LIZ.LJJJLL.sendEmptyMessage(1002);
        YQ8 yq8 = this.LIZ;
        yq8.LJJLIIIJ = totalCaptureResult;
        yq8.getClass();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        C63922P6w.LIZIZ("TEImage2Mode", "onCaptureCompleted, do capture failed");
        YQ8 yq8 = this.LIZ;
        C84134X0g c84134X0g = yq8.LJII;
        if (c84134X0g.LLJJIII) {
            c84134X0g.LLJJIII = false;
        }
        if (c84134X0g.LJLJLJ) {
            c84134X0g.LJLJLJ = false;
        }
        YQJ yqj = yq8.LJJJLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Capture failed: ");
        LIZ.append(captureFailure.getReason());
        yqj.sendMessage(yqj.obtainMessage(1003, new Exception(X1D.LIZIZ(LIZ))));
        this.LIZ.LJJJLL.sendEmptyMessage(1002);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.LIZ.LJII.LLIIII.getBoolean("enableShutterSound")) {
            this.LIZ.LJL.getClass();
        }
    }
}

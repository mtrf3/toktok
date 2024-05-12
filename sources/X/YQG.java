package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;

/* loaded from: classes16.dex */
public final class YQG extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ YQ8 LIZ;

    public YQG(YQ8 yq8) {
        this.LIZ = yq8;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        YQ8 yq8 = this.LIZ;
        if (yq8.LIZJ == null) {
            return;
        }
        yq8.getClass();
        YQ8 yq82 = this.LIZ;
        yq82.LJJLIIIJ = totalCaptureResult;
        Integer num = (Integer) yq82.LIZJ.get(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER);
        Integer num2 = (Integer) this.LIZ.LIZJ.get(CaptureRequest.CONTROL_AF_TRIGGER);
        if ((num != null && num.intValue() == 1) || (num2 != null && num2.intValue() == 1)) {
            C63922P6w.LIZLLL("TEImage2Mode", "need cancel ae af trigger");
            if (Build.VERSION.SDK_INT >= 23) {
                this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            YQ8 yq83 = this.LIZ;
            XS3 LJII = yq83.LJII(yq83.LIZJ, null, null);
            if (!LJII.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onCaptureSequenceCompleted: error = ");
                LIZ.append(LJII.LIZIZ);
                C63922P6w.LJ("TEImage2Mode", X1D.LIZIZ(LIZ));
                return;
            }
            this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            this.LIZ.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        }
        YQ8 yq84 = this.LIZ;
        yq84.LJJJJIZL(yq84.LIZJ);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        C63922P6w.LIZIZ("TEImage2Mode", "captureStillPicture, capture failed");
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
}

package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes16.dex */
public class YQC extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ YQ7 LIZ;

    public YQC(YQ7 yq7) {
        this.LIZ = yq7;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Handler handler;
        int intValue;
        YQ6 yq6;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        int i = -1;
        if (totalCaptureResult != null) {
            YQ7 yq7 = this.LIZ;
            if (totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY) == null) {
                intValue = -1;
            } else {
                intValue = ((Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY)).intValue();
            }
            yq7.LJJIII = intValue;
            YQ7 yq72 = this.LIZ;
            C84134X0g c84134X0g = yq72.LJII;
            if (c84134X0g != null && c84134X0g.LJLLLLLL && (yq6 = yq72.LJI) != null) {
                long j = 0;
                if (yq6.LJJII) {
                    yq6.LJJ = 0L;
                    yq6.LJJIFFI = 0L;
                    yq6.LJJII = false;
                }
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l != null) {
                    j = l.longValue();
                }
                YQ6 yq62 = this.LIZ.LJI;
                long j2 = yq62.LJJ;
                long j3 = yq62.LJJIFFI;
                long j4 = (j2 * j3) + j;
                long j5 = 1 + j3;
                yq62.LJJ = j4 / j5;
                yq62.LJJI = (int) (((int) ((yq62.LJJI * j3) + r9.LJJIII)) / j5);
                yq62.LJJIFFI = j5;
            }
        }
        if (!this.LIZ.LJJIIZI) {
            this.LIZ.LJJIIJZLJL();
            this.LIZ.LJJIIZI = true;
            long currentTimeMillis = System.currentTimeMillis() - this.LIZ.LJJIJIL;
            StringBuilder LIZJ = V10.LIZJ("first preview frame callback arrived! consume = ", currentTimeMillis, ", session consume: ");
            LIZJ.append(this.LIZ.LJJIJIIJIL);
            C63922P6w.LIZLLL("TECameraModeBase", X1D.LIZIZ(LIZJ));
            C87367YQp.LIZ("te_record_camera2_set_repeating_request_cost", currentTimeMillis);
            YQ7 yq73 = this.LIZ;
            C84134X0g c84134X0g2 = yq73.LJII;
            if (c84134X0g2 != null && (handler = yq73.LJIIJ) != null && c84134X0g2.LJLLLLLL) {
                handler.postDelayed(yq73.LJI.LJJIJL, c84134X0g2.LJLZ);
            }
        }
        P6S p6s = new P6S();
        if (Build.VERSION.SDK_INT >= 23 && totalCaptureResult != null) {
            if (totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) != null) {
                i = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE)).intValue();
            }
            p6s.LIZLLL = i;
        }
        if (this.LIZ.LJII.LLJILJIL) {
            System.currentTimeMillis();
            p6s.LIZIZ = this.LIZ.LJJI()[1];
            p6s.LIZJ = this.LIZ.LJJI()[0];
            p6s.LIZ = totalCaptureResult;
        }
        YQ6 yq63 = this.LIZ.LJI;
        if (yq63 != null && yq63.LJJIL == 3 && this.LIZ.LJJIZ) {
            this.LIZ.LJI.LJI.LIZ.LJI = p6s;
        }
        YQ7 yq74 = this.LIZ;
        if (yq74.LJIILJJIL) {
            yq74.LJIILJJIL = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        YQ7 yq7 = this.LIZ;
        if (yq7.LJII.LLILZLL && !yq7.LJJIIZI && captureFailure.getReason() == 0) {
            YQ7 yq72 = this.LIZ;
            int i = yq72.LJJIJL + 1;
            yq72.LJJIJL = i;
            Objects.requireNonNull(yq72.LJII);
            if (i > 15) {
                YQ7 yq73 = this.LIZ;
                yq73.LJFF.LIZLLL(yq73.LJIIIZ, yq73.LJII.LJLILLLLZI, -437, "Camera previewing failed");
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failure: ");
        LIZ.append(captureFailure);
        LIZ.append(", reason: ");
        LIZ.append(captureFailure.getReason());
        C63922P6w.LIZIZ("TECameraModeBase", X1D.LIZIZ(LIZ));
    }
}

package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.YQd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87355YQd extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C87356YQe LIZIZ;

    public C87355YQd(C87356YQe c87356YQe, boolean z) {
        this.LIZIZ = c87356YQe;
        this.LIZ = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C84151X0x c84151X0x;
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            C63922P6w.LJ("TEImageFocus", "metering failed.");
            return;
        }
        if (num.intValue() == 3 || num.intValue() == 2) {
            if (!this.LIZ && (c84151X0x = this.LIZIZ.LIZIZ) != null) {
                c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LIZIZ.LIZJ.LJLJJI, "Done");
            }
            C87356YQe c87356YQe = this.LIZIZ;
            if (!c87356YQe.LIZJ.LJLLL) {
                c87356YQe.LJFF.LIZIZ();
            }
        }
        C87356YQe c87356YQe2 = this.LIZIZ;
        if (c87356YQe2.LJI) {
            c87356YQe2.LJI = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        C87356YQe c87356YQe;
        C84151X0x c84151X0x;
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        if (!this.LIZ && (c84151X0x = (c87356YQe = this.LIZIZ).LIZIZ) != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c87356YQe.LIZJ.LJLJJI, captureFailure.toString());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Metering Failed: ");
        LIZ.append(captureFailure);
        C63922P6w.LIZIZ("TEImageFocus", X1D.LIZIZ(LIZ));
    }
}

package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.YQb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87353YQb extends CameraCaptureSession.CaptureCallback {
    public boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ YQX LIZJ;

    public C87353YQb(YQX yqx, boolean z) {
        this.LIZJ = yqx;
        this.LIZIZ = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C84151X0x c84151X0x;
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            C63922P6w.LJ("TEFocusAndMeterStrategy", "metering failed.");
            return;
        }
        if (num.intValue() == 3 || num.intValue() == 2) {
            if (!this.LIZIZ && (c84151X0x = this.LIZJ.LIZIZ) != null && !this.LIZ) {
                c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LIZJ.LIZJ.LJLJJI, "Done");
                this.LIZ = true;
            }
            this.LIZJ.LJ.LIZIZ();
        }
        YQX yqx = this.LIZJ;
        if (yqx.LIZLLL) {
            yqx.LIZLLL = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        YQX yqx;
        C84151X0x c84151X0x;
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        if (!this.LIZIZ && (c84151X0x = (yqx = this.LIZJ).LIZIZ) != null) {
            c84151X0x.LJIIJJI.LIZ(-411, yqx.LIZJ.LJLJJI, captureFailure.toString());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Metering Failed: ");
        LIZ.append(captureFailure);
        C63922P6w.LIZIZ("TEFocusAndMeterStrategy", X1D.LIZIZ(LIZ));
    }
}

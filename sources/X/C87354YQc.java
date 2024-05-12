package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.YQc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87354YQc extends CameraCaptureSession.CaptureCallback {
    public boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C87357YQf LIZJ;

    public C87354YQc(C87357YQf c87357YQf, boolean z) {
        this.LIZJ = c87357YQf;
        this.LIZIZ = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C84151X0x c84151X0x;
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            C63922P6w.LJ("TEVideoFocus", "metering failed.");
            return;
        }
        if (num.intValue() == 3 || num.intValue() == 2) {
            if (!this.LIZIZ && (c84151X0x = this.LIZJ.LIZIZ) != null && !this.LIZ) {
                c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LIZJ.LIZJ.LJLJJI, "Done");
                this.LIZ = true;
            }
            C87357YQf c87357YQf = this.LIZJ;
            if (!c87357YQf.LIZJ.LJLLL) {
                c87357YQf.LJ.LIZIZ();
            }
            C63922P6w.LIZ("TEVideoFocus", "Manual Metering success");
        }
        C87357YQf c87357YQf2 = this.LIZJ;
        if (c87357YQf2.LIZLLL) {
            c87357YQf2.LIZLLL = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        C87357YQf c87357YQf;
        C84151X0x c84151X0x;
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        if (!this.LIZIZ && (c84151X0x = (c87357YQf = this.LIZJ).LIZIZ) != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c87357YQf.LIZJ.LJLJJI, captureFailure.toString());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Metering Failed: ");
        LIZ.append(captureFailure);
        C63922P6w.LIZIZ("TEVideoFocus", X1D.LIZIZ(LIZ));
    }
}

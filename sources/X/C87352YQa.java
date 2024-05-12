package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.YQa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87352YQa extends CameraCaptureSession.CaptureCallback {
    public int LIZ = -1;
    public boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ CaptureRequest.Builder LIZLLL;
    public final /* synthetic */ C87356YQe LJ;

    public final void LIZ(CameraCaptureSession cameraCaptureSession) {
        if (this.LIZJ) {
            this.LIZLLL.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            ((YQ7) this.LJ.LJFF).LJJJJL(cameraCaptureSession, this.LIZLLL);
        }
        AtomicBoolean atomicBoolean = this.LJ.LJ;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        super.onCaptureSequenceAborted(cameraCaptureSession, i);
        C63922P6w.LIZIZ("TEImageFocus", "Manual Focus capture abort ");
        C87356YQe c87356YQe = this.LJ;
        C84151X0x c84151X0x = c87356YQe.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-438, c87356YQe.LIZJ.LJLJJI, "Manual Focus capture abort ");
        }
        LIZ(cameraCaptureSession);
    }

    public C87352YQa(C87356YQe c87356YQe, boolean z, CaptureRequest.Builder builder) {
        this.LJ = c87356YQe;
        this.LIZJ = z;
        this.LIZLLL = builder;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
            C63922P6w.LJ("TEImageFocus", "Not focus request!");
            return;
        }
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            C63922P6w.LJ("TEImageFocus", "Focus failed.");
            AtomicBoolean atomicBoolean = this.LJ.LJ;
            if (atomicBoolean != null) {
                atomicBoolean.set(false);
                return;
            }
            return;
        }
        if (this.LIZ != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
            if (this.LIZJ) {
                this.LIZLLL.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                ((YQ7) this.LJ.LJFF).LJJJJL(cameraCaptureSession, this.LIZLLL);
            } else {
                C87356YQe c87356YQe = this.LJ;
                if (!c87356YQe.LIZJ.LJLLL) {
                    c87356YQe.LJFF.LIZ();
                }
            }
            if (!this.LIZIZ) {
                this.LIZIZ = true;
                C84151X0x c84151X0x = this.LJ.LIZIZ;
                if (c84151X0x != null) {
                    c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LJ.LIZJ.LJLJJI, "Done");
                }
            }
            AtomicBoolean atomicBoolean2 = this.LJ.LJ;
            if (atomicBoolean2 != null) {
                atomicBoolean2.set(false);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Focus done, isLock = ");
            LIZ.append(this.LIZJ);
            LIZ.append(", afState = ");
            LIZ.append(num);
            C63922P6w.LIZLLL("TEImageFocus", X1D.LIZIZ(LIZ));
        }
        if (this.LIZIZ && num.intValue() != 4 && num.intValue() != 5) {
            C63922P6w.LIZIZ("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
            C87356YQe c87356YQe2 = this.LJ;
            if (!c87356YQe2.LIZJ.LJLLL) {
                c87356YQe2.LJFF.LIZ();
            }
        }
        this.LIZ = num.intValue();
        C87356YQe c87356YQe3 = this.LJ;
        if (c87356YQe3.LJI) {
            c87356YQe3.LJI = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Focus Failed: ");
        LIZ.append(captureFailure);
        C63922P6w.LIZIZ("TEImageFocus", X1D.LIZIZ(LIZ));
        C87356YQe c87356YQe = this.LJ;
        C84151X0x c84151X0x = c87356YQe.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c87356YQe.LIZJ.LJLJJI, captureFailure.toString());
        }
        LIZ(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        C63922P6w.LIZIZ("TEImageFocus", "Manual Focus capture buffer lost ");
        C87356YQe c87356YQe = this.LJ;
        C84151X0x c84151X0x = c87356YQe.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c87356YQe.LIZJ.LJLJJI, "Manual Focus capture buffer lost ");
        }
        LIZ(cameraCaptureSession);
    }
}

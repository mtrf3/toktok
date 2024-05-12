package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public final class YQZ extends CameraCaptureSession.CaptureCallback {
    public int LIZ = -1;
    public boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ CaptureRequest.Builder LIZLLL;
    public final /* synthetic */ C87357YQf LJ;

    public final void LIZ() {
        AtomicBoolean atomicBoolean = this.LJ.LJFF;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
    }

    public final void LIZIZ(CameraCaptureSession cameraCaptureSession) {
        if (this.LIZJ) {
            this.LIZLLL.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            ((YQ7) this.LJ.LJ).LJJJJL(cameraCaptureSession, this.LIZLLL);
        }
        LIZ();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        super.onCaptureSequenceAborted(cameraCaptureSession, i);
        C63922P6w.LIZIZ("TEVideoFocus", "Manual Focus capture abort ");
        C87357YQf c87357YQf = this.LJ;
        C84151X0x c84151X0x = c87357YQf.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-438, c87357YQf.LIZJ.LJLJJI, "Manual Focus capture abort ");
        }
        LIZIZ(cameraCaptureSession);
    }

    public YQZ(C87357YQf c87357YQf, boolean z, CaptureRequest.Builder builder) {
        this.LJ = c87357YQf;
        this.LIZJ = z;
        this.LIZLLL = builder;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
            C63922P6w.LJ("TEVideoFocus", "Not focus request!");
            LIZ();
            return;
        }
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        Object obj = captureRequest.get(CaptureRequest.CONTROL_AF_TRIGGER);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Focus onCaptureCompleted: afState = ");
        LIZ.append(num);
        LIZ.append(", triggerState = ");
        LIZ.append(obj);
        C63922P6w.LIZ("TEVideoFocus", X1D.LIZIZ(LIZ));
        if (num == null) {
            C63922P6w.LJ("TEVideoFocus", "Focus failed.");
            LIZ();
            return;
        }
        if (this.LIZ != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
            if (this.LIZJ) {
                this.LIZLLL.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                ((YQ7) this.LJ.LJ).LJJJJL(cameraCaptureSession, this.LIZLLL);
            } else {
                C87357YQf c87357YQf = this.LJ;
                if (!c87357YQf.LIZJ.LJLLL) {
                    c87357YQf.LJ.LIZ();
                }
            }
            if (!this.LIZIZ) {
                this.LIZIZ = true;
                C84151X0x c84151X0x = this.LJ.LIZIZ;
                if (c84151X0x != null) {
                    c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LJ.LIZJ.LJLJJI, "Done");
                }
            }
            LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Focus done, isLock = ");
            LIZ2.append(this.LIZJ);
            LIZ2.append(", afState = ");
            LIZ2.append(num);
            C63922P6w.LIZLLL("TEVideoFocus", X1D.LIZIZ(LIZ2));
        }
        if (this.LIZIZ && num.intValue() != 4 && num.intValue() != 5) {
            C63922P6w.LIZIZ("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
            C87357YQf c87357YQf2 = this.LJ;
            if (!c87357YQf2.LIZJ.LJLLL) {
                c87357YQf2.LJ.LIZ();
            }
        }
        this.LIZ = num.intValue();
        C87357YQf c87357YQf3 = this.LJ;
        if (c87357YQf3.LIZLLL) {
            c87357YQf3.LIZLLL = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Focus Failed: ");
        LIZ.append(captureFailure);
        C63922P6w.LIZIZ("TEVideoFocus", X1D.LIZIZ(LIZ));
        C87357YQf c87357YQf = this.LJ;
        C84151X0x c84151X0x = c87357YQf.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c87357YQf.LIZJ.LJLJJI, captureFailure.toString());
        }
        LIZIZ(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        C63922P6w.LIZ("TEVideoFocus", "Focus onCaptureProgressed!");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        C63922P6w.LIZ("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
        LIZ();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        C63922P6w.LIZIZ("TEVideoFocus", "Manual Focus capture buffer lost ");
        C84151X0x c84151X0x = this.LJ.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c84151X0x.LIZ(), "Manual Focus capture buffer lost ");
        }
        LIZIZ(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        C63922P6w.LIZ("TEVideoFocus", "Focus onCaptureStarted!");
    }
}

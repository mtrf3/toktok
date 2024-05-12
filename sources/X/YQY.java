package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public final class YQY extends CameraCaptureSession.CaptureCallback {
    public int LIZ = -1;
    public boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ CaptureRequest.Builder LIZLLL;
    public final /* synthetic */ YQX LJ;

    public final void LIZ(CameraCaptureSession cameraCaptureSession) {
        if (this.LIZJ) {
            this.LIZLLL.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            ((YQ7) this.LJ.LJ).LJJJJL(cameraCaptureSession, this.LIZLLL);
        }
        AtomicBoolean atomicBoolean = this.LJ.LJFF;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        super.onCaptureSequenceAborted(cameraCaptureSession, i);
        C63922P6w.LIZIZ("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
        YQX yqx = this.LJ;
        C84151X0x c84151X0x = yqx.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-438, yqx.LIZJ.LJLJJI, "Manual Focus capture abort ");
        }
        LIZ(cameraCaptureSession);
    }

    public YQY(YQX yqx, boolean z, CaptureRequest.Builder builder) {
        this.LJ = yqx;
        this.LIZJ = z;
        this.LIZLLL = builder;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        boolean z;
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            C63922P6w.LJ("TEFocusAndMeterStrategy", "Focus failed.");
            AtomicBoolean atomicBoolean = this.LJ.LJFF;
            if (atomicBoolean != null) {
                atomicBoolean.set(false);
                return;
            }
            return;
        }
        if (this.LIZ != num.intValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Focus onCaptureCompleted! afState = ");
            LIZ.append(num);
            C63922P6w.LIZLLL("TEFocusAndMeterStrategy", X1D.LIZIZ(LIZ));
            z = true;
        } else {
            z = false;
        }
        this.LIZ = num.intValue();
        if (z && (num.intValue() == 4 || num.intValue() == 5)) {
            if (this.LIZJ) {
                ((YQ7) this.LJ.LJ).LJJJJL(cameraCaptureSession, this.LIZLLL);
            } else {
                this.LJ.LJ.LIZ();
            }
            if (!this.LIZIZ) {
                this.LIZIZ = true;
                C84151X0x c84151X0x = this.LJ.LIZIZ;
                if (c84151X0x != null) {
                    c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LJ.LIZJ.LJLJJI, "Done");
                }
            }
            AtomicBoolean atomicBoolean2 = this.LJ.LJFF;
            if (atomicBoolean2 != null) {
                atomicBoolean2.set(false);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Focus done, isLock = ");
            LIZ2.append(this.LIZJ);
            LIZ2.append(", afState = ");
            LIZ2.append(num);
            C63922P6w.LIZLLL("TEFocusAndMeterStrategy", X1D.LIZIZ(LIZ2));
        }
        if (this.LIZIZ && num.intValue() != 4 && num.intValue() != 5) {
            C63922P6w.LIZIZ("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
            this.LJ.LJ.LIZ();
        }
        YQX yqx = this.LJ;
        if (yqx.LIZLLL) {
            yqx.LIZLLL = PDA.LJIIIIZZ(totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Focus Failed: ");
        LIZ.append(captureFailure);
        LIZ.append(", session: ");
        LIZ.append(cameraCaptureSession);
        C63922P6w.LIZIZ("TEFocusAndMeterStrategy", X1D.LIZIZ(LIZ));
        YQX yqx = this.LJ;
        C84151X0x c84151X0x = yqx.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-411, yqx.LIZJ.LJLJJI, captureFailure.toString());
        }
        LIZ(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        C63922P6w.LIZ("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        C63922P6w.LIZ("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
        AtomicBoolean atomicBoolean = this.LJ.LJFF;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Manual Focus capture buffer lost , session: ");
        LIZ.append(cameraCaptureSession);
        C63922P6w.LIZIZ("TEFocusAndMeterStrategy", X1D.LIZIZ(LIZ));
        C84151X0x c84151X0x = this.LJ.LIZIZ;
        if (c84151X0x != null) {
            c84151X0x.LJIIJJI.LIZ(-411, c84151X0x.LIZ(), "Manual Focus capture buffer lost ");
        }
        LIZ(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        C63922P6w.LIZ("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
    }
}

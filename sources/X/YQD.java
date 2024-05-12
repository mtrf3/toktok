package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;

/* loaded from: classes16.dex */
public final class YQD extends CameraCaptureSession.CaptureCallback {
    public Integer LIZ = -1;
    public Integer LIZIZ = -1;
    public Integer LIZJ = -1;
    public Integer LIZLLL = -1;
    public final /* synthetic */ YQ8 LJ;

    public YQD(YQ8 yq8) {
        this.LJ = yq8;
    }

    public final void LIZ(CaptureResult captureResult) {
        int i;
        boolean z;
        Integer num;
        int i2 = this.LJ.LJJLIIIJJIZ;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num2 != null && num2.intValue() == 1) {
                this.LJ.LJJLIIIJLLLLLLLZ = true;
                C63922P6w.LIZLLL("TEImage2Mode", "ae trigger start...");
            }
            if (!this.LJ.LJJLIIIJLLLLLLLZ) {
                return;
            }
            if (num3 == null || num3.intValue() == 2 || num3.intValue() == 4) {
                this.LJ.LJJLIIIJLLLLLLLZ = false;
                C63922P6w.LIZLLL("TEImage2Mode", "ae converge, is shot can do");
            } else {
                z2 = false;
            }
            if (!this.LIZLLL.equals(num3)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ae state:");
                LIZ.append(num3);
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
            }
            this.LIZLLL = num3;
            if (!z2) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            YQ8 yq8 = this.LJ;
            long j = currentTimeMillis - yq8.LJJJLIIL;
            yq8.LJJLIIIJJIZ = 0;
            yq8.LJJLIIIJLLLLLLLZ = false;
            YQJ yqj = yq8.LJJJLL;
            if (yqj != null) {
                yqj.removeMessages(1007);
                this.LJ.LJJJLL.sendEmptyMessage(1006);
                this.LJ.LJJJLL.sendEmptyMessage(1005);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("send-capture-command consume = ");
            LIZ2.append(j);
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
            return;
        }
        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num4 != null) {
            i = num4.intValue();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        YQ8 yq82 = this.LJ;
        if (valueOf.intValue() == -1 || valueOf.intValue() == 2 || valueOf.intValue() == 4) {
            z = true;
        } else {
            z = false;
        }
        yq82.LJJLIL = z;
        CaptureRequest.Builder builder = this.LJ.LIZJ;
        if (builder == null || (num = (Integer) builder.get(CaptureRequest.CONTROL_AF_TRIGGER)) == null || num.intValue() != 1) {
            return;
        }
        if (4 != valueOf.intValue() && 5 != valueOf.intValue() && -1 != valueOf.intValue()) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        YQJ yqj2 = this.LJ.LJJJLL;
        if (yqj2 == null) {
            return;
        }
        yqj2.sendEmptyMessage(1004);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i;
        int i2;
        int i3;
        int i4;
        long currentTimeMillis = System.currentTimeMillis();
        YQ8 yq8 = this.LJ;
        if (currentTimeMillis - yq8.LJLIIIL > 1000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on frame arrived fps: ");
            LIZ.append(this.LJ.LJLI);
            C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ));
            YQ8 yq82 = this.LJ;
            yq82.LJLI = 0;
            yq82.LJLIIIL = currentTimeMillis;
        } else {
            yq8.LJLI++;
        }
        this.LJ.getClass();
        LIZ(totalCaptureResult);
        if (!this.LJ.LJJIIZI) {
            this.LJ.LJJIIJZLJL();
            this.LJ.LJJIIZI = true;
            long currentTimeMillis2 = System.currentTimeMillis();
            YQ8 yq83 = this.LJ;
            long j = currentTimeMillis2 - yq83.LJJIJIL;
            long j2 = yq83.LJJIJ;
            long j3 = 0;
            if (j2 != 0) {
                j3 = currentTimeMillis2 - j2;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("first preview frame callback arrived! facing = ");
            V10.LJFF(LIZ2, this.LJ.LJII.LJLJJI, " consume = ", j);
            LIZ2.append(", session consume: ");
            LIZ2.append(this.LJ.LJJIJIIJIL);
            LIZ2.append(", camera whole consume: ");
            LIZ2.append(j3);
            C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ2));
            C87367YQp.LIZ("te_record_camera2_set_repeating_request_cost", j);
        }
        if (this.LJ.LJJLIIIJJIZ == 2) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
            Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            Integer valueOf = Integer.valueOf(i);
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = -1;
            }
            Integer valueOf2 = Integer.valueOf(i2);
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = -1;
            }
            Integer valueOf3 = Integer.valueOf(i3);
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = -1;
            }
            Integer valueOf4 = Integer.valueOf(i4);
            if (!this.LIZ.equals(valueOf) || !this.LIZIZ.equals(valueOf2) || !this.LIZJ.equals(valueOf3) || !this.LIZLLL.equals(valueOf4)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[afMode=");
                LIZ3.append(valueOf);
                LIZ3.append(", afState=");
                LIZ3.append(valueOf2);
                LIZ3.append(",aeMode=");
                LIZ3.append(valueOf3);
                LIZ3.append(", aeState=");
                LIZ3.append(valueOf4);
                LIZ3.append("]");
                C63922P6w.LIZ("TEImage2Mode", X1D.LIZIZ(LIZ3));
            }
            this.LIZ = valueOf;
            this.LIZIZ = valueOf2;
            this.LIZJ = valueOf3;
            this.LIZLLL = valueOf4;
            if ("CAPTURE_REQUEST_TAG_FOR_SHOT".equals(totalCaptureResult.getRequest().getTag())) {
                this.LJ.LJJLIIJ = true;
                C63922P6w.LIZLLL("TEImage2Mode", "is shot can do");
            }
            if (!this.LJ.LJJLIIJ) {
                C63922P6w.LIZ("TEImage2Mode", "discard previous callback");
            } else if ((valueOf2.intValue() == -1 || valueOf2.intValue() == 4 || valueOf2.intValue() == 5 || valueOf2.intValue() == 2) && (valueOf4.intValue() == -1 || valueOf4.intValue() == 4 || valueOf4.intValue() == 2)) {
                long currentTimeMillis3 = System.currentTimeMillis();
                YQ8 yq84 = this.LJ;
                long j4 = currentTimeMillis3 - yq84.LJJJLIIL;
                yq84.LJJJLL.removeMessages(1001);
                this.LJ.LJJJLL.sendEmptyMessage(1000);
                this.LJ.LJJLIIJ = false;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("send-capture-command consume = ");
                LIZ4.append(j4);
                C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ4));
                C87367YQp.LIZ("te_record_send_capture_command_cost", j4);
            }
        }
        YQ8 yq85 = this.LJ;
        int i5 = yq85.LJJLJ + 1;
        yq85.LJJLJ = i5;
        int i6 = yq85.LJJLJLI;
        if (i6 != 0 && i5 > i6) {
            yq85.LJJLJ = 0;
            Runtime.getRuntime().gc();
        }
        YQ8 yq86 = this.LJ;
        int i7 = yq86.LJJLI + 1;
        yq86.LJJLI = i7;
        if (i7 % 5 == 0) {
            yq86.LJJLI = 0;
        }
        TotalCaptureResult[] totalCaptureResultArr = yq86.LJJLIIIIJ;
        if (totalCaptureResultArr != null) {
            totalCaptureResultArr[yq86.LJJLI] = totalCaptureResult;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        if (this.LJ.LJJLIIIJJIZ == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
            this.LJ.LJJLIIJ = true;
            C63922P6w.LIZIZ("TEImage2Mode", "onCaptureFailed: ");
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        LIZ(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        if (this.LJ.LJJLIIIJJIZ == 2 && "CAPTURE_REQUEST_TAG_FOR_SHOT".equals(captureRequest.getTag())) {
            this.LJ.LJJLIIJ = true;
            C63922P6w.LIZIZ("TEImage2Mode", "onCaptureBufferLost: ");
        }
    }
}

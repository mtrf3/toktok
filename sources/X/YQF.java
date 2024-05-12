package X;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import com.google.ar.core.Session;

/* loaded from: classes16.dex */
public final class YQF extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ YQ9 LIZ;

    public YQF(YQ9 yq9) {
        this.LIZ = yq9;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        String str = YQ9.LJJJZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onActive...");
        LIZ.append(this.LIZ.LJJIZ);
        C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
        if (this.LIZ.LJJIZ) {
            YQ9 yq9 = this.LIZ;
            C80074Vbi c80074Vbi = yq9.LJJJLL;
            if (c80074Vbi != null && c80074Vbi.LJFF != null) {
                c80074Vbi.LJIIL(yq9.LJJJJZI);
                this.LIZ.LJJJLIIL = true;
                YQ9 yq92 = this.LIZ;
                P7K p7k = yq92.LJI.LJI.LIZ;
                Session session = yq92.LJJJLL.LJFF;
                P7P p7p = p7k.LIZ;
                if (p7p != null && (p7p instanceof P7S)) {
                    ((P7S) p7p).LIZJ(session);
                    return;
                }
                return;
            }
            return;
        }
        C63922P6w.LIZIZ(str, "onActive...session not alive");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.LJJJLIIL(cameraCaptureSession, 6, null);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.LJJJLIIL(cameraCaptureSession, 5, null);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.LJJJLIIL(cameraCaptureSession, 1, null);
        C63922P6w.LIZLLL(YQ9.LJJJZ, "onConfigureFailed...");
        this.LIZ.LJI.LJIILIIL(4);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.LIZ.LJJJLIIL(cameraCaptureSession, 0, null);
        this.LIZ.LJJJLIIL(cameraCaptureSession, 3, null);
        this.LIZ.LJJJLZIJ = System.currentTimeMillis();
        YQ9 yq9 = this.LIZ;
        long j = yq9.LJJJLZIJ - yq9.LJJIJIIJI;
        String str = YQ9.LJJJZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConfigured...createSessionConsume = ");
        LIZ.append(j);
        C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
        YQ9 yq92 = this.LIZ;
        if (yq92.LJIIIZ == null) {
            C63922P6w.LIZIZ(str, "onConfigured...device has closed...");
            cameraCaptureSession.close();
            this.LIZ.LJJIIJZLJL();
            return;
        }
        yq92.LJJIZ = true;
        this.LIZ.LIZLLL = cameraCaptureSession;
        try {
            int LJJJJI = this.LIZ.LJJJJI();
            if (LJJJJI != 0) {
                YQ9 yq93 = this.LIZ;
                yq93.LJFF.LJ(null, yq93.LJII.LJLILLLLZI, LJJJJI, "updateCapture : something wrong.");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("update capture failed, device: ");
                LIZ2.append(this.LIZ.LJIIIZ);
                C63922P6w.LIZIZ(str, X1D.LIZIZ(LIZ2));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        String str = YQ9.LJJJZ;
        C63922P6w.LIZLLL(str, "onReady...");
        if (this.LIZ.LJJIZ) {
            this.LIZ.LJJJLIIL(cameraCaptureSession, 4, null);
        } else {
            C63922P6w.LIZIZ(str, "onReady...session not alive");
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.LIZ.LJJJLIIL(cameraCaptureSession, 7, surface);
    }
}

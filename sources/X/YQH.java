package X;

import Y.ARunnableS51S0100000_15;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class YQH extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ YQ9 LIZ;

    public YQH(YQ9 yq9) {
        this.LIZ = yq9;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        if (!this.LIZ.LJJIIZI) {
            this.LIZ.LJJIIJZLJL();
            this.LIZ.LJJIIZI = true;
            long currentTimeMillis = System.currentTimeMillis() - this.LIZ.LJJIJIL;
            String str = YQ9.LJJJZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("first preview frame callback arrived! consume = ");
            LIZ.append(currentTimeMillis);
            C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
            C80074Vbi c80074Vbi = this.LIZ.LJJJLL;
            if (c80074Vbi != null) {
                c80074Vbi.getClass();
                long currentTimeMillis2 = System.currentTimeMillis() - c80074Vbi.LJIIIIZZ;
                synchronized (c80074Vbi.LJII) {
                    if (((ArrayList) c80074Vbi.LJIIIZ).size() > C80074Vbi.LJIIJJI) {
                        ((ArrayList) c80074Vbi.LJIIIZ).remove(0);
                    }
                    ((ArrayList) c80074Vbi.LJIIIZ).add(Long.valueOf(currentTimeMillis2));
                }
            }
        }
        if (!this.LIZ.LJJJLIIL) {
            C63922P6w.LIZIZ(YQ9.LJJJZ, "discardSurfaceTextureOnFrameAvailable");
            return;
        }
        YQ9 yq9 = this.LIZ;
        if (yq9.LJII.LJLLI) {
            Handler handler = yq9.LJIIJ;
            if (handler != null) {
                handler.post(new ARunnableS51S0100000_15(this, 102));
                return;
            }
            return;
        }
        yq9.LJI.LJI.LIZ.LJJIFFI();
    }
}

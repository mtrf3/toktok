package X;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes16.dex */
public class YQJ extends Handler {
    public final /* synthetic */ YQ8 LIZ;

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dispatch msg = ");
        LIZ.append(message.what);
        C63922P6w.LIZLLL("TEImage2Mode", X1D.LIZIZ(LIZ));
        switch (message.what) {
            case 1000:
            case 1001:
                this.LIZ.LJJJLIIL();
                return;
            case 1002:
                YQ8 yq8 = this.LIZ;
                C84134X0g c84134X0g = yq8.LJII;
                if (c84134X0g.LJLJJI != 0) {
                    return;
                }
                CaptureRequest.Builder builder = yq8.LIZJ;
                if (builder == null) {
                    C63922P6w.LIZIZ("TEImage2Mode", "resetPreviewAfterFlashCapture failed, no builder");
                    return;
                }
                int i = c84134X0g.LLILZIL;
                if (i == 3) {
                    if (yq8.LJJIJLIJ) {
                        builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                        yq8.LIZJ.set(CaptureRequest.FLASH_MODE, 1);
                    }
                } else if (i == 2 && yq8.LJJLIIIJLJLI) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    yq8.LJII(yq8.LIZJ, null, null);
                }
                if (yq8.LJJLIIIJLJLI) {
                    yq8.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                }
                yq8.LIZJ.set(CaptureRequest.CONTROL_AF_MODE, 4);
                yq8.LIZJ.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                yq8.LJJJJIZL(yq8.LIZJ);
                return;
            case 1003:
                this.LIZ.LJJJZ(-1000, (Exception) message.obj);
                return;
            case 1004:
                YQ8 yq82 = this.LIZ;
                yq82.LJJJJIZL(yq82.LIZJ);
                return;
            case 1005:
                YQ8 yq83 = this.LIZ;
                Integer num = (Integer) yq83.LIZJ.get(CaptureRequest.CONTROL_AF_TRIGGER);
                if (num == null || num.intValue() != 1) {
                    return;
                }
                C63922P6w.LIZLLL("TEImage2Mode", "need cancel af trigger");
                yq83.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                yq83.LJII(yq83.LIZJ, null, null);
                yq83.LIZJ.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                yq83.LJJJJIZL(yq83.LIZJ);
                return;
            case 1006:
            case 1007:
                this.LIZ.LJJJJZI();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YQJ(YQ8 yq8, Looper looper) {
        super(looper);
        this.LIZ = yq8;
    }
}

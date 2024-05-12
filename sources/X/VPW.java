package X;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VPW extends Handler {
    public final /* synthetic */ VPX LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    VPX vpx = this.LIZ;
                    InterfaceC79684VPc interfaceC79684VPc = vpx.LIZLLL;
                    if (interfaceC79684VPc != null && !vpx.LJ) {
                        interfaceC79684VPc.LIZ();
                        return;
                    }
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unknown message ");
                LIZ.append(message);
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
            VPX vpx2 = this.LIZ;
            vpx2.LIZIZ.removeMessages(3);
            vpx2.LJFF = true;
            InterfaceC79685VPd interfaceC79685VPd = vpx2.LIZJ;
            MotionEvent motionEvent = vpx2.LJII;
            C79682VPa c79682VPa = (C79682VPa) interfaceC79685VPd;
            VPV vpv = c79682VPa.LIZ;
            VPY vpy = vpv.LIZJ;
            if (vpy == null || !vpv.LIZ(vpy)) {
                return;
            }
            VPV vpv2 = c79682VPa.LIZ;
            vpv2.LIZJ(vpv2.LIZJ, "longpress", motionEvent);
            return;
        }
        this.LIZ.LIZJ.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VPW(VPX vpx, Handler handler) {
        super(handler.getLooper());
        this.LIZ = vpx;
    }
}

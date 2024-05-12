package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Iq3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC47839Iq3 extends Handler {
    public final /* synthetic */ C47836Iq0 LIZ;
    public final /* synthetic */ C47836Iq0 LIZIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null || this.LIZ == null) {
            return;
        }
        super.handleMessage(message);
        int i = message.what;
        if (i == 111) {
            this.LIZ.LJIIIIZZ(0);
            C47836Iq0 c47836Iq0 = this.LIZ;
            C47837Iq1 c47837Iq1 = c47836Iq0.LJIILJJIL;
            if (c47837Iq1 != null) {
                c47837Iq1.LIZJ.remove(c47836Iq0);
                c47837Iq1.LJFF.remove(Long.valueOf(c47836Iq0.LIZIZ));
                c47837Iq1.LIZLLL.remove(c47836Iq0);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("task info: ");
                LIZ.append(c47836Iq0.toString());
                c47836Iq0.LJI(new C47789IpF("kTTVideoErrorDomainDownload", -9995, 0, X1D.LIZIZ(LIZ)));
                return;
            }
            return;
        }
        if (i == 112) {
            C47836Iq0 c47836Iq02 = this.LIZ;
            C47789IpF c47789IpF = (C47789IpF) message.obj;
            c47836Iq02.LJI = c47789IpF;
            if (!this.LIZIZ.LIZ(c47789IpF)) {
                this.LIZ.LJIIIIZZ(5);
            }
            C47836Iq0 c47836Iq03 = this.LIZ;
            C47837Iq1 c47837Iq12 = c47836Iq03.LJIILJJIL;
            if (c47837Iq12 == null) {
                return;
            }
            c47837Iq12.LIZIZ(c47836Iq03, c47836Iq03.LJI);
            return;
        }
        if (i != 113) {
            return;
        }
        C47836Iq0 c47836Iq04 = this.LIZ;
        c47836Iq04.LJI = null;
        c47836Iq04.LJIIIIZZ(5);
        C47836Iq0 c47836Iq05 = this.LIZ;
        C47837Iq1 c47837Iq13 = c47836Iq05.LJIILJJIL;
        if (c47837Iq13 == null) {
            return;
        }
        c47837Iq13.LIZIZ(c47836Iq05, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC47839Iq3(C47836Iq0 c47836Iq0, Looper looper, C47836Iq0 c47836Iq02) {
        super(looper);
        this.LIZIZ = c47836Iq0;
        this.LIZ = c47836Iq02;
    }
}

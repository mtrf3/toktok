package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.Ot6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class HandlerC63316Ot6 extends Handler {
    public HandlerC63316Ot6(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        C63315Ot5 c63315Ot5 = C63315Ot5.LIZ;
        int i = msg.what;
        c63315Ot5.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pollingMsgForInbox ");
        LIZ.append(i);
        C63322OtC.LIZIZ("RepairManagerV2 ", X1D.LIZIZ(LIZ));
        if (C63308Osy.LJI().LIZIZ().isWsConnected()) {
            C63308Osy.LJI().LJIIJ();
            return;
        }
        if (C63308Osy.LJI().LIZIZ().isAppBackground()) {
            return;
        }
        if (!C63308Osy.LJI().LIZIZ().LJIL()) {
            C63315Ot5.LIZJ().sendEmptyMessageDelayed(i, C63315Ot5.LIZLLL(i) * 1000);
            return;
        }
        L46 l46 = C63315Ot5.LJFF.get(i);
        if (l46 != null) {
            C63308Osy.LJI().LJIIL(i, l46.LJLIL);
        }
        C63315Ot5.LIZJ().sendEmptyMessageDelayed(i, C63315Ot5.LIZLLL(i) * 1000);
    }
}

package X;

import Y.AfS0S0030000_9;
import Y.AfS0S1020000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LQS {
    public static boolean LIZIZ;
    public static final LQS LIZ = new LQS();
    public static final AfS0S0030000_9 LIZJ = new AfS0S0030000_9(0);
    public static final AfS0S1020000_9 LIZLLL = new AfS0S1020000_9(0);

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLoginStateChange: ");
        LIZ2.append(event.LJLIL);
        C221018lt.LIZ("NoticeCountFetcher", X1D.LIZIZ(LIZ2));
        if (ENR.LIZ()) {
            C54362LVe.LJIIIZ().LJIILJJIL();
        } else {
            C54362LVe.LJIIL().LJIIIZ();
        }
        LRP.LIZIZ.onDestroy();
        int i = event.LJLIL;
        if (i == 0) {
            LIZLLL.z2 = true;
        } else {
            if (i != 1) {
                return;
            }
            LIZJ.z2 = true;
        }
    }

    public static void LIZ(int i, boolean z) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("query, isDelay=");
        LIZ2.append(z);
        LIZ2.append(", source=");
        LIZ2.append(i);
        C221018lt.LIZ("NoticeCountFetcher", X1D.LIZIZ(LIZ2));
        if (ENR.LIZ()) {
            C54362LVe.LJIIIZ().LJIILLIIL(i, z);
        } else {
            C54362LVe.LJIIL().LIZIZ(i, z);
        }
    }
}

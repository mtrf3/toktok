package X;

import Y.AfS0S0030000_9;
import Y.AfS0S1020000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LQO {
    public static boolean LIZIZ;
    public static LQR LIZJ;
    public static final LQO LIZ = new LQO();
    public static final AfS0S0030000_9 LIZLLL = new AfS0S0030000_9(1);
    public static final AfS0S1020000_9 LJ = new AfS0S1020000_9(1);

    public static void LIZ(int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("query, source=");
        LIZ2.append(i);
        C221018lt.LIZ("LiveBubbleTrigger", X1D.LIZIZ(LIZ2));
        LQR lqr = LIZJ;
        if (lqr != null) {
            lqr.LJJJLZIJ(i);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLoginStateChange: ");
        LIZ2.append(event.LJLIL);
        C221018lt.LIZ("LiveBubbleTrigger", X1D.LIZIZ(LIZ2));
        int i = event.LJLIL;
        if (i == 0) {
            LJ.z2 = true;
        } else {
            if (i != 1) {
                return;
            }
            LIZLLL.z2 = true;
        }
    }
}

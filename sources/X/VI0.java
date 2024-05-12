package X;

import J.N;
import Y.ARunnableS20S0000000_14;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.ThreadUtils;

/* loaded from: classes15.dex */
public final class VI0 implements MessageQueue.IdleHandler {
    public static boolean LJLILLLLZI;
    public static VI0 LJLJI;
    public long LJLIL;

    public static void LIZ() {
        if (!ThreadUtils.LIZJ()) {
            ThreadUtils.LIZ().post(new ARunnableS20S0000000_14(8));
            return;
        }
        if (N.MpI7Xy5x()) {
            if (LJLJI == null) {
                LJLJI = new VI0();
            }
            if (!LJLILLLLZI) {
                C16880lQ.LJLI(Looper.myQueue(), LJLJI);
                LJLILLLLZI = true;
                return;
            }
            return;
        }
        if (LJLJI == null || !LJLILLLLZI) {
            return;
        }
        Looper.myQueue().removeIdleHandler(LJLJI);
        LJLILLLLZI = false;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJLIL;
        if (j == 0 || elapsedRealtime - j > 1000) {
            this.LJLIL = elapsedRealtime;
            N.MgOuiubc();
            return true;
        }
        return true;
    }
}

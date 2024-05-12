package X;

import Y.ARunnableS18S0000000_11;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes12.dex */
public final class PF5 implements Printer {
    @Override // android.util.Printer
    public final void println(String str) {
        int i = C45439HsR.LJLJJI;
        if (i == 1) {
            return;
        }
        if (i == 2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.charAt(0) == '>') {
                PF4 pf4 = C36381bm.LJIL.LJIILL;
                pf4.LIZ(Message.obtain(pf4.LIZLLL, PF6.LJIIIZ), 100L);
                return;
            }
            if (str.charAt(0) != '<') {
                return;
            }
            PF4 pf42 = C36381bm.LJIL.LJIILL;
            ARunnableS18S0000000_11 aRunnableS18S0000000_11 = PF6.LJIIIZ;
            if (!((ConcurrentLinkedQueue) pf42.LIZIZ).isEmpty() || !((ConcurrentLinkedQueue) pf42.LIZJ).isEmpty()) {
                Queue<PFA> queue = pf42.LIZIZ;
                PF7 pf7 = PF4.LJFF;
                Iterator it = ((ConcurrentLinkedQueue) queue).iterator();
                while (it.hasNext()) {
                    if (pf7.LIZ(it.next(), aRunnableS18S0000000_11)) {
                        it.remove();
                    }
                }
                Queue<Message> queue2 = pf42.LIZJ;
                PF8 pf8 = PF4.LJI;
                Iterator it2 = ((ConcurrentLinkedQueue) queue2).iterator();
                while (it2.hasNext()) {
                    if (pf8.LIZ(it2.next(), aRunnableS18S0000000_11)) {
                        it2.remove();
                    }
                }
            }
            if (pf42.LIZLLL == null) {
                return;
            }
            pf42.LIZLLL.removeCallbacks(aRunnableS18S0000000_11);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.charAt(0) == '>') {
            if (C45439HsR.LJLILLLLZI) {
                C0M0 c0m0 = C0M1.LJII;
                if (c0m0 == null) {
                    return;
                }
                c0m0.messageDispatchStarting(str);
                return;
            }
            PF6.LIZJ(true, str, null);
            return;
        }
        if (str.charAt(0) != '<') {
            return;
        }
        if (C45439HsR.LJLILLLLZI) {
            C0M0 c0m02 = C0M1.LJII;
            if (c0m02 == null) {
                return;
            }
            c0m02.messageDispatched(str, null);
            return;
        }
        PF6.LIZJ(false, str, null);
    }
}

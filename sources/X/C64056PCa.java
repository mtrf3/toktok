package X;

import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.PCa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64056PCa {
    public static final C64058PCc LJFF = new C64058PCc();
    public static final C64059PCd LJI = new C64059PCd();
    public volatile Handler LIZLLL;
    public final Queue<C64060PCe> LIZIZ = new ConcurrentLinkedQueue();
    public final Queue<Message> LIZJ = new ConcurrentLinkedQueue();
    public final Object LJ = new Object();
    public final PCZ LIZ = new PCZ(this);

    public final void LIZ(ARunnableS47S0100000_11 aRunnableS47S0100000_11) {
        if (!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty() || !((ConcurrentLinkedQueue) this.LIZJ).isEmpty()) {
            Queue<C64060PCe> queue = this.LIZIZ;
            C64058PCc c64058PCc = LJFF;
            Iterator it = ((ConcurrentLinkedQueue) queue).iterator();
            while (it.hasNext()) {
                if (c64058PCc.LIZ(it.next(), aRunnableS47S0100000_11)) {
                    it.remove();
                }
            }
            Queue<Message> queue2 = this.LIZJ;
            C64059PCd c64059PCd = LJI;
            Iterator it2 = ((ConcurrentLinkedQueue) queue2).iterator();
            while (it2.hasNext()) {
                if (c64059PCd.LIZ(it2.next(), aRunnableS47S0100000_11)) {
                    it2.remove();
                }
            }
        }
        if (this.LIZLLL != null) {
            this.LIZLLL.removeCallbacks(aRunnableS47S0100000_11);
        }
    }

    public final boolean LIZIZ(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        if (this.LIZLLL == null) {
            synchronized (this.LJ) {
                if (this.LIZLLL == null) {
                    ((ConcurrentLinkedQueue) this.LIZIZ).add(new C64060PCe(message, uptimeMillis));
                    return true;
                }
            }
        }
        return this.LIZLLL.sendMessageAtTime(message, uptimeMillis);
    }
}

package X;

import Y.ARunnableS18S0000000_11;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.PKu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64284PKu {
    public static final PLE LJFF = new PLE();
    public static final PLG LJI = new PLG();
    public volatile Handler LIZLLL;
    public final Queue<PLZ> LIZIZ = new ConcurrentLinkedQueue();
    public final Queue<Message> LIZJ = new ConcurrentLinkedQueue();
    public final Object LJ = new Object();
    public final HandlerThreadC64288PKy LIZ = new HandlerThreadC64288PKy(this);

    public final void LJ() {
        ARunnableS18S0000000_11 aRunnableS18S0000000_11 = PKO.LJIIJJI;
        if (!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty() || !((ConcurrentLinkedQueue) this.LIZJ).isEmpty()) {
            LIZLLL(this.LIZIZ, LJFF);
            LIZLLL(this.LIZJ, LJI);
        }
        if (this.LIZLLL != null) {
            this.LIZLLL.removeCallbacks(aRunnableS18S0000000_11);
        }
    }

    public final void LIZ(Runnable runnable) {
        LJFF(Message.obtain(this.LIZLLL, runnable), 0L);
    }

    public final void LIZIZ(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        Message obtain = Message.obtain(this.LIZLLL, aRunnableS18S0000000_11);
        if (this.LIZLLL == null) {
            synchronized (this.LJ) {
                if (this.LIZLLL == null) {
                    ((ConcurrentLinkedQueue) this.LIZJ).add(obtain);
                    return;
                }
            }
        }
        try {
            this.LIZLLL.sendMessageAtFrontOfQueue(obtain);
        } catch (Throwable unused) {
        }
    }

    public static void LIZLLL(Collection collection, InterfaceC64290PLa interfaceC64290PLa) {
        if (collection != null) {
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) collection;
            if (!concurrentLinkedQueue.isEmpty()) {
                try {
                    Iterator it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        if (interfaceC64290PLa.LIZ(it.next())) {
                            it.remove();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void LIZJ(Runnable runnable, long j) {
        LJFF(Message.obtain(this.LIZLLL, runnable), j);
    }

    public final boolean LJFF(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        if (this.LIZLLL == null) {
            synchronized (this.LJ) {
                if (this.LIZLLL == null) {
                    ((ConcurrentLinkedQueue) this.LIZIZ).add(new PLZ(message, uptimeMillis));
                    return true;
                }
            }
        }
        try {
            return this.LIZLLL.sendMessageAtTime(message, uptimeMillis);
        } catch (Throwable unused) {
            return true;
        }
    }
}

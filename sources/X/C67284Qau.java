package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qau, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67284Qau extends AbstractC68049QnF {
    public static final AtomicLong LJIIJ = new AtomicLong(Long.MIN_VALUE);
    public C67283Qat LIZJ;
    public C67283Qat LIZLLL;
    public final PriorityBlockingQueue LJ;
    public final BlockingQueue LJFF;
    public final PDI LJI;
    public final PDI LJII;
    public final Object LJIIIIZZ;
    public final Semaphore LJIIIZ;

    @Override // X.AbstractC68049QnF
    public final boolean LJI() {
        return false;
    }

    @Override // X.C68048QnE
    public final void LJFF() {
        if (C16880lQ.LLLLIIIILLL() == this.LIZJ) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void LJIIIZ() {
        if (C16880lQ.LLLLIIIILLL() == this.LIZLLL) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final boolean LJIILL() {
        if (C16880lQ.LLLLIIIILLL() == this.LIZJ) {
            return true;
        }
        return false;
    }

    public C67284Qau(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LJIIIIZZ = new Object();
        this.LJIIIZ = new Semaphore(2);
        this.LJ = new PriorityBlockingQueue();
        this.LJFF = new LinkedBlockingQueue();
        this.LJI = new PDI(this, "Thread death: Uncaught exception on worker thread");
        this.LJII = new PDI(this, "Thread death: Uncaught exception on network thread");
    }

    public final C67285Qav LJIIJJI(Callable callable) {
        LJII();
        C67285Qav c67285Qav = new C67285Qav(this, callable, false);
        if (C16880lQ.LLLLIIIILLL() == this.LIZJ) {
            if (!this.LJ.isEmpty()) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZ("Callable skipped the worker queue.");
            }
            c67285Qav.run();
        } else {
            LJIILLIIL(c67285Qav);
        }
        return c67285Qav;
    }

    public final void LJIIL(Runnable runnable) {
        LJII();
        C67285Qav c67285Qav = new C67285Qav(this, runnable, false, "Task exception on network thread");
        synchronized (this.LJIIIIZZ) {
            this.LJFF.add(c67285Qav);
            C67283Qat c67283Qat = this.LIZLLL;
            if (c67283Qat == null) {
                C67283Qat c67283Qat2 = new C67283Qat(this, "Measurement Network", this.LJFF);
                this.LIZLLL = c67283Qat2;
                c67283Qat2.setUncaughtExceptionHandler(this.LJII);
                this.LIZLLL.start();
            } else {
                c67283Qat.LJ();
            }
        }
    }

    public final void LJIILIIL(Runnable runnable) {
        LJII();
        QH7.LJIIIIZZ(runnable);
        LJIILLIIL(new C67285Qav(this, runnable, false, "Task exception on worker thread"));
    }

    public final void LJIILJJIL(Runnable runnable) {
        LJII();
        LJIILLIIL(new C67285Qav(this, runnable, true, "Task exception on worker thread"));
    }

    public final void LJIILLIIL(C67285Qav c67285Qav) {
        synchronized (this.LJIIIIZZ) {
            this.LJ.add(c67285Qav);
            C67283Qat c67283Qat = this.LIZJ;
            if (c67283Qat == null) {
                C67283Qat c67283Qat2 = new C67283Qat(this, "Measurement Worker", this.LJ);
                this.LIZJ = c67283Qat2;
                c67283Qat2.setUncaughtExceptionHandler(this.LJI);
                this.LIZJ.start();
            } else {
                c67283Qat.LJ();
            }
        }
    }

    public final Object LJIIJ(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.LIZ.LIZIZ().LJIILIIL(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZ("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZ("Timed out waiting for ".concat(str));
        }
        return obj;
    }
}

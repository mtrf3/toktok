package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.XOv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84773XOv<V> extends XPE<V> {
    public static final boolean LJLJJI = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger LJLJJL = Logger.getLogger(AbstractC84773XOv.class.getName());
    public static final AbstractC84770XOs LJLJJLL;
    public static final Object LJLJL;
    public volatile Object LJLIL;
    public volatile XP9 LJLILLLLZI;
    public volatile C84772XOu LJLJI;

    public void LIZIZ() {
    }

    public void LJII() {
    }

    static {
        AbstractC84770XOs c84771XOt;
        Throwable th = null;
        try {
            c84771XOt = new XP0();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c84771XOt = new C84769XOr(AtomicReferenceFieldUpdater.newUpdater(C84772XOu.class, Thread.class, "LIZ"), AtomicReferenceFieldUpdater.newUpdater(C84772XOu.class, C84772XOu.class, "LIZIZ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC84773XOv.class, C84772XOu.class, "LJLJI"), AtomicReferenceFieldUpdater.newUpdater(AbstractC84773XOv.class, XP9.class, "LJLILLLLZI"), AtomicReferenceFieldUpdater.newUpdater(AbstractC84773XOv.class, Object.class, "LJLIL"));
            } catch (Throwable th3) {
                th = th3;
                c84771XOt = new C84771XOt();
            }
        }
        LJLJJLL = c84771XOt;
        if (th != null) {
            Logger logger = LJLJJL;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        LJLJL = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String LJIIIIZZ() {
        String valueOf;
        Object obj = this.LJLIL;
        if (obj instanceof XP2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setFuture=[");
            C76L<? extends V> c76l = ((XP2) obj).LJLILLLLZI;
            if (c76l == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(c76l);
            }
            return JBR.LJFF(LIZ, valueOf, "]", LIZ);
        }
        if (this instanceof ScheduledFuture) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("remaining delay=[");
            LIZ2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            LIZ2.append(" ms]");
            return X1D.LIZIZ(LIZ2);
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.LJLIL instanceof XPA;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        if (this.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r0 instanceof XP2)) & z;
    }

    public final String toString() {
        String LIZIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZ(sb);
        } else {
            try {
                LIZIZ = LJIIIIZZ();
            } catch (RuntimeException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Exception thrown from implementation: ");
                LIZ.append(e.getClass());
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            if (!V0N.LJJII(LIZIZ)) {
                C1DI.LIZIZ(sb, "PENDING, info=[", LIZIZ, "]");
            } else if (isDone()) {
                LIZ(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get() {
        boolean z;
        Object obj;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj2 = this.LJLIL;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj2 instanceof XP2))) {
                return (V) LJ(obj2);
            }
            C84772XOu c84772XOu = this.LJLJI;
            if (c84772XOu != C84772XOu.LIZJ) {
                C84772XOu c84772XOu2 = new C84772XOu();
                do {
                    AbstractC84770XOs abstractC84770XOs = LJLJJLL;
                    abstractC84770XOs.LIZLLL(c84772XOu2, c84772XOu);
                    if (abstractC84770XOs.LIZJ(this, c84772XOu, c84772XOu2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.LJLIL;
                                if (obj != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                LJIIIZ(c84772XOu2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof XP2))));
                        return (V) LJ(obj);
                    }
                    c84772XOu = this.LJLJI;
                } while (c84772XOu != C84772XOu.LIZJ);
            }
            return (V) LJ(this.LJLIL);
        }
        throw new InterruptedException();
    }

    private void LIZ(StringBuilder sb) {
        String valueOf;
        try {
            Object LLLLZIL = C65734Pr0.LLLLZIL(this);
            sb.append("SUCCESS, result=[");
            if (LLLLZIL != this) {
                valueOf = String.valueOf(LLLLZIL);
            } else {
                valueOf = "this future";
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public static void LIZJ(AbstractC84773XOv<?> abstractC84773XOv) {
        XP9 xp9;
        XP9 xp92;
        XP9 xp93 = null;
        while (true) {
            C84772XOu c84772XOu = abstractC84773XOv.LJLJI;
            if (LJLJJLL.LIZJ(abstractC84773XOv, c84772XOu, C84772XOu.LIZJ)) {
                while (c84772XOu != null) {
                    Thread thread = c84772XOu.LIZ;
                    if (thread != null) {
                        c84772XOu.LIZ = null;
                        LockSupport.unpark(thread);
                    }
                    c84772XOu = c84772XOu.LIZIZ;
                }
                abstractC84773XOv.LIZIZ();
                do {
                    xp9 = abstractC84773XOv.LJLILLLLZI;
                } while (!LJLJJLL.LIZ(abstractC84773XOv, xp9, XP9.LIZLLL));
                while (true) {
                    xp92 = xp93;
                    xp93 = xp9;
                    if (xp9 == null) {
                        break;
                    }
                    xp9 = xp9.LIZJ;
                    xp93.LIZJ = xp92;
                }
                while (xp92 != null) {
                    xp93 = xp92.LIZJ;
                    Runnable runnable = xp92.LIZ;
                    if (runnable instanceof XP2) {
                        XP2 xp2 = (XP2) runnable;
                        abstractC84773XOv = xp2.LJLIL;
                        if (abstractC84773XOv.LJLIL == xp2) {
                            if (LJLJJLL.LIZIZ(abstractC84773XOv, xp2, LJI(xp2.LJLILLLLZI))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        LIZLLL(runnable, xp92.LIZIZ);
                    }
                    xp92 = xp93;
                }
                return;
            }
        }
    }

    public static Object LJ(Object obj) {
        if (!(obj instanceof XPA)) {
            if (!(obj instanceof XPC)) {
                if (obj == LJLJL) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((XPC) obj).LIZ);
        }
        Throwable th = ((XPA) obj).LIZIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object LJI(C76L<?> c76l) {
        if (c76l instanceof XP4) {
            Object obj = ((AbstractC84773XOv) c76l).LJLIL;
            if (obj instanceof XPA) {
                XPA xpa = (XPA) obj;
                if (xpa.LIZ) {
                    if (xpa.LIZIZ != null) {
                        return new XPA(xpa.LIZIZ, false);
                    }
                    return XPA.LIZLLL;
                }
                return obj;
            }
            return obj;
        }
        try {
            Object LLLLZIL = C65734Pr0.LLLLZIL(c76l);
            if (LLLLZIL == null) {
                return LJLJL;
            }
            return LLLLZIL;
        } catch (CancellationException e) {
            return new XPA(e, false);
        } catch (ExecutionException e2) {
            return new XPC(e2.getCause());
        } catch (Throwable th) {
            return new XPC(th);
        }
    }

    public final void LJIIIZ(C84772XOu c84772XOu) {
        c84772XOu.LIZ = null;
        while (true) {
            C84772XOu c84772XOu2 = this.LJLJI;
            if (c84772XOu2 == C84772XOu.LIZJ) {
                return;
            }
            C84772XOu c84772XOu3 = null;
            while (c84772XOu2 != null) {
                C84772XOu c84772XOu4 = c84772XOu2.LIZIZ;
                if (c84772XOu2.LIZ != null) {
                    c84772XOu3 = c84772XOu2;
                } else if (c84772XOu3 != null) {
                    c84772XOu3.LIZIZ = c84772XOu4;
                    if (c84772XOu3.LIZ == null) {
                        break;
                    }
                } else if (!LJLJJLL.LIZJ(this, c84772XOu2, c84772XOu4)) {
                    break;
                }
                c84772XOu2 = c84772XOu4;
            }
            return;
        }
    }

    public boolean LJIIJ(V v) {
        if (v == null) {
            v = (V) LJLJL;
        }
        if (LJLJJLL.LIZIZ(this, null, v)) {
            LIZJ(this);
            return true;
        }
        return false;
    }

    public boolean LJIIJJI(Throwable th) {
        th.getClass();
        if (LJLJJLL.LIZIZ(this, null, new XPC(th))) {
            LIZJ(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        XPA xpa;
        boolean z3;
        Object obj = this.LJLIL;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof XP2)) {
            if (LJLJJI) {
                xpa = new XPA(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                xpa = XPA.LIZJ;
            } else {
                xpa = XPA.LIZLLL;
            }
            boolean z4 = false;
            AbstractC84773XOv<V> abstractC84773XOv = this;
            while (true) {
                if (LJLJJLL.LIZIZ(abstractC84773XOv, obj, xpa)) {
                    if (z) {
                        abstractC84773XOv.LJII();
                    }
                    LIZJ(abstractC84773XOv);
                    if (!(obj instanceof XP2)) {
                        return true;
                    }
                    C76L<? extends V> c76l = ((XP2) obj).LJLILLLLZI;
                    if (c76l instanceof XP4) {
                        abstractC84773XOv = (AbstractC84773XOv) c76l;
                        obj = abstractC84773XOv.LJLIL;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof XP2))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        c76l.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractC84773XOv.LJLIL;
                    if (!(obj instanceof XP2)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    public static void LIZLLL(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = LJLJJL;
            Level level = Level.SEVERE;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RuntimeException while executing runnable ");
            LIZ.append(runnable);
            LIZ.append(" with executor ");
            LIZ.append(executor);
            logger.log(level, X1D.LIZIZ(LIZ), (Throwable) e);
        }
    }

    @Override // X.C76L
    public void LJFF(Runnable runnable, Executor executor) {
        C76917UGr.LJII(executor, "Executor was null.");
        XP9 xp9 = this.LJLILLLLZI;
        if (xp9 != XP9.LIZLLL) {
            XP9 xp92 = new XP9(runnable, executor);
            do {
                xp92.LIZJ = xp9;
                if (LJLJJLL.LIZ(this, xp9, xp92)) {
                    return;
                } else {
                    xp9 = this.LJLILLLLZI;
                }
            } while (xp9 != XP9.LIZLLL);
        }
        LIZLLL(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.LJLIL;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof XP2))) {
                return (V) LJ(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C84772XOu c84772XOu = this.LJLJI;
                if (c84772XOu != C84772XOu.LIZJ) {
                    C84772XOu c84772XOu2 = new C84772XOu();
                    do {
                        AbstractC84770XOs abstractC84770XOs = LJLJJLL;
                        abstractC84770XOs.LIZLLL(c84772XOu2, c84772XOu);
                        if (!abstractC84770XOs.LIZJ(this, c84772XOu, c84772XOu2)) {
                            c84772XOu = this.LJLJI;
                        } else {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.LJLIL;
                                    if (obj2 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3 & (!(obj2 instanceof XP2))) {
                                        return (V) LJ(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    LJIIIZ(c84772XOu2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            LJIIIZ(c84772XOu2);
                        }
                    } while (c84772XOu != C84772XOu.LIZJ);
                }
                return (V) LJ(this.LJLIL);
            }
            while (nanos > 0) {
                Object obj3 = this.LJLIL;
                if (obj3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 & (!(obj3 instanceof XP2))) {
                    return (V) LJ(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC84773XOv = toString();
            if (isDone()) {
                StringBuilder LIZJ = V10.LIZJ("Waited ", j, " ");
                LIZJ.append(C30591Hz.LJJIIZ(timeUnit.toString()));
                LIZJ.append(" but future completed as timeout expired");
                throw new TimeoutException(X1D.LIZIZ(LIZJ));
            }
            StringBuilder LIZJ2 = V10.LIZJ("Waited ", j, " ");
            LIZJ2.append(C30591Hz.LJJIIZ(timeUnit.toString()));
            LIZJ2.append(" for ");
            LIZJ2.append(abstractC84773XOv);
            throw new TimeoutException(X1D.LIZIZ(LIZJ2));
        }
        throw new InterruptedException();
    }
}

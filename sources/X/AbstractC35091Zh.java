package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35091Zh<V> implements C76L<V> {
    public static final boolean LJLJJI = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger LJLJJL = Logger.getLogger(AbstractC35091Zh.class.getName());
    public static final AbstractC22550uZ LJLJJLL;
    public static final Object LJLJL;
    public volatile Object LJLIL;
    public volatile C22590ud LJLILLLLZI;
    public volatile C22610uf LJLJI;

    static {
        AbstractC22550uZ abstractC22550uZ;
        try {
            final AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(C22610uf.class, Thread.class, "LIZ");
            final AtomicReferenceFieldUpdater newUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C22610uf.class, C22610uf.class, "LIZIZ");
            final AtomicReferenceFieldUpdater newUpdater3 = AtomicReferenceFieldUpdater.newUpdater(AbstractC35091Zh.class, C22610uf.class, "LJLJI");
            final AtomicReferenceFieldUpdater newUpdater4 = AtomicReferenceFieldUpdater.newUpdater(AbstractC35091Zh.class, C22590ud.class, "LJLILLLLZI");
            final AtomicReferenceFieldUpdater newUpdater5 = AtomicReferenceFieldUpdater.newUpdater(AbstractC35091Zh.class, Object.class, "LJLIL");
            abstractC22550uZ = new AbstractC22550uZ(newUpdater, newUpdater2, newUpdater3, newUpdater4, newUpdater5) { // from class: X.1Zf
                public final AtomicReferenceFieldUpdater<C22610uf, Thread> LIZ;
                public final AtomicReferenceFieldUpdater<C22610uf, C22610uf> LIZIZ;
                public final AtomicReferenceFieldUpdater<AbstractC35091Zh, C22610uf> LIZJ;
                public final AtomicReferenceFieldUpdater<AbstractC35091Zh, C22590ud> LIZLLL;
                public final AtomicReferenceFieldUpdater<AbstractC35091Zh, Object> LJ;

                @Override // X.AbstractC22550uZ
                public final void LIZLLL(C22610uf c22610uf, C22610uf c22610uf2) {
                    this.LIZIZ.lazySet(c22610uf, c22610uf2);
                }

                @Override // X.AbstractC22550uZ
                public final void LJ(C22610uf c22610uf, Thread thread) {
                    this.LIZ.lazySet(c22610uf, thread);
                }

                @Override // X.AbstractC22550uZ
                public final boolean LIZ(AbstractC35091Zh<?> abstractC35091Zh, C22590ud c22590ud, C22590ud c22590ud2) {
                    AtomicReferenceFieldUpdater<AbstractC35091Zh, C22590ud> atomicReferenceFieldUpdater = this.LIZLLL;
                    while (!atomicReferenceFieldUpdater.compareAndSet(abstractC35091Zh, c22590ud, c22590ud2)) {
                        if (atomicReferenceFieldUpdater.get(abstractC35091Zh) != c22590ud) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.AbstractC22550uZ
                public final boolean LIZIZ(AbstractC35091Zh<?> abstractC35091Zh, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater<AbstractC35091Zh, Object> atomicReferenceFieldUpdater = this.LJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(abstractC35091Zh, obj, obj2)) {
                        if (atomicReferenceFieldUpdater.get(abstractC35091Zh) != obj) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.AbstractC22550uZ
                public final boolean LIZJ(AbstractC35091Zh<?> abstractC35091Zh, C22610uf c22610uf, C22610uf c22610uf2) {
                    AtomicReferenceFieldUpdater<AbstractC35091Zh, C22610uf> atomicReferenceFieldUpdater = this.LIZJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(abstractC35091Zh, c22610uf, c22610uf2)) {
                        if (atomicReferenceFieldUpdater.get(abstractC35091Zh) != c22610uf) {
                            return false;
                        }
                    }
                    return true;
                }

                {
                    this.LIZ = newUpdater;
                    this.LIZIZ = newUpdater2;
                    this.LIZJ = newUpdater3;
                    this.LIZLLL = newUpdater4;
                    this.LJ = newUpdater5;
                }
            };
            th = null;
        } catch (Throwable th) {
            th = th;
            abstractC22550uZ = new AbstractC22550uZ() { // from class: X.1Zg
                @Override // X.AbstractC22550uZ
                public final void LIZLLL(C22610uf c22610uf, C22610uf c22610uf2) {
                    c22610uf.LIZIZ = c22610uf2;
                }

                @Override // X.AbstractC22550uZ
                public final void LJ(C22610uf c22610uf, Thread thread) {
                    c22610uf.LIZ = thread;
                }

                @Override // X.AbstractC22550uZ
                public final boolean LIZ(AbstractC35091Zh<?> abstractC35091Zh, C22590ud c22590ud, C22590ud c22590ud2) {
                    synchronized (abstractC35091Zh) {
                        if (abstractC35091Zh.LJLILLLLZI == c22590ud) {
                            abstractC35091Zh.LJLILLLLZI = c22590ud2;
                            return true;
                        }
                        return false;
                    }
                }

                @Override // X.AbstractC22550uZ
                public final boolean LIZIZ(AbstractC35091Zh<?> abstractC35091Zh, Object obj, Object obj2) {
                    synchronized (abstractC35091Zh) {
                        if (abstractC35091Zh.LJLIL == obj) {
                            abstractC35091Zh.LJLIL = obj2;
                            return true;
                        }
                        return false;
                    }
                }

                @Override // X.AbstractC22550uZ
                public final boolean LIZJ(AbstractC35091Zh<?> abstractC35091Zh, C22610uf c22610uf, C22610uf c22610uf2) {
                    synchronized (abstractC35091Zh) {
                        if (abstractC35091Zh.LJLJI == c22610uf) {
                            abstractC35091Zh.LJLJI = c22610uf2;
                            return true;
                        }
                        return false;
                    }
                }
            };
        }
        LJLJJLL = abstractC22550uZ;
        if (th != null) {
            LJLJJL.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        LJLJL = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJI() {
        String valueOf;
        Object obj = this.LJLIL;
        if (obj instanceof RunnableC22600ue) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setFuture=[");
            C76L<? extends V> c76l = ((RunnableC22600ue) obj).LJLILLLLZI;
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
    public final boolean isCancelled() {
        return this.LJLIL instanceof C22560ua;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r0 instanceof RunnableC22600ue)) & z;
    }

    public final String toString() {
        String LIZIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.LJLIL instanceof C22560ua) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZ(sb);
        } else {
            try {
                LIZIZ = LJI();
            } catch (RuntimeException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Exception thrown from implementation: ");
                LIZ.append(e.getClass());
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            if (LIZIZ != null && !LIZIZ.isEmpty()) {
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
    public final V get() {
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
            if (z & (!(obj2 instanceof RunnableC22600ue))) {
                return (V) LIZLLL(obj2);
            }
            C22610uf c22610uf = this.LJLJI;
            if (c22610uf != C22610uf.LIZJ) {
                C22610uf c22610uf2 = new C22610uf();
                do {
                    AbstractC22550uZ abstractC22550uZ = LJLJJLL;
                    abstractC22550uZ.LIZLLL(c22610uf2, c22610uf);
                    if (abstractC22550uZ.LIZJ(this, c22610uf, c22610uf2)) {
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
                                LJII(c22610uf2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof RunnableC22600ue))));
                        return (V) LIZLLL(obj);
                    }
                    c22610uf = this.LJLJI;
                } while (c22610uf != C22610uf.LIZJ);
            }
            return (V) LIZLLL(this.LJLIL);
        }
        throw new InterruptedException();
    }

    public static void LIZIZ(AbstractC35091Zh<?> abstractC35091Zh) {
        C22590ud c22590ud;
        C22590ud c22590ud2;
        C22590ud c22590ud3 = null;
        while (true) {
            C22610uf c22610uf = abstractC35091Zh.LJLJI;
            if (LJLJJLL.LIZJ(abstractC35091Zh, c22610uf, C22610uf.LIZJ)) {
                while (c22610uf != null) {
                    Thread thread = c22610uf.LIZ;
                    if (thread != null) {
                        c22610uf.LIZ = null;
                        LockSupport.unpark(thread);
                    }
                    c22610uf = c22610uf.LIZIZ;
                }
                do {
                    c22590ud = abstractC35091Zh.LJLILLLLZI;
                } while (!LJLJJLL.LIZ(abstractC35091Zh, c22590ud, C22590ud.LIZLLL));
                while (true) {
                    c22590ud2 = c22590ud3;
                    c22590ud3 = c22590ud;
                    if (c22590ud == null) {
                        break;
                    }
                    c22590ud = c22590ud.LIZJ;
                    c22590ud3.LIZJ = c22590ud2;
                }
                while (c22590ud2 != null) {
                    c22590ud3 = c22590ud2.LIZJ;
                    Runnable runnable = c22590ud2.LIZ;
                    if (runnable instanceof RunnableC22600ue) {
                        RunnableC22600ue runnableC22600ue = (RunnableC22600ue) runnable;
                        abstractC35091Zh = runnableC22600ue.LJLIL;
                        if (abstractC35091Zh.LJLIL == runnableC22600ue) {
                            if (LJLJJLL.LIZIZ(abstractC35091Zh, runnableC22600ue, LJ(runnableC22600ue.LJLILLLLZI))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        LIZJ(runnable, c22590ud2.LIZIZ);
                    }
                    c22590ud2 = c22590ud3;
                }
                return;
            }
        }
    }

    public static Object LIZLLL(Object obj) {
        if (!(obj instanceof C22560ua)) {
            if (!(obj instanceof C22580uc)) {
                if (obj == LJLJL) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C22580uc) obj).LIZ);
        }
        Throwable th = ((C22560ua) obj).LIZIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object LJ(C76L<?> c76l) {
        Object obj;
        if (c76l instanceof AbstractC35091Zh) {
            Object obj2 = ((AbstractC35091Zh) c76l).LJLIL;
            if (obj2 instanceof C22560ua) {
                C22560ua c22560ua = (C22560ua) obj2;
                if (c22560ua.LIZ) {
                    if (c22560ua.LIZIZ != null) {
                        return new C22560ua(c22560ua.LIZIZ, false);
                    }
                    return C22560ua.LIZLLL;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = c76l.isCancelled();
        if ((!LJLJJI) & isCancelled) {
            return C22560ua.LIZLLL;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = c76l.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        C16880lQ.LLLLIIIILLL().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (!isCancelled) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    LIZ.append(c76l);
                    return new C22580uc(new IllegalArgumentException(X1D.LIZIZ(LIZ), e));
                }
                return new C22560ua(e, false);
            } catch (ExecutionException e2) {
                return new C22580uc(e2.getCause());
            } catch (Throwable th2) {
                return new C22580uc(th2);
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
        if (obj == null) {
            return LJLJL;
        }
        return obj;
    }

    public final void LIZ(StringBuilder sb) {
        V v;
        String valueOf;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        C16880lQ.LLLLIIIILLL().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v != this) {
            valueOf = String.valueOf(v);
        } else {
            valueOf = "this future";
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public final void LJII(C22610uf c22610uf) {
        c22610uf.LIZ = null;
        while (true) {
            C22610uf c22610uf2 = this.LJLJI;
            if (c22610uf2 == C22610uf.LIZJ) {
                return;
            }
            C22610uf c22610uf3 = null;
            while (c22610uf2 != null) {
                C22610uf c22610uf4 = c22610uf2.LIZIZ;
                if (c22610uf2.LIZ != null) {
                    c22610uf3 = c22610uf2;
                } else if (c22610uf3 != null) {
                    c22610uf3.LIZIZ = c22610uf4;
                    if (c22610uf3.LIZ == null) {
                        break;
                    }
                } else if (!LJLJJLL.LIZJ(this, c22610uf2, c22610uf4)) {
                    break;
                }
                c22610uf2 = c22610uf4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C22560ua c22560ua;
        boolean z3;
        Object obj = this.LJLIL;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC22600ue)) {
            if (LJLJJI) {
                c22560ua = new C22560ua(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                c22560ua = C22560ua.LIZJ;
            } else {
                c22560ua = C22560ua.LIZLLL;
            }
            boolean z4 = false;
            AbstractC35091Zh<V> abstractC35091Zh = this;
            while (true) {
                if (LJLJJLL.LIZIZ(abstractC35091Zh, obj, c22560ua)) {
                    LIZIZ(abstractC35091Zh);
                    if (!(obj instanceof RunnableC22600ue)) {
                        return true;
                    }
                    C76L<? extends V> c76l = ((RunnableC22600ue) obj).LJLILLLLZI;
                    if (c76l instanceof AbstractC35091Zh) {
                        abstractC35091Zh = (AbstractC35091Zh) c76l;
                        obj = abstractC35091Zh.LJLIL;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof RunnableC22600ue))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        c76l.cancel(z);
                        return true;
                    }
                } else {
                    obj = abstractC35091Zh.LJLIL;
                    if (!(obj instanceof RunnableC22600ue)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    public static void LIZJ(Runnable runnable, Executor executor) {
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
    public final void LJFF(Runnable runnable, Executor executor) {
        executor.getClass();
        C22590ud c22590ud = this.LJLILLLLZI;
        if (c22590ud != C22590ud.LIZLLL) {
            C22590ud c22590ud2 = new C22590ud(runnable, executor);
            do {
                c22590ud2.LIZJ = c22590ud;
                if (LJLJJLL.LIZ(this, c22590ud, c22590ud2)) {
                    return;
                } else {
                    c22590ud = this.LJLILLLLZI;
                }
            } while (c22590ud != C22590ud.LIZLLL);
        }
        LIZJ(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x011c, code lost:
    
        if (r4 != false) goto L70;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35091Zh.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

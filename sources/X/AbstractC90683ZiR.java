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

/* renamed from: X.ZiR, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90683ZiR<V> extends AbstractC90121ZYn implements C76L<V> {
    public static final boolean LJLJJI;
    public static final Logger LJLJJL;
    public static final AbstractC90380ZdY LJLJJLL;
    public static final Object LJLJL;
    public volatile Object LJLIL;
    public volatile C90404Zdw LJLILLLLZI;
    public volatile C90274Zbq LJLJI;

    static {
        boolean z;
        AbstractC90380ZdY c90666ZiA;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        LJLJJI = z;
        LJLJJL = Logger.getLogger(AbstractC90683ZiR.class.getName());
        Throwable th = null;
        try {
            c90666ZiA = new C90678ZiM();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c90666ZiA = new C90772Zjs(AtomicReferenceFieldUpdater.newUpdater(C90274Zbq.class, Thread.class, "LIZ"), AtomicReferenceFieldUpdater.newUpdater(C90274Zbq.class, C90274Zbq.class, "LIZIZ"), AtomicReferenceFieldUpdater.newUpdater(AbstractC90683ZiR.class, C90274Zbq.class, "LJLJI"), AtomicReferenceFieldUpdater.newUpdater(AbstractC90683ZiR.class, C90404Zdw.class, "LJLILLLLZI"), AtomicReferenceFieldUpdater.newUpdater(AbstractC90683ZiR.class, Object.class, "LJLIL"));
            } catch (Throwable th3) {
                th = th3;
                c90666ZiA = new C90666ZiA();
            }
        }
        LJLJJLL = c90666ZiA;
        if (th != null) {
            Logger logger = LJLJJL;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        LJLJL = new Object();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LJLIL instanceof C90387Zdf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r0 instanceof RunnableC90233ZbB)) & z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(C16880lQ.LJLLJ(getClass()));
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.LJLIL instanceof C90387Zdf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZ(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.LJLIL;
            String str2 = null;
            if (obj instanceof RunnableC90233ZbB) {
                sb.append(", setFuture=[");
                obj.getClass();
                try {
                    sb.append((Object) null);
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    if (this instanceof ScheduledFuture) {
                        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("remaining delay=[");
                        sb2.append(delay);
                        sb2.append(" ms]");
                        str = sb2.toString();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        if (!str.isEmpty()) {
                            str2 = str;
                        }
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    str2 = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
                }
                if (str2 != null) {
                    sb.append(", info=[");
                    sb.append(str2);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                LIZ(sb);
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
            if (z & (!(obj2 instanceof RunnableC90233ZbB))) {
                return (V) LJ(obj2);
            }
            C90274Zbq c90274Zbq = this.LJLJI;
            if (c90274Zbq != C90274Zbq.LIZJ) {
                C90274Zbq c90274Zbq2 = new C90274Zbq();
                do {
                    AbstractC90380ZdY abstractC90380ZdY = LJLJJLL;
                    abstractC90380ZdY.LIZ(c90274Zbq2, c90274Zbq);
                    if (abstractC90380ZdY.LJ(this, c90274Zbq, c90274Zbq2)) {
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
                                LIZLLL(c90274Zbq2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof RunnableC90233ZbB))));
                        return (V) LJ(obj);
                    }
                    c90274Zbq = this.LJLJI;
                } while (c90274Zbq != C90274Zbq.LIZJ);
            }
            Object obj3 = this.LJLIL;
            obj3.getClass();
            return (V) LJ(obj3);
        }
        throw new InterruptedException();
    }

    public static void LIZIZ(AbstractC90683ZiR<?> abstractC90683ZiR) {
        C90274Zbq c90274Zbq;
        C90404Zdw c90404Zdw;
        do {
            c90274Zbq = abstractC90683ZiR.LJLJI;
        } while (!LJLJJLL.LJ(abstractC90683ZiR, c90274Zbq, C90274Zbq.LIZJ));
        while (c90274Zbq != null) {
            Thread thread = c90274Zbq.LIZ;
            if (thread != null) {
                c90274Zbq.LIZ = null;
                LockSupport.unpark(thread);
            }
            c90274Zbq = c90274Zbq.LIZIZ;
        }
        do {
            c90404Zdw = abstractC90683ZiR.LJLILLLLZI;
        } while (!LJLJJLL.LIZJ(abstractC90683ZiR, c90404Zdw, C90404Zdw.LIZLLL));
        C90404Zdw c90404Zdw2 = null;
        while (c90404Zdw != null) {
            C90404Zdw c90404Zdw3 = c90404Zdw.LIZJ;
            c90404Zdw.LIZJ = c90404Zdw2;
            c90404Zdw2 = c90404Zdw;
            c90404Zdw = c90404Zdw3;
        }
        while (c90404Zdw2 != null) {
            C90404Zdw c90404Zdw4 = c90404Zdw2.LIZJ;
            Runnable runnable = c90404Zdw2.LIZ;
            runnable.getClass();
            if (!(runnable instanceof RunnableC90233ZbB)) {
                Executor executor = c90404Zdw2.LIZIZ;
                executor.getClass();
                LIZJ(runnable, executor);
                c90404Zdw2 = c90404Zdw4;
            } else {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V LJ(Object obj) {
        if (!(obj instanceof C90387Zdf)) {
            if (!(obj instanceof C90397Zdp)) {
                if (obj == LJLJL) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C90397Zdp) obj).LIZ);
        }
        Throwable th = ((C90387Zdf) obj).LIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final void LIZ(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
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
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v != null) {
            if (v == this) {
                sb.append("this future");
            } else {
                sb.append(v.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(v)));
            }
        } else {
            sb.append("null");
        }
        sb.append("]");
    }

    public final void LIZLLL(C90274Zbq c90274Zbq) {
        c90274Zbq.LIZ = null;
        while (true) {
            C90274Zbq c90274Zbq2 = this.LJLJI;
            if (c90274Zbq2 != C90274Zbq.LIZJ) {
                C90274Zbq c90274Zbq3 = null;
                while (c90274Zbq2 != null) {
                    C90274Zbq c90274Zbq4 = c90274Zbq2.LIZIZ;
                    if (c90274Zbq2.LIZ != null) {
                        c90274Zbq3 = c90274Zbq2;
                    } else if (c90274Zbq3 != null) {
                        c90274Zbq3.LIZIZ = c90274Zbq4;
                        if (c90274Zbq3.LIZ == null) {
                            break;
                        }
                    } else if (!LJLJJLL.LJ(this, c90274Zbq2, c90274Zbq4)) {
                        break;
                    }
                    c90274Zbq2 = c90274Zbq4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C90387Zdf c90387Zdf;
        Object obj = this.LJLIL;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC90233ZbB)) {
            if (LJLJJI) {
                c90387Zdf = new C90387Zdf(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c90387Zdf = C90387Zdf.LIZIZ;
                } else {
                    c90387Zdf = C90387Zdf.LIZJ;
                }
                c90387Zdf.getClass();
            }
            while (!LJLJJLL.LIZLLL(this, obj, c90387Zdf)) {
                obj = this.LJLIL;
                if (!(obj instanceof RunnableC90233ZbB)) {
                }
            }
            LIZIZ(this);
            if (!(obj instanceof RunnableC90233ZbB)) {
                return true;
            }
            obj.getClass();
            throw null;
        }
        return false;
    }

    public static void LIZJ(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = LJLJJL;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    @Override // X.C76L
    public final void LJFF(Runnable runnable, Executor executor) {
        C90404Zdw c90404Zdw;
        if (executor != null) {
            if (!isDone() && (c90404Zdw = this.LJLILLLLZI) != C90404Zdw.LIZLLL) {
                C90404Zdw c90404Zdw2 = new C90404Zdw(runnable, executor);
                do {
                    c90404Zdw2.LIZJ = c90404Zdw;
                    if (LJLJJLL.LIZJ(this, c90404Zdw, c90404Zdw2)) {
                        return;
                    } else {
                        c90404Zdw = this.LJLILLLLZI;
                    }
                } while (c90404Zdw != C90404Zdw.LIZLLL);
            }
            LIZJ(runnable, executor);
            return;
        }
        throw new NullPointerException("Executor was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
    
        if (r17 != false) goto L69;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC90683ZiR.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

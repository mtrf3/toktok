package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FSL extends XIC {
    public static final FSL LJLIL = new FSL();
    public static final int LJLILLLLZI;
    public static volatile Executor pool;

    @Override // X.XKW
    public final String toString() {
        return "CommonPool";
    }

    static {
        int i;
        String property;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
        }
        if (property != null) {
            Integer LJJIL = C38350F3i.LJJIL(property);
            if (LJJIL != null && LJJIL.intValue() >= 1) {
                i = LJJIL.intValue();
                LJLILLLLZI = i;
            } else {
                String LJIILLIIL = o.LJIILLIIL(property, "Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
        }
        i = -1;
        LJLILLLLZI = i;
    }

    public static ExecutorService LJJIJIL() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return C16880lQ.LLLLZI(LJJJI(), new ThreadFactory() { // from class: X.FSK
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, o.LJIILLIIL(Integer.valueOf(atomicInteger.incrementAndGet()), "CommonPool-worker-"));
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public static int LJJJI() {
        Integer valueOf = Integer.valueOf(LJLILLLLZI);
        if (valueOf.intValue() > 0) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors < 1) {
            return 1;
        }
        return availableProcessors;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        "Close cannot be invoked on CommonPool".toString();
        throw new IllegalStateException("Close cannot be invoked on CommonPool");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.concurrent.ExecutorService LJJIZ() {
        /*
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = LJJIJIL()
            return r0
        Lb:
            r3 = 0
            java.lang.String r0 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r2 = r3
        L14:
            if (r2 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = LJJIJIL()
            return r0
        L1b:
            int r0 = X.FSL.LJLILLLLZI
            r4 = 0
            r5 = 1
            if (r0 >= 0) goto L71
            java.lang.String r1 = "commonPool"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L36
            boolean r0 = r6 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L36
            java.util.concurrent.ExecutorService r6 = (java.util.concurrent.ExecutorService) r6     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r6 = r3
        L37:
            if (r6 != 0) goto L3a
            goto L71
        L3a:
            X.FSL r0 = X.FSL.LJLIL
            r0.getClass()
            Y.ARunnableS4S0001000_9 r1 = new Y.ARunnableS4S0001000_9
            r0 = 0
            r1.<init>(r5, r0)
            r6.submit(r1)
            java.lang.String r1 = "getPoolSize"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L5d
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r1.invoke(r6, r0)     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5d
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L5d:
            r1 = r3
        L5e:
            if (r1 != 0) goto L68
        L60:
            r0 = 0
        L61:
            if (r0 == 0) goto L66
        L63:
            if (r6 != 0) goto L70
            goto L71
        L66:
            r6 = r3
            goto L63
        L68:
            int r0 = r1.intValue()
            if (r0 < r5) goto L60
            r0 = 1
            goto L61
        L70:
            return r6
        L71:
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L97
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L97
            r1[r4] = r0     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L97
            X.FSL r0 = X.FSL.LJLIL     // Catch: java.lang.Throwable -> L97
            r0.getClass()     // Catch: java.lang.Throwable -> L97
            int r0 = LJJJI()     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L97
            r1[r4] = r0     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L97
            boolean r0 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L97
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L97
            r3 = r1
        L97:
            if (r3 != 0) goto L9d
            java.util.concurrent.ExecutorService r3 = LJJIJIL()
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSL.LJJIZ():java.util.concurrent.ExecutorService");
    }

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                synchronized (this) {
                    executor = pool;
                    if (executor == null) {
                        executor = LJJIZ();
                        pool = executor;
                    }
                }
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            XJE.LJLIL.enqueue(runnable);
        }
    }
}

package X;

import defpackage.b1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T1k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractRunnableC73972T1k<T> extends AtomicReference<Runnable> implements Runnable {
    public static final RunnableC73973T1l LJLIL = new RunnableC73973T1l();
    public static final RunnableC73973T1l LJLILLLLZI = new RunnableC73973T1l();

    public abstract void LIZ(T t, Throwable th);

    public abstract boolean LIZIZ();

    public abstract T LIZJ();

    public abstract String LIZLLL();

    @Override // java.lang.Runnable
    public final void run() {
        com_google_common_util_concurrent_InterruptibleTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public final void com_google_common_util_concurrent_InterruptibleTask__run$___twin___() {
        T LIZJ;
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (!compareAndSet(null, LLLLIIIILLL)) {
            return;
        }
        boolean z = !LIZIZ();
        RunnableC73973T1l runnableC73973T1l = LJLILLLLZI;
        RunnableC73973T1l runnableC73973T1l2 = LJLIL;
        if (z) {
            try {
                LIZJ = LIZJ();
            } catch (Throwable th) {
                if (!compareAndSet(LLLLIIIILLL, runnableC73973T1l2)) {
                    while (get() == runnableC73973T1l) {
                        Thread.yield();
                    }
                }
                LIZ(null, th);
                return;
            }
        } else {
            LIZJ = null;
        }
        if (!compareAndSet(LLLLIIIILLL, runnableC73973T1l2)) {
            while (get() == runnableC73973T1l) {
                Thread.yield();
            }
        }
        if (z) {
            LIZ(LIZJ, null);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == LJLIL) {
            str = "running=[DONE]";
        } else if (runnable == LJLILLLLZI) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("running=[RUNNING ON ");
            LIZ.append(((Thread) runnable).getName());
            LIZ.append("]");
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder LIZJ = b1.LIZJ(str, ", ");
        LIZJ.append(LIZLLL());
        return X1D.LIZIZ(LIZJ);
    }

    public static void com_google_common_util_concurrent_InterruptibleTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AbstractRunnableC73972T1k abstractRunnableC73972T1k) {
        boolean LIZ;
        try {
            abstractRunnableC73972T1k.com_google_common_util_concurrent_InterruptibleTask__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }
}

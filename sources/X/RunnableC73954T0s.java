package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.T0s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73954T0s extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC92693kP {
    public static final Object LJLILLLLZI = new Object();
    public static final Object LJLJI = new Object();
    public static final Object LJLJJI = new Object();
    public static final Object LJLJJL = new Object();
    public static final long serialVersionUID = -6120223772001106981L;
    public final Runnable LJLIL;

    @Override // X.InterfaceC92693kP
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z;
        while (true) {
            Object obj6 = get(1);
            obj = LJLJJL;
            if (obj6 == obj || obj6 == (obj4 = LJLJI) || obj6 == (obj5 = LJLJJI)) {
                break;
            }
            if (get(2) != C16880lQ.LLLLIIIILLL()) {
                z = true;
                obj4 = obj5;
            } else {
                z = false;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = LJLILLLLZI) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC73955T0t) obj2).LIZJ(this);
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == LJLILLLLZI || obj == LJLJJL;
    }

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_schedulers_ScheduledRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void io_reactivex_internal_schedulers_ScheduledRunnable__run$___twin___() {
        Object obj;
        boolean compareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = LJLJJI;
        Object obj5 = LJLJI;
        Object obj6 = LJLILLLLZI;
        Object obj7 = LJLJJL;
        lazySet(2, C16880lQ.LLLLIIIILLL());
        try {
            this.LJLIL.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((InterfaceC73955T0t) obj2).LIZJ(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((InterfaceC73955T0t) obj2).LIZJ(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    public static void io_reactivex_internal_schedulers_ScheduledRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC73954T0s runnableC73954T0s) {
        boolean LIZ;
        try {
            runnableC73954T0s.io_reactivex_internal_schedulers_ScheduledRunnable__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == LJLJJL) {
                return;
            }
            if (obj == LJLJI) {
                future.cancel(false);
                return;
            } else if (obj == LJLJJI) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public RunnableC73954T0s(Runnable runnable, InterfaceC73955T0t interfaceC73955T0t) {
        super(3);
        this.LJLIL = runnable;
        lazySet(0, interfaceC73955T0t);
    }
}

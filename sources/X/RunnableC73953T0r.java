package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.T0r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73953T0r extends AtomicInteger implements Runnable, InterfaceC92693kP {
    public static final long serialVersionUID = -3603436687413320876L;
    public final Runnable LJLIL;
    public final InterfaceC73955T0t LJLILLLLZI;
    public volatile Thread LJLJI;

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    InterfaceC73955T0t interfaceC73955T0t = this.LJLILLLLZI;
                    if (interfaceC73955T0t == null) {
                        return;
                    }
                    interfaceC73955T0t.LIZJ(this);
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.LJLJI;
                if (thread != null) {
                    thread.interrupt();
                    this.LJLJI = null;
                }
                set(4);
                InterfaceC73955T0t interfaceC73955T0t2 = this.LJLILLLLZI;
                if (interfaceC73955T0t2 == null) {
                    return;
                }
                interfaceC73955T0t2.LIZJ(this);
                return;
            }
        }
    }

    public void io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable__run$___twin___() {
        if (get() == 0) {
            this.LJLJI = C16880lQ.LLLLIIIILLL();
            if (compareAndSet(0, 1)) {
                try {
                    this.LJLIL.run();
                    this.LJLJI = null;
                    if (compareAndSet(1, 2)) {
                        InterfaceC73955T0t interfaceC73955T0t = this.LJLILLLLZI;
                        if (interfaceC73955T0t != null) {
                            interfaceC73955T0t.LIZJ(this);
                            return;
                        }
                        return;
                    }
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                    return;
                } catch (Throwable th) {
                    this.LJLJI = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        InterfaceC73955T0t interfaceC73955T0t2 = this.LJLILLLLZI;
                        if (interfaceC73955T0t2 != null) {
                            interfaceC73955T0t2.LIZJ(this);
                        }
                    }
                    throw th;
                }
            }
            this.LJLJI = null;
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() >= 2) {
            return true;
        }
        return false;
    }

    public static void io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC73953T0r runnableC73953T0r) {
        boolean LIZ;
        try {
            runnableC73953T0r.io_reactivex_internal_schedulers_ExecutorScheduler$ExecutorWorker$InterruptibleRunnable__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73953T0r(Runnable runnable, C73318Sq2 c73318Sq2) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = c73318Sq2;
    }
}

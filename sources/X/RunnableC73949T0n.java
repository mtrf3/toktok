package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.T0n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73949T0n extends AbstractC73945T0j implements Runnable {
    public final boolean LJLIL;
    public final Executor LJLILLLLZI;
    public volatile boolean LJLJJI;
    public final AtomicInteger LJLJJL = new AtomicInteger();
    public final C73318Sq2 LJLJJLL = new C73318Sq2();
    public final C73939T0d<Runnable> LJLJI = new C73939T0d<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            this.LJLJJLL.dispose();
            if (this.LJLJJL.getAndIncrement() == 0) {
                this.LJLJI.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0015, code lost:
    
        if (r4.LJLJJI == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        r2 = r4.LJLJJL.addAndGet(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (r2 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0017, code lost:
    
        r3.clear();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            X.T0d<java.lang.Runnable> r3 = r4.LJLJI     // Catch: java.lang.Throwable -> L30
            r2 = 1
        L3:
            boolean r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lb
            r3.clear()     // Catch: java.lang.Throwable -> L30
            goto L37
        Lb:
            java.lang.Object r0 = r3.poll()     // Catch: java.lang.Throwable -> L30
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L1b
            boolean r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L26
            r3.clear()     // Catch: java.lang.Throwable -> L30
            goto L37
        L1b:
            r0.run()     // Catch: java.lang.Throwable -> L30
            boolean r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lb
            r3.clear()     // Catch: java.lang.Throwable -> L30
            goto L37
        L26:
            java.util.concurrent.atomic.AtomicInteger r1 = r4.LJLJJL     // Catch: java.lang.Throwable -> L30
            int r0 = -r2
            int r2 = r1.addAndGet(r0)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L3
            goto L37
        L30:
            r1 = move-exception
            boolean r0 = X.C39223FaN.LIZ(r1)
            if (r0 == 0) goto L38
        L37:
            return
        L38:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC73949T0n.run():void");
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZIZ(Runnable runnable) {
        InterfaceC92693kP poe;
        if (this.LJLJJI) {
            return EnumC73538Sta.INSTANCE;
        }
        C73320Sq4.LIZ(runnable, "run is null");
        if (this.LJLIL) {
            poe = new RunnableC73953T0r(runnable, this.LJLJJLL);
            this.LJLJJLL.LIZ(poe);
        } else {
            poe = new POE(runnable);
        }
        this.LJLJI.offer(poe);
        if (this.LJLJJL.getAndIncrement() == 0) {
            try {
                this.LJLILLLLZI.execute(this);
            } catch (RejectedExecutionException e) {
                this.LJLJJI = true;
                this.LJLJI.clear();
                C73548Stk.LIZIZ(e);
                return EnumC73538Sta.INSTANCE;
            }
        }
        return poe;
    }

    public RunnableC73949T0n(Executor executor, boolean z) {
        this.LJLILLLLZI = executor;
        this.LJLIL = z;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return LIZIZ(runnable);
        }
        if (this.LJLJJI) {
            return EnumC73538Sta.INSTANCE;
        }
        C73616Suq c73616Suq = new C73616Suq();
        C73616Suq c73616Suq2 = new C73616Suq(c73616Suq);
        C73320Sq4.LIZ(runnable, "run is null");
        RunnableC73954T0s runnableC73954T0s = new RunnableC73954T0s(new RunnableC73951T0p(this, c73616Suq2, runnable), this.LJLJJLL);
        this.LJLJJLL.LIZ(runnableC73954T0s);
        Executor executor = this.LJLILLLLZI;
        if (executor instanceof ScheduledExecutorService) {
            try {
                runnableC73954T0s.setFuture(((ScheduledExecutorService) executor).schedule((Callable) runnableC73954T0s, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.LJLJJI = true;
                C73548Stk.LIZIZ(e);
                return EnumC73538Sta.INSTANCE;
            }
        } else {
            runnableC73954T0s.setFuture(new FutureC73952T0q(C73950T0o.LIZLLL.LIZJ(runnableC73954T0s, j, timeUnit)));
        }
        c73616Suq.replace(runnableC73954T0s);
        return c73616Suq2;
    }
}

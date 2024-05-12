package X;

import Y.IDRunnableS85S0100000;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: X.0GU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GU<T> {
    public static Executor LJI = Executors.newCachedThreadPool();
    public C0GS LIZ;
    public final java.util.Set<InterfaceC04760Gq<T>> LIZIZ;
    public final java.util.Set<InterfaceC04760Gq<Throwable>> LIZJ;
    public final Handler LIZLLL;
    public final FutureTask<C0GQ<T>> LJ;
    public volatile C0GQ<T> LJFF;

    public C0GU() {
        throw null;
    }

    public final synchronized void LJFF(Object obj) {
        LJ(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread, X.0GS] */
    public final synchronized void LJIIIZ() {
        C0GS c0gs = this.LIZ;
        if ((c0gs == null || !c0gs.isAlive()) && this.LJFF == null) {
            ?? r0 = new Thread() { // from class: X.0GS
                public boolean LJLIL;

                public final void LIZ() {
                    while (!isInterrupted() && !this.LJLIL) {
                        if (C0GU.this.LJ.isDone()) {
                            try {
                                C0GU c0gu = C0GU.this;
                                c0gu.LJIIIIZZ((C0GQ) c0gu.LJ.get());
                            } catch (InterruptedException | ExecutionException e) {
                                C0GU.this.LJIIIIZZ(new C0GQ(e));
                            }
                            this.LJLIL = true;
                            C0GU.this.LJIIJ();
                        }
                    }
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                {
                    super("LottieTaskObserver");
                }
            };
            this.LIZ = r0;
            r0.start();
        }
    }

    public final synchronized void LJIIJ() {
        C0GS c0gs = this.LIZ;
        if (c0gs != null && c0gs.isAlive()) {
            if (this.LIZIZ.isEmpty() || this.LJFF != null) {
                interrupt();
                this.LIZ = null;
            }
        }
    }

    public C0GU(final Callable<C0GQ<T>> callable) {
        boolean z;
        this.LIZIZ = new LinkedHashSet(1);
        this.LIZJ = new LinkedHashSet(1);
        this.LIZLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJFF = null;
        if (C03970Dp.LIZ) {
            if (C03970Dp.LJIIIZ) {
                try {
                    LJI.execute(new FutureTask<C0GQ<T>>(callable) { // from class: X.0GT
                        @Override // java.util.concurrent.FutureTask
                        public final void done() {
                            if (isCancelled()) {
                                return;
                            }
                            try {
                                C0GU.this.LJIIIIZZ(get());
                            } catch (InterruptedException | ExecutionException e) {
                                C0GU.this.LJIIIIZZ(new C0GQ<>(e));
                            }
                        }
                    });
                } finally {
                    if (!z) {
                    }
                }
            } else {
                LJI.execute(new FutureTask<C0GQ<T>>(callable) { // from class: X.0GT
                    @Override // java.util.concurrent.FutureTask
                    public final void done() {
                        if (isCancelled()) {
                            return;
                        }
                        try {
                            C0GU.this.LJIIIIZZ(get());
                        } catch (InterruptedException | ExecutionException e) {
                            C0GU.this.LJIIIIZZ(new C0GQ<>(e));
                        }
                    }
                });
            }
        } else {
            FutureTask<C0GQ<T>> futureTask = new FutureTask<>(callable);
            this.LJ = futureTask;
            LJI.execute(futureTask);
            LJIIIZ();
        }
    }

    public final synchronized void LIZ(InterfaceC04760Gq interfaceC04760Gq) {
        if (this.LJFF != null && this.LJFF.LIZIZ != null) {
            interfaceC04760Gq.onResult(this.LJFF.LIZIZ);
        }
        this.LIZJ.add(interfaceC04760Gq);
        if (!C03970Dp.LIZ && this.LJ != null) {
            LJIIIZ();
        }
    }

    public final synchronized void LIZIZ(InterfaceC04760Gq interfaceC04760Gq) {
        if (this.LJFF != null && this.LJFF.LIZ != null) {
            interfaceC04760Gq.onResult(this.LJFF.LIZ);
        }
        this.LIZIZ.add(interfaceC04760Gq);
        if (!C03970Dp.LIZ && this.LJ != null) {
            LJIIIZ();
        }
    }

    public final synchronized void LIZJ(T t) {
        Iterator it = new ArrayList(this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC04760Gq) it.next()).onResult(t);
        }
    }

    public final synchronized void LJI(InterfaceC04760Gq interfaceC04760Gq) {
        this.LIZJ.remove(interfaceC04760Gq);
        if (!C03970Dp.LIZ && this.LJ != null) {
            LJIIJ();
        }
    }

    public final synchronized void LJII(InterfaceC04760Gq interfaceC04760Gq) {
        this.LIZIZ.remove(interfaceC04760Gq);
        if (!C03970Dp.LIZ && this.LJ != null) {
            LJIIJ();
        }
    }

    public final void LJIIIIZZ(C0GQ<T> c0gq) {
        if (this.LJFF == null) {
            this.LJFF = c0gq;
            this.LIZLLL.post(new IDRunnableS85S0100000(this, 38));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public static void LIZLLL(C0GU c0gu, Throwable th) {
        try {
            synchronized (c0gu) {
                ArrayList arrayList = new ArrayList(c0gu.LIZJ);
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC04760Gq) it.next()).onResult(th);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJ(C0GU c0gu, Object obj) {
        synchronized (c0gu) {
            c0gu.LIZJ(obj);
        }
    }
}

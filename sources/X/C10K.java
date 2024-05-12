package X;

import Y.IDRunnableS1S0400000;
import Y.IDRunnableS2S0300000;
import Y.IDRunnableS85S0100000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import v5.n;

/* renamed from: X.10K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10K<TResult> {
    public static final ExecutorService LJI = C38995FSd.LIZJ();
    public static final C10E LJII = C10F.LIZJ.LIZIZ;
    public static final C10C LJIIIIZZ = C10D.LIZIZ.LIZ;
    public static final C10K<?> LJIIIZ = new C10K<>((Object) null);
    public static final C10K<Boolean> LJIIJ = new C10K<>(Boolean.TRUE);
    public static final C10K<Boolean> LJIIJJI = new C10K<>(Boolean.FALSE);
    public static final C10K<?> LJIIL = new C10K<>(0);
    public final Object LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public TResult LIZLLL;
    public Exception LJ;
    public List<C10I<TResult, Void>> LJFF;

    public final Exception LJIIJ() {
        Exception exc;
        synchronized (this.LIZ) {
            exc = this.LJ;
        }
        return exc;
    }

    public final TResult LJIIJJI() {
        TResult tresult;
        synchronized (this.LIZ) {
            tresult = this.LIZLLL;
        }
        return tresult;
    }

    public final boolean LJIIL() {
        boolean z;
        synchronized (this.LIZ) {
            z = this.LIZJ;
        }
        return z;
    }

    public final boolean LJIILIIL() {
        boolean z;
        synchronized (this.LIZ) {
            z = this.LIZIZ;
        }
        return z;
    }

    public final boolean LJIILJJIL() {
        boolean z;
        synchronized (this.LIZ) {
            if (LJIIJ() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void LJIIZILJ() {
        synchronized (this.LIZ) {
            Iterator<C10I<TResult, Void>> it = this.LJFF.iterator();
            while (it.hasNext()) {
                try {
                    it.next().then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.LJFF = null;
        }
    }

    public final void LJIJI() {
        synchronized (this.LIZ) {
            if (!LJIILIIL()) {
                this.LIZ.wait();
            }
        }
    }

    public C10K() {
        this.LIZ = new Object();
        this.LJFF = new ArrayList();
    }

    public C10K(int i) {
        Object obj = new Object();
        this.LIZ = obj;
        this.LJFF = new ArrayList();
        synchronized (obj) {
            if (!this.LIZIZ) {
                this.LIZIZ = true;
                this.LIZJ = true;
                obj.notifyAll();
                LJIIZILJ();
            }
        }
    }

    public static <TResult> C10K<TResult> LIZ(Callable<TResult> callable) {
        return LIZIZ(callable, LJII, null);
    }

    public static <TResult> C10K<TResult> LIZJ(Callable<TResult> callable) {
        return LIZIZ(callable, LJI, null);
    }

    public static C10K<Void> LJII(long j) {
        ScheduledExecutorService LJ = C38995FSd.LJ();
        if (j <= 0) {
            return LJIIIZ(null);
        }
        n nVar = new n();
        LJ.schedule(new IDRunnableS85S0100000(nVar, 112), j, TimeUnit.MILLISECONDS);
        return nVar.LIZ;
    }

    public static <TResult> C10K<TResult> LJIIIIZZ(Exception exc) {
        n nVar = new n();
        nVar.LIZIZ(exc);
        return nVar.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> C10K<TResult> LJIIIZ(TResult tresult) {
        if (tresult == 0) {
            return (C10K<TResult>) LJIIIZ;
        }
        if (tresult instanceof Boolean) {
            if (((Boolean) tresult).booleanValue()) {
                return (C10K<TResult>) LJIIJ;
            }
            return (C10K<TResult>) LJIIJJI;
        }
        n nVar = new n();
        nVar.LIZJ(tresult);
        return nVar.LIZ;
    }

    public static C10K<Void> LJIJJ(Collection<? extends C10K<?>> collection) {
        if (collection.size() == 0) {
            return LJIIIZ(null);
        }
        final n nVar = new n();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C10K<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(new C10I<Object, Void>() { // from class: X.1cA
                @Override // X.C10I
                public final Void then(C10K<Object> c10k) {
                    if (c10k.LJIILJJIL()) {
                        synchronized (obj) {
                            arrayList.add(c10k.LJIIJ());
                        }
                    }
                    if (c10k.LJIIL()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                nVar.LIZIZ((Exception) ListProtector.get(arrayList, 0));
                            } else {
                                nVar.LIZIZ(new C10B(C16880lQ.LLLZ("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList.size())}), arrayList));
                            }
                        } else if (atomicBoolean.get()) {
                            nVar.LIZ();
                        } else {
                            nVar.LIZJ(null);
                        }
                    }
                    return null;
                }
            });
        }
        return nVar.LIZ;
    }

    public static <TResult> C10K<List<TResult>> LJIJJLI(final Collection<? extends C10K<TResult>> collection) {
        return (C10K<List<TResult>>) LJIJJ(collection).LJIILL(new C10I<Void, List<TResult>>() { // from class: X.1c9
            @Override // X.C10I
            public final Object then(C10K<Void> c10k) {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C10K) it.next()).LJIIJJI());
                }
                return arrayList;
            }
        });
    }

    public final <TContinuationResult> C10K<TContinuationResult> LIZLLL(C10I<TResult, TContinuationResult> c10i) {
        return LJ(c10i, LJII, null);
    }

    public final <TContinuationResult> C10K<TContinuationResult> LJFF(C10I<TResult, C10K<TContinuationResult>> c10i) {
        return LJI(c10i, LJII, null);
    }

    public final <TContinuationResult> C10K<TContinuationResult> LJIILL(C10I<TResult, TContinuationResult> c10i) {
        return LJIILLIIL(c10i, LJII);
    }

    public final boolean LJIJ(TResult tresult) {
        synchronized (this.LIZ) {
            if (this.LIZIZ) {
                return false;
            }
            this.LIZIZ = true;
            this.LIZLLL = tresult;
            this.LIZ.notifyAll();
            LJIIZILJ();
            return true;
        }
    }

    public C10K(TResult tresult) {
        this.LIZ = new Object();
        this.LJFF = new ArrayList();
        LJIJ(tresult);
    }

    public final C10K LJIILLIIL(final C10I c10i, Executor executor) {
        return LJI(new C10I<Object, C10K<Object>>() { // from class: X.1cB
            public final /* synthetic */ C36581c6 LIZ = null;

            @Override // X.C10I
            public final C10K<Object> then(C10K<Object> c10k) {
                C36581c6 c36581c6 = this.LIZ;
                if (c36581c6 != null && c36581c6.LIZIZ()) {
                    return C10K.LJIIL;
                }
                if (c10k.LJIILJJIL()) {
                    return C10K.LJIIIIZZ(c10k.LJIIJ());
                }
                if (c10k.LJIIL()) {
                    return C10K.LJIIL;
                }
                return c10k.LIZLLL(C10I.this);
            }
        }, executor, null);
    }

    public static <TResult> C10K<TResult> LIZIZ(Callable<TResult> callable, Executor executor, C36581c6 c36581c6) {
        n nVar = new n();
        try {
            executor.execute(new IDRunnableS2S0300000(c36581c6, nVar, callable, 13));
        } catch (Exception e) {
            nVar.LIZIZ(new C10J(e));
        }
        return nVar.LIZ;
    }

    public final <TContinuationResult> C10K<TContinuationResult> LJ(final C10I<TResult, TContinuationResult> c10i, final Executor executor, final C36581c6 c36581c6) {
        boolean LJIILIIL;
        final n nVar = new n();
        synchronized (this.LIZ) {
            LJIILIIL = LJIILIIL();
            if (!LJIILIIL) {
                ((ArrayList) this.LJFF).add(new C10I<TResult, Void>() { // from class: X.1c7
                    @Override // X.C10I
                    public final Void then(C10K c10k) {
                        n nVar2 = nVar;
                        C10I c10i2 = c10i;
                        try {
                            executor.execute(new IDRunnableS1S0400000(c36581c6, nVar2, c10i2, c10k, 3));
                            return null;
                        } catch (Exception e) {
                            nVar2.LIZIZ(new C10J(e));
                            return null;
                        }
                    }
                });
            }
        }
        if (LJIILIIL) {
            try {
                executor.execute(new IDRunnableS1S0400000(c36581c6, nVar, c10i, this, 3));
            } catch (Exception e) {
                nVar.LIZIZ(new C10J(e));
            }
        }
        return nVar.LIZ;
    }

    public final <TContinuationResult> C10K<TContinuationResult> LJI(final C10I<TResult, C10K<TContinuationResult>> c10i, final Executor executor, final C36581c6 c36581c6) {
        boolean LJIILIIL;
        final n nVar = new n();
        synchronized (this.LIZ) {
            LJIILIIL = LJIILIIL();
            if (!LJIILIIL) {
                ((ArrayList) this.LJFF).add(new C10I<TResult, Void>() { // from class: X.1c8
                    @Override // X.C10I
                    public final Void then(C10K c10k) {
                        n nVar2 = nVar;
                        C10I c10i2 = c10i;
                        try {
                            executor.execute(new IDRunnableS1S0400000(c36581c6, nVar2, c10i2, c10k, 4));
                            return null;
                        } catch (Exception e) {
                            nVar2.LIZIZ(new C10J(e));
                            return null;
                        }
                    }
                });
            }
        }
        if (LJIILIIL) {
            try {
                executor.execute(new IDRunnableS1S0400000(c36581c6, nVar, c10i, this, 4));
            } catch (Exception e) {
                nVar.LIZIZ(new C10J(e));
            }
        }
        return nVar.LIZ;
    }
}

package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sx9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73759Sx9<T> extends AbstractC73754Sx4<T> {
    public static final long serialVersionUID = 2427151001689639875L;
    public final C73912Szc<T> LJLJI;
    public Throwable LJLJJI;
    public volatile boolean LJLJJL;
    public final AtomicInteger LJLJJLL;

    @Override // X.AbstractC73754Sx4, X.InterfaceC215138cP
    public final void onComplete() {
        this.LJLJJL = true;
        LJ();
    }

    @Override // X.AbstractC73754Sx4
    public final void LIZLLL() {
        if (this.LJLJJLL.getAndIncrement() == 0) {
            this.LJLJI.clear();
        }
    }

    public final void LJ() {
        boolean z;
        if (this.LJLJJLL.getAndIncrement() != 0) {
            return;
        }
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
        C73912Szc<T> c73912Szc = this.LJLJI;
        int i = 1;
        do {
            long j = get();
            long j2 = 0;
            while (true) {
                if (j2 != j) {
                    if (isCancelled()) {
                        c73912Szc.clear();
                        return;
                    }
                    boolean z2 = this.LJLJJL;
                    T poll = c73912Szc.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2) {
                        if (z) {
                            Throwable th = this.LJLJJI;
                            if (th != null) {
                                LIZIZ(th);
                                return;
                            } else {
                                LIZ();
                                return;
                            }
                        }
                    } else if (z) {
                        break;
                    }
                    interfaceC73740Swq.onNext(poll);
                    j2++;
                } else {
                    if (isCancelled()) {
                        c73912Szc.clear();
                        return;
                    }
                    boolean z3 = this.LJLJJL;
                    boolean isEmpty = c73912Szc.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.LJLJJI;
                        if (th2 != null) {
                            LIZIZ(th2);
                            return;
                        } else {
                            LIZ();
                            return;
                        }
                    }
                }
            }
            if (j2 != 0) {
                V2B.LJIILJJIL(this, j2);
            }
            i = this.LJLJJLL.addAndGet(-i);
        } while (i != 0);
    }

    @Override // X.AbstractC73754Sx4
    public final void LIZJ() {
        LJ();
    }

    @Override // X.AbstractC73754Sx4, X.InterfaceC215138cP
    public final void onNext(T t) {
        if (this.LJLJJL || isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.LJLJI.offer(t);
            LJ();
        }
    }

    @Override // X.AbstractC73754Sx4
    public final boolean tryOnError(Throwable th) {
        if (this.LJLJJL || isCancelled()) {
            return false;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.LJLJJI = th;
        this.LJLJJL = true;
        LJ();
        return true;
    }

    public C73759Sx9(InterfaceC73740Swq<? super T> interfaceC73740Swq, int i) {
        super(interfaceC73740Swq);
        this.LJLJI = new C73912Szc<>(i);
        this.LJLJJLL = new AtomicInteger();
    }
}

package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73760SxA<T> extends AbstractC73754Sx4<T> {
    public static final long serialVersionUID = 4023437720691792495L;
    public final AtomicReference<T> LJLJI;
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
            this.LJLJI.lazySet(null);
        }
    }

    public final void LJ() {
        boolean z;
        if (this.LJLJJLL.getAndIncrement() != 0) {
            return;
        }
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
        AtomicReference<T> atomicReference = this.LJLJI;
        int i = 1;
        do {
            long j = get();
            long j2 = 0;
            while (true) {
                boolean z2 = false;
                if (j2 != j) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.LJLJJL;
                    T andSet = atomicReference.getAndSet(null);
                    if (andSet == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z3) {
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
                    interfaceC73740Swq.onNext(andSet);
                    j2++;
                } else {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z4 = this.LJLJJL;
                    if (atomicReference.get() == null) {
                        z2 = true;
                    }
                    if (z4 && z2) {
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

    public C73760SxA(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        super(interfaceC73740Swq);
        this.LJLJI = new AtomicReference<>();
        this.LJLJJLL = new AtomicInteger();
    }

    @Override // X.AbstractC73754Sx4, X.InterfaceC215138cP
    public final void onNext(T t) {
        if (this.LJLJJL || isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.LJLJI.set(t);
            LJ();
        }
    }

    @Override // X.AbstractC73754Sx4
    public final boolean tryOnError(Throwable th) {
        if (this.LJLJJL || isCancelled()) {
            return false;
        }
        if (th == null) {
            onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
        this.LJLJJI = th;
        this.LJLJJL = true;
        LJ();
        return true;
    }
}

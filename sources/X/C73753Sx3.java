package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sx3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73753Sx3<T> extends AtomicInteger implements InterfaceC73812Sy0<T>, InterfaceC73651SvP {
    public static final long serialVersionUID = 163080509307634843L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public InterfaceC73651SvP LJLILLLLZI;
    public volatile boolean LJLJI;
    public Throwable LJLJJI;
    public volatile boolean LJLJJL;
    public final AtomicLong LJLJJLL = new AtomicLong();
    public final AtomicReference<T> LJLJL = new AtomicReference<>();

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLJI = true;
        LIZJ();
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            this.LJLILLLLZI.cancel();
            if (getAndIncrement() == 0) {
                this.LJLJL.lazySet(null);
            }
        }
    }

    public final void LIZJ() {
        boolean z;
        boolean z2;
        if (getAndIncrement() != 0) {
            return;
        }
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
        AtomicLong atomicLong = this.LJLJJLL;
        AtomicReference<T> atomicReference = this.LJLJL;
        int i = 1;
        do {
            long j = 0;
            while (true) {
                z = false;
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z3 = this.LJLJI;
                T andSet = atomicReference.getAndSet(null);
                if (andSet == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (LIZIZ(z3, z2, interfaceC73740Swq, atomicReference)) {
                    return;
                }
                if (z2) {
                    break;
                }
                interfaceC73740Swq.onNext(andSet);
                j++;
            }
            if (j == atomicLong.get()) {
                boolean z4 = this.LJLJI;
                if (atomicReference.get() == null) {
                    z = true;
                }
                if (LIZIZ(z4, z, interfaceC73740Swq, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                V2B.LJIILJJIL(atomicLong, j);
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    public C73753Sx3(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        this.LJLJJI = th;
        this.LJLJI = true;
        LIZJ();
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        this.LJLJL.lazySet(t);
        LIZJ();
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLILLLLZI, interfaceC73651SvP)) {
            this.LJLILLLLZI = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this.LJLJJLL, j);
            LIZJ();
        }
    }

    public final boolean LIZIZ(boolean z, boolean z2, InterfaceC73740Swq<?> interfaceC73740Swq, AtomicReference<T> atomicReference) {
        if (this.LJLJJL) {
            atomicReference.lazySet(null);
            return true;
        }
        if (z) {
            Throwable th = this.LJLJJI;
            if (th != null) {
                atomicReference.lazySet(null);
                interfaceC73740Swq.onError(th);
                return true;
            }
            if (z2) {
                interfaceC73740Swq.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }
}

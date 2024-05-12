package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Syf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73853Syf<T> extends AtomicInteger implements InterfaceC73812Sy0, InterfaceC73651SvP, InterfaceC92693kP {
    public final AtomicReference<InterfaceC73651SvP> LJLIL = new AtomicReference<>();
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI = new AtomicReference<>();
    public final C73861Syn LJLJI = new C73861Syn();
    public final AtomicReference<InterfaceC73651SvP> LJLJJI = new AtomicReference<>();
    public final AtomicLong LJLJJL = new AtomicLong();
    public final InterfaceC73445Ss5 LJLJJLL;
    public final InterfaceC73740Swq<? super T> LJLJL;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        EnumC73857Syj.LIZJ(this.LJLILLLLZI);
        EnumC73858Syk.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLIL.get() == EnumC73858Syk.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (!isDisposed()) {
            this.LJLIL.lazySet(EnumC73858Syk.LJLIL);
            EnumC73857Syj.LIZJ(this.LJLILLLLZI);
            InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLJL;
            C73861Syn c73861Syn = this.LJLJI;
            if (getAndIncrement() == 0) {
                Throwable LIZIZ = c73861Syn.LIZIZ();
                if (LIZIZ != null) {
                    interfaceC73740Swq.onError(LIZIZ);
                } else {
                    interfaceC73740Swq.onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        cancel();
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.LJLIL.lazySet(EnumC73858Syk.LJLIL);
            EnumC73857Syj.LIZJ(this.LJLILLLLZI);
            InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLJL;
            C73861Syn c73861Syn = this.LJLJI;
            if (c73861Syn.LIZ(th)) {
                if (getAndIncrement() == 0) {
                    interfaceC73740Swq.onError(c73861Syn.LIZIZ());
                    return;
                }
                return;
            }
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (!isDisposed()) {
            InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLJL;
            C73861Syn c73861Syn = this.LJLJI;
            if (get() == 0 && compareAndSet(0, 1)) {
                interfaceC73740Swq.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable LIZIZ = c73861Syn.LIZIZ();
                    if (LIZIZ != null) {
                        interfaceC73740Swq.onError(LIZIZ);
                    } else {
                        interfaceC73740Swq.onComplete();
                    }
                    this.LJLIL.lazySet(EnumC73858Syk.LJLIL);
                    EnumC73857Syj.LIZJ(this.LJLILLLLZI);
                }
            }
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        C73856Syi c73856Syi = new C73856Syi(this);
        if (C78996UzQ.LJJJI(this.LJLILLLLZI, c73856Syi, C73853Syf.class)) {
            this.LJLJL.onSubscribe(this);
            this.LJLJJLL.LIZ(c73856Syi);
            AtomicReference<InterfaceC73651SvP> atomicReference = this.LJLIL;
            if (interfaceC73651SvP == null) {
                throw new NullPointerException("next is null");
            }
            while (!atomicReference.compareAndSet(null, interfaceC73651SvP)) {
                if (atomicReference.get() != null) {
                    interfaceC73651SvP.cancel();
                    if (atomicReference.get() == EnumC73858Syk.LJLIL) {
                        return;
                    }
                    C78996UzQ.LJJIJLIJ(C73853Syf.class);
                    return;
                }
            }
            AtomicReference<InterfaceC73651SvP> atomicReference2 = this.LJLJJI;
            AtomicLong atomicLong = this.LJLJJL;
            while (!atomicReference2.compareAndSet(null, interfaceC73651SvP)) {
                if (atomicReference2.get() != null) {
                    interfaceC73651SvP.cancel();
                    if (atomicReference2.get() == EnumC73858Syk.LJLIL) {
                        return;
                    }
                    C73548Stk.LIZIZ(new IllegalStateException("Subscription already set!"));
                    return;
                }
            }
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC73651SvP.request(andSet);
            }
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        long j2;
        long j3;
        AtomicReference<InterfaceC73651SvP> atomicReference = this.LJLJJI;
        AtomicLong atomicLong = this.LJLJJL;
        InterfaceC73651SvP interfaceC73651SvP = atomicReference.get();
        if (interfaceC73651SvP != null) {
            interfaceC73651SvP.request(j);
            return;
        }
        if (j <= 0) {
            C73548Stk.LIZIZ(new IllegalArgumentException(C61845OOz.LIZ("n > 0 required but it was ", j)));
            return;
        }
        do {
            j2 = atomicLong.get();
            j3 = Long.MAX_VALUE;
            if (j2 == Long.MAX_VALUE) {
                break;
            }
            long j4 = j2 + j;
            if (j4 >= 0) {
                j3 = j4;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        InterfaceC73651SvP interfaceC73651SvP2 = atomicReference.get();
        if (interfaceC73651SvP2 == null) {
            return;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return;
        }
        interfaceC73651SvP2.request(andSet);
    }

    public C73853Syf(InterfaceC73445Ss5 interfaceC73445Ss5, InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLJJLL = interfaceC73445Ss5;
        this.LJLJL = interfaceC73740Swq;
    }
}

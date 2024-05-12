package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sxf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73791Sxf<T> extends AbstractC73797Sxl<T> {
    public final C73912Szc<T> LJLILLLLZI;
    public final AtomicReference<Runnable> LJLJI;
    public final boolean LJLJJI;
    public volatile boolean LJLJJL;
    public Throwable LJLJJLL;
    public final AtomicReference<InterfaceC73740Swq<? super T>> LJLJL;
    public volatile boolean LJLJLJ;
    public final AtomicBoolean LJLJLLL;
    public final C73792Sxg LJLL;
    public final AtomicLong LJLLI;
    public boolean LJLLILLLL;

    public final void LJIILLIIL() {
        boolean z;
        if (this.LJLL.getAndIncrement() != 0) {
            return;
        }
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLJL.get();
        int i = 1;
        int i2 = 1;
        while (interfaceC73740Swq == null) {
            i2 = this.LJLL.addAndGet(-i2);
            if (i2 == 0) {
                return;
            } else {
                interfaceC73740Swq = this.LJLJL.get();
            }
        }
        if (this.LJLLILLLL) {
            C73912Szc<T> c73912Szc = this.LJLILLLLZI;
            boolean z2 = !this.LJLJJI;
            while (!this.LJLJLJ) {
                boolean z3 = this.LJLJJL;
                if (z2 && z3 && this.LJLJJLL != null) {
                    c73912Szc.clear();
                    this.LJLJL.lazySet(null);
                    interfaceC73740Swq.onError(this.LJLJJLL);
                    return;
                }
                interfaceC73740Swq.onNext(null);
                if (z3) {
                    this.LJLJL.lazySet(null);
                    Throwable th = this.LJLJJLL;
                    if (th != null) {
                        interfaceC73740Swq.onError(th);
                        return;
                    } else {
                        interfaceC73740Swq.onComplete();
                        return;
                    }
                }
                i = this.LJLL.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            c73912Szc.clear();
            this.LJLJL.lazySet(null);
            return;
        }
        C73912Szc<T> c73912Szc2 = this.LJLILLLLZI;
        boolean z4 = !this.LJLJJI;
        int i3 = 1;
        do {
            long j = this.LJLLI.get();
            long j2 = 0;
            while (true) {
                if (j != j2) {
                    boolean z5 = this.LJLJJL;
                    T poll = c73912Szc2.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LJIILL(z4, z5, z, interfaceC73740Swq, c73912Szc2)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    interfaceC73740Swq.onNext(poll);
                    j2++;
                } else if (LJIILL(z4, this.LJLJJL, c73912Szc2.isEmpty(), interfaceC73740Swq, c73912Szc2)) {
                    return;
                }
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.LJLLI.addAndGet(-j2);
            }
            i3 = this.LJLL.addAndGet(-i3);
        } while (i3 != 0);
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJJL || this.LJLJLJ) {
            return;
        }
        this.LJLJJL = true;
        Runnable andSet = this.LJLJI.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        LJIILLIIL();
    }

    public C73791Sxf() {
        C73320Sq4.LIZIZ(8, "capacityHint");
        this.LJLILLLLZI = new C73912Szc<>(8);
        this.LJLJI = new AtomicReference<>(null);
        this.LJLJJI = true;
        this.LJLJL = new AtomicReference<>();
        this.LJLJLLL = new AtomicBoolean();
        this.LJLL = new C73792Sxg(this);
        this.LJLLI = new AtomicLong();
    }

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        if (!this.LJLJLLL.get() && this.LJLJLLL.compareAndSet(false, true)) {
            interfaceC73740Swq.onSubscribe(this.LJLL);
            this.LJLJL.set(interfaceC73740Swq);
            if (this.LJLJLJ) {
                this.LJLJL.lazySet(null);
                return;
            } else {
                LJIILLIIL();
                return;
            }
        }
        EnumC73747Swx.error(new IllegalStateException("This processor allows only a single Subscriber"), interfaceC73740Swq);
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        C73320Sq4.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LJLJJL || this.LJLJLJ) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJJLL = th;
        this.LJLJJL = true;
        Runnable andSet = this.LJLJI.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        LJIILLIIL();
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        C73320Sq4.LIZ(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LJLJJL || this.LJLJLJ) {
            return;
        }
        this.LJLILLLLZI.offer(t);
        LJIILLIIL();
    }

    @Override // X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (this.LJLJJL || this.LJLJLJ) {
            interfaceC73651SvP.cancel();
        } else {
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }

    public final boolean LJIILL(boolean z, boolean z2, boolean z3, InterfaceC73740Swq<? super T> interfaceC73740Swq, C73912Szc<T> c73912Szc) {
        if (this.LJLJLJ) {
            c73912Szc.clear();
            this.LJLJL.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.LJLJJLL != null) {
                c73912Szc.clear();
                this.LJLJL.lazySet(null);
                interfaceC73740Swq.onError(this.LJLJJLL);
                return true;
            }
            if (z3) {
                Throwable th = this.LJLJJLL;
                this.LJLJL.lazySet(null);
                if (th != null) {
                    interfaceC73740Swq.onError(th);
                } else {
                    interfaceC73740Swq.onComplete();
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SxC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73762SxC<T> extends AtomicLong implements InterfaceC73812Sy0<T>, InterfaceC73651SvP {
    public static final long serialVersionUID = -3176480756392482682L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public InterfaceC73651SvP LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        this.LJLILLLLZI.cancel();
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        this.LJLIL.onComplete();
    }

    public C73762SxC(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJI) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJI = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJI) {
            return;
        }
        if (get() != 0) {
            this.LJLIL.onNext(t);
            V2B.LJIILJJIL(this, 1L);
        } else {
            onError(new C73799Sxn("could not emit value due to lack of requests"));
        }
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
            V2B.LIZ(this, j);
        }
    }
}

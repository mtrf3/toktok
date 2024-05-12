package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SxB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73761SxB<T> extends AtomicLong implements InterfaceC73812Sy0<T>, InterfaceC73651SvP {
    public static final long serialVersionUID = -6246093802440953054L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final InterfaceC64592gB<? super T> LJLILLLLZI;
    public InterfaceC73651SvP LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        this.LJLJI.cancel();
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJI = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (get() != 0) {
            this.LJLIL.onNext(t);
            V2B.LJIILJJIL(this, 1L);
            return;
        }
        try {
            this.LJLILLLLZI.accept(t);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            cancel();
            onError(th);
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLJI, interfaceC73651SvP)) {
            this.LJLJI = interfaceC73651SvP;
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

    public C73761SxB(InterfaceC73740Swq interfaceC73740Swq, C73735Swl c73735Swl) {
        this.LJLIL = interfaceC73740Swq;
        this.LJLILLLLZI = c73735Swl;
    }
}

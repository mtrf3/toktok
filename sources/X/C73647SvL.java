package X;

import java.util.NoSuchElementException;

/* renamed from: X.SvL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73647SvL<T> implements InterfaceC73812Sy0<T>, InterfaceC92693kP {
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final T LJLILLLLZI;
    public InterfaceC73651SvP LJLJI;
    public boolean LJLJJI;
    public T LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.cancel();
        this.LJLJI = EnumC73755Sx5.CANCELLED;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLJI == EnumC73755Sx5.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLJI = EnumC73755Sx5.CANCELLED;
        T t = this.LJLJJL;
        this.LJLJJL = null;
        if (t != null || (t = this.LJLILLLLZI) != null) {
            this.LJLIL.onSuccess(t);
        } else {
            this.LJLIL.onError(new NoSuchElementException());
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJJI = true;
        this.LJLJI = EnumC73755Sx5.CANCELLED;
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (this.LJLJJL != null) {
            this.LJLJJI = true;
            this.LJLJI.cancel();
            this.LJLJI = EnumC73755Sx5.CANCELLED;
            this.LJLIL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LJLJJL = t;
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLJI, interfaceC73651SvP)) {
            this.LJLJI = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }

    public C73647SvL(InterfaceC73463SsN<? super T> interfaceC73463SsN, T t) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = t;
    }
}

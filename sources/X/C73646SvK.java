package X;

/* renamed from: X.SvK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73646SvK<T> implements InterfaceC73812Sy0<T>, InterfaceC92693kP {
    public final InterfaceC73509St7<? super T> LJLIL;
    public InterfaceC73651SvP LJLILLLLZI;
    public boolean LJLJI;
    public T LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.cancel();
        this.LJLILLLLZI = EnumC73755Sx5.CANCELLED;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLILLLLZI == EnumC73755Sx5.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        this.LJLILLLLZI = EnumC73755Sx5.CANCELLED;
        T t = this.LJLJJI;
        this.LJLJJI = null;
        if (t == null) {
            this.LJLIL.onComplete();
        } else {
            this.LJLIL.onSuccess(t);
        }
    }

    public C73646SvK(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLIL = interfaceC73509St7;
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJI = true;
        this.LJLILLLLZI = EnumC73755Sx5.CANCELLED;
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJI) {
            return;
        }
        if (this.LJLJJI != null) {
            this.LJLJI = true;
            this.LJLILLLLZI.cancel();
            this.LJLILLLLZI = EnumC73755Sx5.CANCELLED;
            this.LJLIL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LJLJJI = t;
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLILLLLZI, interfaceC73651SvP)) {
            this.LJLILLLLZI = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }
}

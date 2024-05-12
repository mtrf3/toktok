package X;

import java.util.NoSuchElementException;

/* renamed from: X.Swg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73730Swg<T> extends C73733Swj<T> implements InterfaceC73812Sy0<T> {
    public static final long serialVersionUID = -5526049321428043809L;
    public final T LJLJI;
    public final boolean LJLJJI;
    public InterfaceC73651SvP LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        T t = this.LJLILLLLZI;
        this.LJLILLLLZI = null;
        if (t == null && (t = this.LJLJI) == null) {
            if (this.LJLJJI) {
                this.LJLIL.onError(new NoSuchElementException());
                return;
            } else {
                this.LJLIL.onComplete();
                return;
            }
        }
        complete(t);
    }

    @Override // X.C73733Swj, X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void cancel() {
        super.cancel();
        this.LJLJJL.cancel();
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJJLL) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJLL = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJJLL) {
            return;
        }
        if (this.LJLILLLLZI != null) {
            this.LJLJJLL = true;
            this.LJLJJL.cancel();
            this.LJLIL.onError(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.LJLILLLLZI = t;
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLJJL, interfaceC73651SvP)) {
            this.LJLJJL = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }

    public C73730Swg(InterfaceC73740Swq<? super T> interfaceC73740Swq, T t, boolean z) {
        super(interfaceC73740Swq);
        this.LJLJI = t;
        this.LJLJJI = z;
    }
}

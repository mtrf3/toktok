package X;

/* renamed from: X.SyU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73842SyU<T> extends AbstractC73797Sxl<T> {
    public final AbstractC73797Sxl<T> LJLILLLLZI;
    public boolean LJLJI;
    public C73846SyY<Object> LJLJJI;
    public volatile boolean LJLJJL;

    public final void LJIILL() {
        C73846SyY<Object> c73846SyY;
        while (true) {
            synchronized (this) {
                c73846SyY = this.LJLJJI;
                if (c73846SyY == null) {
                    this.LJLJI = false;
                    return;
                }
                this.LJLJJI = null;
            }
            c73846SyY.LIZ(this.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJJL) {
            return;
        }
        synchronized (this) {
            if (this.LJLJJL) {
                return;
            }
            this.LJLJJL = true;
            if (this.LJLJI) {
                C73846SyY<Object> c73846SyY = this.LJLJJI;
                if (c73846SyY == null) {
                    c73846SyY = new C73846SyY<>();
                    this.LJLJJI = c73846SyY;
                }
                c73846SyY.LIZIZ(EnumC73845SyX.complete());
                return;
            }
            this.LJLJI = true;
            this.LJLILLLLZI.onComplete();
        }
    }

    public C73842SyU(C73791Sxf c73791Sxf) {
        this.LJLILLLLZI = c73791Sxf;
    }

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLILLLLZI.subscribe(interfaceC73740Swq);
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJJL) {
            C73548Stk.LIZIZ(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.LJLJJL) {
                this.LJLJJL = true;
                if (this.LJLJI) {
                    C73846SyY<Object> c73846SyY = this.LJLJJI;
                    if (c73846SyY == null) {
                        c73846SyY = new C73846SyY<>();
                        this.LJLJJI = c73846SyY;
                    }
                    c73846SyY.LIZ[0] = EnumC73845SyX.error(th);
                    return;
                }
                this.LJLJI = true;
                z = false;
            }
            if (z) {
                C73548Stk.LIZIZ(th);
            } else {
                this.LJLILLLLZI.onError(th);
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJJL) {
            return;
        }
        synchronized (this) {
            if (this.LJLJJL) {
                return;
            }
            if (this.LJLJI) {
                C73846SyY<Object> c73846SyY = this.LJLJJI;
                if (c73846SyY == null) {
                    c73846SyY = new C73846SyY<>();
                    this.LJLJJI = c73846SyY;
                }
                EnumC73845SyX.next(t);
                c73846SyY.LIZIZ(t);
                return;
            }
            this.LJLJI = true;
            this.LJLILLLLZI.onNext(t);
            LJIILL();
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        boolean z = true;
        if (!this.LJLJJL) {
            synchronized (this) {
                if (!this.LJLJJL) {
                    if (this.LJLJI) {
                        C73846SyY<Object> c73846SyY = this.LJLJJI;
                        if (c73846SyY == null) {
                            c73846SyY = new C73846SyY<>();
                            this.LJLJJI = c73846SyY;
                        }
                        c73846SyY.LIZIZ(EnumC73845SyX.subscription(interfaceC73651SvP));
                        return;
                    }
                    this.LJLJI = true;
                    z = false;
                }
                if (!z) {
                    this.LJLILLLLZI.onSubscribe(interfaceC73651SvP);
                    LJIILL();
                    return;
                }
            }
        }
        interfaceC73651SvP.cancel();
    }
}

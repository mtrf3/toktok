package X;

/* renamed from: X.SyV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73843SyV<T> implements InterfaceC73812Sy0<T>, InterfaceC73651SvP {
    public final InterfaceC73740Swq<? super T> LJLIL;
    public InterfaceC73651SvP LJLILLLLZI;
    public boolean LJLJI;
    public C73846SyY<Object> LJLJJI;
    public volatile boolean LJLJJL;

    public final void LIZIZ() {
        C73846SyY<Object> c73846SyY;
        do {
            synchronized (this) {
                c73846SyY = this.LJLJJI;
                if (c73846SyY == null) {
                    this.LJLJI = false;
                    return;
                }
                this.LJLJJI = null;
            }
        } while (!c73846SyY.LIZ(this.LJLIL));
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        this.LJLILLLLZI.cancel();
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
            if (this.LJLJI) {
                C73846SyY<Object> c73846SyY = this.LJLJJI;
                if (c73846SyY == null) {
                    c73846SyY = new C73846SyY<>();
                    this.LJLJJI = c73846SyY;
                }
                c73846SyY.LIZIZ(EnumC73845SyX.complete());
                return;
            }
            this.LJLJJL = true;
            this.LJLJI = true;
            this.LJLIL.onComplete();
        }
    }

    public C73843SyV(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
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
                if (this.LJLJI) {
                    this.LJLJJL = true;
                    C73846SyY<Object> c73846SyY = this.LJLJJI;
                    if (c73846SyY == null) {
                        c73846SyY = new C73846SyY<>();
                        this.LJLJJI = c73846SyY;
                    }
                    c73846SyY.LIZ[0] = EnumC73845SyX.error(th);
                    return;
                }
                this.LJLJJL = true;
                this.LJLJI = true;
                z = false;
            }
            if (z) {
                C73548Stk.LIZIZ(th);
            } else {
                this.LJLIL.onError(th);
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJJL) {
            return;
        }
        if (t == null) {
            this.LJLILLLLZI.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
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
            this.LJLIL.onNext(t);
            LIZIZ();
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLILLLLZI, interfaceC73651SvP)) {
            this.LJLILLLLZI = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        this.LJLILLLLZI.request(j);
    }
}

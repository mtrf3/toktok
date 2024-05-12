package X;

/* renamed from: X.SyZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73847SyZ<T> extends AbstractC73851Syd<T> implements InterfaceC73852Sye<Object> {
    public final AbstractC73851Syd<T> LJLIL;
    public boolean LJLILLLLZI;
    public C73846SyY<Object> LJLJI;
    public volatile boolean LJLJJI;

    public final void LJJZZI() {
        C73846SyY<Object> c73846SyY;
        while (true) {
            synchronized (this) {
                c73846SyY = this.LJLJI;
                if (c73846SyY == null) {
                    this.LJLILLLLZI = false;
                    return;
                }
                this.LJLJI = null;
            }
            c73846SyY.LIZJ(this);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        synchronized (this) {
            if (this.LJLJJI) {
                return;
            }
            this.LJLJJI = true;
            if (this.LJLILLLLZI) {
                C73846SyY<Object> c73846SyY = this.LJLJI;
                if (c73846SyY == null) {
                    c73846SyY = new C73846SyY<>();
                    this.LJLJI = c73846SyY;
                }
                c73846SyY.LIZIZ(EnumC73845SyX.complete());
                return;
            }
            this.LJLILLLLZI = true;
            this.LJLIL.onComplete();
        }
    }

    public C73847SyZ(AbstractC73851Syd<T> abstractC73851Syd) {
        this.LJLIL = abstractC73851Syd;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL.LIZ(interfaceC116954iR);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                if (this.LJLILLLLZI) {
                    C73846SyY<Object> c73846SyY = this.LJLJI;
                    if (c73846SyY == null) {
                        c73846SyY = new C73846SyY<>();
                        this.LJLJI = c73846SyY;
                    }
                    c73846SyY.LIZ[0] = EnumC73845SyX.error(th);
                    return;
                }
                this.LJLILLLLZI = true;
                z = false;
            }
            if (z) {
                C73548Stk.LIZIZ(th);
            } else {
                this.LJLIL.onError(th);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        synchronized (this) {
            if (this.LJLJJI) {
                return;
            }
            if (this.LJLILLLLZI) {
                C73846SyY<Object> c73846SyY = this.LJLJI;
                if (c73846SyY == null) {
                    c73846SyY = new C73846SyY<>();
                    this.LJLJI = c73846SyY;
                }
                EnumC73845SyX.next(t);
                c73846SyY.LIZIZ(t);
                return;
            }
            this.LJLILLLLZI = true;
            this.LJLIL.onNext(t);
            LJJZZI();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        boolean z = true;
        if (!this.LJLJJI) {
            synchronized (this) {
                if (!this.LJLJJI) {
                    if (this.LJLILLLLZI) {
                        C73846SyY<Object> c73846SyY = this.LJLJI;
                        if (c73846SyY == null) {
                            c73846SyY = new C73846SyY<>();
                            this.LJLJI = c73846SyY;
                        }
                        c73846SyY.LIZIZ(EnumC73845SyX.disposable(interfaceC92693kP));
                        return;
                    }
                    this.LJLILLLLZI = true;
                    z = false;
                }
                if (!z) {
                    this.LJLIL.onSubscribe(interfaceC92693kP);
                    LJJZZI();
                    return;
                }
            }
        }
        interfaceC92693kP.dispose();
    }

    @Override // X.InterfaceC73852Sye, X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        return EnumC73845SyX.acceptFull(obj, this.LJLIL);
    }
}

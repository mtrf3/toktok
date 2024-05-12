package X;

/* renamed from: X.SyW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73844SyW<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public final InterfaceC116954iR<? super T> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;
    public boolean LJLJI;
    public C73846SyY<Object> LJLJJI;
    public volatile boolean LJLJJL;

    public final void LIZ() {
        Object[] objArr;
        while (true) {
            synchronized (this) {
                C73846SyY<Object> c73846SyY = this.LJLJJI;
                if (c73846SyY == null) {
                    this.LJLJI = false;
                    return;
                }
                this.LJLJJI = null;
                InterfaceC116954iR<? super T> interfaceC116954iR = this.LJLIL;
                for (Object[] objArr2 = c73846SyY.LIZ; objArr2 != null; objArr2 = objArr2[4]) {
                    for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                        if (EnumC73845SyX.acceptFull(objArr, interfaceC116954iR)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC116954iR
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

    public C73844SyW(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC116954iR
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

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJL) {
            return;
        }
        if (t == null) {
            this.LJLILLLLZI.dispose();
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
            LIZ();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }
}

package X;

/* renamed from: X.Sxr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73803Sxr<T> extends AbstractRunnableC73801Sxp<T> {
    public static final long serialVersionUID = 644624475404284533L;
    public final InterfaceC73813Sy1<? super T> LJLLL;
    public long LJLLLL;

    @Override // X.AbstractRunnableC73801Sxp
    public final void LIZLLL() {
        int i = 1;
        while (!this.LJLJLJ) {
            boolean z = this.LJLJLLL;
            this.LJLLL.onNext(null);
            if (z) {
                this.LJLJLJ = true;
                Throwable th = this.LJLL;
                if (th != null) {
                    this.LJLLL.onError(th);
                } else {
                    this.LJLLL.onComplete();
                }
                this.LJLIL.dispose();
                return;
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }

    @Override // X.AbstractRunnableC73801Sxp
    public final void LIZJ() {
        boolean z;
        InterfaceC73813Sy1<? super T> interfaceC73813Sy1 = this.LJLLL;
        InterfaceC73570Su6<T> interfaceC73570Su6 = this.LJLJL;
        long j = this.LJLLILLLL;
        long j2 = this.LJLLLL;
        int i = 1;
        while (true) {
            long j3 = this.LJLJJL.get();
            while (true) {
                if (j != j3) {
                    boolean z2 = this.LJLJLLL;
                    try {
                        T poll = interfaceC73570Su6.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LIZIZ(z2, z, interfaceC73813Sy1)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        if (interfaceC73813Sy1.LIZ(poll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.LJLJJI) {
                            this.LJLJJLL.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        V0N.LJJIL(th);
                        this.LJLJLJ = true;
                        this.LJLJJLL.cancel();
                        interfaceC73570Su6.clear();
                        interfaceC73813Sy1.onError(th);
                        this.LJLIL.dispose();
                        return;
                    }
                } else if (LIZIZ(this.LJLJLLL, interfaceC73570Su6.isEmpty(), interfaceC73813Sy1)) {
                    return;
                }
            }
            int i2 = get();
            if (i == i2) {
                this.LJLLILLLL = j;
                this.LJLLLL = j2;
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                i = i2;
            }
        }
    }

    @Override // X.AbstractRunnableC73801Sxp
    public final void LJ() {
        InterfaceC73813Sy1<? super T> interfaceC73813Sy1 = this.LJLLL;
        InterfaceC73570Su6<T> interfaceC73570Su6 = this.LJLJL;
        long j = this.LJLLILLLL;
        int i = 1;
        while (true) {
            long j2 = this.LJLJJL.get();
            while (j != j2) {
                try {
                    T poll = interfaceC73570Su6.poll();
                    if (this.LJLJLJ) {
                        return;
                    }
                    if (poll == null) {
                        this.LJLJLJ = true;
                        interfaceC73813Sy1.onComplete();
                        this.LJLIL.dispose();
                        return;
                    } else if (interfaceC73813Sy1.LIZ(poll)) {
                        j++;
                    }
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    this.LJLJLJ = true;
                    this.LJLJJLL.cancel();
                    interfaceC73813Sy1.onError(th);
                    this.LJLIL.dispose();
                    return;
                }
            }
            if (this.LJLJLJ) {
                return;
            }
            if (interfaceC73570Su6.isEmpty()) {
                this.LJLJLJ = true;
                interfaceC73813Sy1.onComplete();
                this.LJLIL.dispose();
                return;
            } else {
                int i2 = get();
                if (i == i2) {
                    this.LJLLILLLL = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final T poll() {
        T poll = this.LJLJL.poll();
        if (poll != null && this.LJLLI != 1) {
            long j = this.LJLLLL + 1;
            if (j == this.LJLJJI) {
                this.LJLLLL = 0L;
                this.LJLJJLL.request(j);
            } else {
                this.LJLLLL = j;
            }
        }
        return poll;
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLJJLL, interfaceC73651SvP)) {
            this.LJLJJLL = interfaceC73651SvP;
            if (interfaceC73651SvP instanceof InterfaceC73632Sv6) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC73651SvP;
                int requestFusion = interfaceC73571Su7.requestFusion(7);
                if (requestFusion == 1) {
                    this.LJLLI = 1;
                    this.LJLJL = interfaceC73571Su7;
                    this.LJLJLLL = true;
                    this.LJLLL.onSubscribe(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.LJLLI = 2;
                    this.LJLJL = interfaceC73571Su7;
                    this.LJLLL.onSubscribe(this);
                    interfaceC73651SvP.request(this.LJLJI);
                    return;
                }
            }
            this.LJLJL = new C73913Szd(this.LJLJI);
            this.LJLLL.onSubscribe(this);
            interfaceC73651SvP.request(this.LJLJI);
        }
    }

    public C73803Sxr(InterfaceC73813Sy1<? super T> interfaceC73813Sy1, AbstractC73945T0j abstractC73945T0j, boolean z, int i) {
        super(abstractC73945T0j, z, i);
        this.LJLLL = interfaceC73813Sy1;
    }
}

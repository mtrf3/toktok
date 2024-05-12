package X;

/* renamed from: X.Sxq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73802Sxq<T> extends AbstractRunnableC73801Sxp<T> {
    public static final long serialVersionUID = -4547113800637756442L;
    public final InterfaceC73740Swq<? super T> LJLLL;

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
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLLL;
        InterfaceC73570Su6<T> interfaceC73570Su6 = this.LJLJL;
        long j = this.LJLLILLLL;
        int i = 1;
        while (true) {
            long j2 = this.LJLJJL.get();
            while (true) {
                if (j != j2) {
                    boolean z2 = this.LJLJLLL;
                    try {
                        T poll = interfaceC73570Su6.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LIZIZ(z2, z, interfaceC73740Swq)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        interfaceC73740Swq.onNext(poll);
                        j++;
                        if (j == this.LJLJJI) {
                            if (j2 != Long.MAX_VALUE) {
                                j2 = this.LJLJJL.addAndGet(-j);
                            }
                            this.LJLJJLL.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        V0N.LJJIL(th);
                        this.LJLJLJ = true;
                        this.LJLJJLL.cancel();
                        interfaceC73570Su6.clear();
                        interfaceC73740Swq.onError(th);
                        this.LJLIL.dispose();
                        return;
                    }
                } else if (LIZIZ(this.LJLJLLL, interfaceC73570Su6.isEmpty(), interfaceC73740Swq)) {
                    return;
                }
            }
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

    @Override // X.AbstractRunnableC73801Sxp
    public final void LJ() {
        InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLLL;
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
                        interfaceC73740Swq.onComplete();
                        this.LJLIL.dispose();
                        return;
                    }
                    interfaceC73740Swq.onNext(poll);
                    j++;
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    this.LJLJLJ = true;
                    this.LJLJJLL.cancel();
                    interfaceC73740Swq.onError(th);
                    this.LJLIL.dispose();
                    return;
                }
            }
            if (this.LJLJLJ) {
                return;
            }
            if (interfaceC73570Su6.isEmpty()) {
                this.LJLJLJ = true;
                interfaceC73740Swq.onComplete();
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
            long j = this.LJLLILLLL + 1;
            if (j == this.LJLJJI) {
                this.LJLLILLLL = 0L;
                this.LJLJJLL.request(j);
            } else {
                this.LJLLILLLL = j;
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

    public C73802Sxq(InterfaceC73740Swq<? super T> interfaceC73740Swq, AbstractC73945T0j abstractC73945T0j, boolean z, int i) {
        super(abstractC73945T0j, z, i);
        this.LJLLL = interfaceC73740Swq;
    }
}

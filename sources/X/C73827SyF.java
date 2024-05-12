package X;

/* renamed from: X.SyF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73827SyF<T> extends AbstractC73828SyG<T, T> {
    public final InterfaceC64592gB<? super T> LJLJJLL;
    public final InterfaceC64592gB<? super Throwable> LJLJL;
    public final InterfaceC29937Boz LJLJLJ;
    public final InterfaceC29937Boz LJLJLLL;

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        try {
            T poll = this.LJLJI.poll();
            if (poll != null) {
                try {
                    this.LJLJJLL.accept(poll);
                } catch (Throwable th) {
                    try {
                        V0N.LJJIL(th);
                        try {
                            this.LJLJL.accept(th);
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th2) {
                            throw new C63756P0m(th, th2);
                        }
                    } finally {
                        this.LJLJLLL.run();
                    }
                }
            } else if (this.LJLJJL == 1) {
                this.LJLJLJ.run();
            }
            return poll;
        } catch (Throwable th3) {
            V0N.LJJIL(th3);
            try {
                this.LJLJL.accept(th3);
                if (th3 instanceof Exception) {
                    throw th3;
                }
                throw th3;
            } catch (Throwable th4) {
                throw new C63756P0m(th3, th4);
            }
        }
    }

    @Override // X.AbstractC73828SyG, X.InterfaceC73740Swq
    public final void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        try {
            this.LJLJLJ.run();
            this.LJLJJI = true;
            this.LJLIL.onComplete();
            try {
                this.LJLJLLL.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        } catch (Throwable th2) {
            LIZIZ(th2);
        }
    }

    @Override // X.InterfaceC73813Sy1
    public final boolean LIZ(T t) {
        if (this.LJLJJI) {
            return false;
        }
        try {
            this.LJLJJLL.accept(t);
            return this.LJLIL.LIZ(t);
        } catch (Throwable th) {
            LIZIZ(th);
            return false;
        }
    }

    @Override // X.AbstractC73828SyG, X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJJI = true;
        try {
            this.LJLJL.accept(th);
            this.LJLIL.onError(th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
        try {
            this.LJLJLLL.run();
        } catch (Throwable th3) {
            V0N.LJJIL(th3);
            C73548Stk.LIZIZ(th3);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (this.LJLJJL != 0) {
            this.LJLIL.onNext(null);
            return;
        }
        try {
            this.LJLJJLL.accept(t);
            this.LJLIL.onNext(t);
        } catch (Throwable th) {
            LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZJ(i);
    }

    public C73827SyF(InterfaceC73813Sy1<? super T> interfaceC73813Sy1, InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz, InterfaceC29937Boz interfaceC29937Boz2) {
        super(interfaceC73813Sy1);
        this.LJLJJLL = interfaceC64592gB;
        this.LJLJL = interfaceC64592gB2;
        this.LJLJLJ = interfaceC29937Boz;
        this.LJLJLLL = interfaceC29937Boz2;
    }
}

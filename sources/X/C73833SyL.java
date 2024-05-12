package X;

/* renamed from: X.SyL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73833SyL<T> extends AbstractC73831SyJ<T, T> implements InterfaceC73813Sy1<T> {
    public final InterfaceC73592SuS<? super T> LJLJJLL;

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        InterfaceC73632Sv6<T> interfaceC73632Sv6 = this.LJLJI;
        InterfaceC73592SuS<? super T> interfaceC73592SuS = this.LJLJJLL;
        while (true) {
            T poll = interfaceC73632Sv6.poll();
            if (poll == null) {
                return null;
            }
            if (interfaceC73592SuS.test(poll)) {
                return poll;
            }
            if (this.LJLJJL == 2) {
                interfaceC73632Sv6.request(1L);
            }
        }
    }

    @Override // X.InterfaceC73813Sy1
    public final boolean LIZ(T t) {
        if (this.LJLJJI) {
            return false;
        }
        if (this.LJLJJL != 0) {
            this.LJLIL.onNext(null);
            return true;
        }
        try {
            boolean test = this.LJLJJLL.test(t);
            if (test) {
                this.LJLIL.onNext(t);
            }
            return test;
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLILLLLZI.cancel();
            onError(th);
            return true;
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (!LIZ(t)) {
            this.LJLILLLLZI.request(1L);
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73833SyL(InterfaceC73740Swq<? super T> interfaceC73740Swq, InterfaceC73592SuS<? super T> interfaceC73592SuS) {
        super(interfaceC73740Swq);
        this.LJLJJLL = interfaceC73592SuS;
    }
}

package X;

/* renamed from: X.SyI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73830SyI<T> extends AbstractC73828SyG<T, T> {
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
            return this.LJLIL.LIZ(null);
        }
        try {
            if (!this.LJLJJLL.test(t) || !this.LJLIL.LIZ(t)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            LIZIZ(th);
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
        return LIZJ(i);
    }

    public C73830SyI(InterfaceC73813Sy1<? super T> interfaceC73813Sy1, InterfaceC73592SuS<? super T> interfaceC73592SuS) {
        super(interfaceC73813Sy1);
        this.LJLJJLL = interfaceC73592SuS;
    }
}

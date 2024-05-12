package X;

/* renamed from: X.SyS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73840SyS<T> extends AbstractC73836SyO<T, T> {
    public final InterfaceC73592SuS<? super T> LJLJJLL;

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        T poll;
        do {
            poll = this.LJLJI.poll();
            if (poll == null) {
                break;
            }
        } while (!this.LJLJJLL.test(poll));
        return poll;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJL == 0) {
            try {
                if (this.LJLJJLL.test(t)) {
                    this.LJLIL.onNext(t);
                    return;
                }
                return;
            } catch (Throwable th) {
                LIZ(th);
                return;
            }
        }
        this.LJLIL.onNext(null);
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73840SyS(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC73592SuS<? super T> interfaceC73592SuS) {
        super(interfaceC116954iR);
        this.LJLJJLL = interfaceC73592SuS;
    }
}

package X;

/* renamed from: X.SyR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73839SyR<T> extends AbstractC73836SyO<T, T> {
    public final InterfaceC64592gB<? super T> LJLJJLL;

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        T poll = this.LJLJI.poll();
        if (poll != null) {
            this.LJLJJLL.accept(poll);
        }
        return poll;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
        if (this.LJLJJL == 0) {
            try {
                this.LJLJJLL.accept(t);
            } catch (Throwable th) {
                LIZ(th);
            }
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73839SyR(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC64592gB<? super T> interfaceC64592gB) {
        super(interfaceC116954iR);
        this.LJLJJLL = interfaceC64592gB;
    }
}

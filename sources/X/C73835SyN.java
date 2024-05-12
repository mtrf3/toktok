package X;

/* renamed from: X.SyN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73835SyN<T, U> extends AbstractC73836SyO<T, U> {
    public final InterfaceC48038ItG<? super T, ? extends U> LJLJJLL;

    @Override // X.InterfaceC73570Su6
    public final U poll() {
        T poll = this.LJLJI.poll();
        if (poll != null) {
            U apply = this.LJLJJLL.apply(poll);
            C73320Sq4.LIZ(apply, "The mapper function returned a null value.");
            return apply;
        }
        return null;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJJI) {
            return;
        }
        if (this.LJLJJL != 0) {
            this.LJLIL.onNext(null);
            return;
        }
        try {
            U apply = this.LJLJJLL.apply(t);
            C73320Sq4.LIZ(apply, "The mapper function returned a null value.");
            this.LJLIL.onNext(apply);
        } catch (Throwable th) {
            LIZ(th);
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73835SyN(InterfaceC116954iR<? super U> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends U> interfaceC48038ItG) {
        super(interfaceC116954iR);
        this.LJLJJLL = interfaceC48038ItG;
    }
}

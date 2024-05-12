package X;

/* renamed from: X.SyM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73834SyM<T, U> extends AbstractC73831SyJ<T, U> {
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
            U apply = this.LJLJJLL.apply(t);
            C73320Sq4.LIZ(apply, "The mapper function returned a null value.");
            this.LJLIL.onNext(apply);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLILLLLZI.cancel();
            onError(th);
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZIZ(i);
    }

    public C73834SyM(InterfaceC73740Swq<? super U> interfaceC73740Swq, InterfaceC48038ItG<? super T, ? extends U> interfaceC48038ItG) {
        super(interfaceC73740Swq);
        this.LJLJJLL = interfaceC48038ItG;
    }
}

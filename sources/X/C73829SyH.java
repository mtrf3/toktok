package X;

/* renamed from: X.SyH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73829SyH<T, U> extends AbstractC73828SyG<T, U> {
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

    @Override // X.InterfaceC73813Sy1
    public final boolean LIZ(T t) {
        if (this.LJLJJI) {
            return false;
        }
        try {
            U apply = this.LJLJJLL.apply(t);
            C73320Sq4.LIZ(apply, "The mapper function returned a null value.");
            return this.LJLIL.LIZ(apply);
        } catch (Throwable th) {
            LIZIZ(th);
            return true;
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
            U apply = this.LJLJJLL.apply(t);
            C73320Sq4.LIZ(apply, "The mapper function returned a null value.");
            this.LJLIL.onNext(apply);
        } catch (Throwable th) {
            LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        return LIZJ(i);
    }

    public C73829SyH(InterfaceC73813Sy1<? super U> interfaceC73813Sy1, InterfaceC48038ItG<? super T, ? extends U> interfaceC48038ItG) {
        super(interfaceC73813Sy1);
        this.LJLJJLL = interfaceC48038ItG;
    }
}

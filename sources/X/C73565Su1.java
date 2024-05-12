package X;

/* renamed from: X.Su1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73565Su1<T> extends AbstractC73672Svk<T> implements I97<T> {
    public final T LJLIL;

    @Override // X.I97, java.util.concurrent.Callable
    public final T call() {
        return this.LJLIL;
    }

    public C73565Su1(T t) {
        this.LJLIL = t;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        RunnableC73564Su0 runnableC73564Su0 = new RunnableC73564Su0(interfaceC116954iR, this.LJLIL);
        interfaceC116954iR.onSubscribe(runnableC73564Su0);
        runnableC73564Su0.run();
    }
}

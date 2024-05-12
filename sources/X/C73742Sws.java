package X;

/* renamed from: X.Sws, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73742Sws<T> extends AbstractC73745Swv<T> implements I97<T> {
    public final T LJLILLLLZI;

    @Override // X.I97, java.util.concurrent.Callable
    public final T call() {
        return this.LJLILLLLZI;
    }

    public C73742Sws(T t) {
        this.LJLILLLLZI = t;
    }

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        interfaceC73740Swq.onSubscribe(new C73741Swr(interfaceC73740Swq, this.LJLILLLLZI));
    }
}

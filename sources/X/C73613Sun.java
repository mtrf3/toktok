package X;

/* renamed from: X.Sun, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73613Sun<T> extends AbstractC73638SvC<T> {
    public final InterfaceC73471SsV<? extends T> LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        RunnableC73612Sum runnableC73612Sum = new RunnableC73612Sum(interfaceC73463SsN, this.LJLIL);
        interfaceC73463SsN.onSubscribe(runnableC73612Sum);
        runnableC73612Sum.LJLILLLLZI.replace(this.LJLILLLLZI.LIZIZ(runnableC73612Sum));
    }

    public C73613Sun(InterfaceC73471SsV<? extends T> interfaceC73471SsV, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73471SsV;
        this.LJLILLLLZI = abstractC73946T0k;
    }
}

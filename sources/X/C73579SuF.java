package X;

/* renamed from: X.SuF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73579SuF<T> extends AbstractC73638SvC<T> {
    public final InterfaceC66992k3<T> LJLIL;

    public C73579SuF(InterfaceC66992k3<T> interfaceC66992k3) {
        this.LJLIL = interfaceC66992k3;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        C73578SuE c73578SuE = new C73578SuE(interfaceC73463SsN);
        interfaceC73463SsN.onSubscribe(c73578SuE);
        try {
            this.LJLIL.subscribe(c73578SuE);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            c73578SuE.onError(th);
        }
    }
}

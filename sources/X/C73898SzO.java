package X;

/* renamed from: X.SzO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73898SzO<T, R> extends AbstractC73638SvC<R> {
    public final InterfaceC73471SsV<? extends T>[] LJLIL;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLILLLLZI;

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super R> interfaceC73463SsN) {
        InterfaceC73471SsV<? extends T>[] interfaceC73471SsVArr = this.LJLIL;
        int length = interfaceC73471SsVArr.length;
        if (length == 1) {
            interfaceC73471SsVArr[0].LIZ(new C73633Sv7(interfaceC73463SsN, new C73899SzP(this)));
            return;
        }
        C73896SzM c73896SzM = new C73896SzM(interfaceC73463SsN, length, this.LJLILLLLZI);
        interfaceC73463SsN.onSubscribe(c73896SzM);
        for (int i = 0; i < length && !c73896SzM.isDisposed(); i++) {
            InterfaceC73471SsV<? extends T> interfaceC73471SsV = interfaceC73471SsVArr[i];
            if (interfaceC73471SsV == null) {
                c73896SzM.LIZ(i, new NullPointerException("One of the sources is null"));
                return;
            }
            interfaceC73471SsV.LIZ(c73896SzM.LJLJI[i]);
        }
    }

    public C73898SzO(C73337SqL c73337SqL, InterfaceC73471SsV[] interfaceC73471SsVArr) {
        this.LJLIL = interfaceC73471SsVArr;
        this.LJLILLLLZI = c73337SqL;
    }
}

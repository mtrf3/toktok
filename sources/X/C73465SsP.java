package X;

/* renamed from: X.SsP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73465SsP<T> extends AbstractC73638SvC<T> {
    public final T LJLIL;

    public C73465SsP(T t) {
        this.LJLIL = t;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        interfaceC73463SsN.onSubscribe(EnumC73538Sta.INSTANCE);
        interfaceC73463SsN.onSuccess(this.LJLIL);
    }
}

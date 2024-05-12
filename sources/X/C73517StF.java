package X;

/* renamed from: X.StF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73517StF<T> extends AbstractC73635Sv9<T> {
    public final InterfaceC73518StG<T> LJLIL;

    public C73517StF(InterfaceC73518StG<T> interfaceC73518StG) {
        this.LJLIL = interfaceC73518StG;
    }

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        C73516StE c73516StE = new C73516StE(interfaceC73509St7);
        interfaceC73509St7.onSubscribe(c73516StE);
        try {
            this.LJLIL.LIZ(c73516StE);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            c73516StE.onError(th);
        }
    }
}

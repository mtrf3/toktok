package X;

/* renamed from: X.aHK, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92846aHK extends AbstractC60815Ntr {
    public final C92844aHI LJLILLLLZI;
    public final C92845aHJ LJLJI;

    public C92846aHK(C92110a5S c92110a5S) {
        this.LJLILLLLZI = new C92844aHI(c92110a5S);
        this.LJLJI = new C92845aHJ(c92110a5S);
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        C60607NqV c60607NqV;
        if ((interfaceC60710NsA instanceof C60607NqV) && (c60607NqV = (C60607NqV) interfaceC60710NsA) != null) {
            c60607NqV.LIZIZ = this.LJLJI;
            c60607NqV.LIZJ = this.LJLILLLLZI;
        }
    }
}

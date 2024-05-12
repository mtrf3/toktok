package X;

/* renamed from: X.Ngt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60011Ngt extends AbstractC60815Ntr {
    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (!(interfaceC60710NsA instanceof C60607NqV)) {
            return;
        }
        C60607NqV c60607NqV = (C60607NqV) interfaceC60710NsA;
        InterfaceC60012Ngu interfaceC60012Ngu = c60607NqV.LJIIJ;
        if (interfaceC60012Ngu != null) {
            c60607NqV.LJIIJ = new C60010Ngs(interfaceC60012Ngu);
        } else {
            c60607NqV.LJIIJ = new C60009Ngr();
        }
    }
}

package X;

/* renamed from: X.3PQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C3PQ LJLIL = new C3PQ();

    public C3PQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        InterfaceC63292Osi LIZIZ;
        C83483Pk c83483Pk;
        C83593Pv c83593Pv;
        C63308Osy LJI = C63308Osy.LJI();
        boolean z = false;
        if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null && LIZIZ.LIZ() != null) {
            C3PK c3pk = C3PK.LJI;
            C3PI c3pi = c3pk.LIZIZ.get(c3pk.LIZJ.invoke());
            if (c3pi != null && (((c83483Pk = c3pi.LIZJ) != null && c83483Pk.LJIILJJIL) || ((c83593Pv = c3pi.LIZLLL) != null && c83593Pv.LJIIJJI))) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

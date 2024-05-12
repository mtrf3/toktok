package X;

/* renamed from: X.XKm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84660XKm extends XLA {
    public final XKS<?> LJLJJL;

    public C84660XKm(XKS<?> xks) {
        this.LJLJJL = xks;
    }

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        XKS<?> xks = this.LJLJJL;
        Throwable LJIIJ = xks.LJIIJ(LJJIII());
        if (!xks.LJIILL() || !((XKT) xks.LJLJJI).LJIIJ(LJIIJ)) {
            xks.LJJIJIL(LJIIJ);
            if (!xks.LJIILL()) {
                xks.LJIIIIZZ();
            }
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }
}

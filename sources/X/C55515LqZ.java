package X;

/* renamed from: X.LqZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55515LqZ extends AbstractC50421Jqb<MIP, C51031K1b<MIP>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return i + 10000;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55515LqZ(AbstractC51036K1g abstractC51036K1g, M89 m89) {
        this.mModel = abstractC51036K1g instanceof MIP ? abstractC51036K1g : new MIP(m89.getPreviousPage(), m89.getVideoType());
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.mPresenter.LJIILL(Integer.valueOf(i), m89.getStickerId(), Integer.valueOf(m89.getVideoType()));
    }
}

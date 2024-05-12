package X;

/* renamed from: X.Lqb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55517Lqb extends AbstractC50421Jqb<C56554MHm, C51031K1b<C56554MHm>> {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return i + 20000;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
    public C55517Lqb(AbstractC51036K1g abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C56554MHm ? abstractC51036K1g : new C56554MHm();
        this.mPresenter = new C51031K1b();
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        this.mPresenter.LJIILL(Integer.valueOf(i), m89.getLibraryMaterialId(), Integer.valueOf(m89.getVideoType()), Boolean.valueOf(z), m89.getIds(), Boolean.FALSE);
    }
}

package X;

/* loaded from: classes10.dex */
public final class LX5 extends AbstractC50421Jqb<C54883LgN, C54395LWl> implements InterfaceC50391Jq7 {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 1;
    }

    public LX5(AbstractC51036K1g abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C54883LgN ? abstractC51036K1g : new C54883LgN();
        this.mPresenter = new C54395LWl();
    }

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJL = interfaceC51032K1c;
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJLL = true;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        if (i == 1) {
            this.mPresenter.LJIILL(1, LX6.LIZIZ(1, 0, 0, C2US.LIZJ("feed").LJ()).LIZ());
            return;
        }
        if (i == 4) {
            PRESENTER presenter = this.mPresenter;
            LX6 LIZIZ = LX6.LIZIZ(4, 2, 0, C2US.LIZJ("feed").LJ());
            LIZIZ.LJ = C2US.LIZJ("feed").LIZLLL();
            presenter.LJIILL(4, LIZIZ.LIZ());
            return;
        }
        PRESENTER presenter2 = this.mPresenter;
        LX6 LIZIZ2 = LX6.LIZIZ(i, 2, 0, C2US.LIZJ("feed").LJ());
        LIZIZ2.LJ = C2US.LIZJ("feed").LIZLLL();
        presenter2.LJIILL(Integer.valueOf(i), LIZIZ2.LIZ());
    }
}

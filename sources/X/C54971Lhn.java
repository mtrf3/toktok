package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Lhn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54971Lhn extends AbstractC50421Jqb<C55017LiX, C54980Lhw> implements InterfaceC50391Jq7 {
    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 2;
    }

    public C54971Lhn(AbstractC51036K1g abstractC51036K1g) {
        this.mModel = abstractC51036K1g instanceof C55017LiX ? abstractC51036K1g : new C55017LiX();
    }

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        ((C54980Lhw) this.mPresenter).LJLJJLL = interfaceC51032K1c;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean init(Fragment fragment) {
        this.mPresenter = new C54980Lhw(fragment);
        return true;
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        ((C54980Lhw) this.mPresenter).LJLJLJ = true;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 m89, int i2, boolean z) {
        PRESENTER presenter = this.mPresenter;
        int i3 = 3;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = 2;
        if (i != 2) {
            if (i != 4) {
                i3 = 1;
            } else {
                i3 = 2;
            }
        }
        objArr[2] = Integer.valueOf(i3);
        presenter.LJIILL(objArr);
    }
}

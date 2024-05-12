package X;

import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LmT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55261LmT implements InterfaceC54978Lhu {
    public final /* synthetic */ DetailPageComponent LJLIL;
    public final /* synthetic */ InterfaceC51679KPz LJLILLLLZI;

    public C55261LmT(DetailPageComponent detailPageComponent, InterfaceC51679KPz interfaceC51679KPz) {
        this.LJLIL = detailPageComponent;
        this.LJLILLLLZI = interfaceC51679KPz;
    }

    @Override // X.InterfaceC54978Lhu
    public final void LJ() {
        this.LJLIL.getActivity();
        if (C2NU.LIZ.LIZIZ()) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJLILLLLZI;
            M89 m89 = this.LJLIL.LJZ;
            interfaceC51679KPz.request(2, m89, m89.getVideoType(), this.LJLIL.LJZI);
            return;
        }
        C5S1 c5s1 = new C5S1(this.LJLIL.getActivity());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
        IRefreshAbility iRefreshAbility = this.LJLIL.LLIIJI;
        if (iRefreshAbility != null) {
            iRefreshAbility.setRefreshing(false);
        }
    }
}

package X;

import com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xi5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85565Xi5 implements InterfaceC85563Xi3 {
    public final /* synthetic */ ViewPagerLoginView LIZ;

    @Override // X.InterfaceC85563Xi3
    public final void LIZ() {
        C85575XiF c85575XiF;
        C85575XiF c85575XiF2;
        FMX.onEventV3("signup_channel_unfold");
        C85539Xhf LIZ = this.LIZ.LIZ();
        C40517FvF LJJ = C78842Uww.LJJ(0, this.LIZ.LIZLLL.size() - this.LIZ.LJIIJ());
        ViewPagerLoginView viewPagerLoginView = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJ, 10));
        C118234kV it = LJJ.iterator();
        while (it.LJLJI) {
            arrayList.add(Integer.valueOf(viewPagerLoginView.LJIIJ() + it.nextInt()));
        }
        LIZ.LJLJJLL.clear();
        LIZ.LJLJJLL.addAll(arrayList);
        List LLJILJILJ = ORZ.LLJILJILJ(this.LIZ.LIZLLL);
        InterfaceC85586XiQ interfaceC85586XiQ = this.LIZ.LIZ;
        if ((interfaceC85586XiQ instanceof C85575XiF) && (c85575XiF2 = (C85575XiF) interfaceC85586XiQ) != null) {
            c85575XiF2.LJII.put(Integer.valueOf(c85575XiF2.LJI.getCurrentItem()), Boolean.TRUE);
        }
        InterfaceC85586XiQ interfaceC85586XiQ2 = this.LIZ.LIZ;
        if ((interfaceC85586XiQ2 instanceof C85575XiF) && (c85575XiF = (C85575XiF) interfaceC85586XiQ2) != null) {
            c85575XiF.LJIILL();
        }
        C85539Xhf LIZ2 = this.LIZ.LIZ();
        LIZ2.LJLIL.clear();
        LIZ2.LJLIL.addAll(LLJILJILJ);
        LIZ2.LJLILLLLZI = LIZ2.LJLIL.size();
        LIZ2.notifyDataSetChanged();
    }

    public C85565Xi5(ViewPagerLoginView viewPagerLoginView) {
        this.LIZ = viewPagerLoginView;
    }
}

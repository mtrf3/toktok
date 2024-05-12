package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanelController;

/* loaded from: classes10.dex */
public final class LO8 implements InterfaceC54159LNj {
    public final /* synthetic */ XTabPanelController LIZ;

    public LO8(XTabPanelController xTabPanelController) {
        this.LIZ = xTabPanelController;
    }

    @Override // X.InterfaceC54159LNj
    public final void LIZ(int i, Fragment fragment) {
        XTabPanelController xTabPanelController = this.LIZ;
        LO9 lo9 = xTabPanelController.LJLJJLL;
        if (lo9 != null && lo9.getTopTabPos() != i && !lo9.getHasMoveDown() && lo9.LIZLLL()) {
            lo9.LIZIZ();
            LB9 lb9 = xTabPanelController.LJZI;
            if (lb9 != null) {
                lb9.LIZ(xTabPanelController.LJLLILLLL, false);
            }
        }
        XTabPanelController xTabPanelController2 = this.LIZ;
        xTabPanelController2.LJLJLLL = fragment;
        xTabPanelController2.LIZJ(i, false);
        XTabPanelController xTabPanelController3 = this.LIZ;
        Fragment fragment2 = xTabPanelController3.LJLJLLL;
        if (fragment2 != null && xTabPanelController3.LJZ == null) {
            LOB lob = new LOB(xTabPanelController3);
            xTabPanelController3.LJZ = lob;
            fragment2.requireFragmentManager().LJJLIL(lob, false);
        }
    }
}

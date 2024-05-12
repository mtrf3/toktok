package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import java.util.List;

/* loaded from: classes16.dex */
public final class YF7 implements InterfaceC80650Vl0 {
    public float LJLIL;
    public final /* synthetic */ AwemePagerAssem LJLILLLLZI;

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        AwemePagerAssem awemePagerAssem = this.LJLILLLLZI;
        if (awemePagerAssem._isViewValid) {
            boolean C4 = awemePagerAssem.C4((int) this.LJLIL);
            this.LJLIL = 0.0f;
            if (C4) {
                return true;
            }
        }
        return false;
    }

    public YF7(AwemePagerAssem awemePagerAssem) {
        this.LJLILLLLZI = awemePagerAssem;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        C80648Vky c80648Vky;
        float f;
        float f2;
        AwemePagerAssem awemePagerAssem = this.LJLILLLLZI;
        if (awemePagerAssem.LLF == 0.0f) {
            View view = awemePagerAssem.LJLLLL;
            if (view != null) {
                f2 = view.getBottom();
            } else {
                C80648Vky c80648Vky2 = awemePagerAssem.LJLJJL;
                if (c80648Vky2 != null) {
                    f = c80648Vky2.getTabsMarginTop();
                } else {
                    f = 0.0f;
                }
                f2 = 0.0f - f;
            }
            awemePagerAssem.LLF = f2;
        }
        List<ProfileListFragment> list = this.LJLILLLLZI.LJLJI;
        if (list == null || list.isEmpty() || (c80648Vky = this.LJLILLLLZI.LJLJJL) == null) {
            return;
        }
        c80648Vky.setCanScrollUp(true);
        AwemePagerAssem awemePagerAssem2 = this.LJLILLLLZI;
        T6H<ProfileListFragment> t6h = awemePagerAssem2.LJLJJLL;
        if (t6h == null || awemePagerAssem2.LJLJL != t6h.LJJIIZI(0)) {
            return;
        }
        this.LJLILLLLZI.B4();
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        List<ProfileListFragment> list;
        C80648Vky c80648Vky;
        this.LJLIL += f2;
        AwemePagerAssem awemePagerAssem = this.LJLILLLLZI;
        if (!awemePagerAssem._isViewValid || (list = awemePagerAssem.LJLJI) == null || list.isEmpty() || (c80648Vky = this.LJLILLLLZI.LJLJJL) == null) {
            return;
        }
        c80648Vky.setCanScrollUp(true);
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;
import java.util.List;

/* loaded from: classes16.dex */
public final class YF8 implements InterfaceC80650Vl0 {
    public float LJLIL;
    public final /* synthetic */ AwemePagerAssemV2 LJLILLLLZI;

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        AwemePagerAssemV2 awemePagerAssemV2 = this.LJLILLLLZI;
        if (awemePagerAssemV2._isViewValid) {
            boolean E4 = awemePagerAssemV2.E4((int) this.LJLIL);
            this.LJLIL = 0.0f;
            if (E4) {
                return true;
            }
        }
        return false;
    }

    public YF8(AwemePagerAssemV2 awemePagerAssemV2) {
        this.LJLILLLLZI = awemePagerAssemV2;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        C80648Vky c80648Vky;
        float f;
        float f2;
        AwemePagerAssemV2 awemePagerAssemV2 = this.LJLILLLLZI;
        if (awemePagerAssemV2.LLF == 0.0f) {
            View view = awemePagerAssemV2.LJLLLLLL;
            if (view != null) {
                f2 = view.getBottom();
            } else {
                C80648Vky c80648Vky2 = awemePagerAssemV2.LJLJL;
                if (c80648Vky2 != null) {
                    f = c80648Vky2.getTabsMarginTop();
                } else {
                    f = 0.0f;
                }
                f2 = 0.0f - f;
            }
            awemePagerAssemV2.LLF = f2;
        }
        List<ProfileListFragment> list = this.LJLILLLLZI.LJLJJL;
        if (list == null || list.isEmpty() || (c80648Vky = this.LJLILLLLZI.LJLJL) == null) {
            return;
        }
        c80648Vky.setCanScrollUp(true);
        AwemePagerAssemV2 awemePagerAssemV22 = this.LJLILLLLZI;
        T6H<ProfileListFragment> t6h = awemePagerAssemV22.LJLJLJ;
        if (t6h == null || awemePagerAssemV22.LJLJLLL != t6h.LJJIIZI(0)) {
            return;
        }
        this.LJLILLLLZI.D4();
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        List<ProfileListFragment> list;
        C80648Vky c80648Vky;
        this.LJLIL += f2;
        AwemePagerAssemV2 awemePagerAssemV2 = this.LJLILLLLZI;
        if (!awemePagerAssemV2._isViewValid || (list = awemePagerAssemV2.LJLJJL) == null || list.isEmpty() || (c80648Vky = this.LJLILLLLZI.LJLJL) == null) {
            return;
        }
        c80648Vky.setCanScrollUp(true);
    }
}

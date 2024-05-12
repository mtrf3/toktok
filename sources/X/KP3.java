package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.ui.component.searchguide.SearchSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KP3 implements C2MJ {
    public final /* synthetic */ SearchSwipeGuideUIComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public KP3(SearchSwipeGuideUIComponent searchSwipeGuideUIComponent) {
        this.LJLIL = searchSwipeGuideUIComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        Aweme aweme;
        SearchSwipeGuideUIComponent searchSwipeGuideUIComponent = this.LJLIL;
        if (!searchSwipeGuideUIComponent.LJLLLL) {
            SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = searchSwipeGuideUIComponent.LJLJLLL;
            if (swipeUpGuideStrengthenLayout != null && swipeUpGuideStrengthenLayout.getVisibility() == 0) {
                this.LJLIL.dismiss();
                this.LJLIL.A3("swipe_up_guide_slide");
            }
        } else {
            IFeedPanelPlatformAbility x3 = searchSwipeGuideUIComponent.x3();
            if (x3 != null) {
                aweme = x3.getCurrentAweme();
            } else {
                aweme = null;
            }
            searchSwipeGuideUIComponent.LJLZ = aweme;
            this.LJLIL.C3(1);
        }
        this.LJLIL.LJLLLL = false;
    }
}

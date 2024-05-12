package com.ss.android.ugc.aweme.explore.assem;

import X.C2MA;
import X.C2MJ;
import X.C51029K0z;
import X.C55096Ljo;
import X.C8XO;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedAssem extends ReusedAssem<ExploreFeedAssem> implements C8XO<VideoItemParams>, C2MJ {
    public IViewPagerComponentAbility LJLLJ;

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        IViewPagerComponentAbility iViewPagerComponentAbility = null;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility != null) {
            iViewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility();
        }
        this.LJLLJ = iViewPagerComponentAbility;
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(this);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        ExploreClientExtra exploreClientExtra;
        if (i != 0 || (exploreClientExtra = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getExploreClientExtra()) == null) {
            return;
        }
        exploreClientExtra.cacheType = 2;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }
}

package com.ss.android.ugc.aweme.ecommerce.mall.ui.racun;

import X.AbstractC55082Lja;
import X.C2MA;
import X.C36746EbW;
import X.C56692Kj;
import X.C58152Pz;
import X.C78996UzQ;
import X.C80796VnM;
import X.M89;
import Y.IDiS271S0100000_9;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import java.util.List;

/* loaded from: classes10.dex */
public final class MallRacunFragmentPanel extends DetailFragmentPanel {
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public MallRacunViewModel LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageResume() {
        super.handlePageResume();
        if (!getUserVisibleHint()) {
            return;
        }
        C2MA curFeedViewHolder = getCurFeedViewHolder();
        if (curFeedViewHolder != null) {
            curFeedViewHolder.LIZJ();
        }
        AbstractC55082Lja abstractC55082Lja = this.mAdapter;
        if (abstractC55082Lja != null && this.mViewPager != null) {
            abstractC55082Lja.LJJJJIZL(this.mCurIndex);
            getPlayerManager().LJJJLL(this.mPlayerController);
            C56692Kj.LIZ().getClass();
            Aweme item = this.mAdapter.getItem(this.mViewPager.getCurrentItem());
            C2MA curViewHolder = getCurViewHolder();
            if (isUseSurfaceView() && curViewHolder != null) {
                curViewHolder.LJJIJIIJIL(1);
            }
            C58152Pz.LIZIZ(C78996UzQ.LJIIL(item), "handlePageResume");
            C58152Pz.LIZJ("tryPlay", tryPlay(item));
        }
    }

    public MallRacunFragmentPanel(M89 m89) {
        super(m89);
        this.LLJJJJ = true;
        this.LLJJL = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJZ(boolean z) {
        this.LLIILII = z;
        this.LLJJJJLIIL = z;
    }

    public final void LLIIJLIL(boolean z) {
        try {
            C2MA curViewHolder = getCurViewHolder();
            if (curViewHolder != null) {
                curViewHolder.Z1(z);
            }
        } catch (Exception e) {
            C36746EbW.LIZ(6, e);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageStop(boolean z) {
        super.handlePageStop(z);
        pauseCurrentPlayerWithListener();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        super.J5(list, z);
        this.LLJJJJJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        ILoadMoreAbility iLoadMoreAbility;
        super.onViewCreated(view, bundle);
        C80796VnM c80796VnM = this.mViewPager;
        if (c80796VnM != null) {
            c80796VnM.LJI(new IDiS271S0100000_9(this, 4));
        }
        if (!LoadMorePanelComponentTempHelper.LJLJJLL && (iLoadMoreAbility = this.loadMoreAbility) != null) {
            iLoadMoreAbility.resetLoadMoreState();
        }
    }
}

package X;

import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.services.SmartLockService;

/* renamed from: X.LiQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55010LiQ implements R5X {
    public final /* synthetic */ MLL LIZ;
    public final /* synthetic */ RecommendFeedFragmentPanel LIZIZ;

    @Override // X.R5X
    public final void onDialogShow() {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockTipMaskShow(this.LIZIZ.getContext(), this.LIZ.LIZIZ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "fyp_page");
        FMX.LJIIL("express_login_authority_window_pop_up", c188727au.LIZ);
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockTipMaskDismiss();
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        SmartLockService.createISmartLockServicebyMonsterPlugin(false).smartLockTipMaskDismiss();
    }

    public C55010LiQ(RecommendFeedFragmentPanel recommendFeedFragmentPanel, MLL mll) {
        this.LIZIZ = recommendFeedFragmentPanel;
        this.LIZ = mll;
    }
}

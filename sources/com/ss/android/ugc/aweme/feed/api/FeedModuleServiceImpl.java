package com.ss.android.ugc.aweme.feed.api;

import X.ActivityC45651qj;
import X.C58096Mr6;
import X.LCP;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedModuleServiceImpl extends FeedModuleServiceCommonImpl {
    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void attachActivityToGlobalAcViewModel(ActivityC45651qj activityC45651qj) {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final String getFeedRequstParam() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final void initLegoInflate() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void initPosterSRProcessorOnHotStart() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void posterSRProcessorOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final void setFeedRequstParam(String str) {
    }

    public static IFeedModuleService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IFeedModuleService.class, false);
        if (LIZ != null) {
            return (IFeedModuleService) LIZ;
        }
        if (C58096Mr6.A0 == null) {
            synchronized (IFeedModuleService.class) {
                if (C58096Mr6.A0 == null) {
                    C58096Mr6.A0 = new FeedModuleServiceImpl();
                }
            }
        }
        return C58096Mr6.A0;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl
    public final LCP createData(Context context) {
        String string;
        o.LJIIIZ(context, "context");
        if (e1.LIZ(31744, "for_you_new_translations", true, false)) {
            string = context.getResources().getString(R.string.sft);
        } else {
            string = context.getResources().getString(R.string.gl6);
        }
        o.LJIIIIZZ(string, "if (ABManager.getInstanc…ng.for_you)\n            }");
        return new LCP(context, "For You", string);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl, com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public final void refreshComment(Fragment fragment) {
        if (fragment instanceof FeedRecommendFragment) {
            RecommendFeedFragmentPanel recommendFeedFragmentPanel = ((FeedRecommendFragment) fragment).LJLL;
            recommendFeedFragmentPanel.showCommentFragment(recommendFeedFragmentPanel.getCurrentPlayAweme(), (String) null, false, "tab_recommend", true);
        }
    }
}

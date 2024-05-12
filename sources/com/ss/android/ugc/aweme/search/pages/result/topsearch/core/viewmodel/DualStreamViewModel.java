package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;

/* loaded from: classes9.dex */
public final class DualStreamViewModel extends ViewModel {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    public final void gv0(SearchMixFeedList searchMixFeedList) {
        boolean z;
        DynamicPatch dynamicPatch;
        GlobalDoodleConfig globalDoodleConfig;
        boolean z2 = true;
        if (searchMixFeedList != null && (globalDoodleConfig = searchMixFeedList.globalDoodleConfig) != null && globalDoodleConfig.getDisableInnerFlow()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        if (searchMixFeedList == null || (dynamicPatch = searchMixFeedList.dynamicMask) == null || dynamicPatch.getOriginType() == 81) {
            z2 = false;
        }
        this.LJLILLLLZI = z2;
    }
}

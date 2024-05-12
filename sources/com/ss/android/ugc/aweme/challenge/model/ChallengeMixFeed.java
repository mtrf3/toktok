package com.ss.android.ugc.aweme.challenge.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* loaded from: classes9.dex */
public final class ChallengeMixFeed {

    @InterfaceC65349Pkn("dynamic_patch")
    public DynamicPatch dynamicPatch;

    @InterfaceC65349Pkn("dynamic_type")
    public int dynamicType;

    @InterfaceC65349Pkn("type")
    public int feedType;
    public LogPbBean mLogPbBean;

    public final boolean isLynxCard() {
        if (this.feedType == 999) {
            return true;
        }
        return false;
    }

    public final boolean isVsLiveCard() {
        if (this.feedType == 998) {
            return true;
        }
        return false;
    }
}

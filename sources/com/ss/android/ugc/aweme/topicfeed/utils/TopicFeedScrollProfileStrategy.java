package com.ss.android.ugc.aweme.topicfeed.utils;

import X.ActivityC45651qj;
import X.LXS;
import X.LXU;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;

/* loaded from: classes10.dex */
public final class TopicFeedScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public final int LJLJJL;
    public boolean LJLJJLL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        LXS LIZ = LXU.LIZ();
        if (LIZ == null || !LIZ.LIZIZ(this.LJLJJL)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean LLJJJJLIIL() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void LLZZLLIL(boolean z) {
        this.LJLJJLL = z;
    }

    public TopicFeedScrollProfileStrategy(int i, ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, "homepage_topic");
        this.LJLJJL = i;
    }
}

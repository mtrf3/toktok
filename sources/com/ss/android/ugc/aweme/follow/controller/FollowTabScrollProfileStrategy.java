package com.ss.android.ugc.aweme.follow.controller;

import X.ActivityC45651qj;
import X.LXS;
import X.LXU;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;

/* loaded from: classes10.dex */
public final class FollowTabScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        LXS LIZ = LXU.LIZ();
        if (LIZ == null || !LIZ.LIZIZ) {
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
        return this.LJLJJL;
    }

    public FollowTabScrollProfileStrategy(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, "Following");
        this.LJLJJL = true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void LLZZLLIL(boolean z) {
        this.LJLJJL = z;
    }
}
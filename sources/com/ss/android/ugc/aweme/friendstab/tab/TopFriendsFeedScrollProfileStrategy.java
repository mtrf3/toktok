package com.ss.android.ugc.aweme.friendstab.tab;

import X.ActivityC45651qj;
import X.C54029LIj;
import X.C55096Ljo;
import X.C55230Lly;
import X.LXS;
import X.LXU;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;
import com.ss.android.ugc.aweme.relation.recuser.helper.IRecSwipeFriendTabDisableScrollProfileHelper;

/* loaded from: classes10.dex */
public final class TopFriendsFeedScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public final ActivityC45651qj LJLJJL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void LLZZLLIL(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        IRecSwipeFriendTabDisableScrollProfileHelper iRecSwipeFriendTabDisableScrollProfileHelper = (IRecSwipeFriendTabDisableScrollProfileHelper) C55096Ljo.LIZ(C55230Lly.LIZLLL(this.LJLJJL, null), IRecSwipeFriendTabDisableScrollProfileHelper.class, "homepage_friends");
        boolean z = false;
        if (iRecSwipeFriendTabDisableScrollProfileHelper != null && iRecSwipeFriendTabDisableScrollProfileHelper.tf0()) {
            return false;
        }
        LXS LIZ = LXU.LIZ();
        if (LIZ != null && LIZ.LIZJ) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final boolean LLJJJJLIIL() {
        return C54029LIj.LIZIZ.LJJLIIIJLJLI();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol
    public final boolean enable() {
        return LIZJ();
    }

    public TopFriendsFeedScrollProfileStrategy(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, "FRIENDS_FEED");
        this.LJLJJL = activityC45651qj;
    }
}

package com.ss.android.ugc.aweme.feed.ui.foryoutab;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C90193gN;
import X.LPR;
import X.LS5;
import X.LXS;
import X.LXU;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.experiment.SlidingGestureHintConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class ForYouTabScrollProfileStrategy extends AbsTabScrollProfileStrategy {
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZ() {
        LXS LIZ = LXU.LIZ();
        if (LIZ == null || !LIZ.LIZ) {
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

    public ForYouTabScrollProfileStrategy(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, "For You");
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(activityC45651qj, 232));
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(activityC45651qj, 231));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy
    public final void LLZZLLIL(boolean z) {
        this.LJLJJL = z;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy
    public final boolean LIZLLL(int i, int i2) {
        Aweme aweme;
        Integer num;
        MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) this.LJLJJLL.getValue();
        if (mainBusinessAbility != null) {
            aweme = mainBusinessAbility.getCurrentAweme();
        } else {
            aweme = null;
        }
        boolean LIZ = LPR.LIZ(aweme);
        MainBusinessAbility mainBusinessAbility2 = (MainBusinessAbility) this.LJLJJLL.getValue();
        if (mainBusinessAbility2 == null || !mainBusinessAbility2.isADShowing() || (num = ((SlidingGestureHintConfig) LS5.LIZIZ.getValue()).fypCanSlideAtMiddle) == null || num.intValue() != 1 || ((aweme != null && C63081OpJ.LJZL(aweme)) || LIZ)) {
            return super.LIZLLL(i, i2);
        }
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LJLJL.getValue();
        if ((homePageViewPagerAbility != null && homePageViewPagerAbility.gU() < 0.0f) || C90193gN.LIZ()) {
            if (!C90193gN.LIZ()) {
                return true;
            }
            HomePageViewPagerAbility homePageViewPagerAbility2 = (HomePageViewPagerAbility) this.LJLJL.getValue();
            if (homePageViewPagerAbility2 != null && homePageViewPagerAbility2.gU() > 0.0f) {
                return true;
            }
        }
        return super.LIZLLL(i, i2);
    }
}

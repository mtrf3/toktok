package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.AbstractC55082Lja;
import X.C1DF;
import X.C210408No;
import X.C221138m5;
import X.C2MA;
import X.C2MJ;
import X.C54838Lfe;
import X.C8NM;
import X.KR8;
import X.M89;
import X.ORZ;
import X.X1D;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardPanelComponent extends BasePanelComponent implements C2MJ {
    public final C221138m5 LJLIL = KR8.LJIIJJI(new AqS153S0100000_3(this, 954));
    public StoryGuideCardViewModel LJLILLLLZI;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Cp(this);
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(this);
        }
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        PagerAdapter pagerAdapter;
        Aweme aweme;
        String str;
        boolean z;
        AbstractC55082Lja abstractC55082Lja;
        List<Aweme> LJJIL;
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LJLIL.getValue();
        String str2 = null;
        if (iViewPagerAbility != null) {
            pagerAdapter = iViewPagerAbility.LJJLIIIJJIZ();
        } else {
            pagerAdapter = null;
        }
        if ((pagerAdapter instanceof AbstractC55082Lja) && (abstractC55082Lja = (AbstractC55082Lja) pagerAdapter) != null && (LJJIL = abstractC55082Lja.LJJIL()) != null) {
            aweme = (Aweme) ORZ.LJLLLLLL(i + 1, LJJIL);
        } else {
            aweme = null;
        }
        M89 m89 = getPanelContext().LIZJ;
        if (m89 == null || (str = m89.getEventType()) == null) {
            str = "";
        }
        int i2 = 0;
        if (C54838Lfe.LJIL(aweme, str) || C54838Lfe.LJIJJLI(aweme, str)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageSelected-");
        LIZ.append(i);
        LIZ.append(", nextIsStoryGuide = ");
        LIZ.append(z);
        LIZ.append(", storyGuideCardVM = ");
        StoryGuideCardViewModel storyGuideCardViewModel = this.LJLILLLLZI;
        if (storyGuideCardViewModel != null) {
            i2 = storyGuideCardViewModel.hashCode();
        }
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        if (!z) {
            return;
        }
        Aweme LIZJ = C210408No.LIZJ(aweme);
        Fragment fragment = getPanelContext().LJ;
        if (LIZJ != null) {
            str2 = LIZJ.getAid();
        }
        StoryGuideCardViewModel LIZIZ = C210408No.LIZIZ(fragment, str2);
        this.LJLILLLLZI = LIZIZ;
        if (LIZIZ != null) {
            Context context = getContext();
            Aweme LIZJ2 = C210408No.LIZJ(aweme);
            if (C1DF.LJJIII(LIZJ2) && context != null) {
                C8NM.LIZ(context, LIZJ2);
            }
        }
        StoryGuideCardViewModel storyGuideCardViewModel2 = this.LJLILLLLZI;
        if (storyGuideCardViewModel2 != null) {
            storyGuideCardViewModel2.kv0(aweme, "preloadSkylight");
        }
    }
}

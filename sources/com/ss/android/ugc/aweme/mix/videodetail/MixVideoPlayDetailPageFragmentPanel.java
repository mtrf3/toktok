package com.ss.android.ugc.aweme.mix.videodetail;

import X.C227768wm;
import X.C228098xJ;
import X.C34493DgH;
import X.C46276IEe;
import X.C55348Lns;
import X.C80796VnM;
import X.C92C;
import X.FN6;
import X.InterfaceC36571c5;
import X.InterfaceC57982Pi;
import X.M89;
import Y.ARunnableS28S0200000_9;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MixVideoPlayDetailPageFragmentPanel extends DetailFragmentPanel implements InterfaceC57982Pi {
    public static final /* synthetic */ int LLJL = 0;
    public final String LLJJJIL;
    public String LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public long LLJJL;
    public int LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC57982Pi
    public final void LIZLLL() {
        this.mControllerHolder.LIZIZ(this.LLJJJJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPinchStart() {
        LJIIIIZZ("touching_screen");
    }

    @Override // X.InterfaceC57982Pi
    public final void LJIIIIZZ(String str) {
        String str2;
        int i;
        PlayListInfo playListInfo;
        Integer index;
        PlayListInfo playListInfo2;
        if (!this.LLJJJJJIL || !C228098xJ.LIZIZ()) {
            return;
        }
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || (playListInfo2 = currentAweme.playlist_info) == null || (str2 = playListInfo2.getMixId()) == null) {
            str2 = "";
        }
        Aweme currentAweme2 = getCurrentAweme();
        if (currentAweme2 != null && (playListInfo = currentAweme2.playlist_info) != null && (index = playListInfo.getIndex()) != null) {
            i = index.intValue();
        } else {
            i = 0;
        }
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = 0;
        MixFeedService.LJJIJIIJIL().LJJI(i, getEventType(), this.LLJJJIL, str2, getCurrentAwemeId(), System.currentTimeMillis() - this.LLJJL, C227768wm.LIZJ(getCurrentAweme()), str);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJLLILLLL(List<? extends Aweme> list) {
        if (C34493DgH.LIZ) {
            FN6.LIZJ(new ARunnableS28S0200000_9(list, this, 20));
        } else {
            LJLLJ(list, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        if (i == 1) {
            LJIIIIZZ("touching_screen");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        super.onRenderFirstFrame(str);
        this.LLJJLIIIJLLLLLLLZ++;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onVideoPlayerEvent(C46276IEe c46276IEe) {
        Integer valueOf;
        String str;
        String str2;
        int i;
        C92C c92c;
        C92C c92c2;
        int LJI;
        PlayListInfo playListInfo;
        Integer index;
        PlayListInfo playListInfo2;
        super.onVideoPlayerEvent(c46276IEe);
        if (c46276IEe == null || (valueOf = Integer.valueOf(c46276IEe.LJLIL)) == null || valueOf.intValue() != 7 || c46276IEe == null || (str = c46276IEe.LJLILLLLZI) == null || !C228098xJ.LIZIZ()) {
            return;
        }
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || (playListInfo2 = currentAweme.playlist_info) == null || (str2 = playListInfo2.getMixId()) == null) {
            str2 = "";
        }
        Aweme currentAweme2 = getCurrentAweme();
        if (currentAweme2 != null && (playListInfo = currentAweme2.playlist_info) != null && (index = playListInfo.getIndex()) != null) {
            i = index.intValue();
        } else {
            i = -1;
        }
        int i2 = i + 1;
        if (this.mViewPager.getScrollState() == 1 || isPinching() || this.LLIFFJFJJ.LJLJJL) {
            return;
        }
        InterfaceC36571c5 fragment = getFragment();
        if (fragment instanceof C92C) {
            c92c = (C92C) fragment;
        } else {
            c92c = null;
        }
        if ((c92c != null && c92c.f()) || this.mAdapter == null) {
            return;
        }
        InterfaceC36571c5 fragment2 = getFragment();
        if (!(fragment2 instanceof C92C) || (c92c2 = (C92C) fragment2) == null || !c92c2.Td() || (LJI = this.mAdapter.LJI(str)) == -1) {
            return;
        }
        int i3 = LJI + 1;
        if (i3 < this.mAdapter.getCount()) {
            this.mViewPager.setIsTriggerByAutoPlay(true);
            this.mCurIndex = i3;
            this.LLJJJJ = "auto";
            this.mViewPager.LJJJ(i3, true);
            this.mViewPager.setIsTriggerByAutoPlay(false);
            if (this.LLJJJJJIL) {
                return;
            }
            this.LLJJJJJIL = true;
            this.LLJJL = System.currentTimeMillis();
            MixFeedService.LJJIJIIJIL().LJIIJ(i2, this.LLJJJJLIIL, getEventType(), this.LLJJJIL, str2, getCurrentAwemeId(), C227768wm.LIZJ(getCurrentAweme()));
            return;
        }
        if (!this.LLJJJJJIL) {
            return;
        }
        LJIIIIZZ("last_episode");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final BaseListFragmentPanel setParam(M89 param) {
        o.LJIIIZ(param, "param");
        super.setParam(param);
        this.mControllerHolder.LIZIZ(this.LLJJJJ);
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MixVideoPlayDetailPageFragmentPanel(M89 param, String str) {
        super(param);
        o.LJIIIZ(param, "param");
        this.LLJJJIL = str;
        this.LLJJJJ = "enter";
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C80796VnM viewPager = getViewPager();
        if (viewPager != null) {
            viewPager.LJI(new C55348Lns(this));
        }
    }
}

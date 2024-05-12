package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.C17N;
import X.C207668Da;
import X.C80647Vkx;
import X.C80672VlM;
import X.C80674VlO;
import X.C80675VlP;
import X.XYD;
import Y.ARunnableS11S0301000_11;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class NewMusicTabFragment extends BaseNewMusicTabFragment {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public final Map<Integer, View> LLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Dl() {
        C80675VlP c80675VlP = this.LJLJI;
        if (c80675VlP != null) {
            c80675VlP.setSelectedTabIndicatorHeight(C17N.LJIILL(2.0d));
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment
    public final void wl() {
        C80647Vkx c80647Vkx = this.LJLJJL;
        if (c80647Vkx == null) {
            return;
        }
        c80647Vkx.setTabsMarginTop(C17N.LJIILL(44));
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Gl(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        linearLayout.setShowDividers(0);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment
    public final void xl(C207668Da kvData) {
        C80675VlP c80675VlP;
        C80674VlO LJIIJ;
        C80672VlM c80672VlM;
        o.LJIIIZ(kvData, "kvData");
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof ChooseMusicFragment) && ((BaseChooseMusicFragment) parentFragment).mIsShowingSearch) {
            return;
        }
        Object obj = kvData.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        XYD xyd = (XYD) obj;
        int i = xyd.LIZLLL;
        MusicModel musicModel = xyd.LJ;
        int i2 = xyd.LIZ;
        if (i != 1 || i2 != 0 || (c80675VlP = this.LJLJI) == null || (LJIIJ = c80675VlP.LJIIJ(1)) == null || (c80672VlM = LJIIJ.LJIIIIZZ) == null) {
            return;
        }
        c80672VlM.post(new ARunnableS11S0301000_11(0, this, LJIIJ, musicModel, 2));
    }

    @Override // X.InterfaceC84871XSp
    public final void LJJJJIZL(MusicModel musicModel, Exception exc) {
        super.LJJJJIZL(musicModel, exc);
    }
}

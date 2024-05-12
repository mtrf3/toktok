package X;

import Y.ARunnableS4S0001000_9;
import Y.ARunnableS8S1200000_9;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import org.json.JSONObject;

/* renamed from: X.Liu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55040Liu extends C1CZ {
    public boolean LJLIL;
    public int LJLILLLLZI = -1;
    public final /* synthetic */ FullFeedFragmentPanel LJLJI;

    public C55040Liu(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.LJLJI = fullFeedFragmentPanel;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLJI.getClass();
        if (i == 1) {
            this.LJLIL = false;
        } else if (i == 0) {
            this.LJLJI.LJLIIIL();
        }
        if (C55041Liv.LJ == null) {
            synchronized (C38840FMe.class) {
                if (C55041Liv.LJ == null) {
                    C55041Liv.LJ = new C55041Liv();
                }
            }
        }
        C55041Liv c55041Liv = C55041Liv.LJ;
        c55041Liv.getClass();
        if (!C52224Kea.LIZ) {
            return;
        }
        if (i == 0) {
            c55041Liv.LIZIZ(false);
            c55041Liv.LIZ(false);
            c55041Liv.LIZJ = false;
        } else {
            c55041Liv.LIZIZ(true);
            c55041Liv.LIZJ = true;
        }
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        Fragment fragment;
        int i2;
        JSONObject jSONObject;
        Aweme prevAweme;
        boolean z;
        boolean z2;
        C80796VnM c80796VnM;
        if (C52224Kea.LIZ && (c80796VnM = this.LJLJI.mViewPager) != null) {
            c80796VnM.postOnAnimation(new ARunnableS4S0001000_9(0, 0));
        }
        C2U8.LIZ(new C46276IEe(10, 0));
        FullFeedFragmentPanel fullFeedFragmentPanel = this.LJLJI;
        Aweme item = fullFeedFragmentPanel.mAdapter.getItem(fullFeedFragmentPanel.mViewPager.getCurrentItem());
        FullFeedFragmentPanel fullFeedFragmentPanel2 = this.LJLJI;
        int i3 = this.LJLILLLLZI;
        fullFeedFragmentPanel2.getClass();
        JSONObject jSONObject2 = null;
        if (R3A.LJII() && (fragment = fullFeedFragmentPanel2.getFragment()) != null && (fragment.getParentFragment() instanceof InterfaceC54054LJi) && fragment.getParentFragment() != null && !C63081OpJ.LJJLIIIJJI(item) && (i2 = R3A.LJLIL) < 6 && i > i3 && i2 <= 6) {
            R3A.LJLIL = i2 + 1;
        }
        if (C63081OpJ.LJJLIIIJJI(item)) {
            C2U8.LIZ(new C55050Lj4());
            C26045AKb c26045AKb = this.LJLJI.LJLLI;
            if (c26045AKb != null) {
                c26045AKb.LIZIZ();
            }
        }
        FullFeedFragmentPanel fullFeedFragmentPanel3 = this.LJLJI;
        fullFeedFragmentPanel3.LJLJL = Math.max(fullFeedFragmentPanel3.LJLJL, i);
        if (this.LJLJI.isRecommendFeed()) {
            if (this.LJLILLLLZI == i + 1) {
                C2MA curViewHolder = this.LJLJI.getCurViewHolder();
                if (this.LJLJI.getCurrentAweme() != null && !this.LJLJI.getCurrentAweme().isAd()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((curViewHolder instanceof InterfaceC55219Lln) && z2) {
                    C2OE.LIZIZ(((InterfaceC55219Lln) curViewHolder).a6(), i + 2);
                } else if ((curViewHolder instanceof InterfaceC56362Jc) && z2) {
                    C2OE.LIZIZ(((InterfaceC56362Jc) curViewHolder).a6(), i + 2);
                }
                C57712Oh.LIZIZ.LIZIZ(i + 2, this.LJLJI.getCurrentAweme());
            } else {
                Aweme previousAweme = this.LJLJI.getPreviousAweme();
                C2MA preViewHolder = this.LJLJI.getPreViewHolder();
                if (previousAweme != null && !previousAweme.isAd()) {
                    z = true;
                } else {
                    z = false;
                }
                if ((preViewHolder instanceof InterfaceC55219Lln) && z) {
                    C2OE.LIZIZ(((InterfaceC55219Lln) preViewHolder).a6(), i);
                } else if ((preViewHolder instanceof InterfaceC56362Jc) && z) {
                    C2OE.LIZIZ(((InterfaceC56362Jc) preViewHolder).a6(), i);
                }
                C57712Oh.LIZIZ.LIZIZ(i, this.LJLJI.getCurrentAweme());
            }
        }
        IMLCommonService instance = MLCommonService.instance();
        String eventType = this.LJLJI.getEventType();
        C80796VnM c80796VnM2 = this.LJLJI.mViewPager;
        if (c80796VnM2 != null) {
            jSONObject = c80796VnM2.LLLIIIIL;
        } else {
            jSONObject = null;
        }
        instance.onViewPagerSelected(item, eventType, i, jSONObject);
        Aweme currentAweme = this.LJLJI.getCurrentAweme();
        if (this.LJLILLLLZI == i + 1) {
            prevAweme = this.LJLJI.getNextAweme(currentAweme);
        } else {
            prevAweme = this.LJLJI.getPrevAweme(currentAweme);
        }
        FullFeedFragmentPanel fullFeedFragmentPanel4 = this.LJLJI;
        C80796VnM c80796VnM3 = fullFeedFragmentPanel4.mViewPager;
        if (c80796VnM3 != null) {
            jSONObject2 = c80796VnM3.LLLIIIIL;
        }
        ARunnableS8S1200000_9 aRunnableS8S1200000_9 = new ARunnableS8S1200000_9(prevAweme, fullFeedFragmentPanel4.param.getEventType(), jSONObject2, 4);
        if (((Boolean) DP9.LIZ.getValue()).booleanValue()) {
            C38995FSd.LIZIZ().execute(aRunnableS8S1200000_9);
        } else {
            aRunnableS8S1200000_9.run();
        }
        this.LJLILLLLZI = i;
        C2MA curViewHolder2 = this.LJLJI.getCurViewHolder();
        if (curViewHolder2 != null) {
            if (curViewHolder2.getAwemeType() == 325) {
                ILoadMoreAbility iLoadMoreAbility = this.LJLJI.loadMoreAbility;
                if (iLoadMoreAbility != null) {
                    iLoadMoreAbility.qW(true);
                }
                this.LJLJI.stopPlayer();
                C84193Sd.LIZ((ActivityC45651qj) this.LJLJI.activity).LJLJL.setValue(Boolean.FALSE);
                return;
            }
            if (curViewHolder2.getAwemeType() == 326) {
                ILoadMoreAbility iLoadMoreAbility2 = this.LJLJI.loadMoreAbility;
                if (iLoadMoreAbility2 != null) {
                    iLoadMoreAbility2.qW(true);
                }
                C84193Sd.LIZ((ActivityC45651qj) this.LJLJI.activity).LJLJL.setValue(Boolean.FALSE);
                return;
            }
            if (curViewHolder2.getAwemeType() == 327) {
                ILoadMoreAbility iLoadMoreAbility3 = this.LJLJI.loadMoreAbility;
                if (iLoadMoreAbility3 != null) {
                    iLoadMoreAbility3.qW(true);
                }
                C84193Sd.LIZ((ActivityC45651qj) this.LJLJI.activity).LJLJL.setValue(Boolean.FALSE);
                return;
            }
        }
        ILoadMoreAbility iLoadMoreAbility4 = this.LJLJI.loadMoreAbility;
        if (iLoadMoreAbility4 != null) {
            iLoadMoreAbility4.qW(false);
        }
        C84193Sd.LIZ((ActivityC45651qj) this.LJLJI.activity).LJLJL.setValue(Boolean.TRUE);
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (!this.LJLIL) {
            this.LJLIL = true;
        }
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJI.LJLJLJ;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            this.LJLJI.LJLJLJ.dismiss();
            this.LJLJI.LJLJLJ = null;
        }
    }
}

package X;

import Y.ARunnableS37S0100000_1;
import Y.ARunnableS5S0101000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.EcUgCommonService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerComponentTemp;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Iterator;
import kotlin.jvm.internal.AqS41S0001000_1;

/* renamed from: X.2Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58042Po extends AbstractC58072Pr {
    public boolean LJLJI;
    public final /* synthetic */ View.OnTouchListener LJLJJLL;
    public final /* synthetic */ BaseListFragmentPanel LJLJL;
    public int LJLIL = -1;
    public int LJLILLLLZI = -1;
    public int LJLJJI = -1;
    public boolean LJLJJL = true;

    @Override // X.C2MJ
    public final void J8(int i) {
        BaseListFragmentPanel baseListFragmentPanel;
        Aweme item;
        boolean z;
        C2MA c2ma;
        BaseListFragmentPanel baseListFragmentPanel2;
        C2MA curViewHolder;
        BaseListFragmentPanel baseListFragmentPanel3 = this.LJLJL;
        baseListFragmentPanel3.mCurIndex = i;
        this.LJLIL = -1;
        baseListFragmentPanel3.checkLoadMore();
        this.LJLJL.checkLoadLatest();
        this.LJLJL.checkLiveStatus();
        if (this.LJLJL.playButtonComponentTemp != null && (!C86951YAp.LIZIZ.LJ() || !C2MX.LIZ().LIZIZ || !TextUtils.equals(this.LJLJL.getEventType(), "offline_mode_page"))) {
            this.LJLJL.playButtonComponentTemp.es0();
        }
        if (!this.LJLJJL) {
            this.LJLJL.mHasSlideOperation = true;
        }
        PlayerComponentTemp playerComponentTemp = this.LJLJL.playerComponent;
        if (playerComponentTemp == null || C2M3.LIZIZ() || (baseListFragmentPanel = playerComponentTemp.LJLIL) == null || (item = baseListFragmentPanel.getAdapter().getItem(i)) == null) {
            return;
        }
        if (!item.isLive() && !item.isCanPlay()) {
            return;
        }
        CommonFeedApiService.LIZ().LJJIIJ(item);
        if (MainPageExperimentServiceImpl.LJ().LIZIZ() && !baseListFragmentPanel.getUserVisibleHint()) {
            z = true;
        } else {
            z = false;
        }
        BaseListFragmentPanel baseListFragmentPanel4 = playerComponentTemp.LJLIL;
        OnUIPlayListener onUIPlayListener = null;
        if (baseListFragmentPanel4 != null) {
            c2ma = baseListFragmentPanel4.getCurViewHolder();
        } else {
            c2ma = null;
        }
        if ((!C72083SQt.LJLILLLLZI(c2ma) && (c2ma == null || c2ma.LLLJ() == null || c2ma.LLLJ().UU() != 2)) || C78996UzQ.LJJII(item) || !playerComponentTemp.LIZLLL() || z || C63081OpJ.LJLJI(item)) {
            return;
        }
        if (C80S.LJ(item)) {
            C5S1 c5s1 = new C5S1(baseListFragmentPanel.getContext());
            c5s1.LIZJ(R.string.txs);
            c5s1.LJ();
            return;
        }
        if (item.isLive()) {
            C56692Kj.LIZ().getClass();
            if (!playerComponentTemp.isUseSurfaceView() || baseListFragmentPanel.getCurViewHolder() == null || (curViewHolder = baseListFragmentPanel.getCurViewHolder()) == null) {
                return;
            }
            curViewHolder.B7();
            return;
        }
        InterfaceC46330IGg playerManager = playerComponentTemp.getPlayerManager();
        IDP idp = playerComponentTemp.LJLJL;
        if (idp != null) {
            onUIPlayListener = idp.LJJJJ();
        }
        playerManager.LJJJLL(onUIPlayListener);
        if (playerComponentTemp.isUseSurfaceView() && baseListFragmentPanel.getCurViewHolder() != null) {
            C2MA curViewHolder2 = baseListFragmentPanel.getCurViewHolder();
            if (curViewHolder2 != null) {
                curViewHolder2.c7();
            }
            playerComponentTemp.getPlayerManager().LJJLIL();
        }
        if (C58222Qg.LJFF.compareAndSet(true, false) || (baseListFragmentPanel2 = playerComponentTemp.LJLIL) == null) {
            return;
        }
        if (C1GE.LJIIIZ(baseListFragmentPanel2.activity) && !playerComponentTemp.LJLLI) {
            return;
        }
        playerComponentTemp.getPlayerManager().LJJLIL();
    }

    public final void LIZ(int i) {
        if (!this.LJLJL.isRecommendFeed() || this.LJLJL.mAdapter == null) {
            return;
        }
        FeedAdServiceImpl.LJJIJLIJ().LJIIZILJ();
        NKP nkp = NKP.LIZ;
        nkp.LJIIZILJ(i, this.LJLJL.mAdapter.Q8());
        if (e1.LIZ(31744, "enable_feed_ad_lynx_card_child_thread", true, false)) {
            new PthreadThread(new ARunnableS5S0101000_1(this, i, 4), "BaseListFragmentPanel$7").start();
        } else {
            FeedAdServiceImpl.LJJIJLIJ().LJIIZILJ();
            C58162Qa.LIZ(nkp, this.LJLJL.mAdapter.Q8(), i);
        }
        if (C58062Pq.LIZ()) {
            FeedAdServiceImpl.LJJIJLIJ().LJJIII();
            C59181NKn.LIZ.LJIILL(i, this.LJLJL.mAdapter.Q8());
            this.LJLJL.mHandler.postDelayed(new ARunnableS5S0101000_1(this, i, 5), 100L);
        }
        if (C58112Pv.LIZ()) {
            FeedAdServiceImpl.LJJIJLIJ().LJIIIZ();
            C59171NKd.LIZ.LJIILL(i, this.LJLJL.mAdapter.Q8());
            this.LJLJL.mHandler.postDelayed(new ARunnableS5S0101000_1(this, i, 6), 100L);
        }
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJL;
        baseListFragmentPanel.preRenderSuperLike(baseListFragmentPanel.viewPagerComponent, i);
        BaseListFragmentPanel baseListFragmentPanel2 = this.LJLJL;
        baseListFragmentPanel2.preRenderDescriptive(baseListFragmentPanel2.viewPagerComponent, i);
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        BaseListFragmentPanel baseListFragmentPanel3 = this.LJLJL;
        LJJIJLIJ.LJIJJ(baseListFragmentPanel3.createPreRenderDepend(baseListFragmentPanel3.viewPagerComponent, i));
        FeedAdServiceImpl.LJJIJLIJ().LJIILJJIL();
        NKM.LIZ.LJIILL(i, this.LJLJL.mAdapter.Q8());
        this.LJLJL.mHandler.postDelayed(new ARunnableS5S0101000_1(this, i, 7), 100L);
        FeedAdServiceImpl.LJJIJLIJ().LIZJ();
        C59182NKo.LJI(i, C59177NKj.LIZ, this.LJLJL.mAdapter.Q8());
        this.LJLJL.mHandler.postDelayed(new ARunnableS5S0101000_1(this, i, 8), 100L);
        this.LJLJL.mHandler.postDelayed(new ARunnableS5S0101000_1(this, i, 9), 100L);
    }

    public final void LIZJ(int i) {
        if (!this.LJLJL.isRecommendFeed() || this.LJLJL.mAdapter == null) {
            return;
        }
        IEcUgCommonService LIZLLL = EcUgCommonService.LIZLLL();
        Context context = this.LJLJL.getContext();
        this.LJLJL.getFragment();
        LIZLLL.LIZ(context, this.LJLJL.getEventType(), this.LJLJL.mAdapter.Q8(), i);
    }

    public final void LIZLLL(boolean z) {
        C80796VnM c80796VnM;
        if (C59472Vb.LLLLZ() && (c80796VnM = this.LJLJL.mViewPager) != null) {
            int childCount = c80796VnM.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Object TQ = this.LJLJL.viewPagerComponent.TQ(i);
                if (TQ instanceof VideoViewCell) {
                    if (z) {
                        ((VideoViewCell) TQ).LLJLILLLLZIIL(true);
                    } else {
                        ((VideoViewCell) TQ).LLJLILLLLZIIL(false);
                    }
                }
            }
        }
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        BaseListFragmentPanel baseListFragmentPanel;
        IDP idp;
        if (this.LJLJJI == 0) {
            BaseListFragmentPanel baseListFragmentPanel2 = this.LJLJL;
            baseListFragmentPanel2.mLastIndexBeforeSlide = baseListFragmentPanel2.mCurIndex;
            baseListFragmentPanel2.mIsManualScroll = false;
        }
        this.LJLJL.viewPagerComponent.onPageScrollStateChanged(i);
        this.LJLJJI = i;
        if (i == 1) {
            this.LJLJL.mIsManualScroll = true;
        }
        BaseListFragmentPanel baseListFragmentPanel3 = this.LJLJL;
        if (baseListFragmentPanel3.mIsManualScroll && i == 0) {
            LIZ(baseListFragmentPanel3.mCurIndex);
            LIZJ(this.LJLJL.mCurIndex);
            BaseListFragmentPanel baseListFragmentPanel4 = this.LJLJL;
            if (baseListFragmentPanel4.mLastIndexBeforeSlide == baseListFragmentPanel4.mCurIndex && baseListFragmentPanel4.getNextViewHolder() != null && this.LJLJL.getNextViewHolder().getAweme() != null && this.LJLJL.getNextViewHolder().getAweme().isAd()) {
                this.LJLJL.getNextViewHolder().getAweme().getAwemeRawAd().setReshowCTA(true);
                if (this.LJLJL.getNextViewHolder().j3() != null) {
                    this.LJLJL.getNextViewHolder().j3().q2();
                }
            }
        }
        C2MA curViewHolder = this.LJLJL.getCurViewHolder();
        if (curViewHolder != null) {
            curViewHolder.r5(this.LJLJL.mCurIndex, i);
        }
        if (i == 1) {
            this.LJLJL.tryDismissViewHolderGuide();
            if (curViewHolder != null) {
                curViewHolder.Z7();
            }
            LIZLLL(true);
        } else if (i == 0) {
            this.LJLJL.isFirstScroller = false;
            C90C.LIZ = false;
            LIZLLL(false);
        }
        PlayerComponentTemp playerComponentTemp = this.LJLJL.playerComponent;
        if (playerComponentTemp != null) {
            playerComponentTemp.getClass();
            if (!C2M3.LIZIZ() && (baseListFragmentPanel = playerComponentTemp.LJLIL) != null) {
                if (i != 0) {
                    if (i == 2 && (idp = playerComponentTemp.LJLJL) != null) {
                        idp.LJJZZIII();
                    }
                } else if (!playerComponentTemp.LJLLLLLL) {
                    playerComponentTemp.LJZ = false;
                    C2MA curViewHolder2 = baseListFragmentPanel.getCurViewHolder();
                    if (curViewHolder2 != null) {
                        curViewHolder2.j8();
                        if (C79146V4k.LJJJJ(baseListFragmentPanel.getParam().getEventType()) && !BaseListFragmentPanel.isLiveViewHolder(curViewHolder2)) {
                            C56692Kj.LIZ().LIZIZ();
                        }
                    }
                }
                IDP idp2 = playerComponentTemp.LJLJL;
                if (idp2 != null) {
                    idp2.LJJZ(i);
                }
            }
        }
        C2U8.LIZ(new C2QA(i, this.LJLJL.getEventType(), this.LJLJL.getCurrentAweme()));
        this.LJLJL.onPageScrollStateChanged(i);
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        ViewPagerComponentTemp viewPagerComponentTemp = this.LJLJL.viewPagerComponent;
        viewPagerComponentTemp.getClass();
        if (!C2M5.LIZ()) {
            viewPagerComponentTemp.LJLJLJ = null;
            ((AbstractC48820JEa) viewPagerComponentTemp.LJLLL.getValue()).LJIIJ(new AqS41S0001000_1(i, 5));
            C2NL.LIZ.LIZ(ILW.PAGE_SELECT_COMPONENT_TOTAL);
            boolean jl = viewPagerComponentTemp.jl(i);
            e(i, jl);
            Iterator<C2MJ> it = viewPagerComponentTemp.LJLLILLLL.iterator();
            while (it.hasNext()) {
                C2MJ next = it.next();
                next.onPageSelected(i);
                next.e(i, jl);
            }
            ILX ilx = C2NL.LIZ;
            ilx.LJIJI = viewPagerComponentTemp.LJLLILLLL.size();
            ilx.LIZIZ(ILW.PAGE_SELECT_COMPONENT_TOTAL);
        }
    }

    public C58042Po(BaseListFragmentPanel baseListFragmentPanel, C110654Vx c110654Vx) {
        this.LJLJL = baseListFragmentPanel;
        this.LJLJJLL = c110654Vx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x03f2, code lost:
    
        if (X.C58552Rn.LIZ == false) goto L277;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:399:0x0351 -> B:201:0x0352). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 2628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58042Po.LIZIZ(int, boolean):void");
    }

    @Override // X.C2MJ
    public final void e(final int i, final boolean z) {
        C80796VnM c80796VnM;
        if (!C56662Kg.LIZ().LJII("feed_ui_duration_onpageselected")) {
            C56662Kg.LIZ().LIZJ("feed_ui_duration_onpageselected", false);
        }
        if (this.LJLJL.isFirst) {
            LIZ(i);
            LIZJ(i);
        }
        View.OnTouchListener onTouchListener = this.LJLJJLL;
        if (onTouchListener instanceof InterfaceViewOnTouchListenerC58082Ps) {
            ((InterfaceViewOnTouchListenerC58082Ps) onTouchListener).LLIFFJFJJ(this.LJLJL.mAdapter.getItem(i));
        }
        if (FN7.LIZ()) {
            FN7.LIZIZ(new Runnable() { // from class: X.2Pp
                @Override // java.lang.Runnable
                public final void run() {
                    C58042Po c58042Po = C58042Po.this;
                    c58042Po.LIZIZ(i, z);
                    FN7.LIZJ(Boolean.TRUE);
                    c58042Po.LJLJL.isFirst = false;
                }
            });
        } else {
            LIZIZ(i, z);
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("feed_ui_duration_onpageselected")) {
            C56662Kg.LIZ().LJFF("feed_ui_duration_onpageselected", false);
        }
        if (!C56662Kg.LIZ().LJII("feed_ui_duration_onpageselected_finish_to_end")) {
            C56662Kg.LIZ().LIZJ("feed_ui_duration_onpageselected_finish_to_end", false);
        }
        BaseListFragmentPanel baseListFragmentPanel = this.LJLJL;
        if (baseListFragmentPanel.isFirst && (c80796VnM = baseListFragmentPanel.mViewPager) != null && c80796VnM.getChildCount() > 0 && !FN7.LIZ()) {
            this.LJLJL.isFirst = false;
        }
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        BaseListFragmentPanel baseListFragmentPanel;
        boolean z;
        IDP idp;
        ViewPagerComponentTemp viewPagerComponentTemp = this.LJLJL.viewPagerComponent;
        int i3 = this.LJLJJI;
        viewPagerComponentTemp.getClass();
        if (!C2M5.LIZ()) {
            viewPagerComponentTemp.LJLJLJ = null;
            BaseListFragmentPanel baseListFragmentPanel2 = viewPagerComponentTemp.LJLILLLLZI;
            if (baseListFragmentPanel2 != null) {
                if (i3 == 1 && viewPagerComponentTemp.LJLJJI) {
                    VL7.LIZIZ(new ARunnableS37S0100000_1(viewPagerComponentTemp, 110), baseListFragmentPanel2.isFypForSecondFeedExperiment());
                }
                Iterator<C2MJ> it = viewPagerComponentTemp.LJLLILLLL.iterator();
                while (it.hasNext()) {
                    it.next().onPageScrolled(i, f, i2);
                }
            }
        }
        if (this.LJLJL.getFragment().mo49getActivity() == null) {
            return;
        }
        BaseListFragmentPanel baseListFragmentPanel3 = this.LJLJL;
        if (!baseListFragmentPanel3.isFirstScroller) {
            baseListFragmentPanel3.isFirstScroller = true;
            baseListFragmentPanel3.checkDecorViewBackGround(false);
        }
        PlayerComponentTemp playerComponentTemp = this.LJLJL.playerComponent;
        if (playerComponentTemp != null) {
            int i4 = this.LJLJJI;
            if (!C2M3.LIZIZ()) {
                playerComponentTemp.LJZI = f;
                BaseListFragmentPanel baseListFragmentPanel4 = playerComponentTemp.LJLIL;
                if (baseListFragmentPanel4 != null) {
                    int i5 = baseListFragmentPanel4.mCurIndex;
                    if (i != i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    playerComponentTemp.LJLLLLLL = z;
                    if (i4 == 1) {
                        if (i == i5 && f > 0.0f) {
                            IDP idp2 = playerComponentTemp.LJLJL;
                            if (idp2 != null) {
                                idp2.LJJLL(i, true);
                            }
                        } else if (i < i5 && C35704Dzo.LJII() && (idp = playerComponentTemp.LJLJL) != null) {
                            idp.LJJLL(i, false);
                        }
                    }
                }
            }
        }
        BaseListFragmentPanel baseListFragmentPanel5 = this.LJLJL;
        boolean z2 = baseListFragmentPanel5.isFirst;
        this.LJLJJL = z2;
        ViewPagerComponentTemp viewPagerComponentTemp2 = baseListFragmentPanel5.viewPagerComponent;
        viewPagerComponentTemp2.getClass();
        if (!C2M5.LIZ() && z2 && f == 0.0f && i2 == 0) {
            C80796VnM c80796VnM = viewPagerComponentTemp2.LJLIL;
            if (c80796VnM != null) {
                c80796VnM.LLJJIJI.LIZ(i);
            }
            onPageSelected(i);
        }
        if (i2 != 0.0f) {
            this.LJLJI = true;
        }
        if (this.LJLJL.isPageChangeByLatest()) {
            this.LJLJL.setPageChangeByLatest(false);
            return;
        }
        ViewPagerComponentTemp viewPagerComponentTemp3 = this.LJLJL.viewPagerComponent;
        int i6 = this.LJLIL;
        viewPagerComponentTemp3.getClass();
        if (!C2M5.LIZ() && i == i6 && f < 1.0E-10f) {
            J8(i);
            Iterator<C2MJ> it2 = viewPagerComponentTemp3.LJLLILLLL.iterator();
            while (it2.hasNext()) {
                it2.next().J8(i);
            }
        }
        PlayerComponentTemp playerComponentTemp2 = this.LJLJL.playerComponent;
        if (playerComponentTemp2 != null) {
            int i7 = this.LJLJJI;
            if (C2M3.LIZIZ() || (baseListFragmentPanel = playerComponentTemp2.LJLIL) == null) {
                return;
            }
            Aweme item = baseListFragmentPanel.getAdapter().getItem(baseListFragmentPanel.mCurIndex);
            if (C79146V4k.LJJJJ(baseListFragmentPanel.getParam().getEventType()) && item != null && !item.isLive() && !playerComponentTemp2.LJZ && i7 == 1) {
                if (f > 0.5f) {
                    Aweme item2 = baseListFragmentPanel.getAdapter().getItem(i);
                    if (item2 != null && item2.isLive()) {
                        playerComponentTemp2.LJII(baseListFragmentPanel.getPreViewHolder(), item2, false);
                        playerComponentTemp2.LJZ = true;
                    }
                } else {
                    Aweme item3 = baseListFragmentPanel.getAdapter().getItem(i + 1);
                    if (item3 != null && item3.isLive()) {
                        playerComponentTemp2.LJII(baseListFragmentPanel.getNextViewHolder(), item3, false);
                        playerComponentTemp2.LJZ = true;
                    }
                }
            }
            playerComponentTemp2.LJLLI = true;
        }
    }
}

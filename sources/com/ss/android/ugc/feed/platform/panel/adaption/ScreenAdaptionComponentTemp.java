package com.ss.android.ugc.feed.platform.panel.adaption;

import X.AbstractC55082Lja;
import X.C17N;
import X.C221108m2;
import X.C38816FLg;
import X.C3D7;
import X.C55511LqV;
import X.C57092Lx;
import X.C61447O9r;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C72083SQt;
import X.C80796VnM;
import X.InterfaceC61452O9w;
import X.Z9N;
import Y.ARunnableS1S0501000_10;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnAbility;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponentTemp;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerComponentTemp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScreenAdaptionComponentTemp implements IScreenComponentAbility {
    public final BaseListFragmentPanel LJLIL;
    public final View LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public final ViewGroup LJLJJL;
    public final View LJLJJLL;
    public final ViewGroup LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

    public final IScreenComponentAbility LIZ() {
        return (IScreenComponentAbility) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void AH() {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.AH();
                return;
            }
            return;
        }
        this.LJLILLLLZI.getLayoutParams().height = 0;
        this.LJLILLLLZI.requestLayout();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int ZK() {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                return LIZ.ZK();
            }
            return 0;
        }
        return this.LJLJI.getHeight();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void adaptation() {
        Aweme LJJLIIIJJIZ;
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.adaptation();
                return;
            }
            return;
        }
        Aweme aweme = null;
        if (Z9N.LIZIZ.LLL(this.LJLIL.getEventType())) {
            AbstractC55082Lja abstractFeedAdapter = this.LJLIL.getAbstractFeedAdapter();
            if (abstractFeedAdapter != null) {
                aweme = abstractFeedAdapter.getItem(this.LJLIL.mCurIndex);
            }
            if (LIZIZ(aweme) && this.LJLJLJ) {
                return;
            }
        }
        ViewPagerComponentTemp viewPagerComponentTemp = this.LJLIL.viewPagerComponent;
        if (viewPagerComponentTemp != null && viewPagerComponentTemp.getCurViewHolder() != null && (LJJLIIIJJIZ = C72083SQt.LJJLIIIJJIZ(this.LJLIL.viewPagerComponent.getLastFeedViewHolder(true))) != null) {
            C63081OpJ.LLIIII(LJJLIIIJJIZ);
        }
        if (o.LJ(ECommerceMallService.v3(), this.LJLIL.getFragment().getClass())) {
            C17N.LJJIIJZLJL(this.LJLJI);
            C17N.LJJIIJZLJL(this.LJLILLLLZI);
        } else if (!this.LJLIL.isFollowFeed() && !this.LJLIL.isNearbyFeed()) {
            if (this.LJLIL.mAwesomeSplashStatus != 4) {
                this.LJLILLLLZI.setVisibility(8);
                this.LJLJI.setVisibility(8);
            } else {
                View view = this.LJLILLLLZI;
                if (view != null) {
                    view.setVisibility(0);
                    this.LJLILLLLZI.setBackgroundResource(R.color.b5);
                }
                this.LJLJI.setVisibility(0);
            }
        }
        C80796VnM viewPager = this.LJLIL.getViewPager();
        View view2 = this.LJLILLLLZI;
        View view3 = this.LJLJI;
        Activity activity = this.LJLIL.activity;
        InterfaceC61452O9w interfaceC61452O9w = new InterfaceC61452O9w() { // from class: X.3D4
            @Override // X.InterfaceC61452O9w
            public final void onAdapterFinish() {
                C2MA curViewHolder;
                RootCellComponent LJJIII;
                InterfaceC55235Lm3 LJIIZILJ;
                ScreenAdaptionComponentTemp.this.LJLIL.onAdapterFinish();
                C224238r5.LJIILLIIL(ScreenAdaptionComponentTemp.this.LJLIL.getViewPager());
                ScreenAdaptionComponentTemp screenAdaptionComponentTemp = ScreenAdaptionComponentTemp.this;
                screenAdaptionComponentTemp.LJLJLJ = true;
                if (Z9N.LIZIZ.LLL(screenAdaptionComponentTemp.LJLIL.getEventType())) {
                    ScreenAdaptionComponentTemp screenAdaptionComponentTemp2 = ScreenAdaptionComponentTemp.this;
                    screenAdaptionComponentTemp2.LJLIL.postDelayed(new ARunnableS37S0100000_1(screenAdaptionComponentTemp2, 52), 0L);
                }
                ScreenAdaptionComponentTemp screenAdaptionComponentTemp3 = ScreenAdaptionComponentTemp.this;
                if (screenAdaptionComponentTemp3.LJLIL.mAwesomeSplashStatus != 4) {
                    int i = C61447O9r.LJIILIIL;
                    if (i > 0) {
                        BaseListFragmentPanel.setLayoutHeight(screenAdaptionComponentTemp3.LJLJJI, i);
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponentTemp.this.LJLJJL, -2);
                    } else {
                        BaseListFragmentPanel.setLayoutHeight(screenAdaptionComponentTemp3.LJLJJL, 0);
                    }
                    int i2 = C61447O9r.LJIILJJIL;
                    if (i2 > 0) {
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponentTemp.this.LJLJJLL, i2);
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponentTemp.this.LJLJL, -2);
                    } else {
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponentTemp.this.LJLJL, 0);
                    }
                } else {
                    BaseListFragmentPanel.setLayoutHeight(screenAdaptionComponentTemp3.LJLJJL, 0);
                    BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponentTemp.this.LJLJL, 0);
                }
                FeedAdServiceImpl.LJJIJLIJ().LJIIJJI();
                C59198NLe.LJIIIIZZ(KL2.LJIIJJI(EF7.LIZIZ()), ScreenAdaptionComponentTemp.this.LJLIL.getViewPager().getHeight());
                LKF splitContainer = ScreenAdaptionComponentTemp.this.LJLIL.getSplitContainer();
                if (splitContainer != null) {
                    C61447O9r c61447O9r = C57092Lx.LIZ;
                    c61447O9r.getClass();
                    C3D9 c3d9 = c61447O9r.LJ;
                    splitContainer.LJIIIIZZ(c3d9.LIZ, c3d9.LIZIZ);
                }
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) ScreenAdaptionComponentTemp.this.LJLL.getValue();
                if (iViewPagerComponentAbility != null && (curViewHolder = iViewPagerComponentAbility.getCurViewHolder()) != null && (LJJIII = C86793Y4n.LJJIII(curViewHolder)) != null && (LJIIZILJ = C55096Ljo.LJIIZILJ(LJJIII)) != null) {
                    VideoShrinkAbility videoShrinkAbility = (VideoShrinkAbility) C55096Ljo.LIZ(LJIIZILJ, VideoShrinkAbility.class, null);
                    if (videoShrinkAbility != null) {
                        videoShrinkAbility.q8();
                    }
                    TopWarnAbility topWarnAbility = (TopWarnAbility) C55096Ljo.LIZ(LJIIZILJ, TopWarnAbility.class, null);
                    if (topWarnAbility != null) {
                        topWarnAbility.q8();
                    }
                }
            }

            @Override // X.InterfaceC61452O9w
            public final void onAdapterStart() {
                ScreenAdaptionComponentTemp.this.LJLIL.onAdapterStart();
            }
        };
        C57092Lx.LIZ.getClass();
        C38816FLg.LJ(new ARunnableS1S0501000_10(C61447O9r.LJIIJJI, activity, view3, view2, viewPager, interfaceC61452O9w, 1));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void d40() {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.d40();
                return;
            }
            return;
        }
        this.LJLJI.setVisibility(8);
        this.LJLJI.getLayoutParams().height = 0;
        this.LJLILLLLZI.getLayoutParams().height = 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final boolean ff() {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ == null) {
                return false;
            }
            return LIZ.ff();
        }
        if (this.LJLJI.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void gj() {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.gj();
                return;
            }
            return;
        }
        this.LJLILLLLZI.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void q30() {
        int i;
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.q30();
                return;
            }
            return;
        }
        this.LJLILLLLZI.setVisibility(0);
        if (!this.LJLIL.isFollowFeed() || (i = C61447O9r.LJIILIIL) <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2.height == i) {
            return;
        }
        layoutParams2.height = i;
        this.LJLILLLLZI.setLayoutParams(layoutParams2);
    }

    public final boolean LIZIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 101) {
            z = true;
        } else {
            z = false;
        }
        if (aweme.getAwemeType() == 4000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void PJ(int i) {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.PJ(i);
                return;
            }
            return;
        }
        C55511LqV.LJIIJJI(i, this.LJLJJL, this.LJLJL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void vU(int i) {
        if (C3D7.LIZ()) {
            IScreenComponentAbility LIZ = LIZ();
            if (LIZ != null) {
                LIZ.vU(i);
                return;
            }
            return;
        }
        this.LJLJI.getLayoutParams().height = i;
        this.LJLJI.requestLayout();
    }

    public ScreenAdaptionComponentTemp(BaseListFragmentPanel panel, View topSpace, View bottomSpace, View topFakeAdaptation, ViewGroup topFakeAdaptationContainer, View bottomFakeAdaptation, ViewGroup bottomFakeAdaptationContainer) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(topSpace, "topSpace");
        o.LJIIIZ(bottomSpace, "bottomSpace");
        o.LJIIIZ(topFakeAdaptation, "topFakeAdaptation");
        o.LJIIIZ(topFakeAdaptationContainer, "topFakeAdaptationContainer");
        o.LJIIIZ(bottomFakeAdaptation, "bottomFakeAdaptation");
        o.LJIIIZ(bottomFakeAdaptationContainer, "bottomFakeAdaptationContainer");
        this.LJLIL = panel;
        this.LJLILLLLZI = topSpace;
        this.LJLJI = bottomSpace;
        this.LJLJJI = topFakeAdaptation;
        this.LJLJJL = topFakeAdaptationContainer;
        this.LJLJJLL = bottomFakeAdaptation;
        this.LJLJL = bottomFakeAdaptationContainer;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 732));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 733));
    }
}

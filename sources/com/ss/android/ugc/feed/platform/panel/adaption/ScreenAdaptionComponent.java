package com.ss.android.ugc.feed.platform.panel.adaption;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2MA;
import X.C2MH;
import X.C38816FLg;
import X.C51781KTx;
import X.C55511LqV;
import X.C57092Lx;
import X.C5H3;
import X.C61447O9r;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C72083SQt;
import X.C80796VnM;
import X.EnumC221088m0;
import X.InterfaceC55102Lju;
import X.InterfaceC61452O9w;
import X.JAK;
import X.KR6;
import X.KU4;
import X.M89;
import X.Z9N;
import Y.ARunnableS1S0501000_10;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnAbility;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ScreenAdaptionComponent extends BasePanelUIComponent implements KR6, IScreenComponentAbility, InterfaceC55102Lju {
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ViewGroup LJLJL;
    public View LJLJLJ;
    public ViewGroup LJLJLLL;
    public boolean LJLL;
    public final C5H3 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // X.KR6
    public final void LJLLILLLL() {
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLJLLL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // X.InterfaceC55102Lju
    public C2K0 provideAbility(String str) {
        if (str.hashCode() != 1570964940) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenAdaptionComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        C16880lQ.LJLLJ(ScreenAdaptionComponent.class);
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 730), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 2));
        }
        this.LJLLI = c62822Ol8;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 731));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void AH() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLJJI;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = 0;
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final int ZK() {
        View view = this.LJLJJL;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void adaptation() {
        String str;
        IViewPagerComponentAbility viewPagerComponentAbility;
        IViewPagerComponentAbility viewPagerComponentAbility2;
        C2MA c2ma;
        IViewPagerComponentAbility viewPagerComponentAbility3;
        Aweme aweme;
        AbstractC55082Lja abstractFeedAdapter;
        Z9N z9n = Z9N.LIZIZ;
        M89 m89 = getPanelContext().LIZJ;
        C80796VnM c80796VnM = null;
        if (m89 != null) {
            str = m89.getEventType();
        } else {
            str = null;
        }
        if (z9n.LLL(str)) {
            IFeedPanelPlatformAbility v3 = v3();
            if (v3 != null && (abstractFeedAdapter = v3.getAbstractFeedAdapter()) != null) {
                aweme = abstractFeedAdapter.getItem(v3.getCurrentIndex());
            } else {
                aweme = null;
            }
            if (A3(aweme) && this.LJLL) {
                return;
            }
        }
        IFeedPanelPlatformAbility v32 = v3();
        if (v32 != null && (viewPagerComponentAbility2 = v32.getViewPagerComponentAbility()) != null && viewPagerComponentAbility2.getCurViewHolder() != null) {
            IFeedPanelPlatformAbility v33 = v3();
            if (v33 != null && (viewPagerComponentAbility3 = v33.getViewPagerComponentAbility()) != null) {
                c2ma = viewPagerComponentAbility3.getLastFeedViewHolder(true);
            } else {
                c2ma = null;
            }
            Aweme LJJLIIIJJIZ = C72083SQt.LJJLIIIJJIZ(c2ma);
            if (LJJLIIIJJIZ != null) {
                C63081OpJ.LLIIII(LJJLIIIJJIZ);
            }
        }
        x3();
        IFeedPanelPlatformAbility v34 = v3();
        if (v34 != null && (viewPagerComponentAbility = v34.getViewPagerComponentAbility()) != null) {
            c80796VnM = viewPagerComponentAbility.zq0();
        }
        View view = this.LJLJJI;
        View view2 = this.LJLJJL;
        ActivityC45651qj LIZ = getPanelContext().LIZ();
        InterfaceC61452O9w interfaceC61452O9w = new InterfaceC61452O9w() { // from class: X.3D6
            @Override // X.InterfaceC61452O9w
            public final void onAdapterFinish() {
                C80796VnM c80796VnM2;
                String str2;
                C2MA curViewHolder;
                RootCellComponent LJJIII;
                InterfaceC55235Lm3 LJIIZILJ;
                LKF splitContainer;
                IViewPagerComponentAbility viewPagerComponentAbility4;
                IFeedPanelPlatformAbility v35;
                IViewPagerComponentAbility viewPagerComponentAbility5;
                IViewPagerComponentAbility viewPagerComponentAbility6;
                IFeedPanelPlatformAbility v36 = ScreenAdaptionComponent.this.v3();
                if (v36 != null) {
                    v36.onAdapterFinish();
                }
                IFeedPanelPlatformAbility v37 = ScreenAdaptionComponent.this.v3();
                if (v37 != null && (viewPagerComponentAbility6 = v37.getViewPagerComponentAbility()) != null) {
                    c80796VnM2 = viewPagerComponentAbility6.zq0();
                } else {
                    c80796VnM2 = null;
                }
                if (!(c80796VnM2 instanceof C80796VnM)) {
                    c80796VnM2 = null;
                }
                C224238r5.LJIILLIIL(c80796VnM2);
                ScreenAdaptionComponent screenAdaptionComponent = ScreenAdaptionComponent.this;
                screenAdaptionComponent.LJLL = true;
                Z9N z9n2 = Z9N.LIZIZ;
                M89 m892 = screenAdaptionComponent.getPanelContext().LIZJ;
                if (m892 != null) {
                    str2 = m892.getEventType();
                } else {
                    str2 = null;
                }
                if (z9n2.LLL(str2) && (v35 = ScreenAdaptionComponent.this.v3()) != null && (viewPagerComponentAbility5 = v35.getViewPagerComponentAbility()) != null) {
                    viewPagerComponentAbility5.postDelayed(new ARunnableS37S0100000_1(ScreenAdaptionComponent.this, 51), 0L);
                }
                IFeedPanelPlatformAbility v38 = ScreenAdaptionComponent.this.v3();
                int i = 0;
                if (v38 != null && v38.getAwesomeSplashStatus() == 4) {
                    BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJL, 0);
                    BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJLLL, 0);
                } else {
                    int i2 = C61447O9r.LJIILIIL;
                    if (i2 > 0) {
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJJLL, i2);
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJL, -2);
                    } else {
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJL, 0);
                    }
                    int i3 = C61447O9r.LJIILJJIL;
                    if (i3 > 0) {
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJLJ, i3);
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJLLL, -2);
                    } else {
                        BaseListFragmentPanel.setLayoutHeight(ScreenAdaptionComponent.this.LJLJLLL, 0);
                    }
                }
                FeedAdServiceImpl.LJJIJLIJ().LJIIJJI();
                int LJIIJJI = KL2.LJIIJJI(EF7.LIZIZ());
                IFeedPanelPlatformAbility v39 = ScreenAdaptionComponent.this.v3();
                if (v39 != null && (viewPagerComponentAbility4 = v39.getViewPagerComponentAbility()) != null) {
                    i = viewPagerComponentAbility4.getHeight();
                }
                C59198NLe.LJIIIIZZ(LJIIJJI, i);
                IFeedPanelPlatformAbility v310 = ScreenAdaptionComponent.this.v3();
                if (v310 != null && (splitContainer = v310.getSplitContainer()) != null) {
                    C61447O9r c61447O9r = C57092Lx.LIZ;
                    c61447O9r.getClass();
                    C3D9 c3d9 = c61447O9r.LJ;
                    splitContainer.LJIIIIZZ(c3d9.LIZ, c3d9.LIZIZ);
                }
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) ScreenAdaptionComponent.this.LJLLILLLL.getValue();
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
                IFeedPanelPlatformAbility v35 = ScreenAdaptionComponent.this.v3();
                if (v35 != null) {
                    v35.onAdapterStart();
                }
            }
        };
        C57092Lx.LIZ.getClass();
        C38816FLg.LJ(new ARunnableS1S0501000_10(C61447O9r.LJIIJJI, LIZ, view2, view, c80796VnM, interfaceC61452O9w, 1));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void d40() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLJJL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLJJL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view2 != null) {
            layoutParams2 = view2.getLayoutParams();
        }
        if (layoutParams2 != null) {
            layoutParams2.height = 0;
        }
        View view3 = this.LJLJJI;
        if (view3 == null || (layoutParams = view3.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final boolean ff() {
        View view = this.LJLJJL;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void gj() {
        View view = this.LJLJJI;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public void q30() {
        View view = this.LJLJJI;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final IFeedPanelPlatformAbility v3() {
        return (IFeedPanelPlatformAbility) this.LJLLI.getValue();
    }

    public void x3() {
        IFeedPanelPlatformAbility v3 = v3();
        if (v3 != null && v3.getAwesomeSplashStatus() == 4) {
            View view = this.LJLJJI;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.LJLJJI;
                if (view2 != null) {
                    view2.setBackgroundResource(R.color.b5);
                }
            }
            View view3 = this.LJLJJL;
            if (view3 == null) {
                return;
            }
            view3.setVisibility(0);
            return;
        }
        View view4 = this.LJLJJI;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.LJLJJL;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(8);
    }

    public final boolean A3(Aweme aweme) {
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

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void PJ(int i) {
        C55511LqV.LJIIJJI(i, this.LJLJL, this.LJLJLLL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void vU(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLJJL;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        View view2;
        View view3;
        View view4;
        View view5;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        if (view != null) {
            view2 = view.findViewById(R.id.lgd);
        } else {
            view2 = null;
        }
        this.LJLJJI = view2;
        if (view != null) {
            view3 = view.findViewById(R.id.arj);
        } else {
            view3 = null;
        }
        this.LJLJJL = view3;
        if (view != null) {
            view4 = view.findViewById(R.id.leq);
        } else {
            view4 = null;
        }
        this.LJLJJLL = view4;
        if (view != null) {
            view5 = view.findViewById(R.id.app);
        } else {
            view5 = null;
        }
        this.LJLJLJ = view5;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.ler);
        } else {
            viewGroup = null;
        }
        this.LJLJL = viewGroup;
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.apq);
        }
        this.LJLJLLL = viewGroup2;
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }
}

package com.ss.android.ugc.feed.platform.panel.pagestate;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C252569vg;
import X.C25678A5y;
import X.C2K0;
import X.C2MH;
import X.C36922EeM;
import X.C37179EiV;
import X.C56509MFt;
import X.C5S1;
import X.C62822Ol8;
import X.C73305Spp;
import X.InterfaceC55102Lju;
import X.KR6;
import X.KRA;
import X.KUR;
import X.MG5;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class PageStateCommonComponent extends BasePanelUIComponent implements KR6, IPageStateAbility, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLJLJ = 0;
    public KUR LJLJJI;
    public boolean LJLJJL;
    public C73305Spp LJLJJLL;
    public final C62822Ol8 LJLJL;

    public void A3() {
    }

    public void Ic0(Exception exc) {
    }

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

    public C2K0 provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    public KUR v3() {
        return null;
    }

    public PageStateCommonComponent() {
        new LinkedHashMap();
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 914));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Gc() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Aa() {
        Context context;
        KUR kp0 = kp0();
        if (kp0 != null) {
            try {
                kp0.setVisibility(0);
                kp0.LJIIIIZZ();
            } catch (RuntimeException e) {
                C36922EeM.LIZ(e);
                Fragment fragment = getPanelContext().LJ;
                if (fragment != null) {
                    context = fragment.getContext();
                } else {
                    context = null;
                }
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public void NV() {
        KUR kp0 = kp0();
        if (kp0 != null) {
            kp0.setVisibility(0);
            kp0.LJII();
        } else {
            Ic0(null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Zs() {
        KUR kp0 = kp0();
        if (kp0 != null) {
            kp0.setVisibility(0);
            kp0.LJII();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void hideStatusView() {
        C73305Spp c73305Spp;
        KUR kp0 = kp0();
        if (kp0 != null) {
            kp0.setVisibility(8);
        }
        if (!C56509MFt.LJIIJ(getPanelContext()) || (c73305Spp = this.LJLJJLL) == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final KUR kp0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        KRA panelContext = getPanelContext();
        if (panelContext != null) {
            str = panelContext.LIZ;
        } else {
            str = null;
        }
        if (!o.LJ(str, "Following")) {
            if (panelContext != null) {
                str2 = panelContext.LIZ;
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, "Nearby")) {
                if (panelContext != null) {
                    str3 = panelContext.LIZ;
                } else {
                    str3 = null;
                }
                if (!o.LJ(str3, "Popular")) {
                    if (panelContext != null) {
                        str4 = panelContext.LIZ;
                    } else {
                        str4 = null;
                    }
                    if (!o.LJ(str4, "For You")) {
                        if (panelContext != null) {
                            str5 = panelContext.LIZ;
                        } else {
                            str5 = null;
                        }
                        if (!o.LJ(str5, "Friends")) {
                            if (panelContext != null) {
                                str6 = panelContext.LIZ;
                            } else {
                                str6 = null;
                            }
                            if (!o.LJ(str6, "Topic")) {
                                if (panelContext != null) {
                                    str7 = panelContext.LIZ;
                                } else {
                                    str7 = null;
                                }
                                if (!o.LJ(str7, "Stem")) {
                                    if (panelContext != null) {
                                        str8 = panelContext.LIZ;
                                    } else {
                                        str8 = null;
                                    }
                                    if (o.LJ(str8, "Live") || !C56509MFt.LJII(getPanelContext())) {
                                        return null;
                                    }
                                    return v3();
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void lR() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            KUR kur = this.LJLJJI;
            if (kur != null) {
                kur.setVisibility(8);
            }
            C73305Spp c73305Spp = this.LJLJJLL;
            if (c73305Spp == null) {
                return;
            }
            c73305Spp.setVisibility(8);
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS40S0100000_4(this, 82));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final C73305Spp IK() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final boolean A9(boolean z) {
        KUR kp0 = kp0();
        if (kp0 == null) {
            return false;
        }
        kp0.LJI();
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void A90(boolean z) {
        KUR kp0 = kp0();
        if (kp0 != null) {
            kp0.setVisibility(0);
            kp0.LJIIIZ();
        } else {
            A3();
        }
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Nk0(boolean z) {
        this.LJLJJL = z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void fk(Exception exc) {
        Context context;
        KUR kp0 = kp0();
        if (kp0 != null) {
            try {
                kp0.setVisibility(0);
                kp0.LJIIIIZZ();
                return;
            } catch (RuntimeException e) {
                C36922EeM.LIZ(e);
                Fragment fragment = getPanelContext().LJ;
                if (fragment != null) {
                    context = fragment.getContext();
                } else {
                    context = null;
                }
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
                return;
            }
        }
        Ic0(exc);
    }

    @Override // X.KR6
    public void LJJJJI(View view, Bundle bundle) {
        C73305Spp c73305Spp;
        C73305Spp c73305Spp2 = null;
        if (view != null) {
            c73305Spp = (C73305Spp) view.findViewById(this.contentLayoutId);
        } else {
            c73305Spp = null;
        }
        if (c73305Spp instanceof C73305Spp) {
            c73305Spp2 = c73305Spp;
        }
        this.LJLJJLL = c73305Spp2;
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }

    public final void x3(MG5 sceneName, Exception exc) {
        ActivityC45651qj mo49getActivity;
        ILoadMoreAbility PZ;
        IRefreshAbility YE;
        ActivityC45651qj mo49getActivity2;
        Window window;
        o.LJIIIZ(sceneName, "sceneName");
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (mo49getActivity2 = fragment.mo49getActivity()) != null && (window = mo49getActivity2.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.b5);
        }
        if (this.LJLJJLL == null) {
            return;
        }
        Fragment fragment2 = getPanelContext().LJ;
        IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LJLJL.getValue();
        if (iFeedFragmentAbility != null && (YE = iFeedFragmentAbility.YE()) != null) {
            YE.setRefreshing(false);
        }
        IFeedFragmentAbility iFeedFragmentAbility2 = (IFeedFragmentAbility) this.LJLJL.getValue();
        if (iFeedFragmentAbility2 != null && (PZ = iFeedFragmentAbility2.PZ()) != null) {
            PZ.resetLoadMoreState();
        }
        if (this.LJLJJL) {
            return;
        }
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            C252569vg.LIZIZ(c73305Spp, sceneName, exc, new AqS151S0200000_4(fragment2, this, 21));
        }
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
        }
        if (fragment2 != null && (mo49getActivity = fragment2.mo49getActivity()) != null) {
            C25678A5y.LIZIZ(mo49getActivity, sceneName, exc, this.LJLJJLL);
        }
    }
}

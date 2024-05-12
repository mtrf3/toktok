package com.ss.android.ugc.aweme.main.assems.ui;

import X.A2U;
import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C0C3;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C35230DsA;
import X.C36093EEn;
import X.C3SZ;
import X.C52187Kdz;
import X.C52482Kik;
import X.C52677Klt;
import X.C53314KwA;
import X.C53765L8f;
import X.C54165LNp;
import X.C54204LPc;
import X.C54295LSp;
import X.C54297LSr;
import X.C54846Lfm;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C84193Sd;
import X.EE1;
import X.InterfaceC54132LMi;
import X.InterfaceC54203LPb;
import X.InterfaceC54205LPd;
import X.InterfaceC54281LSb;
import X.InterfaceC55102Lju;
import X.LGT;
import X.LNH;
import X.LNZ;
import X.LPJ;
import X.LPK;
import X.LPL;
import X.LPM;
import X.LPN;
import X.LPO;
import X.LPP;
import X.LPW;
import X.OSJ;
import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.feed.slide.guide.MainPageSlideImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class HomepageViewPagerAssem extends BaseMainContainerUIAssem implements InterfaceC54205LPd, HomePageViewPagerAbility, InterfaceC54203LPb, InterfaceC55102Lju {
    public C54204LPc LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public LPJ LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1953082163) {
            return null;
        }
        return this;
    }

    public HomepageViewPagerAssem() {
        new LinkedHashMap();
        this.LJLJJL = true;
        C221108m2.LIZIZ(LPM.LJLIL);
        C221108m2.LIZIZ(LPN.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 321));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 322));
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void LF() {
        C54204LPc c54204LPc = this.LJLIL;
        if (c54204LPc != null) {
            c54204LPc.setFlingEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void Xx() {
        C54204LPc c54204LPc = this.LJLIL;
        if (c54204LPc != null) {
            c54204LPc.setFlingEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final boolean isScrollSwitchHelperInit() {
        if (this.LJLJJI != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void de() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        C84193Sd.LIZ(LIZ).E50("page_profile", false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final LPJ Wv() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final float gU() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void LJJJJZ(boolean z) {
        C54204LPc c54204LPc = this.LJLIL;
        if (c54204LPc != null) {
            c54204LPc.LLJLLL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void Nf0(boolean z) {
        C54204LPc c54204LPc = this.LJLIL;
        if (c54204LPc != null) {
            c54204LPc.setEnableDispatchTouchEventCheck(z);
        }
    }

    @Override // X.InterfaceC54205LPd
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        HomeViewPagerAbility homeViewPagerAbility;
        if (motionEvent != null && C52482Kik.LIZ()) {
            int action = motionEvent.getAction();
            boolean z = true;
            if (action != 0) {
                if ((action != 1 && action != 3) || (homeViewPagerAbility = (HomeViewPagerAbility) this.LJLJLJ.getValue()) == null) {
                    return;
                }
                homeViewPagerAbility.LJJJJZ(this.LJLJJL);
                return;
            }
            HomeViewPagerAbility homeViewPagerAbility2 = (HomeViewPagerAbility) this.LJLJLJ.getValue();
            if (homeViewPagerAbility2 == null || !homeViewPagerAbility2.V0()) {
                z = false;
            }
            this.LJLJJL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void ii(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        C54204LPc c54204LPc = this.LJLIL;
        if (c54204LPc != null) {
            c54204LPc.LJFF(listener);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void ku(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        C54204LPc c54204LPc = this.LJLIL;
        if (c54204LPc != null) {
            c54204LPc.LJJIIJ(listener);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void l7(String aid) {
        o.LJIIIZ(aid, "aid");
        LPJ lpj = this.LJLJJI;
        if (lpj != null) {
            lpj.l7(aid);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        AbstractC53895LDf abstractC53895LDf;
        Class cls;
        o.LJIIIZ(view, "view");
        C54204LPc c54204LPc = (C54204LPc) view;
        c54204LPc.getOnInterceptTouchEventListeners().add(this);
        c54204LPc.getOnActionDownListeners().add(this);
        this.LJLIL = c54204LPc;
        C56662Kg.LIZ().LIZJ("method_main_init_pager_duration", false);
        final ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            if (!((Boolean) C35230DsA.LIZ.getValue()).booleanValue()) {
                Hox LIZ2 = Hox.LJLLI.LIZ(LIZ);
                C36093EEn c36093EEn = C36093EEn.LIZ;
                EE1 LIZ3 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getMainTaskHolder().LIZ(LIZ2);
                c36093EEn.getClass();
                C36093EEn.LJ(LIZ3);
            }
            C54295LSp c54295LSp = new C54295LSp();
            Hox LIZ4 = Hox.LJLLI.LIZ(LIZ);
            Class<?> pv0 = LIZ4.pv0("page_feed");
            Class<?> pv02 = LIZ4.pv0("page_profile");
            if (pv0 == null || pv02 == null) {
                try {
                    HomePageUIFrameService LIZ5 = HomePageUIFrameServiceImpl.LIZ();
                    pv0 = LIZ5.getFragmentClass("page_feed");
                    pv02 = LIZ5.getFragmentClass("page_profile");
                } catch (Throwable unused) {
                }
            }
            if (!C53765L8f.LJIJ() || (abstractC53895LDf = LGT.LIZ) == null) {
                i = 0;
            } else {
                OSJ osj = new OSJ(abstractC53895LDf.LJIIJ(), abstractC53895LDf.tag(), abstractC53895LDf.LJIIIZ());
                Object first = osj.getFirst();
                if (first instanceof Class) {
                    cls = (Class) first;
                } else {
                    cls = null;
                }
                c54295LSp.LIZIZ(cls, (String) osj.getSecond(), 0, (Bundle) osj.getThird());
                i = 1;
            }
            if (!(pv0 instanceof Class)) {
                pv0 = null;
            }
            int i2 = i + 1;
            c54295LSp.LIZIZ(pv0, "page_feed", i, null);
            if (!(pv02 instanceof Class)) {
                pv02 = null;
            }
            c54295LSp.LIZIZ(pv02, "page_profile", i2, null);
            c54295LSp.LIZIZ = new InterfaceC54281LSb() { // from class: X.7xW
                @Override // X.InterfaceC54281LSb
                public final void LIZ() {
                }

                @Override // X.InterfaceC54281LSb
                public final void LIZIZ(HashMap<Integer, CommonPageFragment> fragments) {
                    o.LJIIIZ(fragments, "fragments");
                    ScrollSwitchStateManager LIZ6 = C84193Sd.LIZ(ActivityC45651qj.this);
                    LIZ6.getClass();
                    LIZ6.LJLJI.setValue(fragments);
                }

                @Override // X.InterfaceC54281LSb
                public final void LIZJ(List<C54296LSq> mainPages) {
                    o.LJIIIZ(mainPages, "mainPages");
                    ScrollSwitchStateManager LIZ6 = C84193Sd.LIZ(ActivityC45651qj.this);
                    LIZ6.getClass();
                    LIZ6.LJLILLLLZI.setValue(mainPages);
                }
            };
            C54297LSr LIZJ = c54295LSp.LIZJ(LIZ.getSupportFragmentManager());
            C54204LPc c54204LPc2 = this.LJLIL;
            if (c54204LPc2 != null) {
                c54204LPc2.setOffscreenPageLimit(2);
                c54204LPc2.setAdapter(LIZJ);
            }
            LIZJ.notifyDataSetChanged();
            if (c54204LPc2 != null) {
                c54204LPc2.setDescendantFocusability(131072);
                c54204LPc2.setFocusable(true);
                c54204LPc2.setFocusableInTouchMode(true);
            }
            if (1 != ((Number) C52677Klt.LIZ.getValue()).intValue() && c54204LPc2 != null) {
                c54204LPc2.setOnTouchListener(A2U.LJLIL);
            }
            if (LPO.LIZ() && c54204LPc2 != null) {
                c54204LPc2.setDragMotionEventListener(new C54846Lfm());
            }
            ScrollSwitchStateManager LIZ6 = C84193Sd.LIZ(LIZ);
            InterfaceC54132LMi homeTabViewModel = LNZ.LIZIZ.getHomeTabViewModel(LIZ);
            if (c54204LPc2 != null) {
                c54204LPc2.LJFF(new LPW(this, LIZ, LIZ6, homeTabViewModel));
            }
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "RootNode");
            Hox.LJLLI.LIZ(LIZ).Cv0(bundle, "page_feed");
            if (c54204LPc2 != null) {
                c54204LPc2.setOnFlingEndListener(new LPK(LIZ));
            }
            ScrollSwitchStateManager LIZ7 = C84193Sd.LIZ(LIZ);
            C54204LPc c54204LPc3 = this.LJLIL;
            LIZ7.LJLIL.setBridge(new LPL(c54204LPc3));
            LIZ7.LJLJJI.observe(LIZ, new AObserverS77S0100000_9(c54204LPc3, 147));
            LIZ7.LJLJJL.observe(LIZ, new AObserverS77S0100000_9(c54204LPc3, 148));
            LIZ7.LJLLL.observe(LIZ, new AObserverS73S0200000_9(LIZ, c54204LPc3, 10));
            LNH.LIZ(LIZ, LIZ, new C54165LNp(LIZ7));
            this.LJLJJI = new LPJ(LIZ, c54204LPc2, LIZJ);
            C56662Kg.LIZ().LJFF("method_main_init_pager_duration", false);
            ActivityC45651qj LIZ8 = C212428Vi.LIZ(this);
            if (LIZ8 == null) {
                return;
            }
            HomePageDataViewModel LIZ9 = C3SZ.LIZ(LIZ8);
            ScrollSwitchStateManager LIZ10 = C84193Sd.LIZ(LIZ8);
            LIZ9.hv0("homepage_hot");
            if (C52187Kdz.LIZ && LIZ10.nv0("page_feed") != 0) {
                LIZ10.LJZ = true;
            }
            LIZ10.E50("page_feed", false);
            LIZ10.rv0(LIZ8, new AObserverS73S0200000_9(LIZ10, LIZ9, 11));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final String zb0(int i) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return null;
        }
        return C84193Sd.LIZ(LIZ).mv0(i);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void J1(Aweme aweme, String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        LPJ lpj = this.LJLJJI;
        if (lpj != null) {
            lpj.J1(aweme, enterMethod);
        } else {
            "use helper before init".toString();
            throw new IllegalArgumentException("use helper before init");
        }
    }

    @Override // X.InterfaceC54203LPb
    public final void LLZIL(float f, float f2) {
        this.LJLJJLL = f;
        this.LJLJL = 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final boolean toFeedPage(Boolean bool, boolean z) {
        LPJ lpj = this.LJLJJI;
        if (lpj != null) {
            return lpj.LIZLLL(bool, z);
        }
        "use helper before init".toString();
        throw new IllegalArgumentException("use helper before init");
    }

    @Override // X.InterfaceC54205LPd
    public final boolean LLIILII(MotionEvent event, float f, float f2) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 2) {
            this.LJLJL = event.getX() - this.LJLJJLL;
        }
        return gG(event, f, f2);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final boolean gG(MotionEvent event, float f, float f2) {
        LPP lpp;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        if (!C53314KwA.LIZ()) {
            return false;
        }
        if (C52482Kik.LIZ() && (lpp = (LPP) this.LJLJLLL.getValue()) != null && lpp.cU(event, f, f2)) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                aweme = C3SZ.LIZ(LIZ).LJLJLLL;
            } else {
                aweme = null;
            }
            if (!MainPageSlideImpl.LIZIZ().LIZ(aweme).LIZ || (aweme != null && C63081OpJ.LJZL(aweme))) {
                HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJLJLJ.getValue();
                if (homeViewPagerAbility != null) {
                    homeViewPagerAbility.LJJJJZ(false);
                }
                return false;
            }
        }
        LPP lpp2 = (LPP) this.LJLJLLL.getValue();
        if (lpp2 == null || !lpp2.cU(event, f, f2)) {
            return false;
        }
        return true;
    }
}

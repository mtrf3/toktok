package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C0C3;
import X.C188787b0;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C2L0;
import X.C2NH;
import X.C2U8;
import X.C35048DpE;
import X.C35356DuC;
import X.C35359DuF;
import X.C36093EEn;
import X.C38986FRu;
import X.C40380Ft2;
import X.C40384Ft6;
import X.C52307Kfv;
import X.C52309Kfx;
import X.C52482Kik;
import X.C53314KwA;
import X.C54075LKd;
import X.C54155LNf;
import X.C54158LNi;
import X.C54162LNm;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56672Kh;
import X.C60392Yp;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C73040SlY;
import X.C80769Vmv;
import X.C84193Sd;
import X.C8DO;
import X.C8W0;
import X.HG3;
import X.IKL;
import X.InterfaceC225058sP;
import X.InterfaceC36571c5;
import X.InterfaceC54080LKi;
import X.InterfaceC54151LNb;
import X.InterfaceC54156LNg;
import X.InterfaceC54157LNh;
import X.InterfaceC54159LNj;
import X.InterfaceC54184LOi;
import X.InterfaceC55058LjC;
import X.InterfaceC55102Lju;
import X.L9M;
import X.LLW;
import X.LNJ;
import X.LNZ;
import X.LOD;
import X.LOS;
import X.LPU;
import X.LQM;
import X.LXS;
import X.LXU;
import X.OSZ;
import X.QD3;
import X.RBX;
import X.X1D;
import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.IDiS268S0100000_4;
import Y.IDiS271S0100000_9;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes10.dex */
public final class HomeViewPagerAssem extends UIContentAssem implements HomeViewPagerAbility, L9M, InterfaceC55102Lju {
    public InterfaceC54157LNh LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public View LJLJJL;
    public final List<C0C3> LJLJJLL;
    public final List<Observer<LNJ>> LJLJL;
    public ScrollSwitchStateManager LJLJLJ;
    public Hox LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public int LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2002560905) {
            return null;
        }
        return this;
    }

    public HomeViewPagerAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 288));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 286));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 287));
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new ArrayList();
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 285));
        this.LJLLI = C221108m2.LIZIZ(C54158LNi.LJLIL);
        this.LJLLILLLL = 1;
    }

    public final ITabStrip A3() {
        return (ITabStrip) this.LJLJJI.getValue();
    }

    public final C80769Vmv C3() {
        Object obj = this.LJLIL;
        if (obj instanceof C80769Vmv) {
            return (C80769Vmv) obj;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int Eh() {
        InterfaceC54156LNg x3;
        InterfaceC54157LNh interfaceC54157LNh = this.LJLIL;
        if (interfaceC54157LNh == null || (x3 = x3()) == null) {
            return -1;
        }
        return x3.getPageType(interfaceC54157LNh.getCurrentItemCompat());
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final Integer LLILL() {
        InterfaceC54157LNh interfaceC54157LNh = this.LJLIL;
        if (interfaceC54157LNh != null) {
            return Integer.valueOf(interfaceC54157LNh.getCurrentItemCompat());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean V0() {
        InterfaceC54157LNh interfaceC54157LNh = this.LJLIL;
        if (interfaceC54157LNh == null || !interfaceC54157LNh.V0()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean hs0() {
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    public final HomePageDataViewModel v3() {
        return (HomePageDataViewModel) this.LJLL.getValue();
    }

    public final InterfaceC54156LNg x3() {
        return (InterfaceC54156LNg) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void C1() {
        ITabStrip A3 = A3();
        LOS los = null;
        if (A3 != null) {
            los = A3.sj0();
        }
        if ((los instanceof InterfaceC54184LOi) && los != null) {
            los.LIZ(v3().LJLLI, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void E9() {
        ITabStrip A3 = A3();
        if (A3 != null) {
            A3.E9();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int U10() {
        ITabStrip A3;
        String a9;
        ActivityC45651qj LIZ;
        HomeTabAbility homeTabAbility;
        List<TopTabProtocol> L2;
        String str;
        InterfaceC54156LNg x3 = x3();
        int i = 0;
        if (x3 == null) {
            return 0;
        }
        int LLLZZ = x3.LLLZZ(0);
        boolean LJI = t1.LJI();
        Boolean LIZ2 = SharePrefCache.inst().getIsChangeFollowTab().LIZ();
        o.LJIIIIZZ(LIZ2, "inst().isChangeFollowTab.cache");
        if (LIZ2.booleanValue()) {
            if (LJI) {
                LLLZZ = x3.LLLZZ(1);
            }
        } else if (LJI && (A3 = A3()) != null && (a9 = A3.a9()) != null && !ujb.o.LJJJJJL(a9) && ((C52309Kfx.LIZ() || C52307Kfv.LIZ()) && (LIZ = C212428Vi.LIZ(this)) != null && (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), HomeTabAbility.class, null)) != null && (L2 = homeTabAbility.L2()) != null)) {
            Iterator<TopTabProtocol> it = L2.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                String tag = it.next().getTag();
                ITabStrip A32 = A3();
                if (A32 != null) {
                    str = A32.a9();
                } else {
                    str = null;
                }
                if (o.LJ(tag, str)) {
                    LLLZZ = i;
                }
                i = i2;
            }
        }
        if (LLLZZ < 0) {
            return x3.getCount() - 1;
        }
        return LLLZZ;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int dL() {
        return v3().LJLLI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        HomeTabAbility homeTabAbility;
        AbsFragment absFragment;
        ITabStrip A3;
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        ITabStrip A32 = A3();
        if (A32 != null) {
            A32.onDestroy();
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if ((LIZLLL instanceof AbsFragment) && (absFragment = (AbsFragment) LIZLLL) != null && (A3 = A3()) != null) {
            A3.Ce0(absFragment);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), HomeTabAbility.class, null)) != null) {
            homeTabAbility.Pn(this);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        InterfaceC54157LNh interfaceC54157LNh = this.LJLIL;
        if (interfaceC54157LNh == null) {
            return;
        }
        int currentItemCompat = interfaceC54157LNh.getCurrentItemCompat();
        ITabStrip A3 = A3();
        if (A3 != null) {
            A3.Y5(currentItemCompat, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int yt0() {
        InterfaceC54156LNg x3 = x3();
        if (x3 == null) {
            return 0;
        }
        int LLLZZ = x3.LLLZZ(0);
        boolean LJI = t1.LJI();
        Boolean LIZ = SharePrefCache.inst().getIsChangeFollowTab().LIZ();
        o.LJIIIIZZ(LIZ, "inst().isChangeFollowTab.cache");
        if (LIZ.booleanValue() && LJI) {
            LLLZZ = x3.LLLZZ(1);
        }
        if (LLLZZ < 0) {
            return x3.getCount() - 1;
        }
        return LLLZZ;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void B(int i) {
        this.LJLLILLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void LJJJJZ(boolean z) {
        InterfaceC54157LNh interfaceC54157LNh = this.LJLIL;
        if (interfaceC54157LNh != null) {
            interfaceC54157LNh.LJJJJZ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void LJJLIIIIJ(int i) {
        C80769Vmv C3 = C3();
        if (C3 != null) {
            C3.setBackgroundColor(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int LLLZZ(int i) {
        InterfaceC54156LNg x3 = x3();
        if (x3 != null) {
            return x3.LLLZZ(0);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void Oe0(int i) {
        InterfaceC54156LNg x3;
        InterfaceC54157LNh interfaceC54157LNh;
        String str;
        FeedFragment feedFragment;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (x3 = x3()) != null && (interfaceC54157LNh = this.LJLIL) != null && i != -1 && x3.getPageType(interfaceC54157LNh.getCurrentItemCompat()) != i) {
            if (x3() != null) {
                Fragment currentFragment = x3.getCurrentFragment();
                if ((currentFragment instanceof FeedFragment) && (feedFragment = (FeedFragment) currentFragment) != null) {
                    feedFragment.wl(true);
                }
            }
            int LLLZZ = x3.LLLZZ(i);
            Bundle bundle = new Bundle();
            ITabStrip A3 = A3();
            if (A3 == null || (str = A3.n7(LLLZZ)) == null) {
                str = "";
            }
            bundle.putString("toPage", str);
            bundle.putString("fromStart", "MainFragment");
            Hox.LJLLI.LIZ(LIZ).Bv0(LLLZZ, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void addOnPageChangeListener(C0C3 c0c3) {
        ((ArrayList) this.LJLJJLL).add(c0c3);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final int getPageType(int i) {
        InterfaceC54156LNg x3 = x3();
        if (x3 != null) {
            return x3.getPageType(i);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void he(LOD lod) {
        View view = this.LJLJJL;
        if (view != null) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new ARunnableS28S0200000_9(view, lod, 72)).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final String n7(int i) {
        ITabStrip A3 = A3();
        if (A3 != null) {
            return A3.n7(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void oD(AObserverS73S0200000_9 aObserverS73S0200000_9) {
        ((ArrayList) this.LJLJL).add(aObserverS73S0200000_9);
    }

    @QD3(threadMode = ThreadMode.POSTING)
    public final void onRestartAppEvent(C40380Ft2 c40380Ft2) {
        Bundle bundle;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        if (!(getContext() instanceof InterfaceC55058LjC)) {
            if (c40380Ft2 == null || (bundle = c40380Ft2.LJLIL) == null) {
                bundle = new Bundle();
            }
            C40384Ft6.LIZIZ(bundle);
            return;
        }
        LIZ.finishAndRemoveTask();
        SmartRoute buildRoute = SmartRouter.buildRoute(LIZ, "//main");
        buildRoute.addFlags(268468224);
        buildRoute.open();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTimeLineTabEvent(IKL ikl) {
        AbsFragment absFragment;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (!(LIZLLL instanceof AbsFragment) || (absFragment = (AbsFragment) LIZLLL) == null || !absFragment.isViewValid()) {
            return;
        }
        Boolean showTimeLine = SharePrefCache.inst().getShowTimeLineTab().LIZ();
        InterfaceC54156LNg x3 = x3();
        if (x3 != null) {
            o.LJIIIIZZ(showTimeLine, "showTimeLine");
            showTimeLine.booleanValue();
            x3.LJII();
        }
        InterfaceC54156LNg x32 = x3();
        if (x32 != null) {
            x32.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean LIZ;
        Integer num;
        PagerAdapter pagerAdapter;
        LOS sj0;
        o.LJIIIZ(view, "view");
        this.LJLJJL = view.findViewById(R.id.ljj);
        view.findViewById(R.id.ncx).setBackgroundColor(-16777216);
        KeyEvent.Callback findViewById = view.findViewById(R.id.ncx);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.view.tab.IFlippableViewPagerExt");
        InterfaceC54157LNh interfaceC54157LNh = (InterfaceC54157LNh) findViewById;
        boolean z = false;
        if (C53314KwA.LIZ() && C52482Kik.LIZ()) {
            interfaceC54157LNh.setDefaultGutterSize(0);
        }
        this.LJLIL = interfaceC54157LNh;
        if (interfaceC54157LNh instanceof C80769Vmv) {
            ((C80769Vmv) interfaceC54157LNh).LLILII = (int) (r2.LLILII * ((Number) C54162LNm.LJFF.getValue()).floatValue());
            Object obj = this.LJLIL;
            o.LJII(obj, "null cannot be cast to non-null type dmt.viewpager.DmtViewPager");
            ((C80769Vmv) obj).LLIIZ = (int) (r3.LLIIZ * ((Number) C54162LNm.LJI.getValue()).floatValue());
            Object obj2 = this.LJLIL;
            o.LJII(obj2, "null cannot be cast to non-null type dmt.viewpager.DmtViewPager");
            ((C80769Vmv) obj2).setExpDuration(((Number) C35356DuC.LJFF.getValue()).intValue());
            Object obj3 = this.LJLIL;
            o.LJII(obj3, "null cannot be cast to non-null type dmt.viewpager.DmtViewPager");
            ((C80769Vmv) obj3).setPageOffset(((Number) C35359DuF.LJFF.getValue()).floatValue());
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            this.LJLJLJ = C84193Sd.LIZ(LIZ2);
            C188787b0 c188787b0 = Hox.LJLLI;
            this.LJLJLLL = c188787b0.LIZ(LIZ2);
            InterfaceC36571c5 LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL == null) {
                return;
            }
            C38986FRu.LIZ().LJFF("MainFragment onViewCreated");
            C56672Kh.LIZ().LIZLLL("main_fragment_misc");
            C36093EEn c36093EEn = C36093EEn.LIZ;
            IPreDrawableInflate preDrawableInflate = LNZ.LIZIZ.getPreDrawableInflate();
            c36093EEn.getClass();
            Object LJIIIIZZ = ((IPreDrawableInflate) C36093EEn.LJFF(preDrawableInflate)).LJIIIIZZ();
            if (LJIIIIZZ instanceof Integer) {
                getContainerView().findViewById(R.id.kej).getLayoutParams().height = ((Number) LJIIIIZZ).intValue();
            } else {
                getContainerView().findViewById(R.id.kej).getLayoutParams().height = C63081OpJ.LJJJJLI(LIZ2);
            }
            C80769Vmv C3 = C3();
            if (C3 != null) {
                C54155LNf c54155LNf = new C54155LNf((InterfaceC225058sP) LIZLLL, (LPU) C3);
                ITabStrip A3 = A3();
                if (A3 != null) {
                    A3.QN(c54155LNf, C53314KwA.LIZ());
                }
            }
            C80769Vmv C32 = C3();
            int i = 1;
            if (C32 != null) {
                OptValue LIZ3 = LLW.LIZ();
                if (LIZ3 == null || (num = LIZ3.isEnableSlideParamsOpt) == null || num.intValue() != 1) {
                    LIZ = C53314KwA.LIZ();
                } else {
                    LIZ = false;
                }
                C32.setOptimizeSlideEnable(LIZ);
            }
            C80769Vmv C33 = C3();
            if (C33 != null) {
                Object x3 = x3();
                if (x3 instanceof C54075LKd) {
                    pagerAdapter = (PagerAdapter) x3;
                } else {
                    pagerAdapter = null;
                }
                C33.setAdapter(pagerAdapter);
            }
            C80769Vmv C34 = C3();
            if (C34 != null) {
                C34.LLJILJILJ.LIZLLL(LIZ2.getWindow(), true);
            }
            C80769Vmv C35 = C3();
            if (C35 != null) {
                C35.LJFF(new IDiS271S0100000_9(this, 14));
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJLJ;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.LLF.observe(LIZ2, new AObserverS77S0100000_9(this, 102));
            }
            C2NH.LIZ.post(new ARunnableS28S0200000_9(this, LIZLLL, 71));
            ITabStrip A32 = A3();
            if (A32 != null && (sj0 = A32.sj0()) != null) {
                LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
                LQM.LJIIJ = sj0;
            }
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.LJLJLJ;
            if (scrollSwitchStateManager2 != null) {
                scrollSwitchStateManager2.LLD.observe(LIZ2, new AObserverS77S0100000_9(this, 103));
            }
            ScrollSwitchStateManager scrollSwitchStateManager3 = this.LJLJLJ;
            if (scrollSwitchStateManager3 != null) {
                scrollSwitchStateManager3.LJZL.observe(LIZ2, new AObserverS77S0100000_9(this, 104));
            }
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainFragment");
            c188787b0.LIZ(LIZ2).Bv0(U10(), bundle);
            if (C52309Kfx.LIZ() || C52307Kfv.LIZ()) {
                InterfaceC54157LNh interfaceC54157LNh2 = this.LJLIL;
                if (interfaceC54157LNh2 != null) {
                    interfaceC54157LNh2.setOffscreenPageLimit(7);
                }
            } else {
                InterfaceC54157LNh interfaceC54157LNh3 = this.LJLIL;
                if (interfaceC54157LNh3 != null) {
                    interfaceC54157LNh3.setOffscreenPageLimit(2);
                }
            }
            InterfaceC54157LNh interfaceC54157LNh4 = this.LJLIL;
            if (interfaceC54157LNh4 != null) {
                i = interfaceC54157LNh4.getCurrentItemCompat();
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("miscSetup pos=");
            LIZ4.append(i);
            LIZ4.append(' ');
            LIZ4.append(this);
            C60392Yp.LIZ("LFeedPanel", X1D.LIZIZ(LIZ4), 12);
            v3().LJLLI = i;
            C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "main_fragment_misc");
            this.LJLLI.getValue().getClass();
            LXS LIZ5 = LXU.LIZ();
            if (LIZ5.LIZ) {
                LIZ5.LIZ = false;
                C2U8.LIZ(new C2L0());
            }
            ActivityC45651qj LIZ6 = C212428Vi.LIZ(this);
            if (LIZ6 != null && ((RBX) HG3.LJIILL()).isLogin()) {
                Bundle bundle2 = new Bundle();
                if (a.LJIILL().LJIJ()) {
                    bundle2.putString("fromStart", "MainFragment");
                    c188787b0.LIZ(LIZ6).Cv0(bundle2, "For You");
                } else {
                    bundle2.putString("fromStart", "MainFragment");
                    c188787b0.LIZ(LIZ6).Cv0(bundle2, "For You");
                }
            }
            ScrollSwitchStateManager LIZ7 = C84193Sd.LIZ(LIZ2);
            LIZ7.getClass();
            Boolean bool = Boolean.TRUE;
            OSZ<Boolean, Boolean> value = LIZ7.LJLLLL.getValue();
            if (value != null) {
                z = value.getSecond().booleanValue();
            }
            LIZ7.LJLLLL.setValue(new OSZ<>(bool, Boolean.valueOf(z)));
            return;
        }
        "activity is null".toString();
        throw new IllegalArgumentException("activity is null");
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void um(IDiS268S0100000_4 iDiS268S0100000_4) {
        ((ArrayList) this.LJLJJLL).remove(iDiS268S0100000_4);
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final Fragment z7(int i) {
        InterfaceC54156LNg x3 = x3();
        if (x3 != null) {
            return x3.z7(i);
        }
        return null;
    }

    @Override // X.L9M
    public final void G(List<? extends InterfaceC54080LKi> list, List<? extends InterfaceC54080LKi> list2) {
        List<InterfaceC54080LKi> list3;
        InterfaceC54156LNg x3 = x3();
        if (x3 != null) {
            x3.notifyDataSetChanged();
        }
        ITabStrip A3 = A3();
        if (A3 != null) {
            A3.bU();
        }
        C80769Vmv C3 = C3();
        if (C3 != null) {
            C3.setCurrentItem(U10());
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), HomeTabAbility.class, null);
            if (homeTabAbility == null || (list3 = homeTabAbility.p5()) == null) {
                list3 = C61878OQg.INSTANCE;
            }
            LNZ.LIZIZ.refreshXTabs(list3, C212428Vi.LIZ(LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void Kk0(int i, Fragment fragment) {
        InterfaceC54159LNj lq;
        ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJLJ;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LJZI = new WeakReference<>(fragment);
        }
        ITabStrip A3 = A3();
        if (A3 != null && (lq = A3.lq()) != null) {
            lq.LIZ(i, fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void Y5(int i, int i2) {
        ITabStrip A3 = A3();
        if (A3 != null) {
            A3.Y5(i, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final void setCurrentItem(int i, boolean z) {
        InterfaceC54157LNh interfaceC54157LNh = this.LJLIL;
        if (interfaceC54157LNh != null) {
            interfaceC54157LNh.setCurrentItem(i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility
    public final boolean Zg0(String str, String str2, boolean z) {
        InterfaceC54157LNh interfaceC54157LNh;
        FeedFragment feedFragment;
        AssemSupervisor LIZIZ;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        InterfaceC54156LNg x3 = x3();
        if (x3 == null || (interfaceC54157LNh = this.LJLIL) == null) {
            return false;
        }
        Fragment currentFragment = x3.getCurrentFragment();
        if (!(currentFragment instanceof FeedFragment) || (feedFragment = (FeedFragment) currentFragment) == 0) {
            return false;
        }
        int pageType = x3.getPageType(interfaceC54157LNh.getCurrentItemCompat());
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if ((LIZLLL instanceof MainFragment) && LIZLLL != null && (LIZIZ = C212428Vi.LIZIZ(LIZLLL)) != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54151LNb) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54151LNb) it2.next()).y(pageType, z);
            }
        }
        if (pageType != 0) {
            if (pageType != 1) {
                if (pageType == 33) {
                    C73040SlY.LJII(getContext(), str, "homepage_popular");
                }
            } else {
                C73040SlY.LJII(getContext(), str, "homepage_follow");
            }
        } else {
            C73040SlY.LJII(getContext(), str, "homepage_hot");
        }
        if (feedFragment instanceof FeedFollowFragment) {
            return ((FeedFollowFragment) feedFragment).Wl(str, z);
        }
        if (feedFragment instanceof C8DO) {
            if (o.LJ(str, "refresh")) {
                if (((C8DO) feedFragment).X8()) {
                    return true;
                }
                feedFragment.ub(z);
                return true;
            }
            feedFragment.ub(z);
            return true;
        }
        if ((feedFragment instanceof SocialFriendsFeedFragment) && o.LJ(str, "refresh") && (o.LJ(str2, "click_top_icon") || o.LJ(str2, "click_bottom_icon"))) {
            if (!C35048DpE.LIZ()) {
                return true;
            }
            feedFragment.ub(z);
            return true;
        }
        return feedFragment.ub(z);
    }
}

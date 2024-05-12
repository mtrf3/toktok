package com.ss.android.ugc.aweme.main;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C178596zf;
import X.C212428Vi;
import X.C29S;
import X.C2K0;
import X.C2L4;
import X.C36922EeM;
import X.C38816FLg;
import X.C38995FSd;
import X.C3C5;
import X.C40897G3h;
import X.C54075LKd;
import X.C54077LKf;
import X.C54082LKk;
import X.C54437LYb;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56672Kh;
import X.C76800UCe;
import X.C76965UIn;
import X.C78596Usy;
import X.C78929UyL;
import X.C8VV;
import X.C8W0;
import X.C90903hW;
import X.DLH;
import X.DPB;
import X.FAJ;
import X.FAK;
import X.IG8;
import X.InterfaceC225058sP;
import X.InterfaceC34471Wx;
import X.InterfaceC53896LDg;
import X.InterfaceC54054LJi;
import X.InterfaceC54151LNb;
import X.InterfaceC54152LNc;
import X.InterfaceC54157LNh;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC56322M8o;
import X.LCR;
import X.LKF;
import X.LMR;
import X.LNL;
import X.LNP;
import X.LNZ;
import X.LO7;
import X.QD3;
import Y.ARunnableS9S0201000_6;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.hox.Hox;
import com.bytedance.provider.preload.PreLoader;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes10.dex */
public class MainFragment extends AmeBaseFragment implements InterfaceC53896LDg, InterfaceC54054LJi, LNP, InterfaceC225058sP, InterfaceC34471Wx, InterfaceC56322M8o, IMFAbility, InterfaceC55102Lju, C2L4 {
    public static final /* synthetic */ int LJLLJ = 0;
    public ViewGroup LJLIL;
    public FrameLayout LJLILLLLZI;
    public InterfaceC54157LNh LJLJI;
    public ITabStrip LJLJJI;
    public View LJLJJL;
    public FrameLayout LJLJJLL;
    public final LNZ LJLJL;
    public C54075LKd LJLJLJ;
    public final LCR LJLJLLL;
    public View[] LJLL;
    public C54437LYb LJLLI;
    public InterfaceC55235Lm3 LJLLILLLL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "HOME";
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b2001";
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "home";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 548277498) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final MainFragment rl() {
        return this;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final LKF H4() {
        return this.LJLJLLL.H4();
    }

    @Override // X.InterfaceC54054LJi, X.LNP
    public final String LLLLLZ() {
        InterfaceC54157LNh interfaceC54157LNh;
        int pageType;
        C54075LKd c54075LKd = this.LJLJLJ;
        if (c54075LKd != null && (interfaceC54157LNh = this.LJLJI) != null && (pageType = c54075LKd.getPageType(interfaceC54157LNh.getCurrentItemCompat())) != 0) {
            if (pageType == 1) {
                return "homepage_follow";
            }
            if (pageType == 33) {
                return "homepage_popular";
            }
            if (pageType == 31) {
                return "homepage_friends";
            }
            if (pageType == 7) {
                return "homepage_nearby";
            }
            if (pageType == 35) {
                return "homepage_explore";
            }
            if (LO7.LIZIZ.E1(pageType)) {
                return Hox.kv0(requireActivity()).lv0();
            }
            if (pageType == 36) {
                return "homepage_topic_stem";
            }
            if (pageType == 37) {
                return "homepage_live";
            }
        }
        return "homepage_hot";
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final LMR Ur0() {
        return new LMR(this.LJLJLJ, this.LJLJJI);
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final Fragment getCurrentFragment() {
        return this.LJLJLJ.getCurrentFragment();
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final int getCurrentItemCompat() {
        InterfaceC54157LNh interfaceC54157LNh;
        C54075LKd c54075LKd = this.LJLJLJ;
        if (c54075LKd != null && (interfaceC54157LNh = this.LJLJI) != null) {
            return c54075LKd.getPageType(interfaceC54157LNh.getCurrentItemCompat());
        }
        return -1;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(MainFragmentScope.class);
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final boolean io0() {
        if (this.LJLJI != null && this.LJLJLJ != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x010c, code lost:
    
        if (r10.equals("homepage_follow") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014d, code lost:
    
        X.C54154LNe.LIZLLL("enter_homepage_hot", "live", X.C54154LNe.LIZ(r11, "live_2_feed"), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0149, code lost:
    
        if (r10.equals("homepage_hot") == false) goto L14;
     */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainFragment.onResume():void");
    }

    @Override // X.InterfaceC54054LJi
    /* renamed from: vl, reason: merged with bridge method [inline-methods] */
    public final FeedFragment w2() {
        C54075LKd c54075LKd = this.LJLJLJ;
        if (c54075LKd == null) {
            return null;
        }
        return (FeedFragment) c54075LKd.getCurrentFragment();
    }

    public MainFragment() {
        LNZ lnz = LNZ.LIZIZ;
        this.LJLJL = lnz;
        this.LJLJLLL = lnz.getMainFragmentProxy();
    }

    @Override // X.InterfaceC54054LJi
    public final boolean K2() {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == 31) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54054LJi
    public final String LLIIJI() {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        FollowTabAbility followTabAbility;
        if (mo49getActivity() == null || (interfaceC55235Lm3 = this.LJLLILLLL) == null || (followTabAbility = (FollowTabAbility) C55096Ljo.LIZ(interfaceC55235Lm3, FollowTabAbility.class, null)) == null) {
            return "";
        }
        return followTabAbility.Eo0();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC54054LJi
    public final boolean Oe() {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        return C54082LKk.LIZIZ(getContext(), mo49getActivity());
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && Hox.kv0(mo49getActivity()).wv0("HOME")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54054LJi
    public final boolean jg() {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == 35) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54054LJi
    public final boolean lj() {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54054LJi
    public final boolean oc() {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == 7) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        C54437LYb c54437LYb = this.LJLLI;
        if (c54437LYb != null) {
            EventBus.LIZJ().LJIJ(c54437LYb);
        }
        SpecActServiceImpl.LJJJIL().LIZIZ();
        C55096Ljo.LJIILL(this.LJLLILLLL, IMFAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
        LNL.LIZ(requireActivity()).getClass();
    }

    @Override // X.InterfaceC54054LJi
    public final boolean uk() {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == 33) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final C54075LKd Tj() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final ITabStrip iD() {
        return this.LJLJJI;
    }

    @Override // X.LNP
    public final FrameLayout tj() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC225058sP
    public final InterfaceC55235Lm3 ul() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC225058sP
    public final void B(int i) {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (LJIIZILJ != null) {
            LJIIZILJ.B(1);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
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
                ((InterfaceC54151LNb) it2.next()).LLLLILI(bundle);
            }
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle arg) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(arg, "arg");
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
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
                ((InterfaceC54151LNb) it2.next()).LLLLLLZ(arg);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final int LLLZZ(int i) {
        C54075LKd c54075LKd = this.LJLJLJ;
        if (c54075LKd != null && this.LJLJI != null) {
            return c54075LKd.LLLZZ(1);
        }
        return -1;
    }

    @Override // X.InterfaceC54054LJi
    public final boolean Qc(int i) {
        HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
        if (this.LJLJLJ != null && this.LJLJI != null && LJIIZILJ != null && LJIIZILJ.Eh() == i) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        PreLoader.LIZIZ(this, null);
        C54437LYb c54437LYb = new C54437LYb(this);
        this.LJLLI = c54437LYb;
        ARunnableS9S0201000_6 aRunnableS9S0201000_6 = new ARunnableS9S0201000_6(2, c54437LYb, activity, 5);
        if (C78596Usy.LJJIJL(DLH.LJLIL, DPB.LIZJ())) {
            C38995FSd.LJ().schedule(aRunnableS9S0201000_6, 3000L, TimeUnit.MILLISECONDS);
        } else {
            C38816FLg.LIZLLL(aRunnableS9S0201000_6, 3000);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        this.LJLLILLLL = LIZJ;
        C55096Ljo.LJIIL(LIZJ, this, IMFAbility.class, null, null);
        EventBus.LIZJ().LJIILJJIL(this);
        FragmentManager childFragmentManager = getChildFragmentManager();
        ActivityC45651qj requireActivity = requireActivity();
        if (requireActivity != null && childFragmentManager != null) {
            childFragmentManager.LJJLIL(new C40897G3h(requireActivity), false);
        }
        C54437LYb c54437LYb = this.LJLLI;
        c54437LYb.getClass();
        EventBus.LIZJ().LJIILJJIL(c54437LYb);
    }

    @QD3
    public void onLiveCleanEvent(IG8 ig8) {
        if (!isViewValid()) {
            return;
        }
        int i = 0;
        if (this.LJLL == null) {
            this.LJLL = new View[]{this.LJLJJL, this.LJLILLLLZI, this.LJLJJLL, null, null};
        }
        if (!ig8.LJLIL) {
            View[] viewArr = this.LJLL;
            int length = viewArr.length;
            while (i < length) {
                View view = viewArr[i];
                try {
                    C178596zf.LIZ(view.getAlpha(), 0.0f, view);
                } catch (Exception e) {
                    C36922EeM.LIZ(e);
                }
                i++;
            }
            return;
        }
        View[] viewArr2 = this.LJLL;
        int length2 = viewArr2.length;
        while (i < length2) {
            try {
                viewArr2[i].setAlpha(1.0f);
            } catch (Exception e2) {
                C36922EeM.LIZ(e2);
            }
            i++;
        }
    }

    public final void wl(int i) {
        if (this.LJLJI != null && this.LJLJLJ != null) {
            if (a.LJIILL().LJIJ() && i == 0 && Oe()) {
                i = this.LJLJI.getCurrentItemCompat();
            }
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
            }
            HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(this);
            if (LJIIZILJ != null) {
                LJIIZILJ.Oe0(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        FAJ.LIZ("cold_boot_main_fragment_view_created", true);
        this.LJLIL = (ViewGroup) view.findViewById(R.id.dga);
        this.LJLILLLLZI = (FrameLayout) view.findViewById(R.id.i0p);
        this.LJLJI = (InterfaceC54157LNh) view.findViewById(R.id.ncx);
        this.LJLJJL = view.findViewById(R.id.kej);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.j5x);
        this.LJLJJLL = frameLayout;
        this.LJLJJI = this.LJLJL.getMainTabStrip(frameLayout);
        super.onViewCreated(view, bundle);
        this.LJLJLJ = new C54075LKd(this, new C54077LKf(this));
        C56672Kh.LIZ().LIZLLL("main_fragment_apply_assem");
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 138));
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "main_fragment_apply_assem");
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54152LNc) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54152LNc) it2.next()).LJJJJI(view, bundle);
            }
        }
        FAJ.LJFF("cold_boot_main_fragment_view_created", true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        FAJ.LIZ("cold_boot_main_fragment_create_view", true);
        View LIZ = this.LJLJLLL.LIZ(this, inflater);
        FAJ.LJFF("cold_boot_main_fragment_create_view", true);
        C29S c29s = null;
        if (!(LIZ instanceof View)) {
            LIZ = null;
        }
        if (LIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZ, this);
                C10A.LIZIZ(LIZ, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LIZ;
    }
}

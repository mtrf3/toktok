package com.ss.android.ugc.aweme.main;

import X.AXW;
import X.AbstractC2312495s;
import X.ActivityC45651qj;
import X.C0RN;
import X.C10A;
import X.C116694i1;
import X.C141335gf;
import X.C188787b0;
import X.C1JD;
import X.C209108Io;
import X.C212428Vi;
import X.C221108m2;
import X.C225708tS;
import X.C29S;
import X.C2K0;
import X.C2L4;
import X.C2U8;
import X.C36093EEn;
import X.C38816FLg;
import X.C38986FRu;
import X.C3C5;
import X.C3SZ;
import X.C40328FsC;
import X.C40897G3h;
import X.C46538IOg;
import X.C52546Kjm;
import X.C53320KwG;
import X.C54032LIm;
import X.C54057LJl;
import X.C54062LJq;
import X.C55008LiO;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56662Kg;
import X.C56672Kh;
import X.C56682Ki;
import X.C56692Kj;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C76800UCe;
import X.C76965UIn;
import X.C78696Uua;
import X.C78697Uub;
import X.C78866UxK;
import X.C84193Sd;
import X.C86298Xtu;
import X.C87277YNd;
import X.C88545Yp3;
import X.C8VV;
import X.C8W0;
import X.C90903hW;
import X.EE1;
import X.EFK;
import X.EI0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FAJ;
import X.IAX;
import X.IWF;
import X.InterfaceC26386AXe;
import X.InterfaceC53896LDg;
import X.InterfaceC54059LJn;
import X.InterfaceC54061LJp;
import X.InterfaceC55235Lm3;
import X.InterfaceC55377LoL;
import X.InterfaceC59608NaO;
import X.LDU;
import X.LHR;
import X.LIF;
import X.LLE;
import X.LLH;
import X.LLJ;
import X.LLQ;
import X.LNS;
import X.LNU;
import X.LNV;
import X.LNW;
import X.LNZ;
import X.LPY;
import X.LQ1;
import X.LQ2;
import X.LQM;
import X.LTT;
import X.LUX;
import X.OHQ;
import X.OSZ;
import X.V16;
import X.Z8A;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS10S1100000_9;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.legoImp.task.HwWallpaperMobEventTask;
import com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserverTabCheckTask;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MainPageFragment extends CommonPageFragment implements InterfaceC53896LDg, LLE, LLH, C2L4 {
    public static final /* synthetic */ int LJZI = 0;
    public View LJLJI;
    public View LJLJJI;
    public LLQ LJLJJL;
    public View LJLJJLL;
    public TabChangeManager LJLJL;
    public ScrollSwitchStateManager LJLJLJ;
    public HomePageDataViewModel LJLJLLL;
    public AdHomePageDataVM LJLL;
    public boolean LJLLI;
    public MainAnimViewModel LJLLILLLL;
    public C78696Uua LJLLL;
    public C73318Sq2 LJLLLL;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(LNS.LJLIL);
    public final LNV LJLLJ = xl().getMainPageFragmentProxy();
    public final AObserverS77S0100000_9 LJLLLLLL = new AObserverS77S0100000_9(this, 20);
    public final String LJLZ = "page_feed";

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void Al() {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new DownloadFestivalTask(), true);
        LIZJ.LIZIZ(new HwWallpaperMobEventTask(), true);
        LIZJ.LIZIZ(new MultiProcessMobEventTask(), true);
        LIZJ.LIZIZ(new ObserverTabCheckTask(), true);
        LIZJ.LIZIZ(new SubscribeAuthStateTask(), true);
        LIZJ.LIZJ();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(MainPageFragmentScope.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        FAJ.LJFF("measure_fragment_create_to_resume", true);
        FAJ.LIZ("measure_resume_duration", true);
        FAJ.LIZ("cold_boot_mainpage_fragment_onresume", true);
        super.onResume();
        FAJ.LJFF("cold_boot_mainpage_fragment_onresume", true);
    }

    public final IHomePageService xl() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-homePageService>(...)");
        return (IHomePageService) value;
    }

    public final InterfaceC55235Lm3 Dl() {
        if (getFragmentManager() == null) {
            return null;
        }
        return C55230Lly.LIZJ(this, null);
    }

    public final Aweme getCurrentAweme() {
        MainActivityScope LJJLIIIJJI;
        MainBusinessAbility LJIJJLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(mo49getActivity)) != null && (LJIJJLI = C1JD.LJIJJLI(LJJLIIIJJI)) != null) {
            return LJIJJLI.getCurrentAweme();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LQ1 lq1;
        super.onDestroyView();
        C78696Uua c78696Uua = this.LJLLL;
        if (c78696Uua != null) {
            EventBus.LIZJ().LJIJ(c78696Uua);
        }
        C78697Uub LJI = C78697Uub.LJI();
        if (LJI.LJLJJI != null) {
            LJI.LJLJJI = null;
        }
        LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
        LQ2.LJFF("livesdk_bubble_onDestroy");
        if (LQM.LIZIZ) {
            LQM.LIZIZ = false;
        } else {
            LQ1 lq12 = LQM.LJIILLIIL;
            if (lq12 != null) {
                lq12.LJIILIIL = false;
            }
            if (lq12 != null && lq12.isShowing() && (lq1 = LQM.LJIILLIIL) != null) {
                lq1.dismiss();
            }
            LQM.LJIILLIIL = null;
            LQM.LJFF = null;
            LQM.LJI = null;
            LQM.LJIIIIZZ = null;
            LQM.LJIILL = null;
            LQM.LJII = null;
            LQM.LJIJI = false;
            LQM.LJIIIZ = true;
            LQM.LJIJ = true;
            LQM.LJ = false;
            LQM.LJJ.removeCallbacksAndMessages(null);
        }
        C73318Sq2 c73318Sq2 = this.LJLLLL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
    }

    public final InterfaceC54061LJp wl() {
        Fragment fragment;
        String str;
        TabChangeManager tabChangeManager;
        Fragment mv0;
        MainPageBusinessAbility mainPageBusinessAbility;
        if (C52546Kjm.LIZ()) {
            InterfaceC55235Lm3 Dl = Dl();
            if (Dl == null || (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(Dl, MainPageBusinessAbility.class, null)) == null) {
                return null;
            }
            return mainPageBusinessAbility.Fi();
        }
        TabChangeManager tabChangeManager2 = this.LJLJL;
        if (tabChangeManager2 != null) {
            fragment = tabChangeManager2.mv0();
        } else {
            fragment = null;
        }
        if (fragment instanceof MainFragment) {
            mv0 = ((MainFragment) fragment).w2();
        } else {
            if (fragment != null) {
                str = fragment.getTag();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, "FRIENDS_TAB") || (tabChangeManager = this.LJLJL) == null) {
                return null;
            }
            mv0 = tabChangeManager.mv0();
        }
        if (mv0 == null) {
            return null;
        }
        C2K0 LIZ = C55096Ljo.LIZ(C55230Lly.LIZJ(mv0, null), IFeedFragmentAbility.class, null);
        if (!(LIZ instanceof IHomeFeedFragmentAbility)) {
            LIZ = null;
        }
        IHomeFeedFragmentAbility iHomeFeedFragmentAbility = (IHomeFeedFragmentAbility) LIZ;
        if (iHomeFeedFragmentAbility == null) {
            return null;
        }
        return iHomeFeedFragmentAbility.m30();
    }

    /* loaded from: classes10.dex */
    public final class DownloadFestivalTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "MainPageFragment$DownloadFestivalTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public DownloadFestivalTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            C78696Uua c78696Uua = MainPageFragment.this.LJLLL;
            if (c78696Uua != null) {
                c78696Uua.LIZ();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class SubscribeAuthStateTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "MainPageFragment$SubscribeAuthStateTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public SubscribeAuthStateTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            C38816FLg.LIZJ(new ARunnableS45S0100000_9(MainPageFragment.this, 72));
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        MainPageBusinessAbility mainPageBusinessAbility;
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0(this.LJLZ);
        if (o.LJ(bundle.getString("fromStart", ""), "RootNode") || bundle.getBoolean(sv0)) {
            TabAlphaController LIZ = LLJ.LIZ();
            if (LIZ != null) {
                LIZ.LIZ(false);
            }
            C46538IOg.LIZ = false;
            C56662Kg.LIZ().LIZLLL = false;
            C56662Kg.LIZ().LJIIIZ = false;
            IWF.LJJLIIIIJ().LJIILJJIL();
            C56692Kj.LIZ().LIZIZ();
            InterfaceC55235Lm3 Dl = Dl();
            if (Dl != null && (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(Dl, MainPageBusinessAbility.class, null)) != null) {
                mainPageBusinessAbility.Fa();
            }
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        MainPageBusinessAbility mainPageBusinessAbility;
        MutableLiveData<String> mutableLiveData;
        o.LJIIIZ(args, "args");
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        String sv0 = c188787b0.LIZ(mo49getActivity).sv0(this.LJLZ);
        if (o.LJ(args.getString("fromStart", ""), "RootNode") || args.getBoolean(sv0)) {
            TabAlphaController LIZ = LLJ.LIZ();
            if (LIZ != null) {
                LIZ.LIZ(true);
            }
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            Z8A z8a = Z8A.LIZIZ;
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            z8a.preloadProfile(requireActivity2, this.LJLZ);
            C2U8.LIZ(new C56682Ki(true));
            TextUtils.isEmpty(V16.LIZJ);
            HomePageDataViewModel homePageDataViewModel = this.LJLJLLL;
            if (homePageDataViewModel != null && !homePageDataViewModel.LJLL && getCurrentAweme() != null && (requireActivity instanceof MainActivity)) {
                ((MainActivity) requireActivity).flingBackToFeedChange(getCurrentAweme(), getContext());
            }
            MainAnimViewModel mainAnimViewModel = this.LJLLILLLL;
            if (mainAnimViewModel != null && (mutableLiveData = mainAnimViewModel.LJLJI) != null) {
                mutableLiveData.setValue(this.LJLZ);
            }
            InterfaceC55235Lm3 Dl = Dl();
            if (Dl != null && (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(Dl, MainPageBusinessAbility.class, null)) != null) {
                mainPageBusinessAbility.db0();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        C55230Lly.LIZ(this, null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        LLQ llq;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (llq = this.LJLJJL) != null) {
            llq.LJIJ(mo49getActivity, newConfig);
        }
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54059LJn) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54059LJn) it2.next()).W2(newConfig);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 110));
        FragmentManager childFragmentManager = getChildFragmentManager();
        ActivityC45651qj requireActivity = requireActivity();
        if (requireActivity == null || childFragmentManager == null) {
            return;
        }
        childFragmentManager.LJJLIL(new C40897G3h(requireActivity), false);
    }

    public final void qQ(boolean z) {
        MainPageBusinessAbility mainPageBusinessAbility;
        InterfaceC55235Lm3 Dl = Dl();
        if (Dl != null && (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(Dl, MainPageBusinessAbility.class, null)) != null) {
            mainPageBusinessAbility.qQ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HomeTabAbility LJIL;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        MutableLiveData<C55008LiO> mutableLiveData;
        View view2;
        InterfaceC55235Lm3 Dl;
        MainPageSeekAbility mainPageSeekAbility;
        LLQ llq;
        o.LJIIIZ(view, "view");
        FAJ.LIZ("cold_boot_mainpage_fragment_view_created", true);
        super.onViewCreated(view, bundle);
        C56672Kh.LIZ().LIZLLL("mainpage_fragment_apply_assem");
        C8VV.LIZ(this, false, new AqS140S0200000_9(this, view, 12));
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "mainpage_fragment_apply_assem");
        C56672Kh.LIZ().LIZLLL("mainpage_fragment_assem_to_page");
        C38986FRu.LIZ().LJFF("MainPageFragment onViewCreated");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        this.LJLLILLLL = (MainAnimViewModel) ViewModelProviders.of(mo49getActivity).get(MainAnimViewModel.class);
        this.LJLJJLL = view;
        this.LJLJI = view.findViewById(R.id.arm);
        View view3 = this.LJLJJLL;
        o.LJI(view3);
        View findViewById = view3.findViewById(R.id.gc8);
        if (C53320KwG.LIZIZ()) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            findViewById = mo49getActivity.findViewById(R.id.gbw);
            findViewById.setVisibility(0);
        }
        this.LJLJJI = findViewById;
        LNZ lnz = LNZ.LIZIZ;
        o.LJI(findViewById);
        this.LJLJJL = lnz.initTabBarLogic((AbstractC2312495s) findViewById);
        this.LJLJL = C116694i1.LIZ(mo49getActivity);
        this.LJLJLLL = C3SZ.LIZ(mo49getActivity);
        this.LJLJLJ = C84193Sd.LIZ(mo49getActivity);
        this.LJLL = LPY.LIZ(mo49getActivity);
        this.LJLLL = new C78696Uua(mo49getActivity, new C54062LJq(this));
        this.LJLLJ.LIZIZ(this, view);
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "mainpage_fragment_assem_to_page");
        C56672Kh.LIZ().LIZLLL("mainpage_fragment_init_page");
        View view4 = this.LJLJJLL;
        o.LJI(view4);
        this.LJLJI = view4.findViewById(R.id.arm);
        IHomePageService xl = xl();
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJII(mo49getActivity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        xl.getHomeTabViewModel(mo49getActivity2).Gb0(this.LJLJJL);
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null && (llq = this.LJLJJL) != null) {
            llq.LIZJ(mo49getActivity3);
        }
        LLQ llq2 = this.LJLJJL;
        if (llq2 != null && !llq2.LJIILLIIL() && (Dl = Dl()) != null && (mainPageSeekAbility = (MainPageSeekAbility) C55096Ljo.LIZ(Dl, MainPageSeekAbility.class, null)) != null) {
            mainPageSeekAbility.al(C225708tS.LIZ);
        }
        TabAlphaController LIZ = LLJ.LIZ();
        if (LIZ != null && (view2 = this.LJLJJI) != null) {
            LIZ.LJLIL = view2;
        }
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "mainpage_fragment_init_page");
        C56672Kh.LIZ().LIZLLL("mainpage_fragment_page_to_end");
        MainPageFragmentImpl.LJI().LIZ(this);
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        if (mo49getActivity4 != null) {
            DataCenter.gv0(ViewModelProviders.of(mo49getActivity4), this).iv0("onNewIntent", new C54057LJl(this), true);
        }
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(this, 74);
        if (!C52546Kjm.LIZ()) {
            aRunnableS45S0100000_9.run();
        }
        View view5 = this.LJLJJLL;
        if (view5 instanceof ViewGroup) {
            o.LJI(view5);
            new WeakReference(view5);
        }
        AdHomePageDataVM adHomePageDataVM = this.LJLL;
        if (adHomePageDataVM != null && (mutableLiveData = adHomePageDataVM.LJLILLLLZI) != null) {
            mutableLiveData.observe(this, this.LJLLLLLL);
        }
        ActivityC45651qj requireActivity = requireActivity();
        if (requireActivity != null) {
            Hox.LJLLI.LIZ(requireActivity).gv0(new LDU(requireActivity));
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(requireActivity);
            if (LJJLIIIJJI != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                LJIL.fJ(new C54032LIm(requireActivity));
            }
        }
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54059LJn) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54059LJn) it2.next()).LLZILL(view);
            }
        }
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "mainpage_fragment_page_to_end");
        FAJ.LJFF("cold_boot_mainpage_fragment_view_created", true);
    }

    @Override // X.LLH
    public final void LLLLZLLIL(String str, Fragment fragment, Fragment fragment2) {
        InterfaceC55235Lm3 Dl;
        MainPageBusinessAbility mainPageBusinessAbility;
        MainFragment mainFragment;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        InterfaceC26386AXe interfaceC26386AXe;
        boolean z = true;
        if (C53320KwG.LIZIZ() && o.LJ(str, "HOME") && xl().isProfileActiveInMain(mo49getActivity())) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                LTT.LJ(mo49getActivity);
            }
            IAX.LIZ(mo49getActivity(), "USER");
        } else {
            IAX.LIZ(mo49getActivity(), str);
            if ((TextUtils.equals(str, "HOME") && (!(fragment instanceof MainFragment) || (mainFragment = (MainFragment) fragment) == null || !mainFragment.jg())) || o.LJ(str, "FRIENDS_TAB") || o.LJ(str, "Nearby") || o.LJ(str, "Following") || (TextUtils.equals(str, "MUSIC_DSP") && (Dl = Dl()) != null && (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(Dl, MainPageBusinessAbility.class, null)) != null && mainPageBusinessAbility.y60())) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    LTT.LIZJ(mo49getActivity2);
                }
            } else {
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 != null) {
                    LTT.LJ(mo49getActivity3);
                }
                IAX.LIZ(mo49getActivity(), "USER");
            }
        }
        if ((fragment2 instanceof InterfaceC55377LoL) || (fragment2 instanceof InterfaceC59608NaO)) {
            fragment2.setUserVisibleHint(false);
        }
        if (fragment instanceof InterfaceC55377LoL) {
            fragment.setUserVisibleHint(true);
        }
        if (Z8A.LIZIZ.isI18nMyProfileFragmentV2(fragment)) {
            Boolean LIZ = SharePrefCache.inst().getEnableProfileActivityLink().LIZ();
            o.LJIIIIZZ(LIZ, "inst().enableProfileActivityLink.cache");
            if (LIZ.booleanValue() && (interfaceC26386AXe = (InterfaceC26386AXe) AXW.LIZ(getContext(), InterfaceC26386AXe.class)) != null) {
                interfaceC26386AXe.LJFF();
            }
        }
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null && c88545Yp3.isConnected() && fragment != null) {
            IPlaybackControlService LIZ2 = c88545Yp3.LIZ();
            if (!(fragment instanceof LIF) && !(fragment instanceof MainFragment)) {
                z = false;
            }
            LIZ2.updatePlaybackControlsForMainTabs(this, z);
        }
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54059LJn) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54059LJn) it2.next()).LLLLZLLIL(str, fragment, fragment2);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(inflater, "inflater");
        FAJ.LJFF("measure_begin_to_fragment_create", true);
        FAJ.LIZ("measure_fragment_create_duration", true);
        FAJ.LIZ("cold_boot_mainpage_fragment_create_view", true);
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        C29S c29s = null;
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54059LJn) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54059LJn) it2.next()).M1(viewGroup);
            }
        }
        View LIZ = this.LJLLJ.LIZ(this, inflater);
        FAJ.LJFF("cold_boot_mainpage_fragment_create_view", true);
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

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(mo49getActivity(), i, grantResults);
        super.onRequestPermissionsResult(i, strArr, grantResults);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        Bundle bundle2;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        LiveData liveData;
        boolean z3;
        LLQ llq;
        if (z) {
            if (isAdded() && (llq = this.LJLJJL) != null) {
                llq.LJJIIJ(str);
            }
        } else {
            LLQ llq2 = this.LJLJJL;
            if (llq2 != null) {
                llq2.LJII(str, str2, z2);
            }
        }
        if (TextUtils.isEmpty(str2) || o.LJ(str2, "HOME") || TextUtils.isEmpty(str) || !o.LJ(str, "HOME")) {
            TabChangeManager tabChangeManager = this.LJLJL;
            if (!TextUtils.isEmpty(str) && str.equals("USER")) {
                ProfileServiceImpl.LIZ().checkAndRefreshUser(tabChangeManager.mv0());
            }
        }
        C2U8.LIZ(new C209108Io(str2, str));
        LNU LIZ = LNU.LIZ();
        LIZ.LIZIZ = str;
        if (LIZ.LIZ != null && !TextUtils.isEmpty(str)) {
            LUX lux = (LUX) ((LNW) LIZ.LIZ).LIZ;
            if (!TextUtils.equals(str, lux.LIZIZ)) {
                lux.LIZJ = lux.LIZIZ;
                lux.LIZIZ = str;
                lux.LIZLLL();
            }
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        bundle2.putString("fromStart", "MainPage");
        if (str != null && o.LJ(str2, str)) {
            bundle2.putInt("switchType", 1);
        }
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        Hox LIZ2 = c188787b0.LIZ(mo49getActivity);
        o.LJI(str);
        LIZ2.jv0(bundle2, str);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            ScrollSwitchStateManager LIZ3 = C84193Sd.LIZ(mo49getActivity2);
            LIZ3.getClass();
            OSZ<Boolean, Boolean> value = LIZ3.LJLLLL.getValue();
            if (value != null) {
                z3 = value.getFirst().booleanValue();
            } else {
                z3 = false;
            }
            LIZ3.LJLLLL.setValue(new OSZ<>(Boolean.valueOf(z3), Boolean.TRUE));
        }
        ARunnableS10S1100000_9 aRunnableS10S1100000_9 = new ARunnableS10S1100000_9(this, str, 3);
        if (!C52546Kjm.LIZ()) {
            aRunnableS10S1100000_9.run();
        }
        LHR.LIZ.onEvent(str);
        HomePageDataViewModel homePageDataViewModel = this.LJLJLLL;
        if (homePageDataViewModel != null && (liveData = (LiveData) homePageDataViewModel.LJLLLL.getValue()) != null) {
            liveData.postValue(str);
        }
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54059LJn) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54059LJn) it2.next()).LJLJJLL(str, str2, z, z2, bundle, str3);
            }
        }
    }
}

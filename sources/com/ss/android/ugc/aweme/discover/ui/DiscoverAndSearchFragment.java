package com.ss.android.ugc.aweme.discover.ui;

import X.AMD;
import X.AML;
import X.AV1;
import X.AWY;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.AnonymousClass391;
import X.C03880Dg;
import X.C10760bY;
import X.C10A;
import X.C10K;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C16970lZ;
import X.C18000nE;
import X.C188727au;
import X.C25903AEp;
import X.C26338AVi;
import X.C27740Aue;
import X.C29S;
import X.C3C5;
import X.C3SZ;
import X.C50833JxF;
import X.C50948Jz6;
import X.C53487Kyx;
import X.C54127LMd;
import X.C5H3;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78685UuP;
import X.C80261Vej;
import X.C90903hW;
import X.EF7;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC208608Gq;
import X.InterfaceC34471Wx;
import X.InterfaceC36571c5;
import X.InterfaceC53896LDg;
import X.InterfaceC55058LjC;
import X.InterfaceC55377LoL;
import X.InterfaceC56611MJr;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.KL2;
import X.KO1;
import X.MJF;
import X.MJG;
import X.MJH;
import X.MJI;
import X.MJJ;
import X.MJK;
import X.MJL;
import X.MJM;
import X.MJO;
import X.MJS;
import X.MJT;
import X.MJU;
import X.MJW;
import X.TBT;
import X.TBW;
import X.TMG;
import X.VW3;
import X.W1T;
import X.Z9N;
import Y.ACListenerS29S0100000_9;
import Y.ACallableS11S0000100_1;
import Y.ACallableS12S0000100_9;
import Y.IDBReceiverS8S0100000_8;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiscoverAndSearchFragment extends AmeBaseFragment implements InterfaceC208608Gq, InterfaceC56611MJr, InterfaceC55377LoL, InterfaceC151715xP, InterfaceC34471Wx, InterfaceC53896LDg, AMD<C25903AEp> {
    public static long LLFZ;
    public static final /* synthetic */ int LLI = 0;
    public TrendsTabFragment LJLIL;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public MJG LJLJJLL;
    public final lifecycleAwareLazy LJLJLJ;
    public ViewGroup LJLJLLL;
    public FrameLayout LJLL;
    public MJH LJLLI;
    public MJH LJLLILLLL;
    public ImageView LJLLJ;
    public View LJLLL;
    public VW3 LJLLLL;
    public C80261Vej LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public IDBReceiverS8S0100000_8 LJZL;
    public MJT LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public Word LLFF;
    public Context LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public long LJLILLLLZI = -1;
    public long LJLJI = -1;
    public final C25903AEp LJLJL = new C25903AEp();

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
    }

    @Override // X.InterfaceC56611MJr
    public final void ak() {
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b5131";
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    @Override // X.InterfaceC208608Gq
    public final void zj() {
    }

    public DiscoverAndSearchFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(TrendsTabViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 93);
        this.LJLJLJ = new lifecycleAwareLazy(this, aqS159S0100000_9, new AqS72S0400000_12(this, aqS159S0100000_9, LIZ, MJK.INSTANCE, 4));
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LLD = routeArgExtension.optionalArgNotNull(this, MJL.LJLIL, "i18n_tab_mode", Boolean.class);
        this.LLF = routeArgExtension.optionalArg(this, MJM.LJLIL, "search_enter_param", C50948Jz6.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.LLFFF;
        if (context != null) {
            return context;
        }
        return super.getContext();
    }

    public final boolean vl() {
        return ((Boolean) this.LLD.getValue()).booleanValue();
    }

    public final void xl() {
        if (this.LJLILLLLZI > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLILLLLZI;
            if (elapsedRealtime > 0) {
                C10K.LIZIZ(new ACallableS12S0000100_9(elapsedRealtime, 0), FMX.LIZIZ(), null);
            }
            this.LJLILLLLZI = -1L;
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // X.InterfaceC55377LoL
    public final boolean Mh() {
        if (!isViewValid()) {
            return false;
        }
        xl();
        return false;
    }

    public final void onBackPressed() {
        InterfaceC55058LjC interfaceC55058LjC;
        Mh();
        if (mo49getActivity() instanceof InterfaceC55058LjC) {
            InterfaceC36571c5 mo49getActivity = mo49getActivity();
            if ((mo49getActivity instanceof InterfaceC55058LjC) && (interfaceC55058LjC = (InterfaceC55058LjC) mo49getActivity) != null) {
                interfaceC55058LjC.onKeyBack();
                return;
            }
            return;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        mo49getActivity2.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        o.LJI(context);
        C10760bY LIZ = C10760bY.LIZ(context);
        IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8 = this.LJZL;
        o.LJI(iDBReceiverS8S0100000_8);
        LIZ.LIZLLL(iDBReceiverS8S0100000_8);
        C16970lZ.LJII(R.layout.an_);
        C16970lZ.LJII(R.layout.amz);
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        BaseDiscoverTabFragment LJJIIJ;
        super.onPause();
        this.mStatusActive = false;
        if (this.LJLJJI) {
            xl();
            MJG mjg = this.LJLJJLL;
            if (mjg != null && (LJJIIJ = mjg.LJJIIJ(mjg.LJLLI)) != null) {
                LJJIIJ.xl(true, true);
            }
        }
        this.LJLJJL = false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        Window window;
        View decorView;
        Window window2;
        BaseDiscoverTabFragment LJJIIJ;
        super.onResume();
        MJT mjt = this.LL;
        if (mjt != null && (mjt.LJI() instanceof MJW)) {
            MJU LJI = mjt.LJI();
            o.LJII(LJI, "null cannot be cast to non-null type com.ss.android.ugc.aweme.legacy.helper.Experiment5Handler");
            ((MJW) LJI).LJIIJ();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && o.LJ(C116694i1.LIZ(mo49getActivity).mv0(), this)) {
            C12460eI.LJIIIIZZ(this, null);
        }
        if (this.LJLJJI) {
            this.LJLILLLLZI = SystemClock.elapsedRealtime();
            MJG mjg = this.LJLJJLL;
            if (mjg != null && (LJJIIJ = mjg.LJJIIJ(mjg.LJLLI)) != null) {
                LJJIIJ.xl(false, true);
            }
        }
        if (getUserVisibleHint()) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) C16880lQ.LLILL(EF7.LIZIZ(), "keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.inKeyguardRestrictedInputMode()) {
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (this.LJLJJI) {
                Word word = this.LLFF;
                if (word != null) {
                    str = word.getWord();
                } else {
                    str = null;
                }
                TextUtils.isEmpty(str);
                this.LJLJJL = true;
            }
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (window2 = mo49getActivity2.getWindow()) != null) {
            window2.setBackgroundDrawable(null);
        }
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 == null || (window = mo49getActivity3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setBackground(null);
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        C12460eI.LJIIIIZZ(this, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        this.LLFFF = context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        MJG mjg;
        SuggestWordsViewModel suggestWordsViewModel;
        BaseDiscoverTabFragment LJJIIJ;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-7854303858561090518");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/discover/ui/DiscoverAndSearchFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/discover/ui/DiscoverAndSearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        boolean z2 = !z;
        this.LJLJJI = !z2;
        if (mo49getActivity() != null && this.LJLIL != null) {
            MJG mjg2 = this.LJLJJLL;
            if (mjg2 != null && (LJJIIJ = mjg2.LJJIIJ(mjg2.LJLLI)) != null) {
                LJJIIJ.xl(z2, false);
            }
            if (this.LJLJJI) {
                this.LJLILLLLZI = SystemClock.elapsedRealtime();
            } else {
                xl();
            }
        }
        if (this.LJLJJI) {
            AV1.LJIIJJI();
        }
        MJT mjt = this.LL;
        if (mjt != null) {
            if (z && (suggestWordsViewModel = (SuggestWordsViewModel) mjt.LIZLLL.getValue()) != null) {
                suggestWordsViewModel.gv0((KO1) mjt.LJ.getValue(), new MJS(mjt));
            }
            mjt.LIZIZ = z;
            MJU LJI = mjt.LJI();
            if (LJI != null) {
                LJI.LJII(z);
            }
        }
        if (z && (mjg = this.LJLJJLL) != null) {
            int i = mjg.LJLLI;
            if (i < 0) {
                mjg.LJLL = i;
                mjg.LJLLI = 0;
            }
            BaseDiscoverTabFragment LJJIIJ2 = mjg.LJJIIJ(mjg.LJLLI);
            if (LJJIIJ2 != null) {
                mjg.LJJIIJZLJL(LJJIIJ2, true);
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/discover/ui/DiscoverAndSearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void wl(String str) {
        Aweme aweme;
        String str2;
        String authorUid;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        String str3 = null;
        if (mo49getActivity != null) {
            aweme = C3SZ.LIZ(mo49getActivity).LJLJLLL;
            if (aweme != null) {
                str3 = aweme.getAid();
            }
        } else {
            aweme = null;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
            str4 = authorUid;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//search");
        buildRoute.withParam("enter_from", "discovery");
        buildRoute.withParam("search_from", "discovery");
        buildRoute.withParam("in_single_stack", true);
        buildRoute.withParam("group_id", str3);
        buildRoute.withParam("author_id", str4);
        buildRoute.withParam("search_session_id", 0);
        buildRoute.withParam("blankpage_enter_from", "discovery");
        buildRoute.withParam("blankpage_enter_method", "enter");
        if (C78685UuP.LJJJZ(str)) {
            buildRoute.withParam("enter_method", str);
        }
        Word word = this.LLFF;
        if (word != null) {
            buildRoute.withParam("search_hint_word", word.getWord());
            Word word2 = this.LLFF;
            if (word2 != null) {
                buildRoute.withParam("search_hint_word_id", word2.getId());
                buildRoute.withParam("set_hint_by_sug_word", false);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            buildRoute.withParam("set_hint_by_sug_word", true);
        }
        buildRoute.open(1, new OnActivityResultCallback() { // from class: X.4ir
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                DiscoverAndSearchFragment discoverAndSearchFragment = DiscoverAndSearchFragment.this;
                if (discoverAndSearchFragment.LJLJI > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - discoverAndSearchFragment.LJLJI;
                    if (elapsedRealtime > 0) {
                        C10K.LIZIZ(new ACallableS11S0000100_1(elapsedRealtime, 0), FMX.LIZIZ(), null);
                    }
                    discoverAndSearchFragment.LJLJI = -1L;
                }
            }
        });
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "discovery");
        c188727au.LJIIIZ("enter_method", "enter");
        if (Z9N.LIZIZ.LJII()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("has_coin_task", str2);
        FMX.LJIIL("enter_search_blankpage", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "discovery");
        c188727au2.LJIIIZ("enter_method", "enter");
        FMX.LJIIL("enter_search", c188727au2.LIZ);
        FMX.LJIIL("search_sign", new LinkedHashMap());
        C50833JxF.LIZ = System.currentTimeMillis();
        xl();
        this.LJLJI = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJZL = new IDBReceiverS8S0100000_8(this, 0);
        IntentFilter LIZ = AnonymousClass028.LIZ("android.intent.action.USER_PRESENT");
        Context context = getContext();
        o.LJI(context);
        C10760bY LIZ2 = C10760bY.LIZ(context);
        IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8 = this.LJZL;
        o.LJI(iDBReceiverS8S0100000_8);
        LIZ2.LIZIZ(iDBReceiverS8S0100000_8, LIZ);
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            this.LL = new MJT(new MJO(viewGroup, new MJJ(this)));
            FrameLayout frameLayout = this.LJLL;
            if (frameLayout != null && (findViewById = frameLayout.findViewById(R.id.llw)) != null) {
                C26338AVi.LJIIIZ(findViewById, AnonymousClass391.LIZJ(33), null, 0, null, 26);
            }
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            HomeTabViewModel.LJLJLLL.LIZ(mo49getActivity).getClass();
        }
        Context context2 = getContext();
        o.LJI(context2);
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        this.LJLJJLL = new MJG(context2, childFragmentManager);
        VW3 vw3 = this.LJLLLL;
        o.LJI(vw3);
        vw3.setAdapter(this.LJLJJLL);
        MJG mjg = this.LJLJJLL;
        o.LJI(mjg);
        mjg.notifyDataSetChanged();
        VW3 vw32 = this.LJLLLL;
        o.LJI(vw32);
        MJG mjg2 = this.LJLJJLL;
        o.LJI(mjg2);
        vw32.setOnPageChangeListener(new MJI(mjg2));
        VW3 vw33 = this.LJLLLL;
        o.LJI(vw33);
        vw33.setOffscreenPageLimit(4);
        TrendsTabFragment trendsTabFragment = new TrendsTabFragment();
        trendsTabFragment.LJLL = this;
        trendsTabFragment.LJLLI = this;
        trendsTabFragment.setArguments(new Bundle(1));
        this.LJLIL = trendsTabFragment;
        MJG mjg3 = this.LJLJJLL;
        o.LJI(mjg3);
        TrendsTabFragment trendsTabFragment2 = this.LJLIL;
        o.LJI(trendsTabFragment2);
        ((ArrayList) mjg3.LJLJLLL).add(trendsTabFragment2);
        mjg3.notifyDataSetChanged();
        ((TrendsTabViewModel) this.LJLJLJ.getValue()).Pv0(true);
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJLJ.getValue(), new TBT() { // from class: X.MJN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((TrendsTabState) obj).getCanScrollVertically());
            }
        }, new AqS191S0100000_9(this, 69));
        MJG mjg4 = this.LJLJJLL;
        if (mjg4 != null) {
            int i = mjg4.LJLLI;
            if (i < 0) {
                mjg4.LJLL = i;
                mjg4.LJLLI = 0;
            }
            BaseDiscoverTabFragment LJJIIJ = mjg4.LJJIIJ(mjg4.LJLLI);
            if (LJJIIJ != null) {
                mjg4.LJJIIJZLJL(LJJIIJ, true);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            View findViewById2 = view2.findViewById(R.id.dqx);
            if (findViewById2 != null) {
                ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                Context context3 = findViewById2.getContext();
                o.LJIIIIZZ(context3, "statusBar.context");
                layoutParams.height = C63081OpJ.LJJJJLI(context3);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View root = C16970lZ.LIZJ(R.layout.an_, mo49getActivity(), viewGroup, false);
        C53487Kyx.LIZIZ(AWY.DISCOVERY);
        if (root != null) {
            this.LJLJLLL = (ViewGroup) root.findViewById(R.id.lgf);
            this.LJLL = (FrameLayout) root.findViewById(R.id.j4i);
            this.LJLLI = (MJH) root.findViewById(R.id.jha);
            this.LJLLILLLL = (MJH) root.findViewById(R.id.jhb);
            this.LJLLJ = (ImageView) root.findViewById(R.id.aem);
            this.LJLLL = root.findViewById(R.id.j2_);
            this.LJLLLL = (VW3) root.findViewById(R.id.nb6);
            this.LJLLLLLL = (C80261Vej) root.findViewById(R.id.kyt);
            this.LJLZ = root.findViewById(R.id.kyg);
            this.LJZ = root.findViewById(R.id.vn);
            this.LJZI = root.findViewById(R.id.fs_);
            root.findViewById(R.id.f_e);
        }
        if (vl()) {
            MJH mjh = this.LJLLI;
            o.LJI(mjh);
            mjh.setVisibility(8);
            MJH mjh2 = this.LJLLILLLL;
            o.LJI(mjh2);
            mjh2.setVisibility(0);
            MJH mjh3 = this.LJLLILLLL;
            o.LJI(mjh3);
            if (!C54127LMd.LIZ.LIZ().booleanValue()) {
                mjh3.LJLILLLLZI.setVisibility(0);
                mjh3.LJLIL.setVisibility(8);
            }
        } else {
            MJH mjh4 = this.LJLLILLLL;
            o.LJI(mjh4);
            mjh4.setVisibility(8);
            MJH mjh5 = this.LJLLI;
            o.LJI(mjh5);
            mjh5.setVisibility(0);
            MJH mjh6 = this.LJLLI;
            o.LJI(mjh6);
            if (!C54127LMd.LIZ.LIZ().booleanValue()) {
                mjh6.LJLILLLLZI.setVisibility(0);
                mjh6.LJLIL.setVisibility(8);
            }
        }
        MJF mjf = new MJF(this);
        MJH mjh7 = this.LJLLI;
        if (mjh7 != null) {
            mjh7.setOnInternalClickListener(mjf);
        }
        MJH mjh8 = this.LJLLILLLL;
        if (mjh8 != null) {
            mjh8.setOnInternalClickListener(mjf);
        }
        o.LJIIIIZZ(root, "root");
        View findViewById = root.findViewById(R.id.aek);
        ImageView imageView = this.LJLLJ;
        o.LJI(imageView);
        C16880lQ.LJIILLIIL(imageView, new ACListenerS29S0100000_9(this, 90));
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 91), findViewById);
            if (vl()) {
                ImageView imageView2 = this.LJLLJ;
                o.LJI(imageView2);
                imageView2.setVisibility(8);
                findViewById.setVisibility(8);
            } else if (!vl()) {
                ImageView imageView3 = this.LJLLJ;
                o.LJI(imageView3);
                imageView3.setVisibility(0);
                findViewById.setVisibility(8);
            } else {
                ImageView imageView4 = this.LJLLJ;
                o.LJI(imageView4);
                imageView4.setVisibility(8);
                findViewById.setVisibility(0);
            }
            if (vl()) {
                FrameLayout frameLayout = this.LJLL;
                o.LJI(frameLayout);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
                marginLayoutParams.leftMargin = LIZJ;
                marginLayoutParams.setMarginStart(LIZJ);
                marginLayoutParams.setMarginEnd(0);
                FrameLayout frameLayout2 = this.LJLL;
                o.LJI(frameLayout2);
                frameLayout2.setLayoutParams(marginLayoutParams);
            }
            if (AV1.LJIIJJI()) {
                C27740Aue.LJIIIZ(8, this.LJLLL);
                if (this.LJLL != null && getContext() != null) {
                    FrameLayout frameLayout3 = this.LJLL;
                    o.LJI(frameLayout3);
                    ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                    if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                        layoutParams3.rightMargin = (int) KL2.LIZJ(getContext(), 16.0f);
                        layoutParams3.leftMargin = (int) KL2.LIZJ(getContext(), 16.0f);
                        int LIZJ2 = (int) KL2.LIZJ(getContext(), 16.0f);
                        layoutParams3.setMarginEnd(LIZJ2);
                        layoutParams3.setMarginStart(LIZJ2);
                        FrameLayout frameLayout4 = this.LJLL;
                        o.LJI(frameLayout4);
                        frameLayout4.setLayoutParams(layoutParams2);
                    }
                }
            }
            C29S c29s = null;
            root.setBackground(null);
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
            View view = (View) linkedHashMap.get(Integer.valueOf(R.id.ncx));
            if (view == null) {
                View view2 = getView();
                if (view2 != null && (view = view2.findViewById(R.id.ncx)) != null) {
                    linkedHashMap.put(Integer.valueOf(R.id.ncx), view);
                } else {
                    view = null;
                }
            }
            if (view != null) {
                view.setBackground(null);
            }
            C80261Vej c80261Vej = this.LJLLLLLL;
            if (c80261Vej != null) {
                c80261Vej.setBackground(null);
            }
            try {
                ViewTreeLifecycleOwner.set(root, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(root, this);
                C10A.LIZIZ(root, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return root;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}

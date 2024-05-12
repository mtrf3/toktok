package com.ss.android.ugc.aweme.inbox;

import X.AX8;
import X.AbstractC225698tR;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C114304eA;
import X.C116694i1;
import X.C141335gf;
import X.C188727au;
import X.C209108Io;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C53355Kwp;
import X.C57092Lx;
import X.C61447O9r;
import X.C76800UCe;
import X.C84193Sd;
import X.C90903hW;
import X.FMX;
import X.InterfaceC27853AwT;
import X.InterfaceC36571c5;
import X.InterfaceC53896LDg;
import X.InterfaceC54054LJi;
import X.LFQ;
import X.LK2;
import X.LKH;
import X.LLQ;
import X.LLY;
import X.LNZ;
import X.OSZ;
import X.QD3;
import Y.AObserverS73S0200000_9;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.InterceptHomeBackPressServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class NotificationContainer extends CommonPageFragment implements FragmentNavigationContainer, LKH, AX8, InterfaceC53896LDg, LLY {
    public boolean LJLILLLLZI;
    public View LJLJI;
    public String LJLJJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final Map<String, String> LJLJJL = C113554cx.LJJLIIIIJ(new OSZ("new_follows", "enter_new_follower"), new OSZ("activity_page", "enter_new_activities"), new OSZ("social_interaction", "enter_social_interaction"), new OSZ("system_notification", "enter_official_message"), new OSZ("shop_updates", "enter_shop_updates"), new OSZ("shop", "enter_tiktok_shop"));
    public long LJLJJLL = -1;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.LLY
    public final void Vj() {
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final boolean addFragmentToBackStack() {
        return true;
    }

    @Override // X.LK2
    public final String getEnterMethod() {
        return "notification_page";
    }

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final int getFragmentContainer() {
        return R.id.ekk;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.LLY
    public final void x9(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("notification_page");
        return analysis;
    }

    public final void xl() {
        Context context;
        ActivityC45651qj LJJIFFI;
        View view = this.LJLJI;
        if (view == null || (context = getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0();
        if (Xm0 != null && !Xm0.LJIILLIIL()) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        C57092Lx.LIZ.getClass();
        int LIZ = C61447O9r.LIZ();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height == LIZ) {
            return;
        }
        layoutParams.height = LIZ;
        view.setLayoutParams(layoutParams);
    }

    @Override // X.AX8
    public final boolean L3() {
        if (getChildFragmentManager().LJJJJIZL() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.LKH
    public final boolean LJIIJ() {
        LKH lkh;
        InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(this);
        if ((findTopFragment instanceof LKH) && (lkh = (LKH) findTopFragment) != null) {
            lkh.LJIIJ();
        }
        if (this.LJLILLLLZI && wl()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        InterfaceC27853AwT interfaceC27853AwT;
        String pageName;
        InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(this);
        if (!(findTopFragment instanceof LK2) || (interfaceC27853AwT = (InterfaceC27853AwT) findTopFragment) == null || (pageName = interfaceC27853AwT.getPageName()) == null) {
            return "";
        }
        return pageName;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterceptHomeBackPressService LIZLLL = InterceptHomeBackPressServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZIZ(this);
        }
        LFQ.LIZJ(this);
    }

    public final boolean wl() {
        if (getChildFragmentManager().LJJJJIZL() > 0) {
            FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(this);
            o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(this)");
            FragmentRoute.pop$default(fragmentNavigation, null, 1, null);
            FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        InterfaceC53896LDg interfaceC53896LDg;
        if (this.LJLJJLL != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJLL;
            if (currentTimeMillis > 100 && getAnalysis() != null && !TextUtils.isEmpty(getAnalysis().getLabelName())) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("duration", String.valueOf(currentTimeMillis));
                c188727au.LJIIIZ("enter_from", getAnalysis().getLabelName());
                FMX.LJIIL("stay_time", c188727au.LIZ);
            }
            this.LJLJJLL = -1L;
        }
        InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(this);
        if ((findTopFragment instanceof InterfaceC53896LDg) && (interfaceC53896LDg = (InterfaceC53896LDg) findTopFragment) != null) {
            interfaceC53896LDg.LLLLILI(bundle);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        InterfaceC53896LDg interfaceC53896LDg;
        o.LJIIIZ(args, "args");
        this.LJLJJLL = System.currentTimeMillis();
        InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(this);
        if ((findTopFragment instanceof InterfaceC53896LDg) && (interfaceC53896LDg = (InterfaceC53896LDg) findTopFragment) != null) {
            interfaceC53896LDg.LLLLLLZ(args);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(this);
        o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(this)");
        FragmentRoute.push$default(fragmentNavigation, "//home_inbox_fragment", null, null, 6, null);
        FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
        this.LJLILLLLZI = true;
        LFQ.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterceptHomeBackPressService LIZLLL = InterceptHomeBackPressServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZJ(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTabChangeEvent(C209108Io event) {
        String str;
        InterfaceC54054LJi interfaceC54054LJi;
        InterfaceC27853AwT interfaceC27853AwT;
        o.LJIIIZ(event, "event");
        boolean LJ = o.LJ(event.LJLILLLLZI, "NOTIFICATION");
        this.LJLILLLLZI = LJ;
        if (!LJ) {
            EasyNavigationExperimentService LJFF = EasyNavigationExperimentServiceImpl.LJFF();
            if ((LJFF != null && LJFF.LIZLLL()) || C53355Kwp.LIZIZ()) {
                return;
            }
            FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(this);
            o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(this)");
            FragmentRoute.popTo$default(fragmentNavigation, "//home_inbox_fragment", null, null, 6, null);
            FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        String str2 = event.LJLIL;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1382453013:
                    if (str2.equals("NOTIFICATION")) {
                        str = "notification_page";
                        break;
                    }
                    str = "homepage_hot";
                    break;
                case -734952021:
                    if (str2.equals("FRIENDS_TAB")) {
                        str = "homepage_friends";
                        break;
                    }
                    str = "homepage_hot";
                    break;
                case 2223327:
                    if (str2.equals("HOME")) {
                        InterfaceC36571c5 Ja = C116694i1.LIZ(mo49getActivity).Ja(str2);
                        if ((Ja instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) Ja) != null && !interfaceC54054LJi.Oe()) {
                            if (interfaceC54054LJi.lj()) {
                                str = "homepage_follow";
                                break;
                            } else if (interfaceC54054LJi.uk()) {
                                str = "homepage_popular";
                                break;
                            }
                        }
                    }
                    str = "homepage_hot";
                    break;
                case 2614219:
                    if (str2.equals("USER")) {
                        str = "personal_homepage";
                        break;
                    }
                    str = "homepage_hot";
                    break;
                case 1055811561:
                    if (str2.equals("DISCOVER")) {
                        str = "discovery";
                        break;
                    }
                    str = "homepage_hot";
                    break;
                default:
                    str = "homepage_hot";
                    break;
            }
            this.LJLJJI = str;
            InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(this);
            if (!(findTopFragment instanceof InterfaceC27853AwT) || (interfaceC27853AwT = (InterfaceC27853AwT) findTopFragment) == null) {
                return;
            }
            FMX.LJIIL((String) ((LinkedHashMap) this.LJLJJL).get(interfaceC27853AwT.getPageName()), C113554cx.LJJLIIIIJ(new OSZ("enter_from", this.LJLJJI)));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        LK2 lk2;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (!L3()) {
            InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(this);
            if ((findTopFragment instanceof LK2) && (lk2 = (LK2) findTopFragment) != null) {
                lk2.v0(enterFrom);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ScrollSwitchStateManager LIZ = C84193Sd.LIZ(mo49getActivity);
            AObserverS73S0200000_9 aObserverS73S0200000_9 = new AObserverS73S0200000_9(mo49getActivity, this, 2);
            LIZ.getClass();
            LIZ.LJLLJ.observe(this, aObserverS73S0200000_9);
        }
        this.LJLJI = view.findViewById(R.id.arj);
        xl();
    }

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
        xl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZ = C114304eA.LIZ(inflater, R.layout.rt, viewGroup, false, 16);
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

package com.ss.android.ugc.aweme.inbox;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C175256uH;
import X.C1B3;
import X.C221018lt;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C40883G2t;
import X.C55888Lwa;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79045V0n;
import X.C84193Sd;
import X.C90903hW;
import X.HG3;
import X.InterfaceC53896LDg;
import X.J9P;
import X.LJG;
import X.LJH;
import X.LKM;
import X.LKN;
import X.LKR;
import X.QD3;
import X.RBX;
import X.X1D;
import Y.IDgS347S0100000_3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class InboxShellFragment extends CommonPageFragment implements InterfaceC53896LDg {
    public InterfaceC53896LDg LJLILLLLZI;
    public AmeBaseFragment LJLJI;
    public Fragment LJLJJI;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public boolean LJLJJL = true;
    public Bundle LJLJJLL = new Bundle();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(LKM.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(LKN.LJLIL);

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void wl() {
        ActivityC45651qj mo49getActivity;
        C221018lt.LJFF("InboxShellFragment", "perform onNodeShow");
        InterfaceC53896LDg interfaceC53896LDg = this.LJLILLLLZI;
        if (interfaceC53896LDg != null) {
            interfaceC53896LDg.LLLLLLZ(this.LJLJJLL);
        }
        if (this.LJLJJI == null || (mo49getActivity = mo49getActivity()) == null) {
            return;
        }
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZJ("show_login_page_first", ((Boolean) this.LJLJL.getValue()).booleanValue());
        J9P.LIZIZ(mo49getActivity, "message", "click_inbox_tab", (Bundle) c40883G2t.LIZ, new IDgS347S0100000_3(mo49getActivity, 6));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C221018lt.LJFF("InboxShellFragment", "onDestroy");
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C221018lt.LJFF("InboxShellFragment", "onPause");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C221018lt.LJFF("InboxShellFragment", "onResume");
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        C221018lt.LJFF("InboxShellFragment", "onNodeHide");
        InterfaceC53896LDg interfaceC53896LDg = this.LJLILLLLZI;
        if (interfaceC53896LDg != null) {
            interfaceC53896LDg.LLLLILI(bundle);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ScrollSwitchStateManager LIZ = C84193Sd.LIZ(mo49getActivity);
            LIZ.LJLJJL.setValue(Boolean.FALSE);
            LIZ.tv0(this.LJLJJL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        Class<? extends Fragment> LIZIZ;
        Fragment newInstance;
        AmeBaseFragment ameBaseFragment;
        o.LJIIIZ(args, "args");
        C221018lt.LJFF("InboxShellFragment", "onNodeShow");
        this.LJLJJLL = args;
        boolean z = false;
        if (this.LJLILLLLZI == null && this.LJLJJI == null) {
            InterfaceC53896LDg interfaceC53896LDg = null;
            if (((RBX) HG3.LJIILL()).isLogin()) {
                C221018lt.LJFF("InboxShellFragment", "addFragmentIfNeed current is login");
                Class LJIIL = C55888Lwa.LIZIZ.LJIIL();
                if (LJIIL != null && (ameBaseFragment = (AmeBaseFragment) LJIIL.newInstance()) != 0) {
                    this.LJLJI = ameBaseFragment;
                    if (ameBaseFragment instanceof InterfaceC53896LDg) {
                        interfaceC53896LDg = (InterfaceC53896LDg) ameBaseFragment;
                    }
                    this.LJLILLLLZI = interfaceC53896LDg;
                    if (interfaceC53896LDg != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("addFragment ");
                        LIZ.append(ameBaseFragment);
                        C221018lt.LJFF("InboxShellFragment", X1D.LIZIZ(LIZ));
                        xl(ameBaseFragment, "tag_fragment_inbox");
                        getChildFragmentManager().LJJIL();
                        getChildFragmentManager().LJJLIL(new LJH(this), false);
                        z = true;
                    }
                }
            } else {
                C221018lt.LJFF("InboxShellFragment", "addFragmentIfNeed current is unLogin");
                HomePageCommonService homePageCommonService = (HomePageCommonService) this.LJLJLJ.getValue();
                if (homePageCommonService != null && (LIZIZ = homePageCommonService.LIZIZ()) != null && (newInstance = LIZIZ.newInstance()) != null) {
                    this.LJLJJI = newInstance;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("addFragment ");
                    LIZ2.append(newInstance);
                    C221018lt.LJFF("InboxShellFragment", X1D.LIZIZ(LIZ2));
                    Bundle bundle = new Bundle();
                    bundle.putString("tab", "UNLOGIN_NOTIFICATION");
                    newInstance.setArguments(bundle);
                    xl(newInstance, "tag_fragment_un_login");
                    getChildFragmentManager().LJJLIL(new LJH(this), false);
                    z = true;
                }
            }
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Boolean value = C84193Sd.LIZ(mo49getActivity).LJLJJI.getValue();
            o.LJI(value);
            this.LJLJJL = value.booleanValue();
            ScrollSwitchStateManager LIZ3 = C84193Sd.LIZ(mo49getActivity);
            LIZ3.tv0(true);
            LIZ3.LJLJJL.setValue(Boolean.TRUE);
        }
        LKR.LIZLLL = "NOTIFICATION";
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onNodeShow isAdd = ");
        LIZ4.append(z);
        C221018lt.LJFF("InboxShellFragment", X1D.LIZIZ(LIZ4));
        if (!z) {
            wl();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", ");
        LIZ.append(this);
        C221018lt.LJFF("InboxShellFragment", X1D.LIZIZ(LIZ));
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoginStateChangeEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoginStateChangeEvent event = ");
        LIZ.append(event);
        C221018lt.LJFF("InboxShellFragment", X1D.LIZIZ(LIZ));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        AmeBaseFragment ameBaseFragment = this.LJLJI;
        if (ameBaseFragment != null) {
            c1b3.LJJI(ameBaseFragment);
        }
        Fragment fragment = this.LJLJJI;
        if (fragment != null) {
            c1b3.LJJI(fragment);
        }
        c1b3.LJI();
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJLL = new Bundle();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C221018lt.LJFF("InboxShellFragment", "onViewCreated");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        C84193Sd.LIZ(mo49getActivity).qv0(this, LJG.LJLIL);
    }

    public final void xl(Fragment fragment, String str) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIJ(fragment, str, R.id.bs8);
        c1b3.LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replaceFragment:");
        LIZ.append(fragment);
        C221018lt.LJFF("InboxShellFragment", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int i;
        o.LJIIIZ(inflater, "inflater");
        C221018lt.LJFF("InboxShellFragment", "onCreateView");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C29S c29s = null;
        if (mo49getActivity == null) {
            frameLayout = null;
        } else {
            frameLayout = new FrameLayout(mo49getActivity);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Integer LJI = C79045V0n.LJI(R.attr.cl, mo49getActivity);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = R.color.ar;
            }
            frameLayout.setBackgroundColor(i);
            frameLayout.setId(R.id.bs8);
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                C10A.LIZIZ(frameLayout, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return frameLayout;
    }
}

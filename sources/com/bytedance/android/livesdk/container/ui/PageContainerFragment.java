package com.bytedance.android.livesdk.container.ui;

import X.ActivityC45651qj;
import X.BTI;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C29S;
import X.C30939CCh;
import X.C3C5;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CN1;
import X.CNQ;
import X.CNR;
import X.CNX;
import X.COW;
import X.InterfaceC31234CNq;
import X.JF2;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.container.config.base.PageConfig;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PageContainerFragment extends BaseFragment implements CNR, InterfaceC31234CNq, COW {
    public ViewGroup LJLJI;
    public ViewGroup LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public TextView LJLJLJ;
    public HybridFragment LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 204));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 205));

    @Override // X.COW
    public final void LJIL() {
    }

    @Override // X.COW
    public final void LLLLLLL(String str) {
    }

    public final void LJIIJ() {
        CNX cnx;
        CNX cnx2;
        HybridFragment hybridFragment = this.LJLJLLL;
        if (hybridFragment != null && (cnx = hybridFragment.LJLILLLLZI) != null && cnx.LIZ()) {
            HybridFragment hybridFragment2 = this.LJLJLLL;
            if (hybridFragment2 != null && (cnx2 = hybridFragment2.LJLILLLLZI) != null) {
                cnx2.LIZLLL();
            }
            wl();
            return;
        }
        close();
    }

    public final PageConfig vl() {
        return (PageConfig) this.LJLIL.getValue();
    }

    @Override // X.CNR
    public final void close() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IBrowserService iBrowserService;
        C30939CCh To0;
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class)) != null && (To0 = iBrowserService.To0()) != null) {
            To0.LIZ(mo49getActivity);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    public final void wl() {
        HybridFragment hybridFragment;
        CNX cnx;
        if (vl().getShowCloseAll() && (hybridFragment = this.LJLJLLL) != null && (cnx = hybridFragment.LJLILLLLZI) != null && cnx.LIZ()) {
            View view = this.LJLJJLL;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.LJLJJLL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // X.COW
    public final void LJLLI() {
        wl();
    }

    @Override // X.InterfaceC31234CNq
    public final boolean dispatchKeyEvent(KeyEvent event) {
        CNX cnx;
        o.LJIIIZ(event, "event");
        if (event.getKeyCode() != 4 || event.getAction() != 0) {
            return false;
        }
        if (!vl().getDisableBackPress()) {
            HybridFragment hybridFragment = this.LJLJLLL;
            if (hybridFragment == null || (cnx = hybridFragment.LJLILLLLZI) == null || !cnx.LIZ()) {
                return false;
            }
            LJIIJ();
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IBrowserService iBrowserService;
        C30939CCh To0;
        super.onCreate(bundle);
        if (((String) this.LJLILLLLZI.getValue()).length() > 0 && mo49getActivity() != null && (iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class)) != null && (To0 = iBrowserService.To0()) != null) {
            Object containerId = this.LJLILLLLZI.getValue();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            o.LJIIIZ(containerId, "containerId");
            ((ConcurrentHashMap) To0.LIZ).put(containerId, new WeakReference(mo49getActivity));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HybridFragment hybridFragment;
        Window window;
        ActivityC45651qj mo49getActivity;
        Resources resources;
        int hashCode;
        Resources resources2;
        TextView textView;
        Resources resources3;
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Fragment LJJJIL = getChildFragmentManager().LJJJIL("HybridFragment");
        Configuration configuration = null;
        if (LJJJIL instanceof HybridFragment) {
            hybridFragment = (HybridFragment) LJJJIL;
        } else {
            hybridFragment = null;
        }
        if (hybridFragment == null) {
            PageConfig config = vl();
            o.LJIIIZ(config, "config");
            hybridFragment = new HybridFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("argument_key_config", config);
            hybridFragment.setArguments(bundle2);
            String str = (String) this.LJLILLLLZI.getValue();
            o.LJIIIZ(str, "<set-?>");
            hybridFragment.LJLJJLL = str;
            hybridFragment.LJLJJL = this;
        }
        if (!hybridFragment.isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIIZZ(R.id.e8m, 1, hybridFragment, "HybridFragment");
            LIZ.LJI();
        }
        this.LJLJLLL = hybridFragment;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            window = mo49getActivity2.getWindow();
        } else {
            window = null;
        }
        if (window != null && (mo49getActivity = mo49getActivity()) != null) {
            C61713OJx LIZJ = C61712OJw.LIZJ(mo49getActivity);
            LIZJ.LJIIIIZZ(window.getStatusBarColor());
            LIZJ.LIZJ();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            if (vl().getHideStatusBar() || vl().getTransStatusBar()) {
                ViewGroup viewGroup = this.LJLJI;
                if (viewGroup != null) {
                    viewGroup.post(new ARunnableS41S0100000_5(this, 347));
                }
            } else {
                ViewGroup viewGroup2 = this.LJLJI;
                if (viewGroup2 != null) {
                    viewGroup2.post(new ARunnableS41S0100000_5(this, 346));
                }
            }
            if (vl().getHideStatusBar()) {
                mo49getActivity.getWindow().setFlags(1024, 1024);
                try {
                    Class<?> loadClass = C16880lQ.LLLLJ(mo49getActivity).getClassLoader().loadClass("android.os.SystemProperties");
                    Object invoke = loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0);
                    o.LJII(invoke, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) invoke).intValue() == 1 && i < 28) {
                        try {
                            Class cls = Integer.TYPE;
                            o.LJI(cls);
                            Window.class.getMethod("addExtraFlags", cls).invoke(mo49getActivity.getWindow(), 768);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            HColor statusBgColor = vl().getStatusBgColor();
            if (statusBgColor != null) {
                Integer valueOf = Integer.valueOf(statusBgColor.getColor(getContext()));
                if (valueOf.intValue() != 0) {
                    BTI.LIZ(mo49getActivity, valueOf.intValue());
                }
            }
            if (vl().getTransStatusBar()) {
                vl().setHideNavBar(true);
                LIZJ.LJIIIZ();
                BTI.LIZ(mo49getActivity, 0);
            }
            String statusFontMode = vl().getStatusFontMode();
            if (o.LJ(statusFontMode, "light")) {
                JF2.LIZ(window, true);
            } else if (o.LJ(statusFontMode, "dark")) {
                JF2.LIZ(window, false);
            } else {
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    configuration = resources.getConfiguration();
                }
                if (o.LJ(CNQ.LIZ(configuration), "dark")) {
                    JF2.LIZ(window, false);
                } else {
                    JF2.LIZ(window, true);
                }
            }
        }
        if (vl().getHideNavBar()) {
            ViewGroup viewGroup3 = this.LJLJJI;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        } else {
            View view3 = this.LJLJJL;
            if (view3 != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 454), view3);
            }
            if (vl().getShowCloseAll() && (view2 = this.LJLJJLL) != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 455), view2);
            }
            HColor navBarColor = vl().getNavBarColor();
            if (navBarColor != null) {
                Integer valueOf2 = Integer.valueOf(navBarColor.getColor(getContext()));
                int intValue = valueOf2.intValue();
                Context context2 = getContext();
                if (context2 == null || (resources3 = context2.getResources()) == null || intValue != resources3.getColor(R.color.ar)) {
                    int intValue2 = valueOf2.intValue();
                    ViewGroup viewGroup4 = this.LJLJJI;
                    if (viewGroup4 != null) {
                        viewGroup4.setBackgroundColor(intValue2);
                    }
                }
            }
            if (vl().getTitle().length() > 0 && (textView = this.LJLJLJ) != null) {
                textView.setText(vl().getTitle());
            }
            HColor titleColor = vl().getTitleColor();
            if (titleColor != null) {
                Integer valueOf3 = Integer.valueOf(titleColor.getColor(getContext()));
                int intValue3 = valueOf3.intValue();
                Context context3 = getContext();
                if (context3 == null || (resources2 = context3.getResources()) == null || intValue3 != resources2.getColor(R.color.ck)) {
                    int intValue4 = valueOf3.intValue();
                    TextView textView2 = this.LJLJLJ;
                    if (textView2 != null) {
                        textView2.setTextColor(intValue4);
                    }
                }
            }
            String navBtnType = vl().getNavBtnType();
            if (navBtnType == null || ((hashCode = navBtnType.hashCode()) == -934521548 ? !navBtnType.equals("report") : !(hashCode == 109400031 ? navBtnType.equals("share") : hashCode == 949444906 && navBtnType.equals("collect")))) {
                View view4 = this.LJLJL;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
            } else {
                View view5 = this.LJLJL;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
            }
        }
        o.LJIIIZ(vl(), "config");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dg0, viewGroup, false);
        this.LJLJI = (ViewGroup) LLLLIILL.findViewById(R.id.j7n);
        this.LJLJJI = (ViewGroup) LLLLIILL.findViewById(R.id.l_2);
        this.LJLJJL = LLLLIILL.findViewById(R.id.l_3);
        this.LJLJJLL = LLLLIILL.findViewById(R.id.l_6);
        this.LJLJL = LLLLIILL.findViewById(R.id.l_b);
        this.LJLJLJ = (TextView) LLLLIILL.findViewById(R.id.l_c);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}

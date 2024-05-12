package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C199097rd;
import X.C1B3;
import X.C1XY;
import X.C29S;
import X.C32364Cn2;
import X.C3C5;
import X.C72818Shy;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscribeInfoListFragment extends BaseFragment implements InterfaceC72822Si2 {
    public String LJLIL;

    public SubscribeInfoListFragment() {
        new LinkedHashMap();
        this.LJLIL = "";
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C72818Shy.LJII("open_native_subscription_settings", this);
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("enter_from");
            o.LJI(string);
            this.LJLIL = string;
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        List<Fragment> LJJJJLI;
        FragmentManager fragmentManager;
        if (o.LJ(c199097rd.LJLIL, "open_native_subscription_settings")) {
            IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "type", "");
            } else {
                str = null;
            }
            boolean z = false;
            if (o.LJ(str, "popup")) {
                InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
                o.LJIIIIZZ(LIZ, "getService(ISubscribeService::class.java)");
                PreviewSubscriptionSettingDialog Xr0 = ((ISubscribeService) LIZ).Xr0(0, "live_take_page", null);
                FragmentManager fragmentManager2 = getFragmentManager();
                if (fragmentManager2 != null && (LJJJJLI = fragmentManager2.LJJJJLI()) != null) {
                    for (Fragment fragment : LJJJJLI) {
                        if (fragment instanceof PreviewSubscriptionSettingDialog) {
                            if (!((LiveDialogFragment) fragment).isShowing() && (fragmentManager = getFragmentManager()) != null) {
                                C1B3 c1b3 = new C1B3(fragmentManager);
                                c1b3.LJIIL(fragment);
                                c1b3.LJI();
                            }
                        } else if (fragment instanceof SubscriptionSettingFragmentNew) {
                        }
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                }
                FragmentManager fragmentManager3 = getFragmentManager();
                if (fragmentManager3 != null && Xr0 != null) {
                    C1XY.LJJIIJZLJL(Xr0, fragmentManager3, "");
                    return;
                }
                return;
            }
            if (o.LJ(str, "fullscreen")) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null && iHostSubscription != null) {
                    Context baseContext = mo49getActivity.getBaseContext();
                    o.LJIIIIZZ(baseContext, "it.baseContext");
                    iHostSubscription.G30(baseContext, 0, "creator_tools_page");
                    return;
                }
                return;
            }
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && iHostSubscription != null) {
                Context baseContext2 = mo49getActivity2.getBaseContext();
                o.LJIIIIZZ(baseContext2, "it.baseContext");
                iHostSubscription.G30(baseContext2, 0, "creator_tools_page");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C72818Shy.LIZLLL("open_native_subscription_settings", this);
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_list());
        c32364Cn2.LIZJ("show_entrance", this.LJLIL);
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(getContext(), parse);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5m, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}

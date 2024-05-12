package Y;

import X.AnonymousClass744;
import X.C03880Dg;
import X.C188727au;
import X.C237559Tz;
import X.C243079gN;
import X.C26045AKb;
import X.C65300Pk0;
import X.C6ZT;
import X.C72870Sio;
import X.C78856UxA;
import X.C80261Vej;
import X.C80716Vm4;
import X.C81449Vxt;
import X.C82432WWu;
import X.C83551Wqh;
import X.C85824XmG;
import X.DialogC81627W1v;
import X.FMX;
import X.HG3;
import X.InterfaceC72871Sip;
import X.InterfaceC81454Vxy;
import X.RBX;
import X.WX0;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ACListenerS31S0101000_14 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS31S0101000_14 aCListenerS31S0101000_14, View view) {
        ViewPager viewPager = ((C80716Vm4) aCListenerS31S0101000_14.l0).LJLJJLL;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS31S0101000_14.i1);
        }
    }

    public static final void onClick$1(ACListenerS31S0101000_14 aCListenerS31S0101000_14, View view) {
        C81449Vxt c81449Vxt = (C81449Vxt) aCListenerS31S0101000_14.l0;
        c81449Vxt.LJLLILLLL = true;
        InterfaceC81454Vxy LLJJI = c81449Vxt.LLJJI();
        List<String> list = ((C81449Vxt) aCListenerS31S0101000_14.l0).LJLJI;
        if (list != null) {
            LLJJI.E20((String) ListProtector.get(list, aCListenerS31S0101000_14.i1), "click");
            C80261Vej c80261Vej = ((C81449Vxt) aCListenerS31S0101000_14.l0).LJLJJLL;
            if (c80261Vej != null) {
                C78856UxA tabAt = c80261Vej.getTabAt(aCListenerS31S0101000_14.i1);
                if (tabAt != null) {
                    tabAt.LIZIZ();
                }
                ViewPager viewPager = ((C81449Vxt) aCListenerS31S0101000_14.l0).LJLJJL;
                if (viewPager != null) {
                    viewPager.setCurrentItem(aCListenerS31S0101000_14.i1);
                    return;
                } else {
                    o.LJIJI("mPager");
                    throw null;
                }
            }
            o.LJIJI("mTabs");
            throw null;
        }
        o.LJIJI("tabTitles");
        throw null;
    }

    public static final void onClick$2(ACListenerS31S0101000_14 aCListenerS31S0101000_14, View view) {
        switch (aCListenerS31S0101000_14.i1) {
            case 0:
                Context context = (Context) aCListenerS31S0101000_14.l0;
                context.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "manage_account");
                FMX.LJIIL("enter_data_download", c188727au.LIZ);
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://hyd_action/dyd_main");
                buildRoute.withParam("enter_from", "settings");
                buildRoute.withParam("hide_nav_bar", true);
                buildRoute.open();
                return;
            case 1:
                ((SettingNewVersionFragment) aCListenerS31S0101000_14.l0).lambda$initUnits$9(view);
                return;
            case 2:
                ((VEVideoPublishPreviewScene) aCListenerS31S0101000_14.l0).LLLIIIL(false);
                return;
            default:
                ((C83551Wqh) aCListenerS31S0101000_14.l0).LIZJ();
                return;
        }
    }

    public static final void onClick$3(ACListenerS31S0101000_14 aCListenerS31S0101000_14, View view) {
        switch (aCListenerS31S0101000_14.i1) {
            case 0:
                Activity activity = (Activity) aCListenerS31S0101000_14.l0;
                activity.getClass();
                if (C6ZT.LIZ(view)) {
                    return;
                }
                new C237559Tz().LJII("ttelite_click_switch_to_BA", new String[0]);
                if (((RBX) HG3.LJIILL()).getCurUser().isForcePrivateAccount()) {
                    C26045AKb c26045AKb = new C26045AKb(activity);
                    c26045AKb.LJIIIIZZ(R.string.gcj);
                    c26045AKb.LJIIJ();
                    return;
                }
                SmartRouter.buildRoute(activity, C243079gN.LIZ(0, "settings")).open();
                return;
            case 1:
                ((SettingNewVersionFragment) aCListenerS31S0101000_14.l0).lambda$initUnits$74(view);
                return;
            default:
                InterfaceC72871Sip interfaceC72871Sip = ((C72870Sio) aCListenerS31S0101000_14.l0).LIZ;
                if (interfaceC72871Sip != null) {
                    C82432WWu c82432WWu = ((WX0) interfaceC72871Sip).LIZ;
                    if (c82432WWu.LJFF) {
                        c82432WWu.LJ("click_cross");
                        return;
                    } else {
                        c82432WWu.LIZJ("click_cross");
                        return;
                    }
                }
                return;
        }
    }

    public static final void onClick$4(ACListenerS31S0101000_14 aCListenerS31S0101000_14, View view) {
        switch (aCListenerS31S0101000_14.i1) {
            case 0:
                ((AnonymousClass744) ((LifecycleOwner) aCListenerS31S0101000_14.l0)).P(view, "click_name");
                return;
            default:
                PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = (PushSettingManagerFragmentSecondVersion) ((LifecycleOwner) aCListenerS31S0101000_14.l0);
                if (pushSettingManagerFragmentSecondVersion.getContext() == null) {
                    return;
                }
                if (pushSettingManagerFragmentSecondVersion.LLILL == null) {
                    DialogC81627W1v dialogC81627W1v = new DialogC81627W1v(pushSettingManagerFragmentSecondVersion.getContext());
                    pushSettingManagerFragmentSecondVersion.LLILL = dialogC81627W1v;
                    dialogC81627W1v.LJLIL = new C85824XmG(pushSettingManagerFragmentSecondVersion);
                }
                if (!(!TextUtils.isEmpty(((RBX) HG3.LJIILL()).getCurUser().getEmail()))) {
                    DialogC81627W1v dialogC81627W1v2 = pushSettingManagerFragmentSecondVersion.LLILL;
                    if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/setting/ui/dialog/EmailBindDialog", "show", dialogC81627W1v2, new Object[0], "void", new C65300Pk0(false, "()V", "-4882299050665100882")).LIZ) {
                        dialogC81627W1v2.show();
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("page_name", "notification_setting_page");
                    c188727au.LJIIIZ("exp_name", "email_notification_phase2");
                    FMX.LJIIL("show_email_bind_popup_page", c188727au.LIZ);
                    return;
                }
                pushSettingManagerFragmentSecondVersion.xl();
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("page_name", "notification_setting_page");
                c188727au2.LJIIIZ("previous_page", "notification_setting_page");
                c188727au2.LJIIIZ("exp_name", "email_notification_phase2");
                FMX.LJIIL("enter_email_notification_setting", c188727au2.LIZ);
                return;
        }
    }

    public ACListenerS31S0101000_14(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}

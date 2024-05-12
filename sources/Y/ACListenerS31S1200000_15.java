package Y;

import X.C188727au;
import X.C85897XnR;
import X.C85938Xo6;
import X.C85940Xo8;
import X.FMX;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.ui.InnerPushSettingsFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACListenerS31S1200000_15 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS31S1200000_15 aCListenerS31S1200000_15, View view) {
        ((TwoStepVerificationDetailFragment) aCListenerS31S1200000_15.l1).xl(aCListenerS31S1200000_15.s0, (AddVerificationResponse) aCListenerS31S1200000_15.l2, true);
    }

    public static final void onClick$1(ACListenerS31S1200000_15 aCListenerS31S1200000_15, View view) {
        ((TwoStepVerificationDetailFragment) aCListenerS31S1200000_15.l1).xl(aCListenerS31S1200000_15.s0, (AddVerificationResponse) aCListenerS31S1200000_15.l2, true);
    }

    public static final void onClick$2(ACListenerS31S1200000_15 aCListenerS31S1200000_15, View view) {
        ((TwoStepVerificationDetailFragment) aCListenerS31S1200000_15.l1).xl(aCListenerS31S1200000_15.s0, (AddVerificationResponse) aCListenerS31S1200000_15.l2, true);
    }

    public static final void onClick$3(ACListenerS31S1200000_15 aCListenerS31S1200000_15, View view) {
        String str;
        InnerPushSettingsFragment innerPushSettingsFragment = (InnerPushSettingsFragment) aCListenerS31S1200000_15.l1;
        if (!innerPushSettingsFragment.viewValid || innerPushSettingsFragment.getContext() == null) {
            return;
        }
        boolean z = !((C85938Xo6) aCListenerS31S1200000_15.l2).LJFF().LJZI;
        ((C85938Xo6) aCListenerS31S1200000_15.l2).LJIILIIL(z);
        C85940Xo8.LIZIZ.LIZ(z ? 1 : 0, aCListenerS31S1200000_15.s0);
        C85897XnR c85897XnR = ((InnerPushSettingsFragment) aCListenerS31S1200000_15.l1).LJLLLL;
        if (c85897XnR != null) {
            c85897XnR.LJIILL(aCListenerS31S1200000_15.s0, Integer.valueOf(z ? 1 : 0));
        }
        if (o.LJ((C85938Xo6) aCListenerS31S1200000_15.l2, ((InnerPushSettingsFragment) aCListenerS31S1200000_15.l1).Gl())) {
            IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LIZLLL(z);
        } else if (o.LJ((C85938Xo6) aCListenerS31S1200000_15.l2, ((InnerPushSettingsFragment) aCListenerS31S1200000_15.l1).Hl())) {
            NotificationManagerServiceImpl.LJIIIZ().LJ(Integer.valueOf(z ? 1 : 0));
        } else if (o.LJ((C85938Xo6) aCListenerS31S1200000_15.l2, ((InnerPushSettingsFragment) aCListenerS31S1200000_15.l1).Dl()) && z) {
            IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().LIZ();
        }
        InnerPushSettingsFragment innerPushSettingsFragment2 = (InnerPushSettingsFragment) aCListenerS31S1200000_15.l1;
        String str2 = aCListenerS31S1200000_15.s0;
        innerPushSettingsFragment2.getClass();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("label", str2);
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("inner_notification_switch", c188727au.LIZ);
    }

    public ACListenerS31S1200000_15(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj;
    }
}

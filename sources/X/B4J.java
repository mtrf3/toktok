package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class B4J {
    public static java.util.Map<String, InterfaceC28161B3l> LIZ = null;
    public static List<DrawerTabsItem> LIZIZ = null;
    public static int LIZJ = 1;
    public static BOF LIZLLL;

    public static String LIZ(Activity activity) {
        if (activity != null) {
            return C16880lQ.LJLLJ(activity.getClass());
        }
        return null;
    }

    public static B4K LIZJ(String str) {
        InterfaceC28161B3l LIZIZ2 = LIZIZ(null, str);
        if (LIZIZ2 == null) {
            return null;
        }
        return LIZIZ2.LJIJJLI();
    }

    public static BZM LIZLLL(String str) {
        B4K LIZJ2 = LIZJ(str);
        if (LIZJ2 != null) {
            return LIZJ2.x2();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC28161B3l LIZIZ(ActivityC45651qj activityC45651qj, String str) {
        if (activityC45651qj instanceof InterfaceC28161B3l) {
            return (InterfaceC28161B3l) activityC45651qj;
        }
        if (LIZ != null && !TextUtils.isEmpty(str)) {
            return (InterfaceC28161B3l) ((HashMap) LIZ).get(str);
        }
        return null;
    }

    public static void LJ(Activity activity, boolean z) {
        B4K LIZJ2;
        if (activity == null || activity.isFinishing() || (LIZJ2 = LIZJ(LIZ(activity))) == null) {
            return;
        }
        LIZJ2.T5(z, true);
        if (z) {
            return;
        }
        C08680Vs.LJIILJJIL.LJ = C08680Vs.LJIILLIIL;
    }

    public static void LJFF(ActivityC45651qj activityC45651qj, Boolean bool) {
        BZM LIZLLL2 = LIZLLL(LIZ(activityC45651qj));
        if (LIZLLL2 != null) {
            LIZLLL2.setDrawerEnable(bool.booleanValue());
        }
    }
}

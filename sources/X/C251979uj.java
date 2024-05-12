package X;

import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.TouchPoint;
import java.util.LinkedHashMap;

/* renamed from: X.9uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251979uj {
    public final java.util.Map<String, String> LIZ = new LinkedHashMap();

    public final void LIZIZ() {
        String str;
        ActivityTask LJJIIZ = C252019un.LIZ().LJJIIZ();
        if (LJJIIZ == null) {
            return;
        }
        C50436Jqq LJJIJ = C252019un.LIZ().LJJIJ();
        Integer num = null;
        TouchPoint LIZJ = C2MW.LIZ().LIZJ(6, null);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("region", AnonymousClass028.LIZJ("getDefault()", C85990Xow.LIZIZ(), "this as java.lang.String).toLowerCase(locale)"));
        c188727au.LJIIIZ("campaign", "tt_referral");
        c188727au.LJIIIZ("gameplay", "activation");
        c188727au.LIZLLL(6, "touch_point_id");
        if (LIZJ != null) {
            str = LIZJ.touchPointName;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("touch_point_name", str);
        if (LIZJ != null) {
            num = LIZJ.launchPlanId;
        }
        c188727au.LJFF(num, "launch_plan_id");
        c188727au.LJIIIZ("task_key", LJJIIZ.taskKey);
        c188727au.LJIIIZ("type", "inapp_push_activation_search");
        c188727au.LIZLLL(LJJIIZ.count, "task_total");
        c188727au.LIZLLL(LJJIJ.LJLIL, "task_count");
        c188727au.LJIIIIZZ(this.LIZ);
        FMX.LJIIL("touch_point_show", c188727au.LIZ);
    }

    public final void LIZ(String str) {
        String str2;
        String str3;
        ActivityTask LJJIIZ = C252019un.LIZ().LJJIIZ();
        if (LJJIIZ == null) {
            return;
        }
        C50436Jqq LJJIJ = C252019un.LIZ().LJJIJ();
        if (LJJIJ.LJLIL == LJJIIZ.count) {
            str2 = "click_to_claim";
        } else {
            str2 = "click_to_task";
        }
        Integer num = null;
        TouchPoint LIZJ = C2MW.LIZ().LIZJ(6, null);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("region", AnonymousClass028.LIZJ("getDefault()", C85990Xow.LIZIZ(), "this as java.lang.String).toLowerCase(locale)"));
        c188727au.LJIIIZ("campaign", "tt_referral");
        c188727au.LJIIIZ("gameplay", "activation");
        c188727au.LIZLLL(6, "touch_point_id");
        if (LIZJ != null) {
            str3 = LIZJ.touchPointName;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("touch_point_name", str3);
        if (LIZJ != null) {
            num = LIZJ.launchPlanId;
        }
        c188727au.LJFF(num, "launch_plan_id");
        c188727au.LJIIIZ("task_key", LJJIIZ.taskKey);
        c188727au.LJIIIZ("type", "inapp_push_activation_search");
        c188727au.LJIIIZ("click_position", str);
        c188727au.LIZLLL(LJJIIZ.count, "task_total");
        c188727au.LIZLLL(LJJIJ.LJLIL, "task_count");
        c188727au.LJIIIZ("button_type", str2);
        c188727au.LJIIIIZZ(this.LIZ);
        FMX.LJIIL("touch_point_click", c188727au.LIZ);
    }
}

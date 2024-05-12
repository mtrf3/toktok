package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* renamed from: X.3pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96093pt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://user/profile/");
        buildRoute.withParam("uid", str);
        buildRoute.withParam("sec_user_id", C3E5.LIZJ(str));
        buildRoute.withParam("extra_previous_page_position", "card_head");
        buildRoute.withParam("previous_page", "message");
        C05040Hs.LJ(buildRoute, "enter_from", "chat", "extra_from_pre_page", "message");
    }

    public static void LIZIZ(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            LIZ(str);
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://user/profile/");
        buildRoute.withParam("uid", str);
        buildRoute.withParam("sec_user_id", str2);
        buildRoute.withParam("previous_page_position", "other_places");
        C05040Hs.LJ(buildRoute, "previous_page", "message", "enter_from", "chat");
    }

    public static void LIZJ(String str, String str2, String str3, String str4, C57364MfI c57364MfI) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://user/profile/");
        buildRoute.withParam("uid", str);
        buildRoute.withParam("sec_user_id", C3E5.LIZJ(str));
        buildRoute.withParam("enter_method", str3);
        if (str4 != null) {
            buildRoute.withParam("bundle", C0H1.LIZ("conversation_id", str4));
        }
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            buildRoute.withParam("extra_previous_page_position", "card_head");
            buildRoute.withParam("previous_page", "message");
            buildRoute.withParam("enter_from", "chat");
            buildRoute.withParam("extra_from_pre_page", "message");
        } else {
            buildRoute.withParam("previous_page_position", "other_places");
            buildRoute.withParam("extra_from_pre_page", str2);
            buildRoute.withParam("enter_from", str2);
        }
        if (c57364MfI != null) {
            buildRoute.withParam("recommend_enter_profile_params", c57364MfI);
        }
        buildRoute.open();
    }
}

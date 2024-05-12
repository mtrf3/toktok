package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102303zu {
    public static final C102303zu LIZ = new C102303zu();

    public static void LIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("action", str);
        c188727au.LJIIIZ("platform", str2);
        FMX.LJIIL("click_dm_invitation_card", c188727au.LIZ);
    }

    public static void LIZJ(int i, String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LIZLLL(i, "action_type");
        LIZLLL.LJIIIZ(WM7.SCENE_SERVICE, "matched_friends");
        FMX.LJIIL("click_recommended_dm_permission_pop_up", LIZLLL.LIZ);
    }

    public static void LJ(RecUser user, EnumC57365MfJ actionType) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(actionType, "actionType");
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI("notification_page");
        c57362MfG.LJJIJ("guide_dm");
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = actionType;
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJJJJ(user.getRequestId());
        c57362MfG.LJJJ("inbox_first_page");
        c57362MfG.LJIILIIL();
    }

    public static void LIZIZ(int i, int i2, String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LIZLLL(i, "action_type");
        LIZLLL.LJIIIZ("banner_type", "suggested_friends_permission");
        LIZLLL.LJIIIZ(WM7.SCENE_SERVICE, "reshow_simplification");
        if (i == 3) {
            LIZLLL.LJI("dm_suggested_friends_toggle", String.valueOf(i2));
        }
        FMX.LJIIL("click_expanded_dm_permission_pop_up", LIZLLL.LIZ);
    }

    public static void LIZLLL(String str, String str2, boolean z) {
        String str3;
        C188727au LIZLLL = KNV.LIZLLL(str2, "enterMethod");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("enter_method", str2);
        if (z) {
            str3 = "single";
        } else {
            str3 = "";
        }
        LIZLLL.LJIIIZ("follow_type", str3);
        FMX.LJIIL("follow", LIZLLL.LIZ);
    }
}

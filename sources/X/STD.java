package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class STD {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJI(String str) {
        C188727au c188727au = new C188727au();
        Locale locale = Locale.ROOT;
        String lowerCase = "personal_homepage".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("enter_from", lowerCase);
        String lowerCase2 = "click_empty_avatar".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("enter_method", lowerCase2);
        String lowerCase3 = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("action_type", lowerCase3);
        FMX.LJIIL("profile_ai_avatar_entrance", c188727au.LIZ);
    }

    public static final void LJII(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("trigger", "ai_avatar");
        c188727au.LJIIIZ("pop_up_type", str);
        if (o.LJ(str, "toggle")) {
            c188727au.LJI("ai_vatar", "ai_avatar");
        }
        FMX.LJIIL("show_push_permission_pop_up", c188727au.LIZ);
    }

    public static void LJIIIIZZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("aigc_type", "slow");
        FMX.LJIIL("upload_confirm_pop_up", c188727au.LIZ);
    }

    public static void LIZ(Integer num, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "choose_num");
        }
        FMX.LJIIL("ai_avatar_choose_style_page", c188727au.LIZ);
    }

    public static final void LJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("trigger", "ai_avatar");
        c188727au.LJIIIZ("pop_up_type", str);
        c188727au.LJIIIZ("action_type", str2);
        if (o.LJ(str, "toggle")) {
            c188727au.LJI("ai_vatar", "ai_avatar");
        }
        FMX.LJIIL("click_push_permission_pop_up", c188727au.LIZ);
    }

    public static void LIZJ(Boolean bool, String str, Boolean bool2) {
        C188727au c188727au = new C188727au();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("action_type", lowerCase);
        if (bool != null) {
            c188727au.LJFF(Boolean.valueOf(bool.booleanValue()), "image_loaded");
        }
        if (bool2 != null) {
            c188727au.LJFF(Boolean.valueOf(bool2.booleanValue()), "is_half_page");
        }
        FMX.LJIIL("ai_avatar_intro_page", c188727au.LIZ);
    }

    public static final void LJFF(String str, ST9 status, Integer num) {
        String str2;
        o.LJIIIZ(status, "status");
        int i = STB.LIZ[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str2 = "fail";
                    } else {
                        str2 = "in_queue";
                    }
                } else {
                    str2 = "try_new";
                }
            } else {
                str2 = "success";
            }
        } else {
            str2 = "in_progress";
        }
        C188727au c188727au = new C188727au();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("action_type", lowerCase);
        String lowerCase2 = str2.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("status", lowerCase2);
        c188727au.LJFF(num, "index");
        FMX.LJIIL("edit_profile_ai_avatar_banner", c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2, Long l, String str3, String str4) {
        C188727au LIZLLL = KNV.LIZLLL(str4, "status");
        LIZLLL.LJIIIZ("action_type", str2);
        LIZLLL.LJIIIZ("path", str);
        LIZLLL.LJFF(l, "duration");
        LIZLLL.LJIIIZ("enter_from", str3);
        LIZLLL.LJIIIZ("status", str4);
        FMX.LJIIL("ai_avatar_creating_page", LIZLLL.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, int i, Integer num, Integer num2, int i2) {
        String str5;
        String str6;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        String str7 = null;
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        C188727au c188727au = new C188727au();
        if (str != null) {
            str5 = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("path", str5);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJIIIZ("action_type", lowerCase);
        if (str3 != null) {
            str6 = str3.toLowerCase(locale);
            o.LJIIIIZZ(str6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("enter_from", str6);
        if (str4 != null) {
            str7 = str4.toLowerCase(locale);
            o.LJIIIIZZ(str7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        c188727au.LJIIIZ("enter_method", str7);
        c188727au.LIZLLL(i, "download_num");
        c188727au.LJFF(num, "generate_more_cnt");
        if (num2 != null) {
            c188727au.LIZLLL(num2.intValue(), "initial_image_cnt");
        }
        FMX.LJIIL("ai_avatar_choose_avatar_page", c188727au.LIZ);
    }
}

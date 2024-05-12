package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.Locale;
import ujb.o;
import ujb.s;

/* renamed from: X.ARs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26244ARs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("enter_method", str2);
        FMX.LJIIL("customize_fyp_entrance_show", LIZLLL.LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str2);
        FMX.LJIIL("enter_customize_fyp", c188727au.LIZ);
    }

    public static void LJFF(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("source_page", str);
        c188727au.LJIIIZ("fail_reason", str2);
        FMX.LJIIL("customize_fyp_recognize_fail", c188727au.LIZ);
    }

    public static void LJIIIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("source_page", str);
        c188727au.LJIIIZ("toast_type", str2);
        FMX.LJIIL("customize_fyp_toast_show", c188727au.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("enter_method", str2);
        LIZLLL.LJIIIZ("source_page", str3);
        FMX.LJIIL("customize_fyp_recognize_cancel", LIZLLL.LIZ);
    }

    public static final void LJ(String str, String str2, String str3) {
        String str4;
        if (str != null) {
            Locale locale = Locale.US;
            str4 = C141415gn.LIZIZ(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str4 = "";
        }
        String str5 = "more";
        if (!o.LJJJLIIL(str4, "more", false)) {
            str5 = "fewer";
            if (!o.LJJJLIIL(str4, "fewer", false) && !o.LJJJLIIL(str4, "less", false)) {
                str5 = "no";
                if (!o.LJJJLIIL(str4, "no", false)) {
                    str5 = "reset";
                    if (!s.LJJJLZIJ(str4, "reset", false)) {
                        str5 = "others";
                    }
                }
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("adjust_content", str4);
        c188727au.LJIIIZ("source_page", str2);
        c188727au.LJIIIZ("adjustment_type", str5);
        c188727au.LJIIIZ("final_status", str3);
        FMX.LJIIL("customize_fyp_final_status", c188727au.LIZ);
    }

    public static void LJI(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("source_page", str);
        c188727au.LJIIIZ("fail_reason", str2);
        c188727au.LJIIIZ("retry_type", str3);
        FMX.LJIIL("customize_fyp_recognize_retry", c188727au.LIZ);
    }

    public static final void LJIIIIZZ(String str, Option option, boolean z) {
        String str2;
        String str3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("survey_id", str);
        if (option != null) {
            str2 = option.getName();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("adjust_fyp_options", str2);
        if (z) {
            str3 = "select";
        } else {
            str3 = "unselect";
        }
        c188727au.LJIIIZ("click_type", str3);
        FMX.LJIIL("customize_fyp_survey_click", c188727au.LIZ);
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "long_press");
        c188727au.LIZLLL(i, "position");
        c188727au.LJIIIZ("current_page", str2);
        c188727au.LJIIIZ("sug_content", str3);
        FMX.LJIIL("click_sug_prompt", c188727au.LIZ);
    }

    public static void LJII(int i, String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "long_press");
        c188727au.LIZLLL(i, "position");
        c188727au.LJIIIZ("current_page", str2);
        c188727au.LJIIIZ("sug_content", str3);
        FMX.LJIIL("sug_prompt_show", c188727au.LIZ);
    }
}

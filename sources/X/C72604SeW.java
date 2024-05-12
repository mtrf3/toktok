package X;

import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.SeW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72604SeW {
    public static String LIZ = "profile_photo_page";

    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "avatar_hub");
        c188727au.LJIIIZ("exit_method", str);
        FMX.LJIIL("cancel_more_option_avatar_profile", c188727au.LIZ);
    }

    public static void LIZIZ(String str) {
        String valueOf = String.valueOf(new Date().getTime());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("item_id", str);
        c188727au.LJIIIZ("start_time", valueOf);
        c188727au.LJIIIZ("enter_from", LIZ);
        FMX.LJIIL("choose_starter_avatar", c188727au.LIZ);
    }

    public static void LIZJ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        String valueOf = String.valueOf(new Date().getTime());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", "click");
        c188727au.LJIIIZ("start_time", valueOf);
        FMX.LJIIL("create_avatar", c188727au.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        C188727au LIZLLL = KNV.LIZLLL(str3, "category");
        LIZLLL.LJIIIZ("item_id", str);
        LIZLLL.LJIIIZ("item_tab", str2);
        LIZLLL.LJIIIZ("item_subcategory", str3);
        LIZLLL.LJIIIZ("color", str4);
        FMX.LJIIL("select_avatar_item", LIZLLL.LIZ);
    }
}

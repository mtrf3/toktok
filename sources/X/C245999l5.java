package X;

/* renamed from: X.9l5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245999l5 {
    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("target", str);
        FMX.LJIIL("block_confirm", c188727au.LIZ);
    }

    public static void LIZIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("enter_method", "button");
        c188727au.LJIIIZ("rec_type", str2);
        c188727au.LIZLLL(i, "relation_tag");
        c188727au.LJIIIZ("to_user_type", str3);
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("show_airplane_message_button", c188727au.LIZ);
    }

    public static void LIZLLL(int i, String str, boolean z, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("user_id", str);
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LJIIIZ("enter_method", "button");
        c188727au.LIZLLL(z ? 1 : 0, "is_enterprise");
        c188727au.LJIIIZ("rec_type", str2);
        c188727au.LIZLLL(i, "relation_tag");
        c188727au.LJIIIZ("to_user_type", str3);
        FMX.LJIIL("show_message_button", c188727au.LIZ);
    }
}

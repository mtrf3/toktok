package X;

/* renamed from: X.9H4, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9H4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("enter_method", str);
        FMX.LJIIL("enter_qr_code_page", c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", str);
        if (str2 != null && str2.length() != 0) {
            c188727au.LJI("icon_type", str2);
        }
        FMX.LJIIL("qr_code_icon", c188727au.LIZ);
    }
}

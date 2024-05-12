package X;

/* renamed from: X.6zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178456zR {
    public static String LIZ = "personal_homepage";
    public static boolean LIZIZ;

    public static String LIZIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                return "click_personal_collection";
            }
            throw new IllegalArgumentException("wrong action value");
        }
        return "show_personal_collection";
    }

    public static C188727au LIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("content", str);
        c188727au.LJIIIZ("enter_from", str2);
        return c188727au;
    }

    public static void LIZJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZ);
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("tab_name", str2);
        FMX.LJIIL("change_personal_collection_tab", c188727au.LIZ);
    }
}

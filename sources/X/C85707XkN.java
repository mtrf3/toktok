package X;

/* renamed from: X.XkN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85707XkN {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            if (!bool.booleanValue()) {
                return "cold_launch";
            }
        }
        return "click_add_email_popup";
    }

    public static String LIZIZ(Integer num) {
        if (num == null) {
            return "unknown";
        }
        num.intValue();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return "unknown";
                }
                return "personal_homepage";
            }
            return "notification_page";
        }
        return "homepage_hot";
    }

    public static void LIZJ(Boolean bool, String str, Integer num) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", LIZIZ(num));
        c35936E8m.LIZLLL("enter_method", LIZ(bool));
        c35936E8m.LIZ(C61851OPf.LIZIZ(num), "show_index");
        c35936E8m.LIZLLL("type", str);
        c35936E8m.LIZLLL("bind_type", "email");
        FMX.LJIIL("add_email_page_click", c35936E8m.LIZ);
    }

    public static void LIZLLL(Boolean bool, String str, Integer num) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", LIZIZ(num));
        c35936E8m.LIZLLL("enter_method", LIZ(bool));
        c35936E8m.LIZ(C61851OPf.LIZIZ(num), "show_index");
        c35936E8m.LIZLLL("type", str);
        FMX.LJIIL("add_email_popup_click", c35936E8m.LIZ);
    }
}

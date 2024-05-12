package X;

/* loaded from: classes14.dex */
public final class UUF {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(int i) {
        return i != 1 ? i != 2 ? i != 6 ? "" : "mlbb" : "fb" : "contact";
    }

    public static void LIZIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        c188727au.LJIIIZ("action_type", "click");
        FMX.LJIIL("click_live_event_icon", c188727au.LIZ);
    }

    public static void LIZ(int i) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_setting");
        c188727au.LJIIIZ("platform", LIZJ(i));
        FMX.LJIIL("remove_sync_auth", c188727au.LIZ);
    }

    public static void LJ(int i) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_setting");
        c188727au.LJIIIZ("platform", LIZJ(i));
        FMX.LJIIL("remove_sync_pop", c188727au.LIZ);
    }

    public static void LJFF(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL(" remove_result", c188727au.LIZ);
    }

    public static void LJI(int i) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_setting");
        c188727au.LJIIIZ("method", "manual");
        c188727au.LJIIIZ("to_status", "off");
        c188727au.LJIIIZ("platform", LIZJ(i));
        FMX.LJIIL("switch_sync_auth", c188727au.LIZ);
    }

    public static void LJII(int i) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_setting");
        c188727au.LJIIIZ("method", "manual");
        c188727au.LJIIIZ("to_status", "on");
        c188727au.LJIIIZ("platform", LIZJ(i));
        FMX.LJIIL("switch_sync_auth", c188727au.LIZ);
    }

    public static void LIZLLL(int i, boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_setting");
        if (z) {
            str = "remove";
        } else {
            str = "cancel";
        }
        c188727au.LJIIIZ("result", str);
        c188727au.LJIIIZ("platform", LIZJ(i));
        FMX.LJIIL("confirm_remove_sync_pop", c188727au.LIZ);
    }
}

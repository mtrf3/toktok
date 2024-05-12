package X;

/* loaded from: classes5.dex */
public final class ALQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "notification_bell");
        c188727au.LJIIIZ("enter_reason", "leave");
        FMX.LJIIL("push_pre_permission_show", c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C188727au LIZ2 = C78928UyK.LIZ(str2, "enterFrom", str3, "previousPage");
        LIZ2.LJIIIZ("action_type", str);
        LIZ2.LJIIIZ("enter_from", str2);
        LIZ2.LJIIIZ("previous_page", str3);
        LIZ2.LJIIIZ("to_anchor", str4);
        FMX.LJIIL("livesdk_notification_bell_nudge", LIZ2.LIZ);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str3, "previous_page");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LIZLLL(i, "follow_status");
        LIZ2.LJIIIZ("to_user_id", str2);
        LIZ2.LJIIIZ("previous_page", str3);
        LIZ2.LJIIIZ("to_status", str4);
        FMX.LJIIL("change_notification_preference", LIZ2.LIZ);
    }
}

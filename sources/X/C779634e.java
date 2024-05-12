package X;

/* renamed from: X.34e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C779634e {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, String str3, String str4, Integer num, long j) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "eventSender");
        if (str == null) {
            str = "";
        }
        LIZ3.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ3.put("group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ3.put("author_id", str3);
        LIZ3.put("is_tt_app", String.valueOf(true));
        LIZ3.put("casting_device_id", str4);
        LIZ3.put("app_id", "");
        if (num != null) {
            num.intValue();
            LIZ3.put("app_id", num.toString());
        }
        LIZ3.put("loading_time", String.valueOf(j));
        LIZ2.LIZIZ("casting_playback_modal_show", LIZ3);
    }

    public static void LIZ(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "eventSender");
        if (str == null) {
            str = "";
        }
        LIZ3.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ3.put("group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ3.put("author_id", str3);
        LIZ3.put("is_autoscroll", String.valueOf(z));
        if (str4 == null) {
            str4 = "";
        }
        LIZ3.put("tv_device_name", str4);
        LIZ3.put("is_tt_app", String.valueOf(true));
        LIZ3.put("casting_device_id", str5);
        LIZ3.put("action_from", str6);
        LIZ2.LIZIZ("casting_disconnect_device", LIZ3);
    }
}

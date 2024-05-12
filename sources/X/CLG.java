package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CLG {
    public static void LIZIZ(String str) {
        C29822Bn8.LIZIZ("livesdk_safety_reminder_popup_show", C03660Ck.LIZJ("show_page", str));
    }

    public static void LIZ(String str, String str2) {
        C29822Bn8.LIZIZ("livesdk_safety_reminder_click", C45243HpH.LIZ("click_type", str, "show_page", str2));
    }

    public static void LIZJ(String str, String str2, String str3) {
        HashMap LIZ = C45243HpH.LIZ("click_type", str, "unavailable_event", str2);
        if (str3 != null) {
            LIZ.put("popup_entrance", str3);
        }
        C29822Bn8.LIZIZ("livesdk_gifting_recharge_unavailable_click", LIZ);
    }

    public static void LIZLLL(int i, String str, String str2) {
        HashMap LIZJ = C03660Ck.LIZJ("unavailable_event", str);
        if (str2 != null) {
            LIZJ.put("popup_entrance", str2);
        }
        LIZJ.put("error_code", String.valueOf(i));
        C29822Bn8.LIZIZ("livesdk_gifting_recharge_unavailable_popup_show", LIZJ);
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RC0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJI(EnumC85644XjM inputType, boolean z) {
        o.LJIIIZ(inputType, "inputType");
        if (!z) {
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(inputType.ordinal(), "input_type");
        FMX.LJIIL("paste_verify_success", c35936E8m.LIZ);
    }

    public static void LIZ(String str, String str2, String str3) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str2);
        c35936E8m.LIZLLL("enter_method", str);
        c35936E8m.LIZLLL("page", str3);
        FMX.LJIIL("phone_binding_show", c35936E8m.LIZ);
    }

    public static void LJ(Integer num, String enterMethod, String str) {
        int i;
        o.LJIIIZ(enterMethod, "enterMethod");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", str);
        c35936E8m.LIZLLL("enter_method", enterMethod);
        if (num == null || num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        c35936E8m.LIZ(i, "is_success");
        c35936E8m.LIZ(1, "is_register");
        if (num == null) {
            c35936E8m.LIZJ("error_code", "");
        } else {
            c35936E8m.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("register_click_next_result", c35936E8m.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        if (z) {
            str4 = "start_phone_typing";
        } else {
            str4 = "start_email_typing";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str2);
        c35936E8m.LIZLLL("enter_method", str);
        c35936E8m.LIZLLL("login_panel_type", str3);
        FMX.LJIIL(str4, c35936E8m.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        if (!C62783OkV.LIZ()) {
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str2);
        c35936E8m.LIZLLL("enter_method", str3);
        c35936E8m.LIZLLL("login_panel_type", "signup_login");
        c35936E8m.LIZLLL("submit_type", str4);
        FMX.LJIIL(str, c35936E8m.LIZ);
    }

    public static void LJFF(long j, String str, boolean z, String str2, String str3) {
        LIZJ(Long.valueOf(j), "login_signup_email_username_result", str, str2, str3, z);
    }

    public static void LIZJ(Long l, String str, String str2, String str3, String str4, boolean z) {
        int i;
        if (!C62783OkV.LIZ()) {
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str2);
        c35936E8m.LIZLLL("enter_method", str3);
        c35936E8m.LIZLLL("login_panel_type", "signup_login");
        c35936E8m.LIZLLL("submit_type", str4);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i, "result");
        if (l != null) {
            c35936E8m.LIZIZ(l.longValue(), "response_time");
        }
        FMX.LJIIL(str, c35936E8m.LIZ);
    }
}

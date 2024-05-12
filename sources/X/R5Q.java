package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5Q {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, boolean z2) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(z ? 1 : 0, "cloud_service_status");
        c35936E8m.LIZ(z2 ? 1 : 0, "cloud_storage_status");
        FMX.LJIIL("check_ocl_status", c35936E8m.LIZ);
    }

    public static void LIZLLL(Integer num, boolean z) {
        int i;
        C35936E8m c35936E8m = new C35936E8m();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i, "is_success");
        if (num != null) {
            c35936E8m.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("oneclick_csrf_retry", c35936E8m.LIZ);
    }

    public static void LIZIZ(Integer num, String enterFrom, boolean z) {
        int i;
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i, "is_success");
        if (num != null) {
            c35936E8m.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("check_save_login_popup", c35936E8m.LIZ);
    }

    public static void LJFF(int i, String enterFrom, boolean z) {
        int i2;
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", "popup");
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c35936E8m.LIZ(i2, "is_saved");
        c35936E8m.LIZ(i, "show_index");
        FMX.LJIIL("save_login_info_click", c35936E8m.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("enter_method", str2);
        if (str3 == null) {
            str3 = "";
        }
        c35936E8m.LIZLLL("login_panel_type", str3);
        c35936E8m.LIZLLL("exit_method", str4);
        FMX.LJIIL("close_login_notify", c35936E8m.LIZ);
    }

    public static void LJ(BaseLoginMethod baseLoginMethod, String str, String str2, String str3, String platform) {
        String LIZIZ;
        o.LJIIIZ(platform, "platform");
        C35936E8m c35936E8m = new C35936E8m();
        String str4 = "";
        if (str == null) {
            str = "";
        }
        c35936E8m.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c35936E8m.LIZLLL("enter_method", str2);
        if (str3 == null) {
            str3 = "";
        }
        c35936E8m.LIZLLL("login_panel_type", str3);
        if (baseLoginMethod != null) {
            str4 = R5D.LIZ(baseLoginMethod);
        }
        c35936E8m.LIZLLL("account_type", str4);
        if (baseLoginMethod != null && (LIZIZ = R5D.LIZIZ(baseLoginMethod)) != null) {
            platform = LIZIZ;
        }
        c35936E8m.LIZLLL("platform", platform);
        FMX.LJIIL("select_oneclick_account", c35936E8m.LIZ);
    }

    public static void LJI(String enterFrom, String str, boolean z, Boolean bool, Integer num) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        if (str == null) {
            str = "";
        }
        c35936E8m.LIZLLL("enter_method", str);
        c35936E8m.LIZ(z ? 1 : 0, "is_success");
        if (bool != null) {
            c35936E8m.LIZ(bool.booleanValue() ? 1 : 0, "status");
        }
        if (num != null) {
            c35936E8m.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("save_login_info_result", c35936E8m.LIZ);
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XiJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85579XiJ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static String LIZ() {
        String LIZJ = C82727WdP.LIZJ();
        switch (LIZJ.hashCode()) {
            case 47802638:
                if (LIZJ.equals("25001")) {
                    return "RU MTS";
                }
                return C82727WdP.LIZJ();
            case 47802639:
                if (LIZJ.equals("25002")) {
                    return "RU MegaFon";
                }
                return C82727WdP.LIZJ();
            case 47802699:
                if (LIZJ.equals("25020")) {
                    return "RU Tele2";
                }
                return C82727WdP.LIZJ();
            case 47802925:
                if (LIZJ.equals("25099")) {
                    return "RU Beeline";
                }
                return C82727WdP.LIZJ();
            default:
                return C82727WdP.LIZJ();
        }
    }

    public static void LIZIZ(boolean z, boolean z2) {
        String str;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("carrier", LIZ());
        c35936E8m.LIZ(z2 ? 1 : 0, "mobile_id_status");
        if (z) {
            str = "after";
        } else {
            str = "before";
        }
        c35936E8m.LIZLLL("before_continue", str);
        FMX.LJIIL("carrier_detection", c35936E8m.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("exit_method", str);
        c35936E8m.LIZLLL("platform", str2);
        c35936E8m.LIZLLL("carrier", LIZ());
        c35936E8m.LIZ(C68972R5c.LIZLLL("show_phone_account_create"), "stay_time");
        FMX.LJIIL("exit_phone_account_create", c35936E8m.LIZ);
    }

    public static void LJ(String str, String verifyStatus) {
        o.LJIIIZ(verifyStatus, "verifyStatus");
        C68972R5c.LIZ.put("verify_request_result", Long.valueOf(System.currentTimeMillis()));
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("mode", "si");
        c35936E8m.LIZLLL("verification_type", str);
        c35936E8m.LIZLLL("carrier", LIZ());
        c35936E8m.LIZLLL("verify_status", verifyStatus);
        c35936E8m.LIZ(C68972R5c.LIZLLL("authorize_request_result"), "stay_time");
        FMX.LJIIL("verify_request_result", c35936E8m.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C68972R5c.LIZ.put("phone_instant_login_click", Long.valueOf(System.currentTimeMillis()));
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("click_method", str);
        c35936E8m.LIZLLL("enter_from", str2);
        c35936E8m.LIZLLL("enter_method", str3);
        c35936E8m.LIZLLL("carrier", LIZ());
        c35936E8m.LIZLLL("mode", "si");
        c35936E8m.LIZ(C68972R5c.LIZLLL("login_notify"), "stay_time");
        FMX.LJIIL("phone_instant_login_click", c35936E8m.LIZ);
    }
}

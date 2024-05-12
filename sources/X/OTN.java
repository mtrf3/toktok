package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class OTN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(C188727au c188727au, String str) {
        c188727au.LJIIIZ("result", "success");
        c188727au.LJIIIZ("api_path", str);
        FMX.LJIIL("auth_server_error", c188727au.LIZ);
    }

    public static C188727au LIZ(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("auth_app", str);
        c188727au.LJIIIZ("channel", str2);
        c188727au.LJIIIZ("enter_from", "authorize_screen");
        if (z) {
            str5 = "qr_code";
        } else {
            str5 = "android";
        }
        c188727au.LJIIIZ("enter_method", str5);
        c188727au.LJIIIZ("sdk_name", str3);
        c188727au.LJIIIZ("sdk_version", str4);
        return c188727au;
    }

    public static void LIZIZ(C188727au c188727au, Integer num, String str, String str2, Context context) {
        c188727au.LJIIIZ("result", "fail");
        c188727au.LJFF(num, "error_code");
        c188727au.LJIIIZ("error_msg", str);
        c188727au.LJIIIZ("api_path", str2);
        c188727au.LIZLLL(C48203Ivv.LJ(context) ? 1 : 0, "is_network_available");
        c188727au.LIZLLL(C48203Ivv.LIZIZ(context).getValue(), "network_type");
        FMX.LJIIL("auth_server_error", c188727au.LIZ);
    }
}

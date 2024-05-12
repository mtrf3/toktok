package X;

import android.os.Bundle;

/* renamed from: X.R5q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68986R5q {
    public static final C68987R5r LIZ = new C68987R5r();
    public static long LIZIZ;

    public static final void LIZ(boolean z, int i, String str, Bundle bundle) {
        String str2;
        String string;
        C68987R5r c68987R5r = LIZ;
        int i2 = !z ? 1 : 0;
        String str3 = "";
        if (bundle == null || (str2 = bundle.getString("login_path", "")) == null) {
            str2 = "";
        }
        switch (str2.hashCode()) {
            case -1500610442:
                if (!str2.equals("phone_sms_two_factor_email_code")) {
                    return;
                }
                Q13.LIZIZ("monitor_login_phone_sms_2sv_email_code", i2, C68987R5r.LIZ(c68987R5r, i, str));
                return;
            case -1250497972:
                if (!str2.equals("phone_password")) {
                    return;
                }
                c68987R5r.LIZLLL(i, str, z);
                return;
            case -1028668664:
                if (!str2.equals("phone_sms")) {
                    return;
                }
                c68987R5r.LJ(i, str, z);
                return;
            case -262499015:
                if (!str2.equals("third_party_auth")) {
                    return;
                }
                if (bundle != null && (string = bundle.getString("platform", "")) != null) {
                    str3 = string;
                }
                Q13.LIZIZ("monitor_login_thirdparty", i2, C68987R5r.LIZIZ(i, str, str3));
                return;
            case 761206973:
                if (!str2.equals("email_password_two_factor_sms")) {
                    return;
                }
                Q13.LIZIZ("monitor_login_email_2sv_sms", i2, C68987R5r.LIZ(c68987R5r, i, str));
                return;
            case 1440398223:
                if (!str2.equals("email_or_username")) {
                    return;
                }
                c68987R5r.LIZJ(i2, i, str);
                return;
            case 1778733764:
                if (!str2.equals("reset_password_for_phone")) {
                    return;
                }
                Q13.LIZIZ("reset_password_for_phone", i2, C68987R5r.LIZ(c68987R5r, i, str));
                return;
            case 1836959948:
                if (!str2.equals("email_password_two_factor_email_code")) {
                    return;
                }
                Q13.LIZIZ("monitor_login_email_password_2sv_email_code", i2, C68987R5r.LIZ(c68987R5r, i, str));
                return;
            case 1933604833:
                if (!str2.equals("phone_sms_two_factor_password")) {
                    return;
                }
                Q13.LIZIZ("monitor_login_phone_sms_2sv_password", i2, C68987R5r.LIZ(c68987R5r, i, str));
                return;
            default:
                return;
        }
    }
}

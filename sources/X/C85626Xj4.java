package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xj4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85626Xj4 {
    public static EnumC69113RAn LIZIZ(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 300626556) {
            if (hashCode != 312290780) {
                if (hashCode == 1972338561 && str.equals("totp_verify")) {
                    return EnumC69113RAn.VERIFY_TOTP;
                }
            } else if (str.equals("mobile_sms_verify")) {
                return EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
            }
        } else if (str.equals("email_verify")) {
            return EnumC69113RAn.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV;
        }
        return EnumC69113RAn.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
    }

    public static String LIZ(Context context, String str) {
        if (C52927Kpv.LIZ()) {
            int hashCode = str.hashCode();
            if (hashCode != 300626556) {
                if (hashCode != 312290780) {
                    if (hashCode == 1972338561 && str.equals("totp_verify")) {
                        String string = context.getString(R.string.t7u);
                        o.LJIIIIZZ(string, "context.getString(R.stri…ethodSheet_authAppOption)");
                        return string;
                    }
                } else if (str.equals("mobile_sms_verify")) {
                    String string2 = context.getString(R.string.t7x);
                    o.LJIIIIZZ(string2, "context.getString(R.stri…nMethodSheet_phoneOption)");
                    return string2;
                }
            } else if (str.equals("email_verify")) {
                String string3 = context.getString(R.string.t7v);
                o.LJIIIIZZ(string3, "context.getString(R.stri…nMethodSheet_emailOption)");
                return string3;
            }
            String string4 = context.getString(R.string.t7v);
            o.LJIIIIZZ(string4, "context.getString(R.stri…nMethodSheet_emailOption)");
            return string4;
        }
        int hashCode2 = str.hashCode();
        if (hashCode2 != 300626556) {
            if (hashCode2 != 312290780) {
                if (hashCode2 == 1972338561 && str.equals("totp_verify")) {
                    String string5 = context.getString(R.string.sge);
                    o.LJIIIIZZ(string5, "context.getString(R.stri…thodOption_authenticator)");
                    return string5;
                }
            } else if (str.equals("mobile_sms_verify")) {
                String string6 = context.getString(R.string.hxn);
                o.LJIIIIZZ(string6, "context.getString(R.string.login_send_code_sms)");
                return string6;
            }
        } else if (str.equals("email_verify")) {
            String string7 = context.getString(R.string.hxm);
            o.LJIIIIZZ(string7, "context.getString(R.string.login_send_code_email)");
            return string7;
        }
        String string8 = context.getString(R.string.hxm);
        o.LJIIIIZZ(string8, "context.getString(R.string.login_send_code_email)");
        return string8;
    }
}

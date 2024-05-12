package X;

import android.telephony.TelephonyManager;

/* renamed from: X.CJv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31135CJv {
    public String LIZ;

    public final String LIZ() {
        String str;
        String str2;
        synchronized (this) {
            if (this.LIZ == null) {
                try {
                    str = LIZIZ();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    str = "";
                }
                this.LIZ = str;
            }
            str2 = this.LIZ;
        }
        return str2;
    }

    public static String LIZIZ() {
        if (((TelephonyManager) C16880lQ.LLILL(EF7.LIZIZ(), "phone")).getPhoneType() == 2) {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getMethod("get", String.class).invoke(cls, "ro.cdma.home.operator.numeric")).substring(0, 3);
        }
        int i = EF7.LIZIZ().getResources().getConfiguration().mcc;
        if (i == 0) {
            return "";
        }
        return String.valueOf(i);
    }
}

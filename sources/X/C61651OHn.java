package X;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.OHn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61651OHn {
    public static final String LIZIZ() {
        String str;
        String str2;
        String str3 = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(EF7.LIZIZ(), "phone");
            if (!C34049DXx.LIZ()) {
                str = telephonyManager.getSimCountryIso();
            } else {
                if (TextUtils.isEmpty(C39248Fam.LJIJI)) {
                    C39248Fam.LJIJI = telephonyManager.getSimCountryIso();
                }
                str = C39248Fam.LJIJI;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
        }
        if (C39684Fho.LIZ()) {
            String str4 = "US";
            if (TextUtils.isEmpty(str)) {
                str3 = C85990Xow.LJFF();
                if (TextUtils.isEmpty(str3)) {
                    str3 = C85990Xow.LIZJ();
                }
                if (TextUtils.isEmpty(str3)) {
                    str2 = "US";
                } else {
                    str3 = str3.toUpperCase(Locale.US);
                    str2 = str3;
                }
            } else {
                str2 = str;
            }
            if (!TextUtils.equals(str, "CN") && !TextUtils.equals(str3, "CN")) {
                str4 = str2;
            }
            String string = F9J.LIZIZ(EF7.LIZIZ(), 0, "test_setting").getString("pref_carrier", str4);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return str;
    }

    public static final String LIZ() {
        String LIZIZ = LIZIZ();
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = C85990Xow.LJFF();
            if (TextUtils.isEmpty(LIZIZ)) {
                LIZIZ = C85990Xow.LIZJ();
            }
        }
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = "";
        }
        return LIZIZ.toUpperCase();
    }

    public static final boolean LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB").contains(str.toUpperCase());
    }
}

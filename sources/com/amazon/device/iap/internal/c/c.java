package com.amazon.device.iap.internal.c;

import X.C06540Nm;
import X.C16880lQ;
import X.C25620zW;
import X.F9J;
import X.UPJ;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class c {
    public static c a = new c();
    public static final String b = C16880lQ.LJLLJ(c.class);
    public static final String c;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c.class.getName());
        LIZ.append("_PREFS_");
        c = X1D.LIZIZ(LIZ);
    }

    public static c a() {
        return a;
    }

    public String a(String str, String str2) {
        com.amazon.device.iap.internal.util.e.a(b, UPJ.LIZIZ("enter getReceiptIdFromSku for sku [", str2, "], user [", str, "]"));
        String str3 = null;
        try {
            com.amazon.device.iap.internal.util.d.a(str, "userId");
            com.amazon.device.iap.internal.util.d.a(str2, "sku");
            Context b2 = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(b2, "context");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c);
            LIZ.append(str);
            str3 = F9J.LIZIZ(b2, 0, X1D.LIZIZ(LIZ)).getString(str2, null);
        } catch (Throwable th) {
            String str4 = b;
            StringBuilder LIZIZ = C25620zW.LIZIZ("error in saving v1 Entitlement:", str2, ":");
            LIZIZ.append(th.getMessage());
            com.amazon.device.iap.internal.util.e.a(str4, X1D.LIZIZ(LIZIZ));
        }
        com.amazon.device.iap.internal.util.e.a(b, UPJ.LIZIZ("leaving saveEntitlementRecord for sku [", str2, "], user [", str, "]"));
        return str3;
    }

    public void a(String str, String str2, String str3) {
        String str4 = b;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("enter saveEntitlementRecord for v1 Entitlement [", str2, "/", str3, "], user [");
        LIZLLL.append(str);
        LIZLLL.append("]");
        com.amazon.device.iap.internal.util.e.a(str4, X1D.LIZIZ(LIZLLL));
        try {
            com.amazon.device.iap.internal.util.d.a(str, "userId");
            com.amazon.device.iap.internal.util.d.a(str2, "receiptId");
            com.amazon.device.iap.internal.util.d.a(str3, "sku");
            Context b2 = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(b2, "context");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c);
            LIZ.append(str);
            SharedPreferences.Editor edit = F9J.LIZIZ(b2, 0, X1D.LIZIZ(LIZ)).edit();
            edit.putString(str3, str2);
            edit.commit();
        } catch (Throwable th) {
            String str5 = b;
            StringBuilder LIZLLL2 = C06540Nm.LIZLLL("error in saving v1 Entitlement:", str2, "/", str3, ":");
            LIZLLL2.append(th.getMessage());
            com.amazon.device.iap.internal.util.e.a(str5, X1D.LIZIZ(LIZLLL2));
        }
        String str6 = b;
        StringBuilder LIZLLL3 = C06540Nm.LIZLLL("leaving saveEntitlementRecord for v1 Entitlement [", str2, "/", str3, "], user [");
        LIZLLL3.append(str);
        LIZLLL3.append("]");
        com.amazon.device.iap.internal.util.e.a(str6, X1D.LIZIZ(LIZLLL3));
    }
}

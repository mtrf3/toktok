package X;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Locale;

/* renamed from: X.0Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04520Fs {
    public static String LIZLLL() {
        String str;
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            String string = F9J.LIZIZ(C38891fp.LJIJJLI(), 0, "test_setting").getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(C38891fp.LJIJJLI(), "phone");
            C39405FdJ.LJFF.getClass();
            str = C39571Ffz.LJ(telephonyManager);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.getDefault());
        }
        return str;
    }

    public static String LIZIZ() {
        return LIZ(C38891fp.LJIJJLI()).getLanguage();
    }

    public static String LIZJ() {
        if (!TextUtils.isEmpty(LIZLLL())) {
            return LIZLLL();
        }
        String LIZ = C39399FdD.LIZ(Locale.getDefault());
        if (TextUtils.isEmpty(LIZ)) {
            return "US";
        }
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Locale LIZ(android.content.Context r4) {
        /*
            if (r4 != 0) goto L2b
        L2:
            r1 = 0
        L3:
            if (r1 == 0) goto L4a
            X.Ffv r0 = X.C39399FdD.LIZIZ
            r0.getClass()
            java.lang.String r0 = X.C39567Ffv.LIZIZ(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2a
            java.util.Locale r4 = new java.util.Locale
            java.lang.String r3 = r1.getLanguage()
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r2 = X.C39399FdD.LIZ(r0)
            java.lang.String r0 = r1.getVariant()
            r4.<init>(r3, r2, r0)
            r1 = r4
        L2a:
            return r1
        L2b:
            X.BoD r3 = X.C29889BoD.LIZIZ(r4)
            X.Boj r2 = X.EnumC29921Boj.STRING
            java.lang.String r1 = "sp_lanuage_last_select_tag"
            java.lang.String r0 = ""
            java.lang.Object r2 = r3.LIZLLL(r1, r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            com.google.gson.Gson r1 = X.C09650Zl.LIZIZ     // Catch: java.lang.Exception -> L2
            java.lang.Class<java.util.Locale> r0 = java.util.Locale.class
            java.lang.Object r1 = r1.LJI(r2, r0)     // Catch: java.lang.Exception -> L2
            java.util.Locale r1 = (java.util.Locale) r1     // Catch: java.lang.Exception -> L2
            boolean r0 = r1 instanceof java.util.Locale     // Catch: java.lang.Exception -> L2
            if (r0 != 0) goto L3
            goto L2
        L4a:
            java.util.Locale r0 = java.util.Locale.getDefault()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04520Fs.LIZ(android.content.Context):java.util.Locale");
    }
}

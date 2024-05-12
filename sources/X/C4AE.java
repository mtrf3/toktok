package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.4AE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AE {
    public static final C4AE LIZ = new C4AE();
    public static final String[] LIZIZ = new String[0];

    public static String[] LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("tt_dm_illegal_schema", String[].class, strArr);
        if (strArr2 == null) {
            return strArr;
        }
        return strArr2;
    }

    public static boolean LIZIZ(C4AE c4ae, String str) {
        android.net.Uri parse;
        c4ae.getClass();
        String[] blacklist = LIZ();
        c4ae.getClass();
        o.LJIIIZ(blacklist, "blacklist");
        if (blacklist.length == 0 || str == null || str.length() == 0 || (parse = UriProtector.parse(str)) == null) {
            return false;
        }
        String scheme = parse.getScheme();
        if (scheme != null && scheme.length() != 0) {
            for (String str2 : blacklist) {
                if (ujb.o.LJJJJIZL(scheme, str2, true)) {
                    if (str2 == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(X.C4AE r2, java.lang.String r3) {
        /*
            r2.getClass()
            java.lang.String[] r1 = LIZ()
            r2.getClass()
            java.lang.String r0 = "blacklist"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.length
            r2 = 1
            if (r0 != 0) goto L64
            r0 = 1
        L14:
            if (r0 == 0) goto L17
        L16:
            return r3
        L17:
            if (r3 == 0) goto L1f
            int r0 = r3.length()
            if (r0 != 0) goto L23
        L1f:
            r0 = 1
        L20:
            if (r0 == 0) goto L25
            goto L16
        L23:
            r0 = 0
            goto L20
        L25:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = r1.getScheme()     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L37
            int r0 = r0.length()     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L36
            goto L37
        L36:
            r2 = 0
        L37:
            if (r2 == 0) goto L3a
            goto L16
        L3a:
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "tiktok"
            android.net.Uri$Builder r0 = r1.scheme(r0)     // Catch: java.lang.Exception -> L4d
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L4d
            goto L16
        L4d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "replaceIllegalScheme failed "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MessagingIllegalSchemeSetting"
            X.C34B.LIZLLL(r0, r1, r2)
            goto L16
        L64:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4AE.LIZJ(X.4AE, java.lang.String):java.lang.String");
    }
}

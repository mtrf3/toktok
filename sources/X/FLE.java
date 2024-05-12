package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FLE {
    public static String LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(FLF.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(FLG.LJLIL);

    public static /* synthetic */ String LIZIZ() {
        return LIZ("other");
    }

    public static SharedPreferences LIZJ() {
        return (SharedPreferences) LJ.getValue();
    }

    public static boolean LIZLLL() {
        int LIZ2 = C00F.LIZ(31744, 0, "ad_web_ua_update_frequency", true);
        if (LIZ2 == 0) {
            return true;
        }
        long j = LIZJ().getLong("ad_user_agent_update_time", 0L);
        if (j != 0 && TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) <= LIZ2) {
            return false;
        }
        return true;
    }

    public static final void LJ() {
        if (!LIZLLL()) {
            return;
        }
        C84763XOl.LJI().LJJJJZI(F9I.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if ((!r1) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(java.lang.String r7) {
        /*
            java.lang.String r0 = "from"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r1 = X.FLE.LIZ
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L11
            int r0 = r1.length()
            if (r0 != 0) goto L88
        L11:
            android.content.SharedPreferences r1 = LIZJ()
            java.lang.String r4 = "ad_user_agent_sp"
            r0 = 0
            java.lang.String r1 = r1.getString(r4, r0)
            if (r1 == 0) goto L24
            int r0 = r1.length()
            if (r0 != 0) goto L84
        L24:
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            boolean r0 = X.C73098SmU.LJFF(r0)
            if (r0 != 0) goto L42
            android.content.SharedPreferences r3 = LIZJ()
            java.lang.String r0 = "feed"
            boolean r0 = android.text.TextUtils.equals(r7, r0)
            if (r0 != 0) goto L50
        L3a:
            X.NzR r0 = X.C61161NzR.LIZIZ
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L66
        L42:
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = ""
        L4c:
            LJ()
            return r0
        L50:
            java.lang.String r2 = "ad_user_agent_has_read_sp"
            boolean r1 = r3.getBoolean(r2, r6)
            android.content.SharedPreferences$Editor r0 = r3.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r5)
            r0.apply()
            r0 = r1 ^ 1
            if (r0 != 0) goto L42
            goto L3a
        L66:
            X.Ol8 r3 = X.FLE.LIZLLL
            java.lang.Object r2 = r3.getValue()
            java.lang.String r2 = (java.lang.String) r2
            android.content.SharedPreferences r0 = LIZJ()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)
            r0.apply()
            return r2
        L84:
            LJ()
            return r1
        L88:
            LJ()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FLE.LIZ(java.lang.String):java.lang.String");
    }
}

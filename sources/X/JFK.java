package X;

import Y.ARunnableS27S0200000_8;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes9.dex */
public abstract class JFK implements JFL {
    public static String LJ;
    public static String LJFF;
    public static volatile String LJI;
    public final Context LIZ;
    public final JFB LIZIZ;
    public final JFE LIZJ;
    public final String LIZLLL;

    public final String LIZJ() {
        synchronized (this) {
            if (!C38354F3m.LJ(LJI)) {
                return LJI;
            }
            LJI = this.LIZIZ.LIZLLL("", "");
            return LJI;
        }
    }

    public final String LIZIZ() {
        if (!TextUtils.isEmpty(LJFF)) {
            return LJFF;
        }
        try {
            SharedPreferences LIZIZ = F9J.LIZIZ(this.LIZ, 0, C48841JEv.LJIIJJI());
            String string = LIZIZ.getString("clientudid", null);
            if (!C44384HbQ.LLF(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = LIZIZ.edit();
                edit.putString("clientudid", string);
                edit.commit();
            }
            if (!C38354F3m.LJ(string)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(string);
                LIZ.append(this.LIZLLL);
                string = X1D.LIZIZ(LIZ);
            }
            LJFF = string;
            return string;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
    
        if (r3.length() >= 13) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            r8 = this;
            java.lang.String r5 = "openudid"
            java.lang.String r0 = X.JFK.LJ
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = X.JFK.LJ
            return r0
        Ld:
            android.content.Context r0 = r8.LIZ
            r2 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = X.C39243Fah.LIZ(r0)     // Catch: java.lang.Exception -> L19
            goto L1e
        L19:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            r3 = r2
        L1e:
            r6 = 13
            if (r3 == 0) goto L30
            java.lang.String r0 = "9774d56d682e549c"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Exception -> L8c
            if (r0 != 0) goto L30
            int r0 = r3.length()     // Catch: java.lang.Exception -> L8c
            if (r0 >= r6) goto L8c
        L30:
            android.content.Context r1 = r8.LIZ     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = X.C48841JEv.LJIIJJI()     // Catch: java.lang.Exception -> L8c
            r7 = 0
            android.content.SharedPreferences r4 = X.F9J.LIZIZ(r1, r7, r0)     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = r4.getString(r5, r2)     // Catch: java.lang.Exception -> L8c
            boolean r0 = X.C44384HbQ.LLF(r2)     // Catch: java.lang.Exception -> L8c
            if (r0 != 0) goto L8b
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L8c
            r2.<init>()     // Catch: java.lang.Exception -> L8c
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch: java.lang.Exception -> L8c
            r0 = 80
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L8c
            r0 = 16
            java.lang.String r2 = r1.toString(r0)     // Catch: java.lang.Exception -> L8c
            char r1 = r2.charAt(r7)     // Catch: java.lang.Exception -> L8c
            r0 = 45
            if (r1 != r0) goto L64
            r0 = 1
            java.lang.String r2 = r2.substring(r0)     // Catch: java.lang.Exception -> L8c
        L64:
            int r0 = r2.length()     // Catch: java.lang.Exception -> L8c
            int r6 = r6 - r0
            if (r6 <= 0) goto L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8c
            r1.<init>()     // Catch: java.lang.Exception -> L8c
        L70:
            if (r6 <= 0) goto L7a
            r0 = 70
            r1.append(r0)     // Catch: java.lang.Exception -> L8c
            int r6 = r6 + (-1)
            goto L70
        L7a:
            r1.append(r2)     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Exception -> L8c
        L81:
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch: java.lang.Exception -> L8c
            r0.putString(r5, r2)     // Catch: java.lang.Exception -> L8c
            r0.commit()     // Catch: java.lang.Exception -> L8c
        L8b:
            r3 = r2
        L8c:
            boolean r0 = X.C38354F3m.LJ(r3)
            if (r0 != 0) goto L9f
            java.lang.StringBuilder r1 = X.C278817o.LIZJ(r3)
            java.lang.String r0 = r8.LIZLLL
            r1.append(r0)
            java.lang.String r3 = r1.toString()
        L9f:
            boolean r0 = X.C38354F3m.LJ(r3)
            if (r0 != 0) goto La7
            X.JFK.LJ = r3
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JFK.LIZLLL():java.lang.String");
    }

    public final void LIZ(String str) {
        if (TextUtils.equals(str, "device_id")) {
            LJI = null;
        }
        if (TextUtils.equals(str, "openudid")) {
            LJ = null;
        }
        if (TextUtils.equals(str, "clientudid")) {
            LJFF = null;
        }
        this.LIZIZ.LIZIZ(str);
    }

    public final void LJ(Account account) {
        JFE jfe = this.LIZJ;
        if (account != null) {
            synchronized (jfe) {
                jfe.LIZJ = account;
                if (jfe.LIZLLL.size() > 0) {
                    if (jfe.LJ != null) {
                        Iterator<String> it = jfe.LJ.iterator();
                        while (it.hasNext()) {
                            try {
                                jfe.LIZIZ.setUserData(jfe.LIZJ, it.next(), null);
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }
                    RunnableC39007FSp.LIZIZ(new ARunnableS27S0200000_8(jfe, account, 50));
                    return;
                }
                return;
            }
        }
        jfe.getClass();
    }

    public JFK(Context context, boolean z) {
        String str;
        if (z) {
            str = "_local";
        } else {
            str = "";
        }
        this.LIZLLL = str;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        JFB jfb = new JFB(LLLLL);
        this.LIZIZ = jfb;
        JFE jfe = new JFE(LLLLL);
        this.LIZJ = jfe;
        jfb.LIZ = jfe;
        int i = Build.VERSION.SDK_INT;
        if ((i < 30 && (i != 29 || Build.VERSION.PREVIEW_SDK_INT <= 0)) || context.getApplicationInfo().targetSdkVersion < 30) {
            DeviceRegisterManager.isNeedSharedStorage();
        }
        if (DeviceRegisterManager.isDeleteSharedStorage()) {
            DeviceRegisterManager.isNeedSharedStorage();
        }
    }
}

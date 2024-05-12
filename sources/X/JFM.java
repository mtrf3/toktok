package X;

import Y.ARunnableS27S0200000_8;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public abstract class JFM implements QKU {
    public final Context LIZ;
    public final JFO LIZIZ;
    public final JFI LIZJ;
    public final JFF LIZLLL;
    public String LJ;
    public String LJFF;
    public volatile String LJI;
    public final String LJII;

    @Override // X.QKU
    public final String A3() {
        if (!TextUtils.isEmpty(this.LJFF)) {
            return this.LJFF;
        }
        try {
            SharedPreferences LIZ = C48847JFb.LIZ(this.LIZ, this.LIZIZ.LJ);
            String string = LIZ.getString("clientudid", null);
            if (!C36860EdM.LJ(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = LIZ.edit();
                edit.putString("clientudid", string);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(string);
                LIZ2.append(this.LJII);
                string = X1D.LIZIZ(LIZ2);
            }
            this.LJFF = string;
            return string;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    @Override // X.QKU
    public final String getDeviceId() {
        if (!TextUtils.isEmpty(this.LJI)) {
            return this.LJI;
        }
        this.LJI = this.LIZJ.LIZIZ("", "");
        return this.LJI;
    }

    @Override // X.QKU
    public final String getOpenUdid() {
        String str;
        if (!TextUtils.isEmpty(this.LJ)) {
            return this.LJ;
        }
        try {
            str = E78.LIZ(this.LIZ.getContentResolver());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = null;
        }
        SharedPreferences LIZ = C48847JFb.LIZ(this.LIZ, this.LIZIZ.LJ);
        String string = LIZ.getString("openudid", null);
        try {
            if (!C36860EdM.LJ(str) || "9774d56d682e549c".equals(str)) {
                if (!C36860EdM.LJ(string)) {
                    string = new BigInteger(80, new SecureRandom()).toString(16);
                    if (string.charAt(0) == '-') {
                        string = string.substring(1);
                    }
                    int length = 13 - string.length();
                    if (length > 0) {
                        StringBuilder sb = new StringBuilder();
                        while (length > 0) {
                            sb.append('F');
                            length--;
                        }
                        sb.append(string);
                        str = sb.toString();
                    }
                }
                str = string;
            }
        } catch (Exception unused) {
        }
        SharedPreferences.Editor edit = LIZ.edit();
        edit.putString("openudid", str);
        edit.apply();
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(this.LJII);
            str = X1D.LIZIZ(LIZ2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.LJ = str;
        }
        return str;
    }

    @Override // X.QKU
    public final void LIZ(Account account) {
        ExecutorService executorService;
        JFF jff = this.LIZLLL;
        if (jff != null) {
            String LIZ = this.LIZIZ.LJ.LIZ();
            if (account != null) {
                jff.LIZLLL = account;
                if (jff.LJ.size() <= 0) {
                    return;
                }
                ARunnableS27S0200000_8 aRunnableS27S0200000_8 = new ARunnableS27S0200000_8(jff, account, 79);
                if (LIZ == null) {
                    executorService = JFV.LJFF.LIZIZ(new Object[0]);
                } else {
                    executorService = (ExecutorService) ((ConcurrentHashMap) JFV.LIZIZ).get(LIZ);
                    if (executorService == null) {
                        executorService = JFV.LJFF.LIZIZ(new Object[0]);
                    }
                }
                executorService.execute(aRunnableS27S0200000_8);
            }
        }
    }

    @Override // X.QKU
    public final void LIZIZ(String str) {
        if (C36860EdM.LIZ(str)) {
            String str2 = this.LJI;
            if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || str.equals(str2)) {
                return;
            }
            this.LJI = this.LIZJ.LIZIZ(str, this.LJI);
        }
    }

    public JFM(Context context, JFO jfo) {
        String str;
        if (jfo.LIZIZ) {
            str = "_local";
        } else {
            str = "";
        }
        this.LJII = str;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        this.LIZIZ = jfo;
        JFI jfi = new JFI(LLLLL, jfo.LIZ, jfo.LJ);
        this.LIZJ = jfi;
        if (!C48847JFb.LIZ(context, jfo.LJ).getBoolean("is_migrate", false)) {
            JFF jff = new JFF(context, jfo.LIZLLL, jfo.LJ);
            this.LIZLLL = jff;
            jfi.LIZ = jff;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 || (i == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                context.getApplicationInfo();
            }
        }
        LIZ(jfo.LIZJ);
    }
}

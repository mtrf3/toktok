package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: X.QhS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67690QhS {
    public static final Lock LIZJ = new ReentrantLock();
    public static C67690QhS LIZLLL;
    public final Lock LIZ = new ReentrantLock();
    public final SharedPreferences LIZIZ;

    public final GoogleSignInAccount LIZIZ() {
        String LJ;
        String LJ2 = LJ("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(LJ2) && (LJ = LJ(LJI("googleSignInAccount", LJ2))) != null) {
            try {
                return GoogleSignInAccount.LJJJJZ(LJ);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions LIZJ() {
        String LJ;
        String LJ2 = LJ("defaultGoogleSignInAccount");
        GoogleSignInOptions googleSignInOptions = null;
        if (TextUtils.isEmpty(LJ2) || (LJ = LJ(LJI("googleSignInOptions", LJ2))) == null) {
            return null;
        }
        try {
            googleSignInOptions = GoogleSignInOptions.LJJJJZ(LJ);
            return googleSignInOptions;
        } catch (JSONException unused) {
            return googleSignInOptions;
        }
    }

    public C67690QhS(Context context) {
        this.LIZIZ = F9J.LIZIZ(context, 0, "com.google.android.gms.signin");
    }

    public static C67690QhS LIZ(Context context) {
        QH7.LJIIIIZZ(context);
        ReentrantLock reentrantLock = (ReentrantLock) LIZJ;
        reentrantLock.lock();
        try {
            if (LIZLLL == null) {
                LIZLLL = new C67690QhS(C16880lQ.LLLLL(context));
            }
            C67690QhS c67690QhS = LIZLLL;
            reentrantLock.unlock();
            return c67690QhS;
        } catch (Throwable th) {
            ((ReentrantLock) LIZJ).unlock();
            throw th;
        }
    }

    public final String LJ(String str) {
        ((ReentrantLock) this.LIZ).lock();
        try {
            return this.LIZIZ.getString(str, null);
        } finally {
            ((ReentrantLock) this.LIZ).unlock();
        }
    }

    public static final String LJI(String str, String str2) {
        return FP1.LIZLLL(new StringBuilder(C1FL.LIZ(str, 1, String.valueOf(str2).length())), str, ":", str2);
    }

    public final void LIZLLL(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        QH7.LJIIIIZZ(googleSignInOptions);
        LJFF("defaultGoogleSignInAccount", googleSignInAccount.zak);
        String str = googleSignInAccount.zak;
        LJFF(LJI("googleSignInAccount", str), googleSignInAccount.LJJJJZI());
        LJFF(LJI("googleSignInOptions", str), googleSignInOptions.LJJJLIIL());
    }

    public final void LJFF(String str, String str2) {
        ((ReentrantLock) this.LIZ).lock();
        try {
            this.LIZIZ.edit().putString(str, str2).apply();
        } finally {
            ((ReentrantLock) this.LIZ).unlock();
        }
    }
}

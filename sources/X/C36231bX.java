package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import org.json.JSONObject;

/* renamed from: X.1bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36231bX implements InterfaceC25210yr {
    public final Context LIZ;
    public final String LIZIZ;
    public SharedPreferences LIZJ;
    public SharedPreferences.Editor LIZLLL;

    public final SharedPreferences.Editor LIZIZ() {
        SharedPreferences LIZJ;
        if (this.LIZLLL == null) {
            synchronized (this) {
                if (this.LIZLLL == null && (LIZJ = LIZJ()) != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.LIZLLL = LIZJ.edit();
                    C43861nq LJJJI = C43861nq.LJJJI();
                    String str = this.LIZIZ;
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    LJJJI.getClass();
                    try {
                        new JSONObject().put("sp", str);
                    } catch (Throwable unused) {
                    }
                    try {
                        new JSONObject().put("cost", uptimeMillis2);
                    } catch (Throwable unused2) {
                    }
                    AbstractC38911fr.LJIJI();
                }
            }
        }
        return this.LIZLLL;
    }

    public final SharedPreferences LIZJ() {
        if (this.LIZJ == null) {
            synchronized (this) {
                if (this.LIZJ == null) {
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.LIZJ = F9J.LIZIZ(this.LIZ, 0, this.LIZIZ);
                        C43861nq LJJJI = C43861nq.LJJJI();
                        String str = this.LIZIZ;
                        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                        LJJJI.getClass();
                        try {
                            new JSONObject().put("sp", str);
                        } catch (Throwable unused) {
                        }
                        try {
                            new JSONObject().put("cost", uptimeMillis2);
                        } catch (Throwable unused2) {
                        }
                        AbstractC38911fr.LJIJI();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        return this.LIZJ;
    }

    public final void LIZ() {
        SharedPreferences.Editor LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.apply();
    }

    public C36231bX(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }
}

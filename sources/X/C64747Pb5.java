package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.Pb5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64747Pb5 {
    public static volatile C64747Pb5 LJFF;
    public static final Object LJI = new Object();
    public static volatile SharedPreferences LJII;
    public volatile Context LIZ;
    public volatile int LIZIZ;
    public volatile long LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;

    public C64747Pb5(Context context) {
        if (context != null) {
            this.LIZ = C16880lQ.LLLLL(context);
        }
        try {
            if (LJII == null) {
                LJII = F9J.LIZIZ(this.LIZ, 0, "image_opt_table");
            }
            SharedPreferences sharedPreferences = LJII;
            this.LIZIZ = sharedPreferences.getInt("image_opt_switch", 0);
            this.LIZJ = sharedPreferences.getLong("image_opt_black_interval", 0L);
            this.LIZLLL = sharedPreferences.getInt("image_opt_failed_times", 0);
            this.LJ = sharedPreferences.getInt("image_opt_limit_count", 0);
        } catch (Throwable unused) {
        }
    }

    public static void LIZ(Context context) {
        if (LJFF == null) {
            synchronized (LJI) {
                if (LJFF == null) {
                    LJFF = new C64747Pb5(context);
                }
            }
        }
    }
}

package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.keva.Keva;

/* renamed from: X.FRv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38987FRv {
    public static volatile Boolean LIZ;
    public static InterfaceC38988FRw LIZIZ;
    public static final Object LIZJ = new Object();
    public static boolean LIZLLL = false;
    public static LSC LJ = LSC.FEED;
    public static long LJFF = -1;
    public static long LJI = -1;

    public static long LIZ() {
        return Keva.getRepo("repo_new_version_journey").getLong("key_first_launch_time", 0L);
    }

    public static String LIZJ() {
        return LJ.name();
    }

    public static Boolean LIZLLL() {
        Boolean bool;
        synchronized (LIZJ) {
            if (LIZ == null) {
                LJFF();
            }
            bool = LIZ;
        }
        return bool;
    }

    public static Boolean LJ() {
        if (LIZ == null) {
            boolean z = F9J.LIZIZ(EF7.LIZIZ(), 0, "prefs_feed_check").getBoolean("key_first_launch", true);
            if (LIZ == null) {
                LIZ = Boolean.valueOf(z);
            }
        }
        return LIZ;
    }

    public static String LIZIZ() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            return C16880lQ.LJLLJ(LJIIIIZZ.getClass());
        }
        return null;
    }

    public static void LJFF() {
        EF7.LIZIZ();
        SharedPreferences LIZIZ2 = F9J.LIZIZ(EF7.LIZIZ(), 0, "prefs_feed_check");
        boolean z = LIZIZ2.getBoolean("key_first_launch", true);
        if (LIZ == null) {
            LIZ = Boolean.valueOf(z);
        }
        if (LIZ.booleanValue()) {
            Keva.getRepo("repo_story_cold_start").storeBoolean("key_new_user", true);
        }
        LIZIZ2.edit().putBoolean("key_first_launch", false).apply();
        Keva repo = Keva.getRepo("repo_new_version_journey");
        if (repo.getLong("key_first_launch_time", 0L) == 0) {
            repo.storeLong("key_first_launch_time", System.currentTimeMillis());
        }
        LIZ.booleanValue();
    }

    public static void LJI(LSC lsc) {
        LJ = lsc;
        InterfaceC38988FRw interfaceC38988FRw = LIZIZ;
        if (interfaceC38988FRw != null) {
            interfaceC38988FRw.getClass();
            if (C38989FRx.LIZ && LSC.FEED != lsc) {
                C38989FRx.LIZIZ("2", null);
            }
        }
    }
}

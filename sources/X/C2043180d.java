package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.80d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043180d {
    public static final int LIZ() {
        return LIZLLL().getInt("diggUnloginCount", 0);
    }

    public static final boolean LIZIZ() {
        return LIZLLL().getBoolean("deviceHasDigged", false);
    }

    public static final void LIZJ() {
        LIZLLL().edit().putBoolean("deviceHasDigged", true).apply();
    }

    public static SharedPreferences LIZLLL() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "MainTabPreferences");
        o.LJIIIIZZ(LIZIZ, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return LIZIZ;
    }

    public static final void LJ(int i) {
        LIZLLL().edit().putInt("diggUnloginCount", i).apply();
    }
}

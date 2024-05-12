package X;

import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class FW4 {
    public static final SharedPreferences LIZ;
    public static int LIZIZ;

    static {
        SharedPreferences LIZIZ2 = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme-app");
        LIZ = LIZIZ2;
        LIZIZ = LIZIZ2.getInt("x2c_switch", 2);
    }
}

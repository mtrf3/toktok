package X;

import android.content.SharedPreferences;

/* renamed from: X.FvX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40535FvX {
    public static int LIZ = -1;

    public static SharedPreferences LIZ() {
        return F9J.LIZIZ(C58725N2z.LIZ, 0, "aweme-app");
    }

    public static void LIZIZ(boolean z) {
        F9J.LIZIZ(C58725N2z.LIZ, 0, "aweme_account_terminal_relative_sp").edit().putBoolean("account_terminal_app_has_logged_out", z).apply();
    }

    public static void LIZJ(boolean z) {
        LIZ().edit().putBoolean("ftc_create_account_showing", z).apply();
    }

    public static void LIZLLL(boolean z) {
        LIZ().edit().putBoolean("ftc_create_password_showing", z).apply();
    }
}

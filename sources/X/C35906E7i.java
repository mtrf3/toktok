package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.E7i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35906E7i {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(DX3.LJLIL);

    public static boolean LIZ() {
        if (((Number) LIZ.getValue()).intValue() <= 0) {
            return false;
        }
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (!c54029LIj.LJJIZ()) {
            return false;
        }
        if (c54029LIj.LJJIJL() && !C53295Kvr.LIZIZ()) {
            return false;
        }
        long j = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j) - ((RBX) HG3.LJIILL()).getCurUser().getRegisterTime();
        int i = 3;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("tt_friends_tab_avatar_exemption_new_user_days", 3);
        } catch (Exception unused) {
        }
        if (currentTimeMillis < (i * 86400000) / j) {
            return false;
        }
        return true;
    }
}

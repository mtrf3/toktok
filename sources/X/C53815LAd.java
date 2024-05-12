package X;

import com.bytedance.keva.Keva;

/* renamed from: X.LAd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53815LAd {
    public static final Keva LIZ = Keva.getRepo("rcmd_new_user_protection_repo");

    public static boolean LIZIZ() {
        return LIZ.getBoolean(LIZ("rcmd_new_user_protection_flag"), false);
    }

    public static void LIZJ() {
        Keva keva = LIZ;
        int i = keva.getInt(LIZ("rcmd_new_user_protection_cold_start_count"), 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Current user ");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        LIZ2.append(" - cold start count = ");
        int i2 = i + 1;
        LIZ2.append(i2);
        C221018lt.LJFF("NewUserProtection", X1D.LIZIZ(LIZ2));
        keva.storeInt(LIZ("rcmd_new_user_protection_cold_start_count"), i2);
        if (keva.getLong(LIZ("rcmd_new_user_protection_first_launch_time"), 0L) == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Current user ");
            LIZ3.append(((RBX) HG3.LJIILL()).getCurUserId());
            LIZ3.append(" - first launch time = ");
            LIZ3.append(currentTimeMillis);
            C221018lt.LJFF("NewUserProtection", X1D.LIZIZ(LIZ3));
            keva.storeLong(LIZ("rcmd_new_user_protection_first_launch_time"), currentTimeMillis);
        }
    }

    public static String LIZ(String str) {
        String str2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('_');
        HG3.LJIIL();
        if (HG3.LJLJL.LJFF().isLogin()) {
            str2 = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            str2 = "";
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }
}

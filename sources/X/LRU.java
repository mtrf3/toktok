package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class LRU {
    public static boolean LIZIZ() {
        if (!((RBX) HG3.LJIILL()).isLogin() || ((RBY) HG3.LJIILL()).isChildrenMode() || !Keva.getRepo("account_security_keva_name").getBoolean(LIZ("safe_info_need_show_"), false)) {
            return false;
        }
        return true;
    }

    public static String LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
    }
}

package X;

import Y.ACallableS8S2100000_6;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import defpackage.i0;

/* loaded from: classes7.dex */
public final class E9W {
    public static Keva LIZ() {
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF.isLogin()) {
            String curUserId = LJFF.getCurUserId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("repo_tt_push_settings_");
            LIZ.append(curUserId);
            return Keva.getRepo(X1D.LIZIZ(LIZ));
        }
        return null;
    }

    public static String LIZIZ(String str) {
        return i0.LJFF("current_settings__", str);
    }

    public static void LIZJ(String str) {
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (!LJFF.isLogin()) {
            return;
        }
        String curUserId = LJFF.getCurUserId();
        Keva LIZ = LIZ();
        if (LIZ != null) {
            C10K.LIZJ(new ACallableS8S2100000_6(LIZ, curUserId, str, 1));
        }
    }
}

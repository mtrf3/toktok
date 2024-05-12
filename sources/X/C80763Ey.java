package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.3Ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80763Ey {
    public static String LIZIZ() {
        boolean z;
        C80773Ez.LIZ.getClass();
        int i = C80773Ez.LIZIZ;
        if (i == 2 || i == 6) {
            z = true;
        } else {
            z = false;
        }
        return LIZ(z);
    }

    public static final User LIZJ() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getCurUser();
        }
        return null;
    }

    public static final boolean LIZLLL() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.isLogin();
        }
        return false;
    }

    public static final String LIZ(boolean z) {
        String uid;
        RBY LJFF;
        String curUserId;
        if (z) {
            IAccountService LJIJ = AccountService.LJIJ();
            if (LJIJ == null || (LJFF = LJIJ.LJFF()) == null || (curUserId = LJFF.getCurUserId()) == null) {
                return "-1";
            }
            return curUserId;
        }
        User LIZJ = LIZJ();
        if (LIZJ == null || (uid = LIZJ.getUid()) == null) {
            return "-1";
        }
        return uid;
    }
}

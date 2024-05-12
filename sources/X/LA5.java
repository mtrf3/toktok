package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;

/* loaded from: classes10.dex */
public final class LA5 {
    public static final IAccountService LIZ;
    public static final String LIZIZ;
    public static final Keva LIZJ;
    public static final C62822Ol8 LIZLLL;

    static {
        IAccountService LJIJ = AccountService.LJIJ();
        LIZ = LJIJ;
        String curUserId = LJIJ.LJFF().getCurUserId();
        LIZIZ = curUserId;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("email_auth_dialog");
        LIZ2.append(curUserId);
        LIZJ = Keva.getRepo(X1D.LIZIZ(LIZ2));
        LIZLLL = C221108m2.LIZIZ(LA6.LJLIL);
    }
}

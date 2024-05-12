package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.UtO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78622UtO {
    public static volatile IAccountService LIZ;

    public static void LIZ() {
        if (LIZ == null) {
            LIZ = AccountService.LJIJ();
        }
    }

    public static IAccountUserService LIZIZ() {
        LIZ();
        IAccountService iAccountService = LIZ;
        o.LJI(iAccountService);
        RBY LJFF = iAccountService.LJFF();
        o.LJIIIIZZ(LJFF, "sSsrvice!!.userService()");
        return LJFF;
    }
}

package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class R41 {
    public static final List<LEA> LIZ = new CopyOnWriteArrayList();
    public static QWD LIZIZ;
    public static LoginService LIZJ;
    public static BindService LIZLLL;

    public static RBY LIZ() {
        return LIZIZ.LJFF();
    }

    public static BindService LIZIZ() {
        if (LIZLLL == null) {
            LIZLLL = LIZIZ.LIZJ();
        }
        return LIZLLL;
    }

    public static LoginService LJ() {
        if (LIZJ == null) {
            LIZJ = (LoginService) LIZIZ.LJI();
        }
        return LIZJ;
    }

    public static PasswordService LJFF() {
        return LIZIZ.LJII();
    }

    public static boolean LJI() {
        return LIZIZ.LJFF().isLogin();
    }

    public static void LJIIIZ() {
        Iterator it = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it.hasNext()) {
            ((LEA) it.next()).onAccountResult(4, true, 0, null);
        }
    }

    public static User LIZJ() {
        return LIZ().getCurUser();
    }

    public static String LIZLLL() {
        return LIZ().getCurUserId();
    }

    public static boolean LJII() {
        if (LJ().getLoginParam() != null && LJ().getLoginParam().LJI) {
            return true;
        }
        return false;
    }

    public static void LJIIIIZZ(User user) {
        Iterator it = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it.hasNext()) {
            ((LEA) it.next()).onAccountResult(1, true, 0, user);
        }
    }

    public static void LJIIJ(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it.hasNext()) {
            ((LEA) it.next()).onAccountResult(3, z, 0, null);
        }
    }

    public static void LJIILIIL(QTZ qtz) {
        LIZIZ.LJFF().updateUserInfo(qtz);
    }

    public static void LJIIJJI(int i, int i2) {
        QWD qwd = LIZIZ;
        if (qwd.LJIIJ.get() != null) {
            qwd.LJIIJ.get().notifyProgress(i, i2, "");
        }
    }

    public static void LJIIL(int i, int i2, Object obj) {
        QWD qwd = LIZIZ;
        qwd.getClass();
        if (i == 1) {
            if (qwd.LJIIJ.get() != null) {
                qwd.LJIIJ.get().returnResult(i, i2, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            return;
        }
        if (i == 17 || i == 13) {
            PasswordService passwordService = qwd.LIZLLL;
            if (passwordService == null) {
                return;
            }
            passwordService.returnResult(i, i2, obj);
            return;
        }
        BindService bindService = qwd.LIZJ;
        if (bindService != null) {
            bindService.returnResult(i, i2, obj);
        }
        PasswordService passwordService2 = qwd.LIZLLL;
        if (passwordService2 != null) {
            passwordService2.returnResult(i, i2, obj);
        }
        ProAccountService proAccountService = qwd.LJ;
        if (proAccountService == null) {
            return;
        }
        proAccountService.returnResult(i, i2, obj);
    }
}

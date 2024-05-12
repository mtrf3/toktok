package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import defpackage.t1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.EOg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36346EOg implements EOS {
    public static final C36346EOg LIZ = new C36346EOg();
    public static boolean LIZIZ;

    @Override // X.EOS
    public final boolean LIZ() {
        return false;
    }

    @Override // X.EOS
    public final void LIZIZ() {
    }

    @Override // X.EOS
    public final void LJ(String awemeId, String enterFrom) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(enterFrom, "enterFrom");
    }

    @Override // X.EOS
    public final boolean LJFF() {
        return EOP.LIZLLL.getBoolean("need_trial_expires_copy", true);
    }

    @Override // X.EOS
    public final void LJI() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        AccountService.LJIJ().LJFF().addUserChangeListener(C36347EOh.LJLIL);
    }

    @Override // X.EOS
    public final void LIZJ() {
        int LJIIZILJ = C1E4.LJIIZILJ();
        if (LJIIZILJ > 0) {
            Keva keva = EOP.LIZLLL;
            if (keva.getInt("trial_start_time", 0) == 0) {
                keva.storeInt("trial_start_time", LJIIZILJ);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DeviceRegisterTime: ");
        LIZ2.append(EOP.LIZLLL.getInt("trial_start_time", 0));
        EOP.LJIIJ(X1D.LIZIZ(LIZ2));
    }

    @Override // X.EOS
    public final boolean LIZLLL() {
        if (t1.LJI()) {
            C36345EOf.LIZ();
            EOP.LJIIJ("isTrialExpires: isLogin, return false");
            return false;
        }
        Keva keva = EOP.LIZLLL;
        if (keva.getBoolean("is_trial_expired", false)) {
            EOP.LJIIJ("isTrialExpires: TrialConfig.isTrialExpired, return true");
            return true;
        }
        int i = keva.getInt("trial_start_time", 0);
        if (i == 0) {
            EOP.LJIIJ("isTrialExpires: deviceRegisterTime == 0, return false");
            return false;
        }
        PersonalizedNUJV2Data LJIIIZ = EOP.LJIIIZ(false);
        int LJIIZILJ = C1E4.LJIIZILJ();
        long j = LJIIIZ.loginTimeLimitMin;
        int i2 = LJIIZILJ - i;
        if (LJIIZILJ > 0 && i2 >= TimeUnit.MINUTES.toSeconds(j)) {
            StringBuilder LIZLLL = C1FJ.LIZLLL("isTrialExpires: use time ", i2, " > ", j);
            LIZLLL.append('m');
            EOP.LJIIJ(X1D.LIZIZ(LIZLLL));
            C36345EOf.LIZ();
            return true;
        }
        StringBuilder LIZLLL2 = C1FJ.LIZLLL("isTrialExpires: use time ", i2, " < ", j);
        LIZLLL2.append('m');
        EOP.LJIIJ(X1D.LIZIZ(LIZLLL2));
        return false;
    }

    @Override // X.EOS
    public final boolean LJII(String str) {
        return o.LJ("nvv_forced_login", str);
    }
}

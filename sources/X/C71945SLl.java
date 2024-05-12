package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;

/* renamed from: X.SLl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71945SLl {
    public static final /* synthetic */ int LIZ = 0;

    public static User LIZ() {
        return AccountService.LJIJ().LJFF().getCurUser();
    }

    public static String LIZIZ() {
        RBY LJFF;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            return LJFF.getCurUserId();
        }
        return null;
    }

    public static boolean LIZLLL() {
        Boolean bool;
        SNL.LIZIZ().getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        if (LJI != null) {
            bool = Boolean.valueOf(C62848OlY.LIZLLL(LJI));
        } else {
            bool = null;
        }
        boolean isSecret = AccountService.LJIJ().LJFF().getCurUser().isSecret();
        C25574A1y.LIZLLL("pri_acc_val_check_tpsc", C113554cx.LJJL(new OSZ("fromProfile", Boolean.valueOf(isSecret)), new OSZ("fromPrivate", bool)), o.LJ(Boolean.valueOf(isSecret), bool));
        return isSecret;
    }

    public static IAccountService LJ() {
        IAccountService LJIJ = AccountService.LJIJ();
        o.LJIIIIZZ(LJIJ, "get().getService(IAccountService::class.java)");
        return LJIJ;
    }
}

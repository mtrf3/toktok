package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.G1g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40844G1g extends AbstractC40941G4z {
    public final /* synthetic */ LoginAndConsentAssem LIZ;

    @Override // X.AbstractC40941G4z
    public final boolean onCancel() {
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onDeviceBlocked() {
        return false;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onError(PNSErrorModel error) {
        o.LJIIIZ(error, "error");
        return false;
    }

    public C40844G1g(LoginAndConsentAssem loginAndConsentAssem) {
        this.LIZ = loginAndConsentAssem;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onSuccess(C62962OnO result) {
        o.LJIIIZ(result, "result");
        GuestModeServiceImpl.LJIIJJI().LJIIIIZZ();
        AccountService.LJIJ().LJFF().removeUserChangeListener((InterfaceC252619vl) this.LIZ.LJLJJL.getValue());
        C38985FRt.LIZIZ.LJIIL().LIZJ();
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onUnderage(C62962OnO result) {
        o.LJIIIZ(result, "result");
        if (result.LIZ == EnumC63002Oo2.US_FTC) {
            C38985FRt.LIZIZ.LJIIL().LIZJ();
            LoginAndConsentAssem loginAndConsentAssem = this.LIZ;
            loginAndConsentAssem.getClass();
            InterfaceC65895Ptb LJI = AccountService.LJIJ().LJI();
            ActivityC45651qj activityC45651qj = loginAndConsentAssem.LJLIL;
            if (activityC45651qj != null) {
                LJI.showFTCCreateAccountView(activityC45651qj, true);
                return false;
            }
            o.LJIJI("activity");
            throw null;
        }
        return false;
    }
}

package X;

import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;

/* loaded from: classes7.dex */
public final class FZ0 implements InterfaceC252619vl {
    public final /* synthetic */ LoginAndConsentAssem LJLIL;

    public FZ0(LoginAndConsentAssem loginAndConsentAssem) {
        this.LJLIL = loginAndConsentAssem;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i != 4 && i != 12) {
            return;
        }
        ((IRegistrationAgeGateService) this.LJLIL.LJLJJI.getValue()).dismiss();
    }
}

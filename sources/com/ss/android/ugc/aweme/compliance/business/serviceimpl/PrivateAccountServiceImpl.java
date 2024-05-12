package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.ActivityC45651qj;
import X.C251969ui;
import X.C62913Omb;
import X.C62914Omc;
import X.C80S;
import X.HG3;
import X.RBX;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class PrivateAccountServiceImpl implements IPrivateAccountService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final int LIZIZ() {
        Integer notifyPrivateAccount;
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null && (notifyPrivateAccount = LIZ.getNotifyPrivateAccount()) != null) {
            return notifyPrivateAccount.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean LIZJ() {
        Boolean forcePrivateAccount;
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null && (forcePrivateAccount = LIZ.getForcePrivateAccount()) != null) {
            return forcePrivateAccount.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final void LIZLLL() {
        ComplianceSetting complianceSetting;
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        ComplianceSetting LIZ = c62914Omc.LIZ();
        if (LIZ == null || (complianceSetting = ComplianceSetting.copy$default(LIZ, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554399, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, 0, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554335, null);
        }
        c62914Omc.LIZIZ(complianceSetting);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final int LJ() {
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null) {
            return LIZ.getPrivateAccountPromptType();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final int LJII() {
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null) {
            return LIZ.getPrivateAccountPrompt();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean LJFF() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (a.LJIILJJIL().LIZJ() && !((RBX) HG3.LJIILL()).getCurUser().isSecret()) {
                ProfileServiceImpl.LIZ().newUserPresenter().updateUserSecret(true);
                SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().LIZLLL(Boolean.TRUE);
            }
            if (a.LJIILJJIL().LIZIZ() > 0 && !((RBX) HG3.LJIILL()).getCurUser().isSecret()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean LIZ(Aweme aweme) {
        User author;
        o.LJIIIZ(aweme, "aweme");
        if ((!C80S.LJI(aweme) || (author = aweme.getAuthor()) == null || !author.isAccuratePrivateAccount()) && !C80S.LIZJ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final void LJI(ActivityC45651qj activityC45651qj) {
        PopupManager.LJIIL(new C251969ui(activityC45651qj, "profile"));
    }
}

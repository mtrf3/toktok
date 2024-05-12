package com.ss.android.ugc.aweme.account.main;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.IAccountMainService;

/* loaded from: classes10.dex */
public final class AccountMainServiceImpl implements IAccountMainService {
    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(AccountMainActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final C65776Prg LIZIZ() {
        return C65352Pkq.LIZ(LoginAndConsentAssem.class);
    }

    public static IAccountMainService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAccountMainService.class, false);
        if (LIZ != null) {
            return (IAccountMainService) LIZ;
        }
        if (C58096Mr6.LJLJJL == null) {
            synchronized (IAccountMainService.class) {
                if (C58096Mr6.LJLJJL == null) {
                    C58096Mr6.LJLJJL = new AccountMainServiceImpl();
                }
            }
        }
        return C58096Mr6.LJLJJL;
    }
}

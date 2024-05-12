package com.ss.android.ugc.aweme.account.experiment;

import X.C46453IKz;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.IAccountBindingsService;

/* loaded from: classes11.dex */
public final class AccountBindingsService implements IAccountBindingsService {
    public static IAccountBindingsService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAccountBindingsService.class, false);
        if (LIZ != null) {
            return (IAccountBindingsService) LIZ;
        }
        if (C58096Mr6.LJJZZI == null) {
            synchronized (IAccountBindingsService.class) {
                if (C58096Mr6.LJJZZI == null) {
                    C58096Mr6.LJJZZI = new AccountBindingsService();
                }
            }
        }
        return C58096Mr6.LJJZZI;
    }

    @Override // com.ss.android.ugc.aweme.IAccountBindingsService
    public final boolean LIZ() {
        return C46453IKz.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountBindingsService
    public final boolean LIZIZ() {
        return C46453IKz.LIZJ;
    }
}

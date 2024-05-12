package com.ss.android.ugc.aweme;

import X.C58096Mr6;
import X.QWD;

/* loaded from: classes11.dex */
public class AccountService extends QWD {
    public static IAccountService LJIJ() {
        Object LIZ = C58096Mr6.LIZ(IAccountService.class, false);
        if (LIZ != null) {
            return (IAccountService) LIZ;
        }
        if (C58096Mr6.LJJJJZI == null) {
            synchronized (IAccountService.class) {
                if (C58096Mr6.LJJJJZI == null) {
                    C58096Mr6.LJJJJZI = new AccountService();
                }
            }
        }
        return C58096Mr6.LJJJJZI;
    }
}

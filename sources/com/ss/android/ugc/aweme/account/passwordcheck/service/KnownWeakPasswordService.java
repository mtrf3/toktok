package com.ss.android.ugc.aweme.account.passwordcheck.service;

import X.AbstractC73672Svk;
import X.C36953Eer;
import X.C36954Ees;
import X.C36956Eeu;
import X.C58096Mr6;
import X.C73969T1h;
import X.T16;
import Y.IDuS318S0100000_6;
import Y.IDxS307S0100000_6;
import android.content.res.AssetManager;
import com.ss.android.ugc.aweme.IKnownWeakPasswordService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KnownWeakPasswordService implements IKnownWeakPasswordService {
    public C36953Eer LIZ = new C36953Eer();

    public static IKnownWeakPasswordService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IKnownWeakPasswordService.class, false);
        if (LIZ != null) {
            return (IKnownWeakPasswordService) LIZ;
        }
        if (C58096Mr6.LJLJJLL == null) {
            synchronized (IKnownWeakPasswordService.class) {
                if (C58096Mr6.LJLJJLL == null) {
                    C58096Mr6.LJLJJLL = new KnownWeakPasswordService();
                }
            }
        }
        return C58096Mr6.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.IKnownWeakPasswordService
    public final boolean LIZ(String password) {
        o.LJIIIZ(password, "password");
        C36953Eer c36953Eer = this.LIZ;
        c36953Eer.getClass();
        if (password.length() == 0) {
            return false;
        }
        C36954Ees c36954Ees = c36953Eer.LIZ;
        int length = password.length();
        for (int i = 0; i < length; i++) {
            char charAt = password.charAt(i);
            c36954Ees = (C36954Ees) ((LinkedHashMap) c36954Ees.LIZ).get(Character.valueOf(charAt));
            if (c36954Ees == null) {
                return false;
            }
        }
        return c36954Ees.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IKnownWeakPasswordService
    public final void LIZIZ(AssetManager assetManager) {
        if (this.LIZ.LIZIZ.get()) {
            return;
        }
        AbstractC73672Svk.LJIIJ(new IDuS318S0100000_6(assetManager, 0)).LJJJJL(new C36956Eeu()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS307S0100000_6(this, 1));
    }
}

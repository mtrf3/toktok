package com.ss.android.ugc.aweme.account.experiment;

import X.AVK;
import X.ActivityC45651qj;
import X.C26332AVc;
import X.C26334AVe;
import X.C58096Mr6;
import X.C77906Uhq;
import X.HG3;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IMultiAccountService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MultiAccountService implements IMultiAccountService {
    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void LIZIZ() {
        HG3.LJIIIIZZ().uploadAccountNum(false);
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final boolean LIZJ() {
        return AVK.LIZIZ();
    }

    public static IMultiAccountService LJ() {
        Object LIZ = C58096Mr6.LIZ(IMultiAccountService.class, false);
        if (LIZ != null) {
            return (IMultiAccountService) LIZ;
        }
        if (C58096Mr6.LJL == null) {
            synchronized (IMultiAccountService.class) {
                if (C58096Mr6.LJL == null) {
                    C58096Mr6.LJL = new MultiAccountService();
                }
            }
        }
        return C58096Mr6.LJL;
    }

    @Override // com.ss.android.ugc.aweme.IMultiAccountService
    public final void LIZLLL(ActivityC45651qj activityC45651qj, String enterFrom, String enterMethod, Bundle bundle, C77906Uhq c77906Uhq) {
        C26332AVc c26332AVc;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (c77906Uhq != null) {
            c26332AVc = new C26332AVc(c77906Uhq);
        } else {
            c26332AVc = null;
        }
        C26334AVe.LIZ(activityC45651qj, enterFrom, enterMethod, bundle, c26332AVc);
    }
}

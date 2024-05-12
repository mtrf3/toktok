package com.ss.android.ugc.aweme.service;

import X.C53710L6c;
import X.HG3;
import X.InterfaceC53712L6e;
import X.L61;
import X.L6V;
import X.L6X;
import X.L6Y;
import X.RBX;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS64S1200000_9;
import kotlin.jvm.internal.AqS76S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocPubStatusRepoServiceImpl implements ISocPubStatusRepoService {
    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final int LIZ(L61 bizTag, String str) {
        C53710L6c c53710L6c;
        Integer valueOf;
        o.LJIIIZ(bizTag, "bizTag");
        L6Y l6y = (L6Y) L6V.LIZIZ().get(bizTag);
        if (l6y != null) {
            if (str != null && (c53710L6c = l6y.M().get(str)) != null && (valueOf = Integer.valueOf(c53710L6c.LIZ)) != null) {
                return valueOf.intValue();
            }
            return -1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZLLL(L61 bizTag, C53710L6c c53710L6c) {
        o.LJIIIZ(bizTag, "bizTag");
        String currentUid = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(currentUid, "currentUid");
        L6V.LIZJ(bizTag, currentUid, c53710L6c, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LJ(L61 bizTag, String uid) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(uid, "uid");
        L6Y l6y = (L6Y) L6V.LIZIZ().get(bizTag);
        if (l6y != null) {
            L6V.LIZ(new AqS76S1100000_9(l6y, uid, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZJ(L61 bizTag, String str, AqS167S0100000_1 aqS167S0100000_1) {
        o.LJIIIZ(bizTag, "bizTag");
        L6Y l6y = (L6Y) L6V.LIZIZ().get(bizTag);
        if (l6y != null) {
            L6V.LIZ(new AqS64S1200000_9(str, aqS167S0100000_1, l6y, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubStatusRepoService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, L61 bizTag, String str, String str2, InterfaceC53712L6e observer) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(observer, "observer");
        L6Y l6y = (L6Y) L6V.LIZIZ().get(bizTag);
        if (l6y != null) {
            L6V.LIZ(new L6X(str2, l6y, lifecycleOwner, str, observer));
        }
    }
}

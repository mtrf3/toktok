package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC60482NoU;
import X.ActivityC45651qj;
import X.C40127Fox;
import X.C58096Mr6;
import X.C60466NoE;
import X.C60484NoW;
import X.OC1;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.router.IStrategyService;

/* loaded from: classes11.dex */
public final class StrategyService implements IStrategyService {
    public static IStrategyService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IStrategyService.class, false);
        if (LIZ != null) {
            return (IStrategyService) LIZ;
        }
        if (C58096Mr6.P == null) {
            synchronized (IStrategyService.class) {
                if (C58096Mr6.P == null) {
                    C58096Mr6.P = new StrategyService();
                }
            }
        }
        return C58096Mr6.P;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IStrategyService
    public final OC1 LIZIZ() {
        return new OC1();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IStrategyService
    public final AbstractC60482NoU LIZ(ActivityC45651qj activityC45651qj, Uri uri, boolean z) {
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer) {
            C60484NoW c60484NoW = new C60484NoW(activityC45651qj);
            c60484NoW.LIZLLL(activityC45651qj, uri, z);
            return c60484NoW;
        }
        C60466NoE c60466NoE = new C60466NoE(activityC45651qj);
        c60466NoE.LIZLLL(activityC45651qj, uri, z);
        return c60466NoE;
    }
}

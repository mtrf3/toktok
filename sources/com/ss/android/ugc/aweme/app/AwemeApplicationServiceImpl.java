package com.ss.android.ugc.aweme.app;

import X.C58096Mr6;
import X.C61017Nx7;

/* loaded from: classes11.dex */
public class AwemeApplicationServiceImpl implements IAwemeApplicationService {
    public static IAwemeApplicationService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IAwemeApplicationService.class, false);
        if (LIZ != null) {
            return (IAwemeApplicationService) LIZ;
        }
        if (C58096Mr6.LLIIL == null) {
            synchronized (IAwemeApplicationService.class) {
                if (C58096Mr6.LLIIL == null) {
                    C58096Mr6.LLIIL = new AwemeApplicationServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIIL;
    }

    @Override // com.ss.android.ugc.aweme.app.IAwemeApplicationService
    public final boolean isAppBackground() {
        return C61017Nx7.LIZ().LIZ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.app.IAwemeApplicationService
    public final boolean isAppHot() {
        return C61017Nx7.LIZ().LIZIZ();
    }
}

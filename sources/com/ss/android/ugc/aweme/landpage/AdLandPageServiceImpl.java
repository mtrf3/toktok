package com.ss.android.ugc.aweme.landpage;

import X.C58096Mr6;

/* loaded from: classes11.dex */
public final class AdLandPageServiceImpl implements IAdLandPageService {
    @Override // com.ss.android.ugc.aweme.landpage.IAdLandPageService
    public final void LIZ() {
    }

    public static IAdLandPageService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAdLandPageService.class, false);
        if (LIZ != null) {
            return (IAdLandPageService) LIZ;
        }
        if (C58096Mr6.T1 == null) {
            synchronized (IAdLandPageService.class) {
                if (C58096Mr6.T1 == null) {
                    C58096Mr6.T1 = new AdLandPageServiceImpl();
                }
            }
        }
        return C58096Mr6.T1;
    }
}

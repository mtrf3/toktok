package com.ss.android.ugc.aweme.app.services;

import X.C58096Mr6;
import X.C85990Xow;

/* loaded from: classes7.dex */
public final class RegionService implements IRegionService {
    public static IRegionService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IRegionService.class, false);
        if (LIZ != null) {
            return (IRegionService) LIZ;
        }
        if (C58096Mr6.LLILLJJLI == null) {
            synchronized (IRegionService.class) {
                if (C58096Mr6.LLILLJJLI == null) {
                    C58096Mr6.LLILLJJLI = new RegionService();
                }
            }
        }
        return C58096Mr6.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.app.services.IRegionService
    public final String getRegion() {
        return C85990Xow.LIZIZ();
    }
}

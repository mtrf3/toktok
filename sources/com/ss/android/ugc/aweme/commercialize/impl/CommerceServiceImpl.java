package com.ss.android.ugc.aweme.commercialize.impl;

import X.C221108m2;
import X.C58096Mr6;
import X.C58097Mr7;
import X.C58184MsW;
import X.C62822Ol8;
import com.ss.android.ugc.aweme.ad.subpage.ILandPageFunctionModule;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* loaded from: classes11.dex */
public final class CommerceServiceImpl implements ICommerceService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58097Mr7.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58184MsW.LJLIL);

    public static ICommerceService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceService.class, false);
        if (LIZ != null) {
            return (ICommerceService) LIZ;
        }
        if (C58096Mr6.LLLLLJIL == null) {
            synchronized (ICommerceService.class) {
                if (C58096Mr6.LLLLLJIL == null) {
                    C58096Mr6.LLLLLJIL = new CommerceServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLJIL;
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ILandPageFunctionModule LIZ() {
        return (ILandPageFunctionModule) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final IFeedService LIZIZ() {
        return (IFeedService) this.LIZ.getValue();
    }
}

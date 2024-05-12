package com.ss.android.ugc.aweme.web.intercept.forest;

import X.C58096Mr6;
import X.NJC;
import X.NJD;
import X.NJH;
import com.bytedance.forest.Forest;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebViewForestServiceImpl implements IAdWebViewForestService {
    public static IAdWebViewForestService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebViewForestService.class, false);
        if (LIZ != null) {
            return (IAdWebViewForestService) LIZ;
        }
        if (C58096Mr6.i8 == null) {
            synchronized (IAdWebViewForestService.class) {
                if (C58096Mr6.i8 == null) {
                    C58096Mr6.i8 = new AdWebViewForestServiceImpl();
                }
            }
        }
        return C58096Mr6.i8;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService
    public final void LIZ(Forest forest) {
        o.LJIIIZ(forest, "forest");
        forest.registerCustomFetcher("commerce_web", AdLandPageForestFetcher.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService
    public final NJH LIZIZ(boolean z) {
        if (z) {
            return new NJC();
        }
        return new NJD();
    }
}

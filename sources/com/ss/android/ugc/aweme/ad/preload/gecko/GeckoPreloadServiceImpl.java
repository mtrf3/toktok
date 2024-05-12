package com.ss.android.ugc.aweme.ad.preload.gecko;

import X.C38995FSd;
import X.C58096Mr6;
import X.C58909NAb;
import X.InterfaceC59440NUm;
import X.NH1;
import X.NH3;
import X.NTF;
import Y.ARunnableS46S0100000_10;
import com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import ujb.o;

/* loaded from: classes11.dex */
public final class GeckoPreloadServiceImpl implements ICommerceGeckoPreloadService {
    public boolean LIZ;

    public static ICommerceGeckoPreloadService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceGeckoPreloadService.class, false);
        if (LIZ != null) {
            return (ICommerceGeckoPreloadService) LIZ;
        }
        if (C58096Mr6.LLF == null) {
            synchronized (ICommerceGeckoPreloadService.class) {
                if (C58096Mr6.LLF == null) {
                    C58096Mr6.LLF = new GeckoPreloadServiceImpl();
                }
            }
        }
        return C58096Mr6.LLF;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.landpage.preload.ICommerceGeckoPreloadService
    public final void LIZ() {
        C38995FSd.LIZLLL().submit(new ARunnableS46S0100000_10(this, 34));
    }

    public static void LIZJ(NH1 nh1) {
        if (nh1.LIZJ) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            C58909NAb.LIZ.getClass();
            InterfaceC59440NUm LIZ = NH3.LIZ();
            if (LIZ != null) {
                String LJIIIIZZ = ((NTF) LIZ).LJIIIIZZ(nh1.LIZ);
                if (LJIIIIZZ == null || o.LJJJJJL(LJIIIIZZ)) {
                    return;
                }
                LJJI.LJIL(LJIIIIZZ);
            }
        }
    }
}

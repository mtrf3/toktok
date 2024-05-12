package com.ss.android.ugc.aweme.commercialize.feed;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileTrigger;

/* loaded from: classes4.dex */
public final class AdAssemServiceImpl implements IAdAssemService {
    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(AdProductTileTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final C65776Prg LIZIZ() {
        return C65352Pkq.LIZ(FeedCommerceAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService
    public final C65776Prg LIZJ() {
        return C65352Pkq.LIZ(MidAdCellComponent.class);
    }

    public static IAdAssemService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAdAssemService.class, false);
        if (LIZ != null) {
            return (IAdAssemService) LIZ;
        }
        if (C58096Mr6.LLLLIL == null) {
            synchronized (IAdAssemService.class) {
                if (C58096Mr6.LLLLIL == null) {
                    C58096Mr6.LLLLIL = new AdAssemServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLIL;
    }
}

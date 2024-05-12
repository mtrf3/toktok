package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.C55529Lqn;
import X.C55541Lqz;
import X.C55544Lr2;
import X.C58096Mr6;
import X.C59041NFd;
import X.C59367NRr;
import com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService;

/* loaded from: classes10.dex */
public final class CommerceProfileService implements ICommerceProfileService {
    public static ICommerceProfileService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceProfileService.class, false);
        if (LIZ != null) {
            return (ICommerceProfileService) LIZ;
        }
        if (C58096Mr6.LLLLLZL == null) {
            synchronized (ICommerceProfileService.class) {
                if (C58096Mr6.LLLLLZL == null) {
                    C58096Mr6.LLLLLZL = new CommerceProfileService();
                }
            }
        }
        return C58096Mr6.LLLLLZL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService
    public final C55541Lqz LIZ(C55544Lr2 c55544Lr2) {
        return new C55541Lqz(c55544Lr2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.ad.ICommerceProfileService
    public final C59041NFd LIZIZ(C55529Lqn c55529Lqn) {
        C59041NFd c59041NFd = new C59041NFd(c55529Lqn);
        C59367NRr.LIZJ(c59041NFd);
        return c59041NFd;
    }
}

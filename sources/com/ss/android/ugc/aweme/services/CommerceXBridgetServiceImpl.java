package com.ss.android.ugc.aweme.services;

import X.AbstractC37594EpC;
import X.C47261Igj;
import X.C58096Mr6;
import X.C58828N6y;
import X.C58838N7i;
import X.C58856N8a;
import X.N7A;
import X.N81;
import X.N8I;
import X.OWY;
import com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService;
import java.util.List;

/* loaded from: classes11.dex */
public final class CommerceXBridgetServiceImpl implements ICommerceXBridgetService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService
    public List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJIIJI(N81.class, N7A.class, N8I.class, C58828N6y.class, C58838N7i.class, C58856N8a.class, OWY.class);
    }

    public static ICommerceXBridgetService createICommerceXBridgetServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ICommerceXBridgetService.class, z);
        if (LIZ != null) {
            return (ICommerceXBridgetService) LIZ;
        }
        if (C58096Mr6.I5 == null) {
            synchronized (ICommerceXBridgetService.class) {
                if (C58096Mr6.I5 == null) {
                    C58096Mr6.I5 = new CommerceXBridgetServiceImpl();
                }
            }
        }
        return C58096Mr6.I5;
    }
}

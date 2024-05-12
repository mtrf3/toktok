package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.AbstractC37594EpC;
import X.C38367F3z;
import X.C47261Igj;
import X.C51438KGs;
import X.C51444KGy;
import X.C51445KGz;
import X.C58096Mr6;
import X.F40;
import X.K0S;
import X.K0T;
import X.KL1;
import com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService;
import java.util.List;

/* loaded from: classes9.dex */
public final class SearchBDXBridgeServiceImpl implements ISearchBDXBridgeService {
    public static ISearchBDXBridgeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISearchBDXBridgeService.class, false);
        if (LIZ != null) {
            return (ISearchBDXBridgeService) LIZ;
        }
        if (C58096Mr6.K4 == null) {
            synchronized (ISearchBDXBridgeService.class) {
                if (C58096Mr6.K4 == null) {
                    C58096Mr6.K4 = new SearchBDXBridgeServiceImpl();
                }
            }
        }
        return C58096Mr6.K4;
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJIIJI(F40.class, C38367F3z.class, C51445KGz.class, C51444KGy.class, K0T.class, KL1.class, C51438KGs.class, K0S.class);
    }
}

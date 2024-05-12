package com.ss.android.ugc.aweme.ecommerce.ug.common.service;

import X.C38995FSd;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.OL4;
import X.RunnableC61738OKw;
import Y.ARunnableS1S1101000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.ug.common.assem.EcUgMainAssem;
import java.util.List;

/* loaded from: classes10.dex */
public final class EcUgCommonService implements IEcUgCommonService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final C65776Prg LIZJ() {
        return C65352Pkq.LIZ(EcUgMainAssem.class);
    }

    public static IEcUgCommonService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IEcUgCommonService.class, false);
        if (LIZ != null) {
            return (IEcUgCommonService) LIZ;
        }
        if (C58096Mr6.e0 == null) {
            synchronized (IEcUgCommonService.class) {
                if (C58096Mr6.e0 == null) {
                    C58096Mr6.e0 = new EcUgCommonService();
                }
            }
        }
        return C58096Mr6.e0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final void LIZ(Context context, String str, List list, int i) {
        try {
            C38995FSd.LIZJ().execute(new RunnableC61738OKw(str, list, i));
        } catch (Throwable unused) {
        }
        try {
            C38995FSd.LIZJ().execute(new OL4(i, context, str, list));
        } catch (Throwable unused2) {
        }
        try {
            C38995FSd.LIZJ().execute(new ARunnableS1S1101000_6(list, str, i, 3));
        } catch (Throwable unused3) {
        }
    }
}

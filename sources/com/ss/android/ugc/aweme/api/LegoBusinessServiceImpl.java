package com.ss.android.ugc.aweme.api;

import X.C56672Kh;
import X.FAK;
import X.X1D;
import com.ss.android.ugc.aweme.lego.common.LegoBusinessService;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class LegoBusinessServiceImpl implements LegoBusinessService {
    @Override // com.ss.android.ugc.aweme.lego.common.LegoBusinessService
    public final String LIZ() {
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("coreReportCache: size =");
        LIZ2.append(((ConcurrentHashMap) LIZ.LJI).size());
        LIZ2.append(", content = ");
        LIZ2.append(LIZ.LJI);
        return X1D.LIZIZ(LIZ2);
    }
}

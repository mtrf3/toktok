package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C58096Mr6;
import X.C73411SrX;
import X.C73969T1h;
import X.C75792yF;
import X.E7T;
import X.EBJ;
import X.T16;
import Y.AfS58S0100000_6;
import com.ss.android.ugc.aweme.ActivityCenterEntranceExperiment;
import com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService;
import com.ss.android.ugc.aweme.compliance.business.search.PnSSearchHistoryApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PnSSearchHistoryServiceImpl implements IPnSSearchHistoryService {
    public C73411SrX LIZ;

    public static IPnSSearchHistoryService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPnSSearchHistoryService.class, false);
        if (LIZ != null) {
            return (IPnSSearchHistoryService) LIZ;
        }
        if (C58096Mr6.LLZIL == null) {
            synchronized (IPnSSearchHistoryService.class) {
                if (C58096Mr6.LLZIL == null) {
                    C58096Mr6.LLZIL = new PnSSearchHistoryServiceImpl();
                }
            }
        }
        return C58096Mr6.LLZIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.search.IPnSSearchHistoryService
    public final void LIZ(List list, EBJ ebj) {
        if (!((ActivityCenterEntranceExperiment.ActivityCenterSettingModel) ActivityCenterEntranceExperiment.LIZIZ.getValue()).enable) {
            return;
        }
        C73411SrX c73411SrX = this.LIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        E7T e7t = PnSSearchHistoryApi.LIZ;
        String LIZJ = C75792yF.LIZJ(list);
        o.LJIIIIZZ(LIZJ, "toJson(searchItems)");
        e7t.getClass();
        this.LIZ = (C73411SrX) E7T.LIZIZ.deleteSearchItem(LIZJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0100000_6(ebj, 33), new AfS58S0100000_6(ebj, 34));
    }
}

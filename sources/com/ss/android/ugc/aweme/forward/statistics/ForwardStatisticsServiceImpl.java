package com.ss.android.ugc.aweme.forward.statistics;

import X.C03660Ck;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ForwardStatisticsServiceImpl implements IForwardStatisticsService {
    public static IForwardStatisticsService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IForwardStatisticsService.class, false);
        if (LIZ != null) {
            return (IForwardStatisticsService) LIZ;
        }
        if (C58096Mr6.V0 == null) {
            synchronized (IForwardStatisticsService.class) {
                if (C58096Mr6.V0 == null) {
                    C58096Mr6.V0 = new ForwardStatisticsServiceImpl();
                }
            }
        }
        return C58096Mr6.V0;
    }

    @Override // com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    public final HashMap LIZ(Aweme aweme, String str) {
        HashMap LIZJ = C03660Ck.LIZJ("enter_from", str);
        if (aweme != null) {
            LIZJ.put("author_id", aweme.getAuthorUid());
            LIZJ.put("group_id", aweme.getAid());
        }
        return LIZJ;
    }
}

package com.ss.android.ugc.aweme.recommend.users;

import X.C58096Mr6;
import X.MO3;
import android.content.Context;

/* loaded from: classes10.dex */
public final class RecommendUserServiceImpl implements RecommendUserService {
    public static RecommendUserService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(RecommendUserService.class, false);
        if (LIZ != null) {
            return (RecommendUserService) LIZ;
        }
        if (C58096Mr6.p4 == null) {
            synchronized (RecommendUserService.class) {
                if (C58096Mr6.p4 == null) {
                    C58096Mr6.p4 = new RecommendUserServiceImpl();
                }
            }
        }
        return C58096Mr6.p4;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.RecommendUserService
    public final MO3 LIZ(Context context) {
        return new MO3(context, null, 0);
    }
}

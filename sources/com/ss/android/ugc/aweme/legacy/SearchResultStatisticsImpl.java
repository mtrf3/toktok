package com.ss.android.ugc.aweme.legacy;

import X.C49598JdK;
import X.C49599JdL;
import X.C49601JdN;
import X.C58096Mr6;
import X.Z9N;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;

/* loaded from: classes9.dex */
public class SearchResultStatisticsImpl implements ISearchResultStatistics {
    public final ISearchResultStatistics LIZ = Z9N.LIZIZ.LJJJJZI();

    public static ISearchResultStatistics LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ISearchResultStatistics.class, false);
        if (LIZ != null) {
            return (ISearchResultStatistics) LIZ;
        }
        if (C58096Mr6.c2 == null) {
            synchronized (ISearchResultStatistics.class) {
                if (C58096Mr6.c2 == null) {
                    C58096Mr6.c2 = new SearchResultStatisticsImpl();
                }
            }
        }
        return C58096Mr6.c2;
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZ(C49601JdN c49601JdN) {
        this.LIZ.LIZ(c49601JdN);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZIZ(C49598JdK c49598JdK) {
        this.LIZ.LIZIZ(c49598JdK);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZJ(C49599JdL c49599JdL) {
        this.LIZ.LIZJ(c49599JdL);
    }
}

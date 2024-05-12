package com.ss.android.ugc.aweme.paidseries.broadcaster.before.service;

import X.AbstractC73638SvC;
import X.C221108m2;
import X.C25679A5z;
import X.C58096Mr6;
import X.C62822Ol8;
import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.api.PaidSeriesLiveApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;

/* loaded from: classes5.dex */
public final class PaidSeriesLiveApiService implements IPaidSeriesLiveApiService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C25679A5z.LJLIL);

    public static IPaidSeriesLiveApiService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPaidSeriesLiveApiService.class, false);
        if (LIZ != null) {
            return (IPaidSeriesLiveApiService) LIZ;
        }
        if (C58096Mr6.O3 == null) {
            synchronized (IPaidSeriesLiveApiService.class) {
                if (C58096Mr6.O3 == null) {
                    C58096Mr6.O3 = new PaidSeriesLiveApiService();
                }
            }
        }
        return C58096Mr6.O3;
    }

    public final PaidSeriesLiveApi LIZLLL() {
        return (PaidSeriesLiveApi) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC73638SvC<BaseResponse> LIZ(long j) {
        return LIZLLL().deleteSeries(0L, j, 1);
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC73638SvC<PaidSeriesLiveNumResponse> getSeriesNum(long j) {
        return LIZLLL().getSeriesNum(j);
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC73638SvC LIZIZ(long j, long j2) {
        return LIZLLL().removeSeriesFromLive(j, j2, 0);
    }

    @Override // com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService
    public final AbstractC73638SvC<BaseResponse> addSeriesToLive(long j, long j2) {
        return LIZLLL().addSeriesToLive(j, j2);
    }
}

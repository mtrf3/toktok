package com.ss.android.ugc.aweme.api;

import X.AbstractC73638SvC;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;

/* loaded from: classes5.dex */
public interface IPaidSeriesLiveApiService {
    AbstractC73638SvC<BaseResponse> LIZ(long j);

    AbstractC73638SvC LIZIZ(long j, long j2);

    AbstractC73638SvC<BaseResponse> addSeriesToLive(long j, long j2);

    AbstractC73638SvC<PaidSeriesLiveNumResponse> getSeriesNum(long j);
}

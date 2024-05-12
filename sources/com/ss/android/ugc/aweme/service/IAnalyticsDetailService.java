package com.ss.android.ugc.aweme.service;

import X.AbstractC73638SvC;
import X.C6M4;
import android.content.Context;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.model.InsightTypeRequest;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import java.util.List;

/* loaded from: classes2.dex */
public interface IAnalyticsDetailService {
    AbstractC73638SvC<InsightTypeResponse> LIZ(List<InsightTypeRequest> list);

    C6M4 LIZIZ(Context context);

    AnalyticsDetailInterceptor LIZJ();
}

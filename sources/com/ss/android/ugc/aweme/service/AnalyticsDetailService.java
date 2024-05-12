package com.ss.android.ugc.aweme.service;

import X.AbstractC73638SvC;
import X.C6M4;
import X.C77800Ug8;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.model.InsightTypeRequest;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AnalyticsDetailService implements IAnalyticsDetailService {
    public final AnalyticsInsightsApi LIZ;
    public final Gson LIZIZ;

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final AnalyticsDetailInterceptor LIZJ() {
        return new AnalyticsDetailInterceptor();
    }

    public AnalyticsDetailService() {
        AnalyticsInsightsApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = Api.LIZ;
        this.LIZ = (AnalyticsInsightsApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, AnalyticsInsightsApi.class);
        this.LIZIZ = GsonHolder.LIZLLL().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final AbstractC73638SvC<InsightTypeResponse> LIZ(List<InsightTypeRequest> list) {
        AnalyticsInsightsApi analyticsInsightsApi = this.LIZ;
        String json = GsonProtectorUtils.toJson(this.LIZIZ, list);
        o.LJIIIIZZ(json, "gson.toJson(insightTypeRequests)");
        return analyticsInsightsApi.getInsights(json);
    }

    @Override // com.ss.android.ugc.aweme.service.IAnalyticsDetailService
    public final C6M4 LIZIZ(Context context) {
        return new C6M4(context);
    }
}

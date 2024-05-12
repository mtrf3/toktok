package com.ss.android.ugc.aweme.service;

import X.AbstractC73638SvC;
import X.C3D1;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;

/* loaded from: classes2.dex */
public interface AnalyticsInsightsApi {
    public static final C3D1 LIZ = C3D1.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/data/insighs/")
    AbstractC73638SvC<InsightTypeResponse> getInsights(@InterfaceC64987Pex("type_requests") String str);
}

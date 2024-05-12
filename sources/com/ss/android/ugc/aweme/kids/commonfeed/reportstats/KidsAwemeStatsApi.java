package com.ss.android.ugc.aweme.kids.commonfeed.reportstats;

import X.AFI;
import X.C10K;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* loaded from: classes9.dex */
public final class KidsAwemeStatsApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(RetrofitApi.class);

    /* loaded from: classes9.dex */
    public interface RetrofitApi {
        @E8M("/tiktok/v1/kids/video/stats/")
        @InterfaceC195757mF
        C10K<BaseResponse> reportAwemeStats(@InterfaceC36229EJt Map<String, String> map);
    }
}

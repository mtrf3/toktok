package com.ss.android.ugc.aweme.commercialize.utils;

import X.C10K;
import X.C770830u;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes2.dex */
public final class ReportFeedAdAction {
    public static final RetrofitApi LIZ;

    /* loaded from: classes4.dex */
    public interface RetrofitApi {
        @InterfaceC195787mI
        @E4T("/api/ad/v1/ack_action/")
        C10K<Object> reportAction(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("ad_id") long j, @InterfaceC64987Pex("creative_id") long j2, @InterfaceC64987Pex("log_extra") String str2, @InterfaceC64987Pex("action_extra") String str3, @InterfaceC64987Pex("action_type") int i);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (RetrofitApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RetrofitApi.class);
    }
}

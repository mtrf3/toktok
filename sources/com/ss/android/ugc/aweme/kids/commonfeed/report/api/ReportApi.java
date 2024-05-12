package com.ss.android.ugc.aweme.kids.commonfeed.report.api;

import X.AFI;
import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public final class ReportApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(RetrofitApi.class);

    /* loaded from: classes4.dex */
    public interface RetrofitApi {
        @E8L("/aweme/v1/aweme/feedback/")
        AbstractC73672Svk<BaseResponse> reportAwame(@InterfaceC64986Pew("report_type") String str, @InterfaceC64986Pew("object_id") long j, @InterfaceC64986Pew("owner_id") long j2, @InterfaceC64986Pew("reason") int i, @InterfaceC64986Pew("additional_reasons") String str2);
    }
}

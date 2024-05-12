package com.ss.android.ugc.aweme.opt;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC36348EOi;

/* loaded from: classes7.dex */
public interface ILocationApi {
    @E8L("/activity/detect/")
    AbstractC73672Svk<BackendParamsResp> activityDetect(@InterfaceC36348EOi("x-ttnet-dns-query-type") String str, @InterfaceC36348EOi("x-ttnet-isolation-info") String str2);
}

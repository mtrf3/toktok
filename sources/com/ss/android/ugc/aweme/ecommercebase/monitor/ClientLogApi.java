package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* loaded from: classes2.dex */
public interface ClientLogApi {
    @E4T("/api/v1/oec/client_log_report")
    Object getClientLogReportResponse(@InterfaceC27211Am7 ClientLogReportRequest clientLogReportRequest, InterfaceC67352kd<? super BaseResponse<Object>> interfaceC67352kd);
}

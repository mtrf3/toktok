package com.ss.android.ugc.aweme.music.app.auth.report.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes34.dex */
public interface ActionReportApi {
    @E8M("/tiktok/music/aem/action/report/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> reportAction(@InterfaceC64985Pev("actions") String str);
}

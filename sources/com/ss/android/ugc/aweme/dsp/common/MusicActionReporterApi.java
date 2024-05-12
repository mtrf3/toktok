package com.ss.android.ugc.aweme.dsp.common;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public final class MusicActionReporterApi {
    public static MusicActionReporterOperatorApi LIZ;

    /* loaded from: classes7.dex */
    public interface MusicActionReporterOperatorApi {
        @E8M("/tiktok/music/dsp/action/report/v2/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> actionReport(@InterfaceC64985Pev("actions") String str);
    }
}

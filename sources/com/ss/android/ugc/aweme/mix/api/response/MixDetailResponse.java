package com.ss.android.ugc.aweme.mix.api.response;

import X.C64668PZo;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;

/* loaded from: classes4.dex */
public final class MixDetailResponse extends BaseResponse implements K4J {
    public C64668PZo<?> LJLIL;

    @InterfaceC65349Pkn("is_collect")
    public boolean isCollected;

    @InterfaceC65349Pkn("mix")
    public MixStruct mixDetail;

    @Override // X.K4J
    public final /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.K4J
    public final C64668PZo<?> getRequestInfo() {
        return this.LJLIL;
    }

    @Override // X.K4J
    public final void setRequestInfo(C64668PZo<?> c64668PZo) {
        if (c64668PZo != null) {
            this.LJLIL = c64668PZo;
        }
    }
}

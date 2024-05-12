package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C64668PZo;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.util.List;

/* loaded from: classes9.dex */
public final class TopHistoryWordsResponse implements InterfaceC65316PkG, K4J {

    @InterfaceC65349Pkn("data")
    public final List<TopHistoryWord> data;

    @InterfaceC65349Pkn("errno")
    public final int errno;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("msg")
    public final String msg;
    public String requestId = "";
    public C64668PZo<?> requestInfo;

    @Override // X.K4J
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.K4J
    public C64668PZo<?> getRequestInfo() {
        return this.requestInfo;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.K4J
    public void setRequestInfo(C64668PZo<?> c64668PZo) {
        this.requestInfo = c64668PZo;
    }
}

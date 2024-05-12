package com.ss.android.ugc.aweme.model;

import X.C64668PZo;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.K4J;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcommerceSuggestWordResponse implements InterfaceC65316PkG, K4J {

    @InterfaceC65349Pkn("data")
    public final List<EcommerceTypeWords> data;

    @InterfaceC65349Pkn("errno")
    public final int errno;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("msg")
    public final String msg;
    public String requestId = "";
    public C64668PZo<?> requestInfo;

    @InterfaceC65349Pkn("top_history_words")
    public List<TopHistoryWord> topHistoryWords;

    @Override // X.K4J
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    /* loaded from: classes9.dex */
    public static final class Extra implements Serializable {

        @InterfaceC65349Pkn("call_per_refresh")
        public String callPerRefresh;

        @InterfaceC65349Pkn("time_cost_log_pb")
        public Map<String, String> timingLog;

        public final String getCallPerRefresh() {
            return this.callPerRefresh;
        }

        public final Map<String, String> getTimingLog() {
            return this.timingLog;
        }

        public final void setCallPerRefresh(String str) {
            this.callPerRefresh = str;
        }

        public final void setTimingLog(Map<String, String> map) {
            this.timingLog = map;
        }
    }

    public final List<EcommerceTypeWords> getData() {
        return this.data;
    }

    public final int getErrno() {
        return this.errno;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMsg() {
        return this.msg;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.K4J
    public C64668PZo<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final List<TopHistoryWord> getTopHistoryWords() {
        return this.topHistoryWords;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EcommerceSuggestWordResponse) || !o.LJ(this.data, ((EcommerceSuggestWordResponse) obj).data)) {
            return false;
        }
        return true;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.K4J
    public void setRequestInfo(C64668PZo<?> c64668PZo) {
        this.requestInfo = c64668PZo;
    }

    public final void setTopHistoryWords(List<TopHistoryWord> list) {
        this.topHistoryWords = list;
    }
}

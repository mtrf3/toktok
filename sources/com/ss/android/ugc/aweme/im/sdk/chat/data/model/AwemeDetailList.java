package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes2.dex */
public final class AwemeDetailList extends BaseResponse {

    @InterfaceC65349Pkn("aweme_details")
    public List<? extends Aweme> awemeList;

    @InterfaceC65349Pkn("aweme_status")
    public List<AwemeStatusBean> awemeStatus;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final List<AwemeStatusBean> getAwemeStatus() {
        return this.awemeStatus;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setAwemeStatus(List<AwemeStatusBean> list) {
        this.awemeStatus = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }
}

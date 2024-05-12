package com.ss.android.ugc.aweme.detail.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes4.dex */
public class BatchDetailList extends BaseResponse {

    @InterfaceC65349Pkn("aweme_details")
    public List<Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("rid")
    public String requestId;
}

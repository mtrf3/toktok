package com.ss.android.ugc.aweme.feed.interest.model;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.journey.SelectedInterestList;

/* loaded from: classes10.dex */
public final class InterestListResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("aweme")
    public Aweme aweme;

    @InterfaceC65349Pkn("interest_list")
    public SelectedInterestList interestList;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("status_code")
    public Integer statusCode = 0;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg = "";

    @InterfaceC65349Pkn("is_active_device")
    public Integer isActiveDevice = 0;

    @InterfaceC65349Pkn("rid")
    public String requestIdInner = "";

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.requestIdInner;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.requestIdInner = str;
    }
}

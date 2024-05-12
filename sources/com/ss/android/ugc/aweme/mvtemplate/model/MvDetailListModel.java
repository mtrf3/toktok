package com.ss.android.ugc.aweme.mvtemplate.model;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class MvDetailListModel extends BaseResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("aweme_list")
    public ArrayList<Aweme> awemeList;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public Boolean hasMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("rid")
    public String rid;

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.rid;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.rid = str;
    }
}

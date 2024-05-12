package com.ss.android.ugc.aweme.duet.model;

import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class DuetAwemeList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("aweme_list")
    public ArrayList<Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;
}

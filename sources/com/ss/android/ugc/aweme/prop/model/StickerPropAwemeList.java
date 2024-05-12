package com.ss.android.ugc.aweme.prop.model;

import X.InterfaceC195777mH;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes10.dex */
public class StickerPropAwemeList extends BaseResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("feed_session_id")
    public String feedSessionId;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("is_top")
    public boolean isTop;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("aweme_list")
    public List<Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.requestId = str;
    }
}

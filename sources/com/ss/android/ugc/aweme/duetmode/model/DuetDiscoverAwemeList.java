package com.ss.android.ugc.aweme.duetmode.model;

import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class DuetDiscoverAwemeList extends BaseResponse {

    @InterfaceC65349Pkn("next_offset")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("video_list")
    public final List<Aweme> items = new ArrayList();
}

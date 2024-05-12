package com.ss.android.ugc.aweme.notification.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes10.dex */
public final class LikeListResponse extends BaseResponse {
    public transient int LJLIL;

    @InterfaceC65349Pkn("digg_infos")
    public List<DiggInfo> diggInfos;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("total")
    public int total;
}

package com.ss.android.ugc.aweme.notification.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes10.dex */
public final class FavoriteListResponse extends BaseResponse {
    public transient int LJLIL;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("fav_info")
    public List<DiggInfo> diggInfos;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;
}

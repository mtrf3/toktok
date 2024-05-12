package com.ss.android.ugc.aweme.notification.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes10.dex */
public final class TranslationLikeListResponse extends BaseResponse {
    public transient int LJLIL;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("next_offset")
    public long nextOffset;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("users")
    public List<User> users;
}

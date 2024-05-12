package com.ss.android.ugc.aweme.fe.method.feeds.pojo;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FeedsResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("is_new_user")
    public boolean isNewUser;

    @InterfaceC65349Pkn("aweme_list")
    public List<Aweme> list = new ArrayList();
}

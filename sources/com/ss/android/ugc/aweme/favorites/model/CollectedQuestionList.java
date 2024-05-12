package com.ss.android.ugc.aweme.favorites.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.question.ForumStruct;
import java.util.List;

/* loaded from: classes4.dex */
public final class CollectedQuestionList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("invalid_count")
    public int invalidCount;

    @InterfaceC65349Pkn("questions")
    public List<ForumStruct> items;
}

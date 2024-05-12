package com.ss.android.ugc.aweme.kids.discovery.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes11.dex */
public final class CategoryList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("category_list")
    public List<Category> items;
}

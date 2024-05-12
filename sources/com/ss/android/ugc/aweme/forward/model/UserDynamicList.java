package com.ss.android.ugc.aweme.forward.model;

import X.C78540Us4;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes2.dex */
public class UserDynamicList extends BaseResponse implements InterfaceC65316PkG {

    @InterfaceC65349Pkn("dongtai_list")
    public List<DynamicStruct> dynamicList;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;
    public String requestId;

    public List<DynamicStruct> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<DynamicStruct> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
        if (C78540Us4.LJIILLIIL(this.dynamicList)) {
            return;
        }
        for (DynamicStruct dynamicStruct : this.dynamicList) {
            if (dynamicStruct != null) {
                dynamicStruct.setRequestId(str);
            }
        }
    }
}

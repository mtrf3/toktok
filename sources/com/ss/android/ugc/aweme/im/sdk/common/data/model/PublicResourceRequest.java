package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PublicResourceRequest extends F9E {

    @InterfaceC65349Pkn("entries")
    public final List<SingleResourceRefreshReq> singleResourceRefreshReqList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.singleResourceRefreshReqList};
    }

    public PublicResourceRequest(List<SingleResourceRefreshReq> singleResourceRefreshReqList) {
        o.LJIIIZ(singleResourceRefreshReqList, "singleResourceRefreshReqList");
        this.singleResourceRefreshReqList = singleResourceRefreshReqList;
    }
}

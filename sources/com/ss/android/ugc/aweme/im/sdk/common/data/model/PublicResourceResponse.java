package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PublicResourceResponse extends BaseResponse {

    @InterfaceC65349Pkn("results")
    public final List<SingleResourceRefreshResp> singleResourceRefreshRespList;

    public final int hashCode() {
        return Objects.hash(this.singleResourceRefreshRespList);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("PublicResourceResponse:%s", this.singleResourceRefreshRespList);
    }

    public PublicResourceResponse(List<SingleResourceRefreshResp> singleResourceRefreshRespList) {
        o.LJIIIZ(singleResourceRefreshRespList, "singleResourceRefreshRespList");
        this.singleResourceRefreshRespList = singleResourceRefreshRespList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicResourceResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((PublicResourceResponse) obj).singleResourceRefreshRespList}, new Object[]{this.singleResourceRefreshRespList});
    }
}

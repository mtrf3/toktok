package com.ss.android.ugc.aweme.compliance.business.filtervideo.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class FilterKeywordResp extends BaseResponse {

    @InterfaceC65349Pkn("word_count")
    public final int counts;

    public FilterKeywordResp() {
        this(0, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterKeywordResp) {
            return C78966Uyw.LJIIIZ(((FilterKeywordResp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.counts)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("FilterKeywordResp:%s", getObjects());
    }

    public FilterKeywordResp(int i) {
        this.counts = i;
    }

    public /* synthetic */ FilterKeywordResp(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

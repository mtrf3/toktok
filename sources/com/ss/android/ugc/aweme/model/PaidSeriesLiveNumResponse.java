package com.ss.android.ugc.aweme.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PaidSeriesLiveNumResponse extends BaseResponse {

    @InterfaceC65349Pkn("added_live_series_count")
    public final int addedLiveSeriesCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaidSeriesLiveNumResponse) {
            return C78966Uyw.LJIIIZ(((PaidSeriesLiveNumResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.addedLiveSeriesCount)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("PaidSeriesLiveNumResponse:%s", getObjects());
    }

    public PaidSeriesLiveNumResponse(int i) {
        this.addedLiveSeriesCount = i;
    }
}

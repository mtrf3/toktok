package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TrendingTopicSettingResponse extends BaseResponse {

    @InterfaceC65349Pkn("enable_link_topic")
    public final int status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrendingTopicSettingResponse) {
            return C78966Uyw.LJIIIZ(((TrendingTopicSettingResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("TrendingTopicSettingResponse:%s", getObjects());
    }

    public TrendingTopicSettingResponse(int i) {
        this.status = i;
    }
}

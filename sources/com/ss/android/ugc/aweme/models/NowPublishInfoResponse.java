package com.ss.android.ugc.aweme.models;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPublishInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("user_publish_info")
    public final UserPublishInfo userPublishInfo;

    public final int hashCode() {
        return Objects.hash(this.userPublishInfo);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("NowPublishInfoResponse:%s", this.userPublishInfo);
    }

    public NowPublishInfoResponse(UserPublishInfo userPublishInfo) {
        o.LJIIIZ(userPublishInfo, "userPublishInfo");
        this.userPublishInfo = userPublishInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowPublishInfoResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((NowPublishInfoResponse) obj).userPublishInfo}, new Object[]{this.userPublishInfo});
    }
}

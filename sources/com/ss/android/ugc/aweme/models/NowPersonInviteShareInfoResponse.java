package com.ss.android.ugc.aweme.models;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPersonInviteShareInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("share_info")
    public final ShareInfo shareInfo;

    public final int hashCode() {
        return Objects.hash(this.shareInfo);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("NowPersonInviteShareInfoResponse:%s", this.shareInfo);
    }

    public NowPersonInviteShareInfoResponse(ShareInfo shareInfo) {
        o.LJIIIZ(shareInfo, "shareInfo");
        this.shareInfo = shareInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowPersonInviteShareInfoResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((NowPersonInviteShareInfoResponse) obj).shareInfo}, new Object[]{this.shareInfo});
    }
}

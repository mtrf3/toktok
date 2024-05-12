package com.ss.android.ugc.aweme.mix.api.response;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ManageResponse extends BaseResponse {

    @InterfaceC65349Pkn("mix_id")
    public final String mixId;

    public final int hashCode() {
        return Objects.hash(this.mixId);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("ManageResponse:%s", this.mixId);
    }

    public ManageResponse(String mixId) {
        o.LJIIIZ(mixId, "mixId");
        this.mixId = mixId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManageResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((ManageResponse) obj).mixId}, new Object[]{this.mixId});
    }
}

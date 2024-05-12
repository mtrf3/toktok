package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;

/* loaded from: classes34.dex */
public final class UpdateDspPlatformResponse extends BaseResponse {

    @InterfaceC65349Pkn("success")
    public final boolean success;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateDspPlatformResponse) {
            return C78966Uyw.LJIIIZ(((UpdateDspPlatformResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.success)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("UpdateDspPlatformResponse:%s", getObjects());
    }

    public UpdateDspPlatformResponse(boolean z) {
        this.success = z;
    }
}

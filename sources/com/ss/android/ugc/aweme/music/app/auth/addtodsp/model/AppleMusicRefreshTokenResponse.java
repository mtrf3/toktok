package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class AppleMusicRefreshTokenResponse extends BaseResponse {

    @InterfaceC65349Pkn("results")
    public final Result result;

    public final int hashCode() {
        return Objects.hash(this.result);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("AppleMusicRefreshTokenResponse:%s", this.result);
    }

    public AppleMusicRefreshTokenResponse(Result result) {
        o.LJIIIZ(result, "result");
        this.result = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppleMusicRefreshTokenResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((AppleMusicRefreshTokenResponse) obj).result}, new Object[]{this.result});
    }
}

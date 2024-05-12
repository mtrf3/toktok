package com.ss.android.ugc.aweme.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkTransResult extends BaseResponse {

    @InterfaceC65349Pkn("landing_url")
    public final String longUrl;

    public final int hashCode() {
        return Objects.hash(this.longUrl);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("LinkTransResult:%s", this.longUrl);
    }

    public LinkTransResult(String longUrl) {
        o.LJIIIZ(longUrl, "longUrl");
        this.longUrl = longUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkTransResult)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((LinkTransResult) obj).longUrl}, new Object[]{this.longUrl});
    }
}

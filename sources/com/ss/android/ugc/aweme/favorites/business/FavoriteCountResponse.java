package com.ss.android.ugc.aweme.favorites.business;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FavoriteCountResponse extends BaseResponse {

    @InterfaceC65349Pkn("collect_count")
    public final HashMap<String, Integer> count;

    public final int hashCode() {
        return Objects.hash(this.count);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("FavoriteCountResponse:%s", this.count);
    }

    public FavoriteCountResponse(HashMap<String, Integer> count) {
        o.LJIIIZ(count, "count");
        this.count = count;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteCountResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((FavoriteCountResponse) obj).count}, new Object[]{this.count});
    }
}

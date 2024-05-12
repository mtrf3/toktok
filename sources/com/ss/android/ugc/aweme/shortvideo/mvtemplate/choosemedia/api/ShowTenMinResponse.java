package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ShowTenMinResponse extends BaseResponse {

    @InterfaceC65349Pkn("need_show_ten_min")
    public final boolean needShowTenMin;

    public ShowTenMinResponse() {
        this(false, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShowTenMinResponse) {
            return C78966Uyw.LJIIIZ(((ShowTenMinResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.needShowTenMin)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("ShowTenMinResponse:%s", getObjects());
    }

    public ShowTenMinResponse(boolean z) {
        this.needShowTenMin = z;
    }

    public /* synthetic */ ShowTenMinResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

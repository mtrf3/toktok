package com.ss.android.ugc.aweme.compliance.api.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class ConsentAcceptanceResponse extends BaseResponse {

    @InterfaceC65349Pkn("record_found")
    public final boolean recordFound;

    @InterfaceC65349Pkn("should_show")
    public final boolean shouldShow;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentAcceptanceResponse) {
            return C78966Uyw.LJIIIZ(((ConsentAcceptanceResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.shouldShow), Boolean.valueOf(this.recordFound)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("ConsentAcceptanceResponse:%s,%s", getObjects());
    }

    public ConsentAcceptanceResponse(boolean z, boolean z2) {
        this.shouldShow = z;
        this.recordFound = z2;
    }
}

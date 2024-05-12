package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class NightPopupResponse extends BaseResponse {

    @InterfaceC65349Pkn("next_timestamp")
    public final int nextTimeStamps;

    public NightPopupResponse() {
        this(0, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NightPopupResponse) {
            return C78966Uyw.LJIIIZ(((NightPopupResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.nextTimeStamps)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("NightPopupResponse:%s", getObjects());
    }

    public NightPopupResponse(int i) {
        this.nextTimeStamps = i;
    }

    public /* synthetic */ NightPopupResponse(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

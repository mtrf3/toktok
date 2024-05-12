package com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AutoMessageResponse extends BaseResponse {

    @InterfaceC65349Pkn("send_status")
    public final int sendStatus;

    public AutoMessageResponse() {
        this(0, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoMessageResponse) {
            return C78966Uyw.LJIIIZ(((AutoMessageResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sendStatus)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("AutoMessageResponse:%s", getObjects());
    }

    public AutoMessageResponse(int i) {
        this.sendStatus = i;
    }

    public /* synthetic */ AutoMessageResponse(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

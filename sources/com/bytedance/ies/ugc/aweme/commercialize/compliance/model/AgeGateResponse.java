package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AgeGateResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("is_adult")
    public Boolean isAdult;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeGateResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public AgeGateResponse(Boolean bool) {
        this.isAdult = bool;
    }

    public final void setAdult(Boolean bool) {
        this.isAdult = bool;
    }

    public /* synthetic */ AgeGateResponse(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}

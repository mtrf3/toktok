package com.bytedance.android.live.wallet.data.model.kyc;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KYCIqaIdPhotoResult extends F9E {

    @InterfaceC65349Pkn("base_resp")
    public final KYCIqaIdBaseResponse baseResponse;

    @InterfaceC65349Pkn("is_valid")
    public final boolean isValid;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isValid), this.baseResponse};
    }

    public KYCIqaIdPhotoResult(boolean z, KYCIqaIdBaseResponse baseResponse) {
        o.LJIIIZ(baseResponse, "baseResponse");
        this.isValid = z;
        this.baseResponse = baseResponse;
    }

    public /* synthetic */ KYCIqaIdPhotoResult(boolean z, KYCIqaIdBaseResponse kYCIqaIdBaseResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, kYCIqaIdBaseResponse);
    }
}

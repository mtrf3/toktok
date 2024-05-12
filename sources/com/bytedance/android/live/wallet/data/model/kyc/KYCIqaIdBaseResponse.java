package com.bytedance.android.live.wallet.data.model.kyc;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KYCIqaIdBaseResponse extends F9E {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_message")
    public final String statusMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public KYCIqaIdBaseResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMessage};
    }

    public KYCIqaIdBaseResponse(int i, String statusMessage) {
        o.LJIIIZ(statusMessage, "statusMessage");
        this.statusCode = i;
        this.statusMessage = statusMessage;
    }

    public /* synthetic */ KYCIqaIdBaseResponse(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}

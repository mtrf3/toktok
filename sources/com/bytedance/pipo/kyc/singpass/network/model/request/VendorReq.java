package com.bytedance.pipo.kyc.singpass.network.model.request;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class VendorReq extends F9E {

    @InterfaceC65349Pkn("caller_idempotent_id")
    public final String callerIdempotentId;

    @InterfaceC65349Pkn("extra_params")
    public final String extraParams;

    @InterfaceC65349Pkn("scenario")
    public final int scenario;

    @InterfaceC65349Pkn("vendor_id")
    public final String vendorId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.scenario), this.callerIdempotentId, this.vendorId, this.extraParams};
    }

    public VendorReq(int i, String str, String str2, String str3) {
        this.scenario = i;
        this.callerIdempotentId = str;
        this.vendorId = str2;
        this.extraParams = str3;
    }

    public /* synthetic */ VendorReq(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}

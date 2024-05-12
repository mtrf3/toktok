package com.bytedance.pipo.kyc.singpass.network.model.response;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class VendorResp extends F9E {

    @InterfaceC65349Pkn("BaseResp")
    public final BaseResp baseResp;

    @InterfaceC65349Pkn("caller_idempotent_id")
    public final String callerIdempotentId;

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    @InterfaceC65349Pkn("error_message")
    public final String errorMessage;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("response")
    public final String response;

    @InterfaceC65349Pkn("scenario")
    public final int scenario;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("vendor_id")
    public final String vendorId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.errorCode), this.errorMessage, this.callerIdempotentId, this.requestId, this.response, Integer.valueOf(this.scenario), Integer.valueOf(this.status), this.vendorId, this.baseResp};
    }

    public VendorResp(int i, String errorMessage, String callerIdempotentId, String requestId, String response, int i2, int i3, String vendorId, BaseResp baseResp) {
        o.LJIIIZ(errorMessage, "errorMessage");
        o.LJIIIZ(callerIdempotentId, "callerIdempotentId");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(response, "response");
        o.LJIIIZ(vendorId, "vendorId");
        o.LJIIIZ(baseResp, "baseResp");
        this.errorCode = i;
        this.errorMessage = errorMessage;
        this.callerIdempotentId = callerIdempotentId;
        this.requestId = requestId;
        this.response = response;
        this.scenario = i2;
        this.status = i3;
        this.vendorId = vendorId;
        this.baseResp = baseResp;
    }
}

package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScanCommonResponse {

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("data")
    public final ScanCommonResponseData scanCommonResponseData;

    /* JADX WARN: Multi-variable type inference failed */
    public ScanCommonResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanCommonResponse)) {
            return false;
        }
        ScanCommonResponse scanCommonResponse = (ScanCommonResponse) obj;
        return o.LJ(this.message, scanCommonResponse.message) && o.LJ(this.scanCommonResponseData, scanCommonResponse.scanCommonResponseData);
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        ScanCommonResponseData scanCommonResponseData = this.scanCommonResponseData;
        return hashCode + (scanCommonResponseData == null ? 0 : scanCommonResponseData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ScanCommonResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", scanCommonResponseData=");
        LIZ.append(this.scanCommonResponseData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ScanCommonResponse(String message, ScanCommonResponseData scanCommonResponseData) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.scanCommonResponseData = scanCommonResponseData;
    }

    public /* synthetic */ ScanCommonResponse(String str, ScanCommonResponseData scanCommonResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : scanCommonResponseData);
    }
}

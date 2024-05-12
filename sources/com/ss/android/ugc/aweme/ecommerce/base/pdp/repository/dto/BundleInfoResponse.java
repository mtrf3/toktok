package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1GE;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BundleInfoResponse {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("data")
    public final BundleInfoResponseData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public BundleInfoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleInfoResponse)) {
            return false;
        }
        BundleInfoResponse bundleInfoResponse = (BundleInfoResponse) obj;
        return o.LJ(this.code, bundleInfoResponse.code) && o.LJ(this.message, bundleInfoResponse.message) && o.LJ(this.data, bundleInfoResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BundleInfoResponseData bundleInfoResponseData = this.data;
        return hashCode2 + (bundleInfoResponseData != null ? bundleInfoResponseData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BundleInfoResponse(code=");
        LIZ2.append(this.code);
        LIZ2.append(", message=");
        LIZ2.append(this.message);
        LIZ2.append(", data=");
        LIZ2.append(this.data);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public final boolean LIZ() {
        BundleInfoResponseData bundleInfoResponseData;
        Integer num = this.code;
        if (num == null || num.intValue() != 0 || (bundleInfoResponseData = this.data) == null || !C1GE.LJIILIIL(bundleInfoResponseData.bundleInfoList)) {
            return false;
        }
        return true;
    }

    public BundleInfoResponse(Integer num, String str, BundleInfoResponseData bundleInfoResponseData) {
        this.code = num;
        this.message = str;
        this.data = bundleInfoResponseData;
    }

    public /* synthetic */ BundleInfoResponse(Integer num, String str, BundleInfoResponseData bundleInfoResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundleInfoResponseData);
    }
}

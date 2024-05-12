package com.ss.android.ugc.aweme.autocut.sdk.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NLEModelResponse {

    @InterfaceC65349Pkn("data")
    public final String data;

    @InterfaceC65349Pkn("extra")
    public final NLEModelResponseExtra extra;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public NLEModelResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NLEModelResponse)) {
            return false;
        }
        NLEModelResponse nLEModelResponse = (NLEModelResponse) obj;
        return o.LJ(this.data, nLEModelResponse.data) && o.LJ(this.extra, nLEModelResponse.extra) && o.LJ(this.message, nLEModelResponse.message) && this.statusCode == nLEModelResponse.statusCode && o.LJ(this.statusMsg, nLEModelResponse.statusMsg);
    }

    public final int hashCode() {
        String str = this.data;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NLEModelResponseExtra nLEModelResponseExtra = this.extra;
        int hashCode2 = (hashCode + (nLEModelResponseExtra == null ? 0 : nLEModelResponseExtra.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.statusCode) * 31;
        String str3 = this.statusMsg;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NLEModelResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        return q.LIZIZ(LIZ, this.statusMsg, ')', LIZ);
    }

    public NLEModelResponse(String str, NLEModelResponseExtra nLEModelResponseExtra, String str2, int i, String str3) {
        this.data = str;
        this.extra = nLEModelResponseExtra;
        this.message = str2;
        this.statusCode = i;
        this.statusMsg = str3;
    }

    public /* synthetic */ NLEModelResponse(String str, NLEModelResponseExtra nLEModelResponseExtra, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : nLEModelResponseExtra, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? str3 : "");
    }
}

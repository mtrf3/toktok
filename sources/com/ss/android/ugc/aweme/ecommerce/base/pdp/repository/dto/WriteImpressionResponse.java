package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WriteImpressionResponse {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public WriteImpressionResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteImpressionResponse)) {
            return false;
        }
        WriteImpressionResponse writeImpressionResponse = (WriteImpressionResponse) obj;
        return o.LJ(this.code, writeImpressionResponse.code) && o.LJ(this.message, writeImpressionResponse.message);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WriteImpressionResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public WriteImpressionResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }

    public /* synthetic */ WriteImpressionResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str);
    }
}

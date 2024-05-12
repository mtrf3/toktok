package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.U26;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CancelOrderResponse {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("data")
    public final Object data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelOrderResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelOrderResponse)) {
            return false;
        }
        CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) obj;
        return o.LJ(this.code, cancelOrderResponse.code) && o.LJ(this.message, cancelOrderResponse.message) && o.LJ(this.data, cancelOrderResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.data;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CancelOrderResponse(code=");
        LIZ2.append(this.code);
        LIZ2.append(", message=");
        LIZ2.append(this.message);
        LIZ2.append(", data=");
        return U26.LIZJ(LIZ2, this.data, ')', LIZ2);
    }

    public CancelOrderResponse(Integer num, String str, Object obj) {
        this.code = num;
        this.message = str;
        this.data = obj;
    }

    public /* synthetic */ CancelOrderResponse(Integer num, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : obj);
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddOnWriteImpressionResponse implements Serializable {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ AddOnWriteImpressionResponse copy$default(AddOnWriteImpressionResponse addOnWriteImpressionResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = addOnWriteImpressionResponse.code;
        }
        if ((i & 2) != 0) {
            str = addOnWriteImpressionResponse.message;
        }
        return addOnWriteImpressionResponse.copy(num, str);
    }

    public final AddOnWriteImpressionResponse copy(Integer num, String str) {
        return new AddOnWriteImpressionResponse(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddOnWriteImpressionResponse)) {
            return false;
        }
        AddOnWriteImpressionResponse addOnWriteImpressionResponse = (AddOnWriteImpressionResponse) obj;
        return o.LJ(this.code, addOnWriteImpressionResponse.code) && o.LJ(this.message, addOnWriteImpressionResponse.message);
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddOnWriteImpressionResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public AddOnWriteImpressionResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}

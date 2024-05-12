package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CheckLawfulResponse {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ CheckLawfulResponse copy$default(CheckLawfulResponse checkLawfulResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = checkLawfulResponse.code;
        }
        if ((i & 2) != 0) {
            str = checkLawfulResponse.message;
        }
        return checkLawfulResponse.copy(num, str);
    }

    public final CheckLawfulResponse copy(Integer num, String str) {
        return new CheckLawfulResponse(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckLawfulResponse)) {
            return false;
        }
        CheckLawfulResponse checkLawfulResponse = (CheckLawfulResponse) obj;
        return o.LJ(this.code, checkLawfulResponse.code) && o.LJ(this.message, checkLawfulResponse.message);
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckLawfulResponse(code=");
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

    public CheckLawfulResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}

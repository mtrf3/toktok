package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AuthorizedCheckResult implements Serializable {

    @InterfaceC65349Pkn("result_code")
    public final Integer resultCode;

    @InterfaceC65349Pkn("result_msg")
    public final String resultMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizedCheckResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthorizedCheckResult copy$default(AuthorizedCheckResult authorizedCheckResult, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = authorizedCheckResult.resultCode;
        }
        if ((i & 2) != 0) {
            str = authorizedCheckResult.resultMsg;
        }
        return authorizedCheckResult.copy(num, str);
    }

    public final AuthorizedCheckResult copy(Integer num, String str) {
        return new AuthorizedCheckResult(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedCheckResult)) {
            return false;
        }
        AuthorizedCheckResult authorizedCheckResult = (AuthorizedCheckResult) obj;
        return o.LJ(this.resultCode, authorizedCheckResult.resultCode) && o.LJ(this.resultMsg, authorizedCheckResult.resultMsg);
    }

    public int hashCode() {
        Integer num = this.resultCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.resultMsg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedCheckResult(resultCode=");
        LIZ.append(this.resultCode);
        LIZ.append(", resultMsg=");
        return q.LIZIZ(LIZ, this.resultMsg, ')', LIZ);
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final String getResultMsg() {
        return this.resultMsg;
    }

    public AuthorizedCheckResult(Integer num, String str) {
        this.resultCode = num;
        this.resultMsg = str;
    }

    public /* synthetic */ AuthorizedCheckResult(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}

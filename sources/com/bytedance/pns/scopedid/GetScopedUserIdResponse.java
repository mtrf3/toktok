package com.bytedance.pns.scopedid;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetScopedUserIdResponse implements Serializable {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final IdPairList data;

    @InterfaceC65349Pkn("msg")
    public final String msg;

    public static /* synthetic */ GetScopedUserIdResponse copy$default(GetScopedUserIdResponse getScopedUserIdResponse, int i, String str, IdPairList idPairList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getScopedUserIdResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = getScopedUserIdResponse.msg;
        }
        if ((i2 & 4) != 0) {
            idPairList = getScopedUserIdResponse.data;
        }
        return getScopedUserIdResponse.copy(i, str, idPairList);
    }

    public final GetScopedUserIdResponse copy(int i, String msg, IdPairList idPairList) {
        o.LJIIIZ(msg, "msg");
        return new GetScopedUserIdResponse(i, msg, idPairList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetScopedUserIdResponse)) {
            return false;
        }
        GetScopedUserIdResponse getScopedUserIdResponse = (GetScopedUserIdResponse) obj;
        return this.code == getScopedUserIdResponse.code && o.LJ(this.msg, getScopedUserIdResponse.msg) && o.LJ(this.data, getScopedUserIdResponse.data);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetScopedUserIdResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.msg, this.code * 31, 31);
        IdPairList idPairList = this.data;
        if (idPairList == null) {
            hashCode = 0;
        } else {
            hashCode = idPairList.hashCode();
        }
        return LJ + hashCode;
    }

    public final int getCode() {
        return this.code;
    }

    public final IdPairList getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public GetScopedUserIdResponse(int i, String msg, IdPairList idPairList) {
        o.LJIIIZ(msg, "msg");
        this.code = i;
        this.msg = msg;
        this.data = idPairList;
    }

    public /* synthetic */ GetScopedUserIdResponse(int i, String str, IdPairList idPairList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : idPairList);
    }
}

package com.bytedance.pns.scopedid;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetScopedUserIdRequest implements Serializable {

    @InterfaceC65349Pkn("biz_ids")
    public final String[] bizIds;

    public static /* synthetic */ GetScopedUserIdRequest copy$default(GetScopedUserIdRequest getScopedUserIdRequest, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = getScopedUserIdRequest.bizIds;
        }
        return getScopedUserIdRequest.copy(strArr);
    }

    public final GetScopedUserIdRequest copy(String[] bizIds) {
        o.LJIIIZ(bizIds, "bizIds");
        return new GetScopedUserIdRequest(bizIds);
    }

    public int hashCode() {
        return Arrays.hashCode(this.bizIds);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetScopedUserIdRequest(bizIds=");
        return q.LIZIZ(LIZ, Arrays.toString(this.bizIds), ')', LIZ);
    }

    public final String[] getBizIds() {
        return this.bizIds;
    }

    public GetScopedUserIdRequest(String[] bizIds) {
        o.LJIIIZ(bizIds, "bizIds");
        this.bizIds = bizIds;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(GetScopedUserIdRequest.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.pns.scopedid.GetScopedUserIdRequest");
        if (Arrays.equals(this.bizIds, ((GetScopedUserIdRequest) obj).bizIds)) {
            return true;
        }
        return false;
    }
}

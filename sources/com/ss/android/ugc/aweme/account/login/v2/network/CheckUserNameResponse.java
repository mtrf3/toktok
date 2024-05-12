package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CheckUserNameResponse extends BaseResponse {

    @InterfaceC65349Pkn("is_valid")
    public final Boolean is_valid;

    @InterfaceC65349Pkn("recommended_unique_ids")
    public final List<String> recommended_unique_ids;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUserNameResponse)) {
            return false;
        }
        CheckUserNameResponse checkUserNameResponse = (CheckUserNameResponse) obj;
        return o.LJ(this.is_valid, checkUserNameResponse.is_valid) && o.LJ(this.recommended_unique_ids, checkUserNameResponse.recommended_unique_ids);
    }

    public final int hashCode() {
        Boolean bool = this.is_valid;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.recommended_unique_ids;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckUserNameResponse(is_valid=");
        LIZ.append(this.is_valid);
        LIZ.append(", recommended_unique_ids=");
        return C1NE.LIZIZ(LIZ, this.recommended_unique_ids, ')', LIZ);
    }

    public CheckUserNameResponse(Boolean bool, List<String> list) {
        this.is_valid = bool;
        this.recommended_unique_ids = list;
    }

    public /* synthetic */ CheckUserNameResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, list);
    }
}

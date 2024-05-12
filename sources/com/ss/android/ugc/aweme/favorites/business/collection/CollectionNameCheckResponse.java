package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CollectionNameCheckResponse extends BaseResponse {

    @InterfaceC65349Pkn("is_valid")
    public final Boolean isValid;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionNameCheckResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionNameCheckResponse) && o.LJ(this.isValid, ((CollectionNameCheckResponse) obj).isValid);
    }

    public final int hashCode() {
        Boolean bool = this.isValid;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionNameCheckResponse(isValid=");
        return C78920UyC.LIZIZ(LIZ, this.isValid, ')', LIZ);
    }

    public CollectionNameCheckResponse(Boolean bool) {
        this.isValid = bool;
    }

    public /* synthetic */ CollectionNameCheckResponse(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}

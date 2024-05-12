package com.ss.android.ugc.aweme.share.silent.util;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AuthorizedAppListResponse extends BaseResponse {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("list")
    public final ArrayList<AuthItem> listArray;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizedAppListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorizedAppListResponse copy$default(AuthorizedAppListResponse authorizedAppListResponse, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = authorizedAppListResponse.listArray;
        }
        return authorizedAppListResponse.copy(arrayList);
    }

    public final AuthorizedAppListResponse copy(ArrayList<AuthItem> arrayList) {
        return new AuthorizedAppListResponse(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorizedAppListResponse) && o.LJ(this.listArray, ((AuthorizedAppListResponse) obj).listArray);
    }

    public int hashCode() {
        ArrayList<AuthItem> arrayList = this.listArray;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedAppListResponse(listArray=");
        LIZ.append(this.listArray);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ArrayList<AuthItem> getListArray() {
        return this.listArray;
    }

    public AuthorizedAppListResponse(ArrayList<AuthItem> arrayList) {
        this.listArray = arrayList;
    }

    public /* synthetic */ AuthorizedAppListResponse(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}

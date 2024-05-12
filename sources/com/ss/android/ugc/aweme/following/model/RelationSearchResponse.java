package com.ss.android.ugc.aweme.following.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelationSearchResponse extends BaseResponse {

    @InterfaceC65349Pkn("search_users")
    public final List<User> searchUser;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelationSearchResponse) && o.LJ(this.searchUser, ((RelationSearchResponse) obj).searchUser);
    }

    public final int hashCode() {
        List<User> list = this.searchUser;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationSearchResponse(searchUser=");
        return C1NE.LIZIZ(LIZ, this.searchUser, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelationSearchResponse(List<? extends User> list) {
        this.searchUser = list;
    }
}

package com.ss.android.ugc.aweme.contact.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserProfileResponse extends BaseResponse {

    @InterfaceC65349Pkn("users")
    public final List<IMUserProfileInfo> users;

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserProfileResponse) && o.LJ(this.users, ((UserProfileResponse) obj).users);
    }

    public final int hashCode() {
        List<IMUserProfileInfo> list = this.users;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserProfileResponse(users=");
        return C1NE.LIZIZ(LIZ, this.users, ')', LIZ);
    }

    public UserProfileResponse(List<IMUserProfileInfo> list) {
        this.users = list;
    }

    public /* synthetic */ UserProfileResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

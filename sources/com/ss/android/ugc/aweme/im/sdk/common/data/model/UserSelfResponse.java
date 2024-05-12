package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserSelfResponse extends BaseResponse {

    @InterfaceC65349Pkn("user")
    public User user;

    /* JADX WARN: Multi-variable type inference failed */
    public UserSelfResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserSelfResponse copy$default(UserSelfResponse userSelfResponse, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userSelfResponse.user;
        }
        return userSelfResponse.copy(user);
    }

    public final UserSelfResponse copy(User user) {
        return new UserSelfResponse(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserSelfResponse) && o.LJ(this.user, ((UserSelfResponse) obj).user);
    }

    public int hashCode() {
        User user = this.user;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserSelfResponse(user=");
        LIZ.append(this.user);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public UserSelfResponse(User user) {
        this.user = user;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public /* synthetic */ UserSelfResponse(User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user);
    }
}

package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserOtherResponse extends BaseResponse {

    @InterfaceC65349Pkn("user")
    public final User user;

    /* JADX WARN: Multi-variable type inference failed */
    public UserOtherResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserOtherResponse copy$default(UserOtherResponse userOtherResponse, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userOtherResponse.user;
        }
        return userOtherResponse.copy(user);
    }

    public final UserOtherResponse copy(User user) {
        return new UserOtherResponse(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserOtherResponse) && o.LJ(this.user, ((UserOtherResponse) obj).user);
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
        LIZ.append("UserOtherResponse(user=");
        LIZ.append(this.user);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public UserOtherResponse(User user) {
        this.user = user;
    }

    public /* synthetic */ UserOtherResponse(User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user);
    }
}

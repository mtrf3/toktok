package com.ss.android.ugc.aweme.commercialize.ba.impl.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserGetResponse implements Serializable {

    @InterfaceC65349Pkn("user")
    public final User user;

    public static /* synthetic */ UserGetResponse copy$default(UserGetResponse userGetResponse, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userGetResponse.user;
        }
        return userGetResponse.copy(user);
    }

    public final UserGetResponse copy(User user) {
        return new UserGetResponse(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserGetResponse) && o.LJ(this.user, ((UserGetResponse) obj).user);
    }

    public int hashCode() {
        User user = this.user;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserGetResponse(user=");
        LIZ.append(this.user);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public UserGetResponse(User user) {
        this.user = user;
    }
}

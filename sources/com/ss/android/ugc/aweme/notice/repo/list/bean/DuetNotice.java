package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C770830u;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DuetNotice {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("from_user_info")
    public final User fromUser;

    @InterfaceC65349Pkn("to_user_info")
    public final User toUser;

    public static /* synthetic */ DuetNotice copy$default(DuetNotice duetNotice, User user, User user2, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            user = duetNotice.fromUser;
        }
        if ((i & 2) != 0) {
            user2 = duetNotice.toUser;
        }
        if ((i & 4) != 0) {
            aweme = duetNotice.aweme;
        }
        return duetNotice.copy(user, user2, aweme);
    }

    public final DuetNotice copy(User user, User user2, Aweme aweme) {
        return new DuetNotice(user, user2, aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetNotice)) {
            return false;
        }
        DuetNotice duetNotice = (DuetNotice) obj;
        return o.LJ(this.fromUser, duetNotice.fromUser) && o.LJ(this.toUser, duetNotice.toUser) && o.LJ(this.aweme, duetNotice.aweme);
    }

    public int hashCode() {
        User user = this.fromUser;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        User user2 = this.toUser;
        int hashCode2 = (hashCode + (user2 == null ? 0 : user2.hashCode())) * 31;
        Aweme aweme = this.aweme;
        return hashCode2 + (aweme != null ? aweme.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DuetNotice(fromUser=");
        LIZ.append(this.fromUser);
        LIZ.append(", toUser=");
        LIZ.append(this.toUser);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.aweme, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final User getToUser() {
        return this.toUser;
    }

    public DuetNotice(User user, User user2, Aweme aweme) {
        this.fromUser = user;
        this.toUser = user2;
        this.aweme = aweme;
    }
}

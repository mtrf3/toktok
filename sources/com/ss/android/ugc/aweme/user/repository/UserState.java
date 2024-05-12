package com.ss.android.ugc.aweme.user.repository;

import X.AbstractC26082ALm;
import X.C169696lJ;
import X.C26092ALw;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserState implements InterfaceC61312at {
    public final AbstractC26082ALm<FollowStatus> followStatus;
    public final boolean followerIsRemoved;
    public final AbstractC26082ALm<String> remarkName;
    public final Throwable removeFollowerError;
    public final User user;

    /* JADX WARN: Multi-variable type inference failed */
    public UserState() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserState(User user) {
        this(user, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0);
        o.LJIIIZ(user, "user");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserState(User user, boolean z) {
        this(user, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
        o.LJIIIZ(user, "user");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserState(User user, boolean z, AbstractC26082ALm<FollowStatus> followStatus) {
        this(user, z, followStatus, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
        o.LJIIIZ(user, "user");
        o.LJIIIZ(followStatus, "followStatus");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserState(User user, boolean z, AbstractC26082ALm<FollowStatus> followStatus, AbstractC26082ALm<String> remarkName) {
        this(user, z, followStatus, remarkName, null, 16, 0 == true ? 1 : 0);
        o.LJIIIZ(user, "user");
        o.LJIIIZ(followStatus, "followStatus");
        o.LJIIIZ(remarkName, "remarkName");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserState copy$default(UserState userState, User user, boolean z, AbstractC26082ALm abstractC26082ALm, AbstractC26082ALm abstractC26082ALm2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userState.user;
        }
        if ((i & 2) != 0) {
            z = userState.followerIsRemoved;
        }
        if ((i & 4) != 0) {
            abstractC26082ALm = userState.followStatus;
        }
        if ((i & 8) != 0) {
            abstractC26082ALm2 = userState.remarkName;
        }
        if ((i & 16) != 0) {
            th = userState.removeFollowerError;
        }
        return userState.copy(user, z, abstractC26082ALm, abstractC26082ALm2, th);
    }

    public final UserState copy(User user, boolean z, AbstractC26082ALm<FollowStatus> followStatus, AbstractC26082ALm<String> remarkName, Throwable th) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(followStatus, "followStatus");
        o.LJIIIZ(remarkName, "remarkName");
        return new UserState(user, z, followStatus, remarkName, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return o.LJ(this.user, userState.user) && this.followerIsRemoved == userState.followerIsRemoved && o.LJ(this.followStatus, userState.followStatus) && o.LJ(this.remarkName, userState.remarkName) && o.LJ(this.removeFollowerError, userState.removeFollowerError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.user.hashCode() * 31;
        boolean z = this.followerIsRemoved;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.remarkName.hashCode() + ((this.followStatus.hashCode() + ((hashCode + i) * 31)) * 31)) * 31;
        Throwable th = this.removeFollowerError;
        return hashCode2 + (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserState(user=");
        LIZ.append(this.user);
        LIZ.append(", followerIsRemoved=");
        LIZ.append(this.followerIsRemoved);
        LIZ.append(", followStatus=");
        LIZ.append(this.followStatus);
        LIZ.append(", remarkName=");
        LIZ.append(this.remarkName);
        LIZ.append(", removeFollowerError=");
        return C169696lJ.LIZLLL(LIZ, this.removeFollowerError, ')', LIZ);
    }

    public final AbstractC26082ALm<FollowStatus> getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getFollowerIsRemoved() {
        return this.followerIsRemoved;
    }

    public final AbstractC26082ALm<String> getRemarkName() {
        return this.remarkName;
    }

    public final Throwable getRemoveFollowerError() {
        return this.removeFollowerError;
    }

    public final User getUser() {
        return this.user;
    }

    public UserState(User user, boolean z, AbstractC26082ALm<FollowStatus> followStatus, AbstractC26082ALm<String> remarkName, Throwable th) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(followStatus, "followStatus");
        o.LJIIIZ(remarkName, "remarkName");
        this.user = user;
        this.followerIsRemoved = z;
        this.followStatus = followStatus;
        this.remarkName = remarkName;
        this.removeFollowerError = th;
    }

    public /* synthetic */ UserState(User user, boolean z, AbstractC26082ALm abstractC26082ALm, AbstractC26082ALm abstractC26082ALm2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new User() : user, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C26092ALw.LIZ : abstractC26082ALm, (i & 8) != 0 ? C26092ALw.LIZ : abstractC26082ALm2, (i & 16) != 0 ? null : th);
    }
}

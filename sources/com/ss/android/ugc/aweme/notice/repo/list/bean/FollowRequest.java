package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FollowRequest {

    @InterfaceC65349Pkn("count")
    public final int followRequestCount;

    @InterfaceC65349Pkn("from_users")
    public final List<User> followRequestUser;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowRequest() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowRequest copy$default(FollowRequest followRequest, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followRequest.followRequestCount;
        }
        if ((i2 & 2) != 0) {
            list = followRequest.followRequestUser;
        }
        return followRequest.copy(i, list);
    }

    public final FollowRequest copy(int i, List<? extends User> list) {
        return new FollowRequest(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRequest)) {
            return false;
        }
        FollowRequest followRequest = (FollowRequest) obj;
        return this.followRequestCount == followRequest.followRequestCount && o.LJ(this.followRequestUser, followRequest.followRequestUser);
    }

    public int hashCode() {
        int i = this.followRequestCount * 31;
        List<User> list = this.followRequestUser;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowRequest(followRequestCount=");
        LIZ.append(this.followRequestCount);
        LIZ.append(", followRequestUser=");
        return C1NE.LIZIZ(LIZ, this.followRequestUser, ')', LIZ);
    }

    public final int getFollowRequestCount() {
        return this.followRequestCount;
    }

    public final List<User> getFollowRequestUser() {
        return this.followRequestUser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FollowRequest(int i, List<? extends User> list) {
        this.followRequestCount = i;
        this.followRequestUser = list;
    }

    public /* synthetic */ FollowRequest(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}

package com.bytedance.android.live.share.response;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BatchShareUsersResult {

    @InterfaceC65349Pkn("recently_shared_users")
    public final List<User> recentlySharedUsers;

    @InterfaceC65349Pkn("rank_users")
    public final List<User> topRankUsers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchShareUsersResult copy$default(BatchShareUsersResult batchShareUsersResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchShareUsersResult.topRankUsers;
        }
        if ((i & 2) != 0) {
            list2 = batchShareUsersResult.recentlySharedUsers;
        }
        return batchShareUsersResult.copy(list, list2);
    }

    public final BatchShareUsersResult copy(List<? extends User> list, List<? extends User> list2) {
        return new BatchShareUsersResult(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchShareUsersResult)) {
            return false;
        }
        BatchShareUsersResult batchShareUsersResult = (BatchShareUsersResult) obj;
        return o.LJ(this.topRankUsers, batchShareUsersResult.topRankUsers) && o.LJ(this.recentlySharedUsers, batchShareUsersResult.recentlySharedUsers);
    }

    public int hashCode() {
        List<User> list = this.topRankUsers;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<User> list2 = this.recentlySharedUsers;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BatchShareUsersResult(topRankUsers=");
        LIZ.append(this.topRankUsers);
        LIZ.append(", recentlySharedUsers=");
        return C1NE.LIZIZ(LIZ, this.recentlySharedUsers, ')', LIZ);
    }

    public final List<User> getRecentlySharedUsers() {
        return this.recentlySharedUsers;
    }

    public final List<User> getTopRankUsers() {
        return this.topRankUsers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BatchShareUsersResult(List<? extends User> list, List<? extends User> list2) {
        this.topRankUsers = list;
        this.recentlySharedUsers = list2;
    }
}

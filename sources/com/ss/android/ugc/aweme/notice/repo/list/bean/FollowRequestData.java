package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowRequestData extends F9E {

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("has_read")
    public boolean hasRead;

    @InterfaceC65349Pkn("from_user")
    public final User user;

    public static /* synthetic */ FollowRequestData copy$default(FollowRequestData followRequestData, User user, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            user = followRequestData.user;
        }
        if ((i & 2) != 0) {
            j = followRequestData.createTime;
        }
        if ((i & 4) != 0) {
            z = followRequestData.hasRead;
        }
        return followRequestData.copy(user, j, z);
    }

    public final FollowRequestData copy(User user, long j, boolean z) {
        o.LJIIIZ(user, "user");
        return new FollowRequestData(user, j, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.user, Long.valueOf(this.createTime), Boolean.valueOf(this.hasRead)};
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final boolean getHasRead() {
        return this.hasRead;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setHasRead(boolean z) {
        this.hasRead = z;
    }

    public FollowRequestData(User user, long j, boolean z) {
        o.LJIIIZ(user, "user");
        this.user = user;
        this.createTime = j;
        this.hasRead = z;
    }

    public /* synthetic */ FollowRequestData(User user, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, j, (i & 4) != 0 ? false : z);
    }
}

package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FollowApproveNotice extends F9E {

    @InterfaceC65349Pkn("from_user")
    public final User user;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowApproveNotice() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FollowApproveNotice copy$default(FollowApproveNotice followApproveNotice, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = followApproveNotice.user;
        }
        return followApproveNotice.copy(user);
    }

    public final FollowApproveNotice copy(User user) {
        return new FollowApproveNotice(user);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.user};
    }

    public final User getUser() {
        return this.user;
    }

    public FollowApproveNotice(User user) {
        this.user = user;
    }

    public /* synthetic */ FollowApproveNotice(User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user);
    }
}

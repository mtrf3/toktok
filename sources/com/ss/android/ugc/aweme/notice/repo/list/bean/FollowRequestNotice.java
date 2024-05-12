package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class FollowRequestNotice extends F9E {

    @InterfaceC65349Pkn("count")
    public final int requestCount;

    public FollowRequestNotice() {
        this(0, 1, null);
    }

    public static /* synthetic */ FollowRequestNotice copy$default(FollowRequestNotice followRequestNotice, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followRequestNotice.requestCount;
        }
        return followRequestNotice.copy(i);
    }

    public final FollowRequestNotice copy(int i) {
        return new FollowRequestNotice(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.requestCount)};
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public FollowRequestNotice(int i) {
        this.requestCount = i;
    }

    public /* synthetic */ FollowRequestNotice(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

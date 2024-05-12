package com.ss.android.ugc.aweme.profile.viewer.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileViewerInfo extends F9E {

    @InterfaceC65349Pkn("unread")
    public final boolean isUnRead;

    @InterfaceC65349Pkn("last_view_time")
    public final long lastViewTime;

    @InterfaceC65349Pkn("user")
    public final User user;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isUnRead), Long.valueOf(this.lastViewTime), this.user};
    }

    public ProfileViewerInfo(boolean z, long j, User user) {
        o.LJIIIZ(user, "user");
        this.isUnRead = z;
        this.lastViewTime = j;
        this.user = user;
    }

    public /* synthetic */ ProfileViewerInfo(boolean z, long j, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, user);
    }
}

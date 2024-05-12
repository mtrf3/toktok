package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class TeamUser {

    @InterfaceC65349Pkn("team_id")
    public long teamId;

    @InterfaceC65349Pkn("user_id")
    public List<Long> userIds;

    /* JADX WARN: Multi-variable type inference failed */
    public TeamUser() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    public TeamUser(List<Long> list, long j) {
        this.userIds = list;
        this.teamId = j;
    }

    public /* synthetic */ TeamUser(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0L : j);
    }
}

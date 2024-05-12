package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CoHost extends F9E {

    @InterfaceC65349Pkn("linked_users")
    public List<LinkmicUser> linkedUsers;

    @InterfaceC65349Pkn("multi_cohost_permission")
    public boolean multiCoHostPermission;

    /* JADX WARN: Multi-variable type inference failed */
    public CoHost() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.multiCoHostPermission), this.linkedUsers};
    }

    public CoHost(boolean z, List<LinkmicUser> list) {
        this.multiCoHostPermission = z;
        this.linkedUsers = list;
    }

    public /* synthetic */ CoHost(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}

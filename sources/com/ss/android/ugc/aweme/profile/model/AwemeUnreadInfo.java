package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AwemeUnreadInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("unread_id_list")
    public final List<String> unreadIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeUnreadInfo copy$default(AwemeUnreadInfo awemeUnreadInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = awemeUnreadInfo.unreadIdList;
        }
        return awemeUnreadInfo.copy(list);
    }

    public final AwemeUnreadInfo copy(List<String> unreadIdList) {
        o.LJIIIZ(unreadIdList, "unreadIdList");
        return new AwemeUnreadInfo(unreadIdList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.unreadIdList};
    }

    public final List<String> getUnreadIdList() {
        return this.unreadIdList;
    }

    public AwemeUnreadInfo(List<String> unreadIdList) {
        o.LJIIIZ(unreadIdList, "unreadIdList");
        this.unreadIdList = unreadIdList;
    }
}

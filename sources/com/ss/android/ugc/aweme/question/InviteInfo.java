package com.ss.android.ugc.aweme.question;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class InviteInfo implements Serializable {

    @InterfaceC65349Pkn("inviter_list")
    public final List<User> inviterList;

    @InterfaceC65349Pkn("total_inviter_count")
    public final Integer totalInviterCount;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<User> getInviterList() {
        return this.inviterList;
    }

    public final Integer getTotalInviterCount() {
        return this.totalInviterCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InviteInfo(List<? extends User> list, Integer num) {
        this.inviterList = list;
        this.totalInviterCount = num;
    }

    public /* synthetic */ InviteInfo(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}

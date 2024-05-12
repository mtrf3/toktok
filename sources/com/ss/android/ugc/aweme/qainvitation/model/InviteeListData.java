package com.ss.android.ugc.aweme.qainvitation.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InviteeListData extends BaseResponse {

    @InterfaceC65349Pkn("invitees")
    public final List<User> inviteeList;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteeListData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InviteeListData) && o.LJ(this.inviteeList, ((InviteeListData) obj).inviteeList);
    }

    public final int hashCode() {
        List<User> list = this.inviteeList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteeListData(inviteeList=");
        return C1NE.LIZIZ(LIZ, this.inviteeList, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InviteeListData(List<? extends User> list) {
        this.inviteeList = list;
    }

    public /* synthetic */ InviteeListData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

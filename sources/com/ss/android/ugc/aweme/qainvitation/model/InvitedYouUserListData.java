package com.ss.android.ugc.aweme.qainvitation.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InvitedYouUserListData extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("has_more")
    public final Integer hasMore;

    @InterfaceC65349Pkn("inviters")
    public final List<User> inviterList;

    @InterfaceC65349Pkn("total_count")
    public final Integer totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public InvitedYouUserListData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitedYouUserListData)) {
            return false;
        }
        InvitedYouUserListData invitedYouUserListData = (InvitedYouUserListData) obj;
        return o.LJ(this.inviterList, invitedYouUserListData.inviterList) && o.LJ(this.totalCount, invitedYouUserListData.totalCount) && o.LJ(this.cursor, invitedYouUserListData.cursor) && o.LJ(this.hasMore, invitedYouUserListData.hasMore);
    }

    public final int hashCode() {
        List<User> list = this.inviterList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cursor;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hasMore;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InvitedYouUserListData(inviterList=");
        LIZ.append(this.inviterList);
        LIZ.append(", totalCount=");
        LIZ.append(this.totalCount);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        return s0.LIZJ(LIZ, this.hasMore, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvitedYouUserListData(List<? extends User> list, Integer num, Integer num2, Integer num3) {
        this.inviterList = list;
        this.totalCount = num;
        this.cursor = num2;
        this.hasMore = num3;
    }

    public /* synthetic */ InvitedYouUserListData(List list, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}

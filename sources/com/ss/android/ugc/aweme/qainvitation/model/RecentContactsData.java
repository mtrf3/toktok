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
public final class RecentContactsData extends BaseResponse {

    @InterfaceC65349Pkn("user_list")
    public final List<User> recentContacts;

    @InterfaceC65349Pkn("block_results")
    public final List<UserBlockData> recentContactsBlockedList;

    /* JADX WARN: Multi-variable type inference failed */
    public RecentContactsData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentContactsData)) {
            return false;
        }
        RecentContactsData recentContactsData = (RecentContactsData) obj;
        return o.LJ(this.recentContacts, recentContactsData.recentContacts) && o.LJ(this.recentContactsBlockedList, recentContactsData.recentContactsBlockedList);
    }

    public final int hashCode() {
        List<User> list = this.recentContacts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UserBlockData> list2 = this.recentContactsBlockedList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentContactsData(recentContacts=");
        LIZ.append(this.recentContacts);
        LIZ.append(", recentContactsBlockedList=");
        return C1NE.LIZIZ(LIZ, this.recentContactsBlockedList, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecentContactsData(List<? extends User> list, List<UserBlockData> list2) {
        this.recentContacts = list;
        this.recentContactsBlockedList = list2;
    }

    public /* synthetic */ RecentContactsData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}

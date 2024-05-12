package com.ss.android.ugc.aweme.qainvitation.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserPrivacyCheckData extends BaseResponse {

    @InterfaceC65349Pkn("block_results")
    public final List<UserBlockData> filteredContactList;

    /* JADX WARN: Multi-variable type inference failed */
    public UserPrivacyCheckData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserPrivacyCheckData) && o.LJ(this.filteredContactList, ((UserPrivacyCheckData) obj).filteredContactList);
    }

    public final int hashCode() {
        List<UserBlockData> list = this.filteredContactList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserPrivacyCheckData(filteredContactList=");
        return C1NE.LIZIZ(LIZ, this.filteredContactList, ')', LIZ);
    }

    public UserPrivacyCheckData(List<UserBlockData> list) {
        this.filteredContactList = list;
    }

    public /* synthetic */ UserPrivacyCheckData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

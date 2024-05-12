package com.ss.android.ugc.aweme.contact.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMContactListResponse extends BaseResponse {

    @InterfaceC65349Pkn("next_index")
    public final Integer nextIndex;

    @InterfaceC65349Pkn("next_user_type")
    public final Integer nextUserType;

    @InterfaceC65349Pkn("users")
    public final List<IMUserProfileInfo> users;

    /* JADX WARN: Multi-variable type inference failed */
    public IMContactListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMContactListResponse)) {
            return false;
        }
        IMContactListResponse iMContactListResponse = (IMContactListResponse) obj;
        return o.LJ(this.users, iMContactListResponse.users) && o.LJ(this.nextIndex, iMContactListResponse.nextIndex) && o.LJ(this.nextUserType, iMContactListResponse.nextUserType);
    }

    public final int hashCode() {
        List<IMUserProfileInfo> list = this.users;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.nextIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextUserType;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMContactListResponse(users=");
        LIZ.append(this.users);
        LIZ.append(", nextIndex=");
        LIZ.append(this.nextIndex);
        LIZ.append(", nextUserType=");
        return s0.LIZJ(LIZ, this.nextUserType, ')', LIZ);
    }

    public IMContactListResponse(List<IMUserProfileInfo> list, Integer num, Integer num2) {
        this.users = list;
        this.nextIndex = num;
        this.nextUserType = num2;
    }

    public /* synthetic */ IMContactListResponse(List list, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}

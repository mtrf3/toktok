package com.ss.android.ugc.aweme.qainvitation.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InviteUsersData extends BaseResponse {

    @InterfaceC65349Pkn("invite_id")
    public final Integer uid;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteUsersData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InviteUsersData) && o.LJ(this.uid, ((InviteUsersData) obj).uid);
    }

    public final int hashCode() {
        Integer num = this.uid;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteUsersData(uid=");
        return s0.LIZJ(LIZ, this.uid, ')', LIZ);
    }

    public InviteUsersData(Integer num) {
        this.uid = num;
    }

    public /* synthetic */ InviteUsersData(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}

package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatInviteAcceptResponse extends BaseResponse {

    @InterfaceC65349Pkn("accept_status")
    public Integer acceptStatus;

    @InterfaceC65349Pkn("invitor_user_id")
    public Long invitorUserId;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInviteAcceptResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatInviteAcceptResponse)) {
            return false;
        }
        ChatInviteAcceptResponse chatInviteAcceptResponse = (ChatInviteAcceptResponse) obj;
        return o.LJ(this.acceptStatus, chatInviteAcceptResponse.acceptStatus) && o.LJ(this.invitorUserId, chatInviteAcceptResponse.invitorUserId);
    }

    public final int hashCode() {
        Integer num = this.acceptStatus;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.invitorUserId;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChatInviteAcceptResponse(acceptStatus=");
        LIZ.append(this.acceptStatus);
        LIZ.append(", invitorUserId=");
        return JBR.LJ(LIZ, this.invitorUserId, ')', LIZ);
    }

    public ChatInviteAcceptResponse(Integer num, Long l) {
        this.acceptStatus = num;
        this.invitorUserId = l;
    }

    public /* synthetic */ ChatInviteAcceptResponse(Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l);
    }
}

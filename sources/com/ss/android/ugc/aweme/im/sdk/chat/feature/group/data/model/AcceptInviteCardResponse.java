package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.InviteError;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AcceptInviteCardResponse extends BaseResponse {

    @InterfaceC65349Pkn("error")
    public final InviteError inviteError;

    @InterfaceC65349Pkn("invitee_group_status")
    public final Integer inviteeGroupStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptInviteCardResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AcceptInviteCardResponse copy$default(AcceptInviteCardResponse acceptInviteCardResponse, InviteError inviteError, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            inviteError = acceptInviteCardResponse.inviteError;
        }
        if ((i & 2) != 0) {
            num = acceptInviteCardResponse.inviteeGroupStatus;
        }
        return acceptInviteCardResponse.copy(inviteError, num);
    }

    public final AcceptInviteCardResponse copy(InviteError inviteError, Integer num) {
        return new AcceptInviteCardResponse(inviteError, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptInviteCardResponse)) {
            return false;
        }
        AcceptInviteCardResponse acceptInviteCardResponse = (AcceptInviteCardResponse) obj;
        return o.LJ(this.inviteError, acceptInviteCardResponse.inviteError) && o.LJ(this.inviteeGroupStatus, acceptInviteCardResponse.inviteeGroupStatus);
    }

    public int hashCode() {
        InviteError inviteError = this.inviteError;
        int hashCode = (inviteError == null ? 0 : inviteError.hashCode()) * 31;
        Integer num = this.inviteeGroupStatus;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AcceptInviteCardResponse(inviteError=");
        LIZ.append(this.inviteError);
        LIZ.append(", inviteeGroupStatus=");
        return s0.LIZJ(LIZ, this.inviteeGroupStatus, ')', LIZ);
    }

    public final InviteError getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public AcceptInviteCardResponse(InviteError inviteError, Integer num) {
        this.inviteError = inviteError;
        this.inviteeGroupStatus = num;
    }

    public /* synthetic */ AcceptInviteCardResponse(InviteError inviteError, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : inviteError, (i & 2) != 0 ? null : num);
    }
}

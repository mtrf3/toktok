package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.InviteError;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InviteCardDetailInnerResponse extends BaseResponse {

    @InterfaceC65349Pkn("group")
    public final GroupInfo group;

    @InterfaceC65349Pkn("error")
    public final InviteError inviteError;

    @InterfaceC65349Pkn("invitee_group_status")
    public final Integer inviteeGroupStatus;

    @InterfaceC65349Pkn("inviter_id")
    public final Long inviterId;

    @InterfaceC65349Pkn("inviter_name")
    public final String inviterName;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteCardDetailInnerResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InviteCardDetailInnerResponse copy$default(InviteCardDetailInnerResponse inviteCardDetailInnerResponse, GroupInfo groupInfo, Long l, String str, InviteError inviteError, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            groupInfo = inviteCardDetailInnerResponse.group;
        }
        if ((i & 2) != 0) {
            l = inviteCardDetailInnerResponse.inviterId;
        }
        if ((i & 4) != 0) {
            str = inviteCardDetailInnerResponse.inviterName;
        }
        if ((i & 8) != 0) {
            inviteError = inviteCardDetailInnerResponse.inviteError;
        }
        if ((i & 16) != 0) {
            num = inviteCardDetailInnerResponse.inviteeGroupStatus;
        }
        return inviteCardDetailInnerResponse.copy(groupInfo, l, str, inviteError, num);
    }

    public final InviteCardDetailInnerResponse copy(GroupInfo groupInfo, Long l, String str, InviteError inviteError, Integer num) {
        return new InviteCardDetailInnerResponse(groupInfo, l, str, inviteError, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteCardDetailInnerResponse)) {
            return false;
        }
        InviteCardDetailInnerResponse inviteCardDetailInnerResponse = (InviteCardDetailInnerResponse) obj;
        return o.LJ(this.group, inviteCardDetailInnerResponse.group) && o.LJ(this.inviterId, inviteCardDetailInnerResponse.inviterId) && o.LJ(this.inviterName, inviteCardDetailInnerResponse.inviterName) && o.LJ(this.inviteError, inviteCardDetailInnerResponse.inviteError) && o.LJ(this.inviteeGroupStatus, inviteCardDetailInnerResponse.inviteeGroupStatus);
    }

    public int hashCode() {
        GroupInfo groupInfo = this.group;
        int hashCode = (groupInfo == null ? 0 : groupInfo.hashCode()) * 31;
        Long l = this.inviterId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.inviterName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InviteError inviteError = this.inviteError;
        int hashCode4 = (hashCode3 + (inviteError == null ? 0 : inviteError.hashCode())) * 31;
        Integer num = this.inviteeGroupStatus;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteCardDetailInnerResponse(group=");
        LIZ.append(this.group);
        LIZ.append(", inviterId=");
        LIZ.append(this.inviterId);
        LIZ.append(", inviterName=");
        LIZ.append(this.inviterName);
        LIZ.append(", inviteError=");
        LIZ.append(this.inviteError);
        LIZ.append(", inviteeGroupStatus=");
        return s0.LIZJ(LIZ, this.inviteeGroupStatus, ')', LIZ);
    }

    public final GroupInfo getGroup() {
        return this.group;
    }

    public final InviteError getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public final Long getInviterId() {
        return this.inviterId;
    }

    public final String getInviterName() {
        return this.inviterName;
    }

    public InviteCardDetailInnerResponse(GroupInfo groupInfo, Long l, String str, InviteError inviteError, Integer num) {
        this.group = groupInfo;
        this.inviterId = l;
        this.inviterName = str;
        this.inviteError = inviteError;
        this.inviteeGroupStatus = num;
    }

    public /* synthetic */ InviteCardDetailInnerResponse(GroupInfo groupInfo, Long l, String str, InviteError inviteError, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupInfo, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : inviteError, (i & 16) == 0 ? num : null);
    }
}

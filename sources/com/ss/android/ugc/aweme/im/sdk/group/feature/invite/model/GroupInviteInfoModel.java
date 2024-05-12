package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupInviteInfoModel extends BaseResponse {

    @InterfaceC65349Pkn("expired_at")
    public Long expiredAt;

    @InterfaceC65349Pkn("group")
    public GroupInfo groupInfo;

    @InterfaceC65349Pkn("error")
    public InviteError inviteError;

    @InterfaceC65349Pkn("invite_id")
    public String inviteId;

    @InterfaceC65349Pkn("invite_url")
    public String inviteUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupInviteInfoModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInviteInfoModel)) {
            return false;
        }
        GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
        return o.LJ(this.inviteId, groupInviteInfoModel.inviteId) && o.LJ(this.inviteUrl, groupInviteInfoModel.inviteUrl) && o.LJ(this.expiredAt, groupInviteInfoModel.expiredAt) && o.LJ(this.groupInfo, groupInviteInfoModel.groupInfo) && o.LJ(this.inviteError, groupInviteInfoModel.inviteError);
    }

    public final int hashCode() {
        String str = this.inviteId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inviteUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.expiredAt;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        GroupInfo groupInfo = this.groupInfo;
        int hashCode4 = (hashCode3 + (groupInfo == null ? 0 : groupInfo.hashCode())) * 31;
        InviteError inviteError = this.inviteError;
        return hashCode4 + (inviteError != null ? inviteError.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupInviteInfoModel(inviteId=");
        LIZ.append(this.inviteId);
        LIZ.append(", inviteUrl=");
        LIZ.append(this.inviteUrl);
        LIZ.append(", expiredAt=");
        LIZ.append(this.expiredAt);
        LIZ.append(", groupInfo=");
        LIZ.append(this.groupInfo);
        LIZ.append(", inviteError=");
        LIZ.append(this.inviteError);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GroupInviteInfoModel(String str, String str2, Long l, GroupInfo groupInfo, InviteError inviteError) {
        this.inviteId = str;
        this.inviteUrl = str2;
        this.expiredAt = l;
        this.groupInfo = groupInfo;
        this.inviteError = inviteError;
    }

    public /* synthetic */ GroupInviteInfoModel(String str, String str2, Long l, GroupInfo groupInfo, InviteError inviteError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : groupInfo, (i & 16) == 0 ? inviteError : null);
    }
}

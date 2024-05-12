package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ReplyInviteParam {

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizReplyParams bizReplyParams;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("invite_operator")
    public UserBean inviteOperator;

    @InterfaceC65349Pkn("invitee")
    public UserBean invitee;

    @InterfaceC65349Pkn("invitor")
    public UserBean inviter;

    @InterfaceC65349Pkn("reply_status")
    public int replyStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyInviteParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyInviteParam)) {
            return false;
        }
        ReplyInviteParam replyInviteParam = (ReplyInviteParam) obj;
        return o.LJ(this.common, replyInviteParam.common) && o.LJ(this.channelId, replyInviteParam.channelId) && o.LJ(this.invitee, replyInviteParam.invitee) && o.LJ(this.inviteOperator, replyInviteParam.inviteOperator) && o.LJ(this.inviter, replyInviteParam.inviter) && this.replyStatus == replyInviteParam.replyStatus && o.LJ(this.bizReplyParams, replyInviteParam.bizReplyParams);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        Long l = this.channelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBean userBean = this.invitee;
        int hashCode3 = (hashCode2 + (userBean == null ? 0 : userBean.hashCode())) * 31;
        UserBean userBean2 = this.inviteOperator;
        int hashCode4 = (hashCode3 + (userBean2 == null ? 0 : userBean2.hashCode())) * 31;
        UserBean userBean3 = this.inviter;
        int hashCode5 = (((hashCode4 + (userBean3 == null ? 0 : userBean3.hashCode())) * 31) + this.replyStatus) * 31;
        BizReplyParams bizReplyParams = this.bizReplyParams;
        return hashCode5 + (bizReplyParams != null ? bizReplyParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyInviteParam(common=");
        LIZ.append(this.common);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", invitee=");
        LIZ.append(this.invitee);
        LIZ.append(", inviteOperator=");
        LIZ.append(this.inviteOperator);
        LIZ.append(", inviter=");
        LIZ.append(this.inviter);
        LIZ.append(", replyStatus=");
        LIZ.append(this.replyStatus);
        LIZ.append(", bizReplyParams=");
        LIZ.append(this.bizReplyParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ReplyInviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, BizReplyParams bizReplyParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.invitee = userBean;
        this.inviteOperator = userBean2;
        this.inviter = userBean3;
        this.replyStatus = i;
        this.bizReplyParams = bizReplyParams;
    }

    public /* synthetic */ ReplyInviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, BizReplyParams bizReplyParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : linkCommonBean, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : userBean, (i2 & 8) != 0 ? null : userBean2, (i2 & 16) != 0 ? null : userBean3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) == 0 ? bizReplyParams : null);
    }
}

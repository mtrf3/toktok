package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.im.KickOutBizContent;

/* loaded from: classes14.dex */
public final class MultiLiveContent extends F9E {

    @InterfaceC65349Pkn("apply_biz_content")
    public ApplyBizContent applyIMContent;

    @InterfaceC65349Pkn("invite_biz_content")
    public InviteBizContent inviteIMContent;

    @InterfaceC65349Pkn("join_direct_biz_content")
    public JoinDirectBizContent joinDirectIMContent;

    @InterfaceC65349Pkn("kick_out_biz_content")
    public KickOutBizContent kickOutBizContent;

    @InterfaceC65349Pkn("permit_biz_content")
    public PermitBizContent permitIMContent;

    @InterfaceC65349Pkn("reply_biz_content")
    public ReplyBizContent replyIMContent;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLiveContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.applyIMContent, this.inviteIMContent, this.replyIMContent, this.permitIMContent, this.joinDirectIMContent, this.kickOutBizContent};
    }

    public MultiLiveContent(ApplyBizContent applyBizContent, InviteBizContent inviteBizContent, ReplyBizContent replyBizContent, PermitBizContent permitBizContent, JoinDirectBizContent joinDirectBizContent, KickOutBizContent kickOutBizContent) {
        this.applyIMContent = applyBizContent;
        this.inviteIMContent = inviteBizContent;
        this.replyIMContent = replyBizContent;
        this.permitIMContent = permitBizContent;
        this.joinDirectIMContent = joinDirectBizContent;
        this.kickOutBizContent = kickOutBizContent;
    }

    public /* synthetic */ MultiLiveContent(ApplyBizContent applyBizContent, InviteBizContent inviteBizContent, ReplyBizContent replyBizContent, PermitBizContent permitBizContent, JoinDirectBizContent joinDirectBizContent, KickOutBizContent kickOutBizContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : applyBizContent, (i & 2) != 0 ? null : inviteBizContent, (i & 4) != 0 ? null : replyBizContent, (i & 8) != 0 ? null : permitBizContent, (i & 16) != 0 ? null : joinDirectBizContent, (i & 32) == 0 ? kickOutBizContent : null);
    }
}

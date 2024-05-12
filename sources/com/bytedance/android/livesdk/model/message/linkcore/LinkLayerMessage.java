package com.bytedance.android.livesdk.model.message.linkcore;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.im.CancelJoinGroupContent;
import webcast.im.GroupChangeContent;
import webcast.im.JoinGroupContent;
import webcast.im.LeaveJoinGroupContent;
import webcast.im.P2PGroupChangeContent;
import webcast.im.PermitJoinGroupContent;

/* loaded from: classes14.dex */
public final class LinkLayerMessage extends CR6 {

    @InterfaceC65349Pkn("apply_content")
    public ApplyContent applyContent;

    @InterfaceC65349Pkn("business_content")
    public BusinessContent bizContent;

    @InterfaceC65349Pkn("cancel_apply_content")
    public CancelApplyContent cancelApplyContent;

    @InterfaceC65349Pkn("cancel_group_content")
    public CancelJoinGroupContent cancelGroupContent;

    @InterfaceC65349Pkn("cancel_invite_content")
    public CancelInviteContent cancelInviteContent;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("create_channel_content")
    public CreateChannelContent createChannelContent;

    @InterfaceC65349Pkn("finish_content")
    public FinishChannelContent finishContent;

    @InterfaceC65349Pkn("group_change_content")
    public GroupChangeContent groupChangeContent;

    @InterfaceC65349Pkn("invite_content")
    public InviteContent inviteContent;

    @InterfaceC65349Pkn("join_direct_content")
    public JoinDirectContent joinDirectContent;

    @InterfaceC65349Pkn("join_group_content")
    public JoinGroupContent joinGroupContent;

    @InterfaceC65349Pkn("kick_out_content")
    public KickOutContent kickOutContent;

    @InterfaceC65349Pkn("leave_content")
    public LeaveContent leaveContent;

    @InterfaceC65349Pkn("leave_group_content")
    public LeaveJoinGroupContent leaveGroupContent;

    @InterfaceC65349Pkn("list_change_content")
    public LinkListChangeContent listContent;

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    @InterfaceC65349Pkn("p2p_group_change_content")
    public P2PGroupChangeContent p2pGroupChangeContent;

    @InterfaceC65349Pkn("permit_apply_content")
    public PermitApplyContent permitApplyContent;

    @InterfaceC65349Pkn("permit_group_content")
    public PermitJoinGroupContent permitGroupContent;

    @InterfaceC65349Pkn("reply_invite_content")
    public ReplyInviteContent replyInviteContent;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("source")
    public String source;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkLayerMessage() {
        /*
            r20 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r18 = 65535(0xffff, float:9.1834E-41)
            r0 = r20
            r4 = r1
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r19 = r5
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage.<init>():void");
    }

    public LinkLayerMessage(int i, long j, int i2, CreateChannelContent createChannelContent, LinkListChangeContent linkListChangeContent, InviteContent inviteContent, ApplyContent applyContent, PermitApplyContent permitApplyContent, ReplyInviteContent replyInviteContent, KickOutContent kickOutContent, CancelApplyContent cancelApplyContent, CancelInviteContent cancelInviteContent, LeaveContent leaveContent, FinishChannelContent finishChannelContent, BusinessContent businessContent, JoinDirectContent joinDirectContent) {
        this.messageType = i;
        this.channelId = j;
        this.scene = i2;
        this.createChannelContent = createChannelContent;
        this.listContent = linkListChangeContent;
        this.inviteContent = inviteContent;
        this.applyContent = applyContent;
        this.permitApplyContent = permitApplyContent;
        this.replyInviteContent = replyInviteContent;
        this.kickOutContent = kickOutContent;
        this.cancelApplyContent = cancelApplyContent;
        this.cancelInviteContent = cancelInviteContent;
        this.leaveContent = leaveContent;
        this.finishContent = finishChannelContent;
        this.bizContent = businessContent;
        this.joinDirectContent = joinDirectContent;
        this.type = EnumC31509CYf.BASE_LINK_LAYER_MESSAGE;
        this.source = "";
    }

    public /* synthetic */ LinkLayerMessage(int i, long j, int i2, CreateChannelContent createChannelContent, LinkListChangeContent linkListChangeContent, InviteContent inviteContent, ApplyContent applyContent, PermitApplyContent permitApplyContent, ReplyInviteContent replyInviteContent, KickOutContent kickOutContent, CancelApplyContent cancelApplyContent, CancelInviteContent cancelInviteContent, LeaveContent leaveContent, FinishChannelContent finishChannelContent, BusinessContent businessContent, JoinDirectContent joinDirectContent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? null : createChannelContent, (i3 & 16) != 0 ? null : linkListChangeContent, (i3 & 32) != 0 ? null : inviteContent, (i3 & 64) != 0 ? null : applyContent, (i3 & 128) != 0 ? null : permitApplyContent, (i3 & 256) != 0 ? null : replyInviteContent, (i3 & 512) != 0 ? null : kickOutContent, (i3 & 1024) != 0 ? null : cancelApplyContent, (i3 & 2048) != 0 ? null : cancelInviteContent, (i3 & 4096) != 0 ? null : leaveContent, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : finishChannelContent, (i3 & 16384) != 0 ? null : businessContent, (i3 & 32768) != 0 ? null : joinDirectContent);
    }
}

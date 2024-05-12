package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ReplyInviteContent extends F9E {

    @InterfaceC65349Pkn("invite_operator_user")
    public Player inviteOperatorUser;

    @InterfaceC65349Pkn("invitee")
    public Player invitee;

    @InterfaceC65349Pkn("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @InterfaceC65349Pkn("invitee_pos")
    public MicPositionData positionData;

    @InterfaceC65349Pkn("reply_status")
    public int replyStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyInviteContent() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.invitee, Integer.valueOf(this.replyStatus), this.positionData, this.inviteeLinkMicId, this.inviteOperatorUser};
    }

    public ReplyInviteContent(Player player, int i, MicPositionData micPositionData, String str, Player player2) {
        this.invitee = player;
        this.replyStatus = i;
        this.positionData = micPositionData;
        this.inviteeLinkMicId = str;
        this.inviteOperatorUser = player2;
    }

    public /* synthetic */ ReplyInviteContent(Player player, int i, MicPositionData micPositionData, String str, Player player2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : player, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : micPositionData, (i2 & 8) != 0 ? null : str, (i2 & 16) == 0 ? player2 : null);
    }
}

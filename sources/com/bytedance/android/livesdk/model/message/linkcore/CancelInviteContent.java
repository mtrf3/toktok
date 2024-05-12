package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class CancelInviteContent extends F9E {

    @InterfaceC65349Pkn("invite_seq_id")
    public long inviteSeqId;

    @InterfaceC65349Pkn("invitee")
    public Player invitee;

    @InterfaceC65349Pkn("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @InterfaceC65349Pkn("invitor")
    public Player inviter;

    @InterfaceC65349Pkn("invitor_link_mic_id")
    public String inviterLinkMicId;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelInviteContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.inviter, this.inviterLinkMicId, this.inviteeLinkMicId, Long.valueOf(this.inviteSeqId), this.invitee};
    }

    public CancelInviteContent(Player player, String str, String str2, long j, Player player2) {
        this.inviter = player;
        this.inviterLinkMicId = str;
        this.inviteeLinkMicId = str2;
        this.inviteSeqId = j;
        this.invitee = player2;
    }

    public /* synthetic */ CancelInviteContent(Player player, String str, String str2, long j, Player player2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? player2 : null);
    }
}

package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class InviteContent extends F9E {

    @InterfaceC65349Pkn("dsl")
    public DSLConfig dsl;

    @InterfaceC65349Pkn("invitee")
    public Player invitee;

    @InterfaceC65349Pkn("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @InterfaceC65349Pkn("invitee_rtc_ext_info")
    public RTCExtraInfo inviteeRTCInfo;

    @InterfaceC65349Pkn("invitor")
    public Player inviter;

    @InterfaceC65349Pkn("invitor_link_mic_id")
    public String inviterLinkMicId;

    @InterfaceC65349Pkn("is_owner")
    public boolean isOwner;

    @InterfaceC65349Pkn("operator")
    public Player operator;

    @InterfaceC65349Pkn("pos")
    public MicPositionData positionData;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.inviter, this.positionData, this.inviteeRTCInfo, this.inviterLinkMicId, this.inviteeLinkMicId, Boolean.valueOf(this.isOwner), this.dsl, this.invitee, this.operator};
    }

    public InviteContent(Player player, MicPositionData micPositionData, RTCExtraInfo rTCExtraInfo, String str, String str2, boolean z, DSLConfig dSLConfig, Player player2, Player player3) {
        this.inviter = player;
        this.positionData = micPositionData;
        this.inviteeRTCInfo = rTCExtraInfo;
        this.inviterLinkMicId = str;
        this.inviteeLinkMicId = str2;
        this.isOwner = z;
        this.dsl = dSLConfig;
        this.invitee = player2;
        this.operator = player3;
    }

    public /* synthetic */ InviteContent(Player player, MicPositionData micPositionData, RTCExtraInfo rTCExtraInfo, String str, String str2, boolean z, DSLConfig dSLConfig, Player player2, Player player3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? null : micPositionData, (i & 4) != 0 ? null : rTCExtraInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : dSLConfig, (i & 128) != 0 ? null : player2, (i & 256) == 0 ? player3 : null);
    }
}

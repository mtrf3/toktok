package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import defpackage.b0;

/* loaded from: classes14.dex */
public class LinkMicBattlePunishFinishMessage extends CR6 {

    @InterfaceC65349Pkn("battle_id")
    public long battleId;

    @InterfaceC65349Pkn("battle_settings")
    public BattleSetting battleSettings;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("op_uid")
    public long opUid;

    @InterfaceC65349Pkn("reason")
    public int reason;

    public LinkMicBattlePunishFinishMessage() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE_PUNISH_FINISH;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicBattlePunishFinishMessage{channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", opUid=");
        LIZ.append(this.opUid);
        LIZ.append(", reason=");
        return b0.LIZJ(LIZ, this.reason, '}', LIZ);
    }
}

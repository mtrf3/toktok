package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceIdentifyOptSettings;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Twu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76292Twu implements OnMessageListener {
    public final /* synthetic */ C76288Twq LJLIL;

    public C76292Twu(C76288Twq c76288Twq) {
        this.LJLIL = c76288Twq;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        int intValue;
        Room room;
        InterfaceC76359Txz interfaceC76359Txz;
        if (iMessage instanceof LinkMicBattleMessage) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) iMessage;
            if (linkMicBattleMessage.action == 4 && (interfaceC76359Txz = (InterfaceC76359Txz) this.LJLIL.mView) != null) {
                interfaceC76359Txz.p7(linkMicBattleMessage);
                return;
            }
            return;
        }
        if (!(iMessage instanceof LinkMicBattleArmiesMessage)) {
            return;
        }
        LinkMicBattleArmiesMessage linkMicBattleArmiesMessage = (LinkMicBattleArmiesMessage) iMessage;
        BattleSetting battleSetting = linkMicBattleArmiesMessage.battleSettings;
        long j2 = 0;
        if (battleSetting != null) {
            j = battleSetting.startTimeMs;
        } else {
            j = 0;
        }
        BattleSetting battleSetting2 = C76265TwT.LIZ.LIZLLL;
        if (battleSetting2 != null) {
            j2 = battleSetting2.startTimeMs;
        }
        if (j <= j2) {
            return;
        }
        Integer num = this.LJLIL.LJLJL.get(Long.valueOf(linkMicBattleArmiesMessage.battleId));
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        if (intValue >= 1) {
            return;
        }
        C76288Twq c76288Twq = this.LJLIL;
        long j3 = linkMicBattleArmiesMessage.battleId;
        c76288Twq.getClass();
        if (LiveMatchAudienceIdentifyOptSettings.INSTANCE.isArmiesFallBackEnable()) {
            DataChannel dataChannel = c76288Twq.dataChannel;
            if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
                room = new Room();
            }
            ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).getInfo(room.getId(), B5G.LIZIZ().LJFF, j3, room.getOwnerUserId()).LIZJ(c76288Twq.autoDisposeWithTransformer())).LIZJ(new AfS65S0100000_13(c76288Twq, 21), new AfS65S0100000_13(c76288Twq, 22));
        }
        this.LJLIL.LJLJL.put(Long.valueOf(linkMicBattleArmiesMessage.battleId), 1);
    }
}

package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Tx7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76305Tx7 implements OnMessageListener {
    public final /* synthetic */ C76302Tx4 LJLIL;

    public C76305Tx7(C76302Tx4 c76302Tx4) {
        this.LJLIL = c76302Tx4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC76362Ty2 interfaceC76362Ty2;
        Room room;
        long j;
        if (iMessage == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMessage, message = ");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZJ, iMessage));
        C0NB.LJIIIZ("MultiMatchAnchorPresent", X1D.LIZIZ(LIZ));
        if (iMessage instanceof BaseMessage) {
            C76302Tx4 c76302Tx4 = this.LJLIL;
            if (c76302Tx4.dataChannel == null) {
                c76302Tx4.dataChannel = ((InterfaceC31336CRo) c76302Tx4.mView).provideDataChannel();
            }
            DataChannel dataChannel = this.LJLIL.dataChannel;
            if (dataChannel != null) {
                room = (Room) dataChannel.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
            long j2 = 0;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = 0;
            }
            if (room != null) {
                j2 = room.nowTime;
            }
            if (j < j2) {
                C0NB.LJIIIZ("MultiMatchAnchorPresent", "onMessage, return message is old");
                return;
            }
        }
        if ((iMessage instanceof LinkMicBattleMessage) && (interfaceC76362Ty2 = (InterfaceC76362Ty2) this.LJLIL.mView) != null) {
            interfaceC76362Ty2.Ip0((LinkMicBattleMessage) iMessage);
        }
    }
}

package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.CjL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32135CjL implements OnMessageListener {
    public IMessageManager LJLIL;
    public DataChannel LJLILLLLZI;

    public abstract String LIZ();

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        boolean z;
        Room room;
        Room room2;
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        FirstChargeData firstChargeData = c32313CmD.LIZLLL;
        c32313CmD.LJIIIIZZ().LIZLLL();
        UW7 uw7 = GiftManager.inst().giftRepository;
        DataChannel dataChannel = this.LJLILLLLZI;
        long j2 = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
            j2 = room.getOwnerUserId();
        }
        if (currentUserId == j2) {
            z = true;
        } else {
            z = false;
        }
        uw7.LIZ(5, j, new C32274Cla(firstChargeData, this), "", z);
    }
}

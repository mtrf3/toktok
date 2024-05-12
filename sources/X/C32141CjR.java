package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CjR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32141CjR {
    public final DataChannel LIZ;
    public Gift LIZIZ;
    public final C73318Sq2 LIZJ = new C73318Sq2();
    public InterfaceC32144CjU LIZLLL;

    public C32141CjR(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        EnumC30204BtI.DUMMY_FAST_GIFT.hide(dataChannel);
        this.LIZIZ = null;
    }

    public final void onEvent(C32145CjV c32145CjV) {
        DataChannel dataChannel;
        long j;
        if (c32145CjV == null || (dataChannel = this.LIZ) == null || dataChannel.kv0(RoomChannel.class) == null) {
            return;
        }
        long j2 = c32145CjV.LIZIZ;
        Room room = (Room) this.LIZ.kv0(RoomChannel.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        if (j2 != j) {
            return;
        }
        Gift findGiftById = GiftManager.inst().findGiftById(c32145CjV.LIZ);
        this.LIZIZ = findGiftById;
        if (findGiftById == null || c32145CjV.LIZ <= 0) {
            EnumC30204BtI.DUMMY_FAST_GIFT.hide(this.LIZ);
        } else {
            EnumC30204BtI.DUMMY_FAST_GIFT.show(this.LIZ);
        }
        InterfaceC32144CjU interfaceC32144CjU = this.LIZLLL;
        if (interfaceC32144CjU == null) {
            return;
        }
        interfaceC32144CjU.LIZ(this.LIZIZ);
    }
}

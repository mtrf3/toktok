package X;

import Y.AfS4S0100100_5;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CmR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32327CmR {
    public InterfaceC32326CmQ LIZ;
    public final DataChannel LIZIZ;
    public Gift LIZJ;
    public final C73318Sq2 LIZLLL;

    public C32327CmR(InterfaceC32326CmQ interfaceC32326CmQ, DataChannel dataChannel) {
        Room room;
        this.LIZ = interfaceC32326CmQ;
        this.LIZIZ = dataChannel;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LIZLLL = c73318Sq2;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        if (LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(dataChannel)) {
            InterfaceC32326CmQ interfaceC32326CmQ2 = this.LIZ;
            if (interfaceC32326CmQ2 != null) {
                interfaceC32326CmQ2.setImageDrawable(R.drawable.cpy);
            }
        } else {
            EnumC30204BtI.FAST_GIFT.hide(dataChannel);
        }
        long id = room.getId();
        Gift fastGift = GiftManager.inst().getFastGift(id);
        if (fastGift != null) {
            this.LIZJ = fastGift;
            EnumC30204BtI.FAST_GIFT.show(dataChannel);
            InterfaceC32326CmQ interfaceC32326CmQ3 = this.LIZ;
            if (interfaceC32326CmQ3 != null) {
                interfaceC32326CmQ3.LIZ(this.LIZJ);
            }
        }
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C32145CjV.class).LJJJJZI(new AfS4S0100100_5(id, this, 17)));
    }
}

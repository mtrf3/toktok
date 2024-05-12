package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Cp4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32490Cp4 implements InterfaceC32497CpB {
    public final C15940ju LJLIL;
    public final DataChannel LJLILLLLZI;
    public final Room LJLJI;

    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        long j;
        boolean z;
        Room room;
        o.LJIIIZ(t, "t");
        this.LJLIL.LIZLLL.LIZIZ(t);
        if ((t instanceof C29401Dk) && ((C276516r) t).getErrorCode() == 4017163) {
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            if (currentUserId == j) {
                z = true;
            } else {
                z = false;
            }
            GiftManager.inst().giftRepository.LIZ(3, this.LJLJI.getId(), new C32489Cp3(z, this), "", z);
        }
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        long j;
        boolean z;
        Room room;
        this.LJLIL.LIZLLL.LIZJ(sendGiftResult);
        if (this.LJLIL.LJIIL != null) {
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            if (currentUserId == j) {
                z = true;
            } else {
                z = false;
            }
            GiftManager.inst().giftRepository.LIZ(3, this.LJLJI.getId(), new C32494Cp8(), "", z);
        }
    }

    public C32490Cp4(C15940ju c15940ju, DataChannel dataChannel, Room room) {
        o.LJIIIZ(room, "room");
        this.LJLIL = c15940ju;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = room;
    }
}

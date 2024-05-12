package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.BtU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30216BtU implements C10X {
    public final Room LIZ;
    public C73411SrX LIZIZ;
    public final C30215BtT LIZJ;

    public final void LIZ() {
        Boolean bool;
        C7N.LJIIIIZZ().resetRoomStatus();
        RoomAuthStatus roomAuthStatus = this.LIZ.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            bool = Boolean.valueOf(roomAuthStatus.enableGift);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C2U firstRechargeManager = C7N.LJIIIIZZ().getFirstRechargeManager();
            if (firstRechargeManager != null) {
                firstRechargeManager.LIZ(this.LIZ.getId(), this.LIZ.getOwnerUserId());
            }
            C7N.LJIIIIZZ().clearFastGift(this.LIZ.getId());
            C7N.LJIIIIZZ().syncGiftList(this.LIZJ, this.LIZ.getId(), 2, true);
        }
    }

    public C30216BtU(Room mRoom) {
        o.LJIIIZ(mRoom, "mRoom");
        this.LIZ = mRoom;
        this.LIZJ = new C30215BtT(this);
    }
}

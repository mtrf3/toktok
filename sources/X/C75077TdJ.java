package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TdJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75077TdJ implements InterfaceC75076TdI {
    public final DataChannel LIZ;
    public C73495Sst LIZIZ;

    public C75077TdJ(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC75076TdI
    public final void LIZ(ListByTypeResponse.ReservedUser reserveUser) {
        String str;
        String str2;
        o.LJIIIZ(reserveUser, "reserveUser");
        C0NB.LIZIZ("ReserveCardClickListener", "onAcceptIconClick");
        User user = reserveUser.user;
        if (o.LJ(C74824TYe.LJIIJJI, "appointment_guide")) {
            str = "appointment_guide";
        } else {
            str = "panel_Golive";
        }
        if (o.LJ(C74824TYe.LJIIJJI, "appointment_guide")) {
            str2 = "appointment_guide_invite";
        } else {
            str2 = "panel_Golive_invite";
        }
        TZQ tzq = new TZQ(user, str, 4, str2);
        tzq.LJ = -1;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomAnchorInviteGuestEvent.class, tzq);
        }
    }

    @Override // X.InterfaceC75076TdI
    public final void LIZIZ(ListByTypeResponse.ReservedUser reserveUser) {
        Room room;
        long j;
        long j2;
        User owner;
        o.LJIIIZ(reserveUser, "reserveUser");
        C0NB.LIZIZ("ReserveCardClickListener", "onWaitIconClick");
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        MultiGuestReserveReqParams multiGuestReserveReqParams = new MultiGuestReserveReqParams();
        multiGuestReserveReqParams.scene = 2;
        multiGuestReserveReqParams.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        multiGuestReserveReqParams.liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        long j3 = 0;
        if (room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        multiGuestReserveReqParams.fromUserId = j;
        User user = reserveUser.user;
        if (user != null) {
            j2 = user.getId();
        } else {
            j2 = 0;
        }
        multiGuestReserveReqParams.toUserId = j2;
        if (room != null) {
            j3 = room.getId();
        }
        multiGuestReserveReqParams.roomId = j3;
        multiGuestReserveReqParams.type = 3;
        this.LIZIZ = U4A.LIZIZ(multiGuestReserveReqParams, new C75079TdL(this, reserveUser));
    }
}

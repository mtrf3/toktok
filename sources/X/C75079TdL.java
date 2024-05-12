package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TdL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75079TdL implements U4B {
    public final /* synthetic */ C75077TdJ LJLIL;
    public final /* synthetic */ ListByTypeResponse.ReservedUser LJLILLLLZI;

    @Override // X.U4B
    public final void LIZJ(MultiGuestReserveResponse.ResponseData responseData) {
        long j;
        AudienceReserveUserInfo audienceReserveUserInfo;
        C73495Sst c73495Sst = this.LJLIL.LIZIZ;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        User user = this.LJLILLLLZI.user;
        long j2 = 0;
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        if (responseData != null && (audienceReserveUserInfo = responseData.reserveUserInfo) != null) {
            j2 = audienceReserveUserInfo.reserveId;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from_user_id", String.valueOf(j));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
        C43881HKb.LIZJ(j2, hashMap, "reservation_id", "reservation_type", "multi_guest");
        C74824TYe.LJLL("livesdk_connection_reservation_response", hashMap);
    }

    @Override // X.U4B
    public final void onFailed(Throwable th) {
        C73495Sst c73495Sst = this.LJLIL.LIZIZ;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
    }

    public C75079TdL(C75077TdJ c75077TdJ, ListByTypeResponse.ReservedUser reservedUser) {
        this.LJLIL = c75077TdJ;
        this.LJLILLLLZI = reservedUser;
    }
}

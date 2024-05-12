package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.FansClubWidget;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.FansGetTaskInfoResponse;

/* renamed from: X.Bm8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29760Bm8 implements InterfaceC72822Si2 {
    public final /* synthetic */ FansClubWidget LJLIL;

    public C29760Bm8(FansClubWidget fansClubWidget) {
        this.LJLIL = fansClubWidget;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, O] */
    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        FansClubViewModel LJLZ;
        C29750Bly c29750Bly;
        Boolean bool;
        Room room;
        String str;
        String str2;
        InterfaceC78280Uns LJJIJIIJIL;
        java.util.Map<String, Object> LIZIZ;
        FansClubWidget fansClubWidget = this.LJLIL;
        fansClubWidget.getClass();
        String str3 = c199097rd.LJLIL;
        int hashCode = str3.hashCode();
        String str4 = null;
        if (hashCode != -1221738807) {
            if (hashCode != -209672718) {
                if (hashCode != 649809957 || !str3.equals("FE_FANS_LEVEL_FETCH_TASK_DATA")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null && (LJJIJIIJIL = u.LJJIJIIJIL(interfaceC78280Uns, "data")) != null && (LIZIZ = LJJIJIIJIL.LIZIZ()) != null) {
                    str = C46104I7o.LJJJJZ(LIZIZ);
                } else {
                    str = null;
                }
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    str2 = u.LJJIJIL(interfaceC78280Uns2, "room_id", "");
                } else {
                    str2 = null;
                }
                Room room2 = (Room) fansClubWidget.dataChannel.kv0(RoomChannel.class);
                if (room2 != null) {
                    str4 = C17280m4.LIZ(room2);
                }
                if (!o.LJ(str2, str4)) {
                    return;
                }
                ?? fromJson = GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, str, (Class<??>) FansGetTaskInfoResponse.Data.class);
                DataChannel dataChannel = fansClubWidget.dataChannel;
                if (dataChannel == null) {
                    return;
                }
                ((C32537Cpp) dataChannel.gv0(BYG.class)).LIZ = fromJson;
                return;
            }
            if (!str3.equals("tt_live_fans_club_event_quit") || (LJLZ = fansClubWidget.LJLZ()) == null) {
                return;
            }
            DataChannel dataChannel2 = LJLZ.getDataChannel();
            if (dataChannel2 == null || (c29750Bly = (C29750Bly) dataChannel2.kv0(FansClubChannel.class)) == null) {
                c29750Bly = new C29750Bly(0L, 0L, null, null, 0, null, "", 0L);
            }
            C29750Bly LIZ = C29750Bly.LIZ(c29750Bly, 0L, 0L, null, null, 0, FansClubViewModel.hv0(0, false), Math.max(c29750Bly.LJII - 1, 0L), 32);
            C73994T2g.LJJIIZI();
            DataChannel dataChannel3 = LJLZ.getDataChannel();
            if (dataChannel3 != null) {
                dataChannel3.rv0(FansClubChannel.class, LIZ);
            }
            DataChannel dataChannel4 = LJLZ.getDataChannel();
            if (dataChannel4 != null) {
                bool = (Boolean) dataChannel4.kv0(UserIsAnchorChannel.class);
            } else {
                bool = null;
            }
            DataChannel dataChannel5 = LJLZ.getDataChannel();
            if (dataChannel5 != null) {
                room = (Room) dataChannel5.kv0(RoomChannel.class);
                if (room != null && bool != null) {
                    ((IGiftService) CN1.LIZ(IGiftService.class)).syncGiftList(new C29761Bm9(LJLZ), room.getId(), 14, bool.booleanValue());
                }
            } else {
                room = null;
            }
            DataChannel dataChannel6 = LJLZ.getDataChannel();
            if (dataChannel6 != null) {
                dataChannel6.qv0(FansClubEvent.class, new C29765BmD());
            }
            DataChannel dataChannel7 = LJLZ.getDataChannel();
            if (dataChannel7 != null) {
                dataChannel7.qv0(GiftDialogDismissEvent.class, Boolean.FALSE);
            }
            if (room != null) {
                User.FansClubInfo fansClubInfo = room.getOwner().fansClubInfo;
                if (fansClubInfo != null) {
                    fansClubInfo.fansCount = 0L;
                    fansClubInfo.fansLevel = 0L;
                    fansClubInfo.fansScore = 0L;
                    fansClubInfo.isSleeping = false;
                }
                DataChannel dataChannel8 = LJLZ.getDataChannel();
                if (dataChannel8 != null) {
                    dataChannel8.rv0(RoomChannel.class, room);
                }
            }
            DataChannel dataChannel9 = LJLZ.getDataChannel();
            if (dataChannel9 == null) {
                return;
            }
            ((C32537Cpp) dataChannel9.gv0(BYG.class)).LIZ = null;
            return;
        }
        if (!str3.equals("tt_live_fans_club_event_quit_clear_data")) {
            return;
        }
        InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns3 != null) {
            str4 = u.LJJIJIL(interfaceC78280Uns3, "anchor_id", "");
        }
        long LJJII = C1E4.LJJII(str4);
        C30554Byw<java.util.Map<String, String>> c30554Byw = InterfaceC30442Bx8.o2;
        java.util.Map<String, String> LIZ2 = c30554Byw.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, String> map = LIZ2;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put(String.valueOf(LJJII), CardStruct.IStatusCode.DEFAULT);
        c30554Byw.LIZJ(linkedHashMap);
    }
}

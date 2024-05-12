package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* loaded from: classes6.dex */
public final class BR4 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        if (((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            return "program_live";
        }
        if (CN1.LIZ(IMicRoomService.class) != null && ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
            return "video_anchor_order";
        }
        if (CN1.LIZ(IInteractService.class) != null) {
            String h00 = ((IInteractService) CN1.LIZ(IInteractService.class)).h00();
            o.LJIIIIZZ(h00, "getService(IInteractService::class.java).roomScene");
            return h00;
        }
        return "normal_video_live";
    }

    public static void LIZIZ(DataChannel dataChannel) {
        String str;
        HashMap hashMap = new HashMap(5);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        hashMap.put(WM7.SCENE_SERVICE, LIZ());
        hashMap.put("online_watch_users", String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()));
        if (C44384HbQ.LJJIJ()) {
            InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
            if (pk != null && pk.LJFF(EnumC30204BtI.INTERACTION_FEATURES)) {
                str = "more_interaction";
            } else {
                str = "interaction";
            }
        } else {
            str = "more";
        }
        hashMap.put("create_entrance", str);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_goody_bag_create_entrance_click");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(DataChannel dataChannel) {
        String str;
        HashMap hashMap = new HashMap(5);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        hashMap.put(WM7.SCENE_SERVICE, LIZ());
        hashMap.put("online_watch_users", String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()));
        if (C44384HbQ.LJJIJ()) {
            InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
            if (pk != null && pk.LJFF(EnumC30204BtI.INTERACTION_FEATURES)) {
                str = "more_interaction";
            } else {
                str = "interaction";
            }
        } else {
            str = "more";
        }
        hashMap.put("create_entrance", str);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_goody_bag_create_entrance_show");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJ(int i, String str, boolean z) {
        String str2;
        String str3;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap hashMap = new HashMap();
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str2);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str3 = Q4K.LIZJ(followInfo)) == null) {
                str3 = "";
            }
            hashMap.put("follow_status", str3);
        }
        hashMap.put("goody_bag_id", str);
        hashMap.put("open_at", String.valueOf(i));
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_goody_bag_prepare_open");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJIIL("other");
        LIZ3.LJIIIZ("live");
        LIZ3.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_goody_bag_prepare_open", hashMap);
    }

    public static void LJI(Integer num, boolean z, GetRoomGoodyBagResponse.ResponseData responseData) {
        Object obj;
        String str;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap hashMap = new HashMap();
        if (num != null) {
            C0EM.LIZJ(num, hashMap, "error_code");
        }
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", obj);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        String str3 = "";
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str = Q4K.LIZJ(followInfo)) == null) {
                str = "";
            }
            hashMap.put("follow_status", str);
        }
        if (responseData != null) {
            String str4 = responseData.goodyBagId;
            if (str4 != null) {
                str3 = str4;
            }
            hashMap.put("goody_bag_id", str3);
            if (!responseData.joined) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("joined", str2);
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_goody_bag_room_response");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIL("other");
        LIZ3.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
            LIZ3.LJIIZILJ();
            LIZ3.LJJIIJZLJL();
        } else {
            LIZ3.LJJIJ();
            LIZ3.LJJIIZI();
        }
        C0K2.LJII(0, "ttlive_goody_bag_room_response", hashMap);
    }

    public static void LIZLLL(int i, String goodyBagId, String dataFrom, boolean z) {
        String str;
        String str2;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        o.LJIIIZ(goodyBagId, "goodyBagId");
        o.LJIIIZ(dataFrom, "dataFrom");
        HashMap hashMap = new HashMap();
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = Q4K.LIZJ(followInfo)) == null) {
                str2 = "";
            }
            hashMap.put("follow_status", str2);
        }
        hashMap.put("goody_bag_id", goodyBagId);
        hashMap.put("open_at", String.valueOf(i));
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("data_from", dataFrom);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_goody_bag_open_monitor");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJIIL("other");
        LIZ3.LJIIIZ("live");
        LIZ3.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_goody_bag_open_monitor", hashMap);
    }

    public static void LJII(Integer num, ArrayList arrayList, ArrayList arrayList2, String uuid, String str, long j) {
        o.LJIIIZ(uuid, "uuid");
        HashMap hashMap = new HashMap(5);
        if (num != null) {
            C0EM.LIZJ(num, hashMap, "error_code");
        }
        hashMap.put("duration_from_request", String.valueOf(System.currentTimeMillis() - j));
        String abstractCollection = arrayList.toString();
        o.LJIIIIZZ(abstractCollection, "envelopePermission.toString()");
        hashMap.put("envelope_permission", abstractCollection);
        String abstractCollection2 = arrayList2.toString();
        o.LJIIIIZZ(abstractCollection2, "goodyBagPermission.toString()");
        hashMap.put("goody_bag_permission", abstractCollection2);
        hashMap.put("uuid", uuid);
        if (str == null) {
            str = "";
        }
        hashMap.put("log_id", str);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_revenue_interact_permission_response");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIL("other");
        LIZ2.LJIIIZ("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJI();
            LIZ2.LJJIIZI();
        }
        C0K2.LJII(0, "ttlive_revenue_interact_permission_response", hashMap);
    }

    public static void LJFF(Integer num, boolean z, String str, GetGoodyBagLotteryResponse.ResponseData responseData, int i, long j, int i2) {
        Object obj;
        int i3;
        String str2;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap LIZ2 = C1R5.LIZ(str, "goodyBagId");
        if (num != null) {
            C0EM.LIZJ(num, LIZ2, "error_code");
        }
        B83 LIZ3 = B83.LIZ();
        if (LIZ3 != null && (LIZIZ = LIZ3.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, LIZ2, "user_id");
        }
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_anchor", obj);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            LIZ2.put("room_id", idStr);
            LIZ2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = Q4K.LIZJ(followInfo)) == null) {
                str2 = "";
            }
            LIZ2.put("follow_status", str2);
        }
        LIZ2.put("goody_bag_id", str);
        if (responseData == null || !responseData.win) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("win", str3);
        if (responseData != null) {
            i3 = responseData.coins;
        } else {
            i3 = 0;
        }
        LIZ2.put("coins", String.valueOf(i3));
        LIZ2.put("open_at", String.valueOf(i));
        LIZ2.put("time_diff", String.valueOf(C31012CFc.LIZIZ));
        LIZ2.put("dur_from_request", String.valueOf(System.currentTimeMillis() - j));
        LIZ2.put("dur_from_open_at", String.valueOf(C31012CFc.LIZIZ() - (i * 1000)));
        LIZ2.put("retry_count", String.valueOf(i2));
        BZI LIZ4 = C28787BRn.LIZ("livesdk_goody_bag_lottery_response");
        LIZ4.LJJIFFI(LIZ2);
        LIZ4.LJIIZILJ();
        LIZ4.LJIIL("other");
        LIZ4.LJIIIZ("live");
        LIZ4.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_goody_bag_lottery_response", LIZ2);
    }

    public static void LJIIIIZZ(Integer num, boolean z, String str, int i, int i2, long j, int i3) {
        String str2;
        String str3;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        HashMap LIZ2 = C1R5.LIZ(str, "goodyBagId");
        if (num != null) {
            C0EM.LIZJ(num, LIZ2, "error_code");
        }
        B83 LIZ3 = B83.LIZ();
        if (LIZ3 != null && (LIZIZ = LIZ3.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, LIZ2, "user_id");
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_anchor", str2);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            LIZ2.put("room_id", idStr);
            LIZ2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str3 = Q4K.LIZJ(followInfo)) == null) {
                str3 = "";
            }
            LIZ2.put("follow_status", str3);
        }
        LIZ2.put("goody_bag_id", str);
        LIZ2.put("request_platform", "client");
        LIZ2.put("winners_count", String.valueOf(i));
        LIZ2.put("open_at", String.valueOf(i2));
        LIZ2.put("time_diff", String.valueOf(C31012CFc.LIZIZ));
        LIZ2.put("dur_from_request", String.valueOf(System.currentTimeMillis() - j));
        LIZ2.put("dur_from_open_at", String.valueOf(C31012CFc.LIZIZ() - (i2 * 1000)));
        LIZ2.put("retry_count", String.valueOf(i3));
        BZI LIZ4 = C28787BRn.LIZ("livesdk_goody_bag_winner_list_response");
        LIZ4.LJJIFFI(LIZ2);
        LIZ4.LJIIZILJ();
        LIZ4.LJIIL("other");
        LIZ4.LJIIIZ("live");
        LIZ4.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_goody_bag_winner_list_response", LIZ2);
    }
}

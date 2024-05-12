package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.event.PartnershipAudiencePromotingTaskChannel;
import com.bytedance.android.livesdk.event.PartnershipRoomExitEvent;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.TaskAttributionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* renamed from: X.BzU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30588BzU {
    public static long LIZ = -1;
    public static BriefGameTask LIZIZ;

    public static boolean LIZ(BriefGameTask briefGameTask) {
        TaskAttributionInfo taskAttributionInfo;
        String str;
        PartnershipTask partnershipTask;
        if (briefGameTask != null && (partnershipTask = briefGameTask.task) != null) {
            taskAttributionInfo = partnershipTask.attributionInfo;
        } else {
            taskAttributionInfo = null;
        }
        if (taskAttributionInfo == null || taskAttributionInfo.viewReportScene == 0 || (str = taskAttributionInfo.viewThroughUrl) == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(DataChannel dataChannel) {
        String str;
        Long l;
        PartnershipTask partnershipTask;
        o.LJIIIZ(dataChannel, "dataChannel");
        if (LIZ < 0) {
            return;
        }
        long currentTimeMillis = (System.currentTimeMillis() - LIZ) / 1000;
        LIZ = -1L;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gamepad_btn_duration");
        LIZ2.LJIILLIIL(dataChannel);
        if (C28835BTj.LIZLLL(dataChannel)) {
            str = "ad";
        } else {
            str = "normal";
        }
        LIZ2.LJIJJ(str, "live_traffic_source");
        LIZ2.LJIJJ("live_detail", "page_name");
        C06530Nl.LIZLLL(LIZ2, "icon", "btn_name", currentTimeMillis, "duration");
        BriefGameTask briefGameTask = LIZIZ;
        if (briefGameTask != null && (partnershipTask = briefGameTask.task) != null) {
            l = partnershipTask.gameId;
        } else {
            l = null;
        }
        LIZ2.LJIJJ(String.valueOf(l), "game_id");
        LIZ2.LJIJJ("user", "user_type");
        LIZ2.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(String.valueOf(BJM.LJ()), "host_id");
        LIZ2.LJIJJ(String.valueOf(BJM.LJIILJJIL()), "content_id");
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    public static void LIZIZ(Room room, DataChannel dataChannel) {
        if (!C78897Uxp.LJJIJLIJ(room)) {
            return;
        }
        if (dataChannel != null) {
            dataChannel.rv0(PartnershipAudiencePromotingTaskChannel.class, new C30124Bs0(""));
            ((C32537Cpp) dataChannel.gv0(C30128Bs4.class)).LIZ = Boolean.FALSE;
            ((C32537Cpp) dataChannel.gv0(C29723BlX.class)).LIZ = Boolean.FALSE;
            ((C32537Cpp) dataChannel.gv0(C30590BzW.class)).LIZ = Boolean.FALSE;
        }
        ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).QB(room);
        if (room != null) {
            DataChannelGlobal.LJLJJI.sv0(PartnershipRoomExitEvent.class, Long.valueOf(room.getId()));
        }
        if (dataChannel != null) {
            LJIIIIZZ(dataChannel);
        }
        LIZ = -1L;
        LIZIZ = null;
    }

    public static void LJ(DataChannel dataChannel, boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        BriefGame briefGame;
        Object obj4;
        PartnershipTask partnershipTask;
        PartnershipTask partnershipTask2;
        PartnershipTask partnershipTask3;
        BriefGameTask briefGameTask = (BriefGameTask) dataChannel.kv0(C30591BzX.class);
        boolean LIZ2 = LIZ(briefGameTask);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_gamepad_btn_click");
        LIZ3.LJIILLIIL(dataChannel);
        if (C28835BTj.LIZLLL(dataChannel)) {
            obj = "ad";
        } else {
            obj = "normal";
        }
        LIZ3.LJIJJ(obj, "live_traffic_source");
        LIZ3.LJIJJ("live_detail", "page_name");
        LIZ3.LJIJJ("icon", "btn_name");
        LIZ3.LJIJJ(Boolean.valueOf(LIZ2), "attribution");
        LIZ3.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_fullscreen");
        LIZ3.LJIJJ(String.valueOf(((C29374Bfu) TTL.LIZJ(LIZ3, "user", "user_type")).getCurrentUserId()), "user_id");
        LIZ3.LJIJJ(String.valueOf(BJM.LJ()), "host_id");
        LIZ3.LJIJJ(String.valueOf(BJM.LJIILJJIL()), "content_id");
        Object obj5 = null;
        if (briefGameTask != null && (partnershipTask3 = briefGameTask.task) != null) {
            obj5 = partnershipTask3.idStr;
        }
        Object obj6 = "";
        if (obj5 == null) {
            obj5 = "";
        }
        LIZ3.LJIJJ(obj5, "task_id");
        if (briefGameTask == null || (partnershipTask2 = briefGameTask.task) == null || (obj2 = partnershipTask2.idStr) == null) {
            obj2 = "";
        }
        LIZ3.LJIJJ(obj2, "game_task_id");
        if (briefGameTask == null || (partnershipTask = briefGameTask.task) == null || (obj3 = partnershipTask.gameIdStr) == null) {
            obj3 = "";
        }
        LIZ3.LJIJJ(obj3, "game_id");
        if (briefGameTask != null && (briefGame = briefGameTask.briefGame) != null && (obj4 = briefGame.name) != null) {
            obj6 = obj4;
        }
        LIZ3.LJIJJ(obj6, "game_name");
        LIZ3.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Boolean, java.lang.Object, O] */
    public static void LJFF(Room room, DataChannel dataChannel) {
        String str;
        long j;
        String str2;
        String str3;
        BriefGame briefGame;
        String str4;
        PartnershipTask partnershipTask;
        PartnershipTask partnershipTask2;
        PartnershipTask partnershipTask3;
        Object kv0 = dataChannel.kv0(C30590BzW.class);
        ?? r2 = Boolean.TRUE;
        if (o.LJ(kv0, r2)) {
            return;
        }
        LIZ = System.currentTimeMillis();
        ((C32537Cpp) dataChannel.gv0(C30590BzW.class)).LIZ = r2;
        BriefGameTask briefGameTask = (BriefGameTask) dataChannel.kv0(C30591BzX.class);
        LIZIZ = briefGameTask;
        boolean LIZ2 = LIZ(briefGameTask);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_gamepad_btn_show");
        LIZ3.LJIILLIIL(dataChannel);
        if (C28835BTj.LIZLLL(dataChannel)) {
            str = "ad";
        } else {
            str = "normal";
        }
        LIZ3.LJIJJ(str, "live_traffic_source");
        LIZ3.LJIJJ("live_detail", "page_name");
        LIZ3.LJIJJ("icon", "btn_name");
        LIZ3.LJIJJ(Boolean.valueOf(LIZ2), "attribution");
        LIZ3.LJIJJ(String.valueOf(((C29374Bfu) TTL.LIZJ(LIZ3, "user", "user_type")).getCurrentUserId()), "user_id");
        LIZ3.LJIJJ(String.valueOf(BJM.LJ()), "host_id");
        LIZ3.LJIJJ(String.valueOf(BJM.LJIILJJIL()), "content_id");
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        LIZ3.LJIJJ(Long.valueOf(j), "room_id");
        String str5 = null;
        if (briefGameTask != null && (partnershipTask3 = briefGameTask.task) != null) {
            str5 = partnershipTask3.idStr;
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        LIZ3.LJIJJ(str5, "task_id");
        if (briefGameTask == null || (partnershipTask2 = briefGameTask.task) == null || (str2 = partnershipTask2.idStr) == null) {
            str2 = "";
        }
        LIZ3.LJIJJ(str2, "game_task_id");
        if (briefGameTask == null || (partnershipTask = briefGameTask.task) == null || (str3 = partnershipTask.gameIdStr) == null) {
            str3 = "";
        }
        LIZ3.LJIJJ(str3, "game_id");
        if (briefGameTask != null && (briefGame = briefGameTask.briefGame) != null && (str4 = briefGame.name) != null) {
            str6 = str4;
        }
        LIZ3.LJIJJ(str6, "game_name");
        LIZ3.LJIJJ(dataChannel.kv0(C30118Bru.class), "show_reason");
        LIZ3.LJJIIJZLJL();
    }

    public static void LJI(String str, String source) {
        o.LJIIIZ(source, "source");
        BZI LIZ2 = C28787BRn.LIZ("ttlive_drops_card_change_event");
        LIZ2.LJIJJ(str, "action");
        LIZ2.LJIJJ(source, "load_from");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJ(String str, String sceneType) {
        o.LJIIIZ(sceneType, "sceneType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_toggle_popup_sec_click");
        LIZ2.LJIJJ(str, "click_type");
        LIZ2.LJIJJ(sceneType, "scene_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(DataChannel dataChannel, String str, String str2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_drops_icon_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "event_page");
        LIZ2.LJIJJ(str2, "icon_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel, String str, String iconType) {
        o.LJIIIZ(iconType, "iconType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_drops_icon_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "event_page");
        LIZ2.LJIJJ(iconType, "icon_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIZ(Boolean bool, String str, String errorMsg, Boolean bool2, Boolean bool3) {
        o.LJIIIZ(errorMsg, "errorMsg");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_game_partnership_gecko_check");
        LIZ2.LJIJJ(str, "channel");
        Boolean bool4 = Boolean.TRUE;
        LIZ2.LJIJJ(Integer.valueOf(o.LJ(bool, bool4) ? 1 : 0), "succeed");
        LIZ2.LJIJJ(Integer.valueOf(o.LJ(bool2, bool4) ? 1 : 0), "is_anchor");
        LIZ2.LJIJJ(errorMsg, "error_msg");
        LIZ2.LJIJJ(bool3, "gecko_exist");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJII(boolean z, AudienceRoomInfoResponse.ResponseData responseData, DataChannel dataChannel, long j, Throwable th, int i) {
        long j2 = j;
        AudienceRoomInfoResponse.ResponseData responseData2 = responseData;
        DataChannel dataChannel2 = dataChannel;
        Throwable th2 = null;
        if ((i & 2) != 0) {
            responseData2 = null;
        }
        if ((i & 4) != 0) {
            dataChannel2 = null;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 16) == 0) {
            th2 = th;
        }
        C38995FSd.LIZIZ().submit(new RunnableC30603Bzj(j2, dataChannel2, th2, responseData2, z));
    }
}

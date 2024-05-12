package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BLH {
    public boolean LIZ = true;

    /* JADX WARN: Type inference failed for: r0v138, types: [X.BJL, O] */
    public static void LIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2 = B57.LIZ.LIZ().mEnterRoomConfig;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (dataChannelGlobal.mv0(C29054Bak.class) == null) {
            BLI bli = new BLI();
            bli.LIZ = enterRoomConfig2.mRoomsData.enterMethod;
            bli.LIZIZ = enterRoomConfig.mRoomsData.enterFromMerge;
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            bli.LIZLLL = logData.gdLabel;
            long j = logData.enterRoomId;
            if (j != 0) {
                bli.LIZJ = Long.valueOf(j);
            }
            bli.LJIIL = C08680Vs.LJIILJJIL.LJ();
            bli.LJIILIIL = enterRoomConfig.mRoomsData.openLiveFromDrawerTab;
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            bli.LJIILJJIL = logData2.topLeftRoomLabel;
            bli.LJIILLIIL = logData2.fromEnd;
            bli.LJIIZILJ = logData2.endSourceEnterFromMerge;
            bli.LJIJ = logData2.endSourceEnterMethod;
            bli.LJIJI = logData2.endSourceActionType;
            bli.LJIJJ = logData2.endViewStatus;
            bli.LJIJJLI = logData2.liveEndExit;
            bli.LJFF = logData2.list_item_id;
            bli.LJI = Boolean.valueOf(logData2.isVideoHead);
            bli.LJJIJIIJI = Integer.valueOf(enterRoomConfig.mLogData.isFromList);
            EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
            bli.LJJIJIIJIL = logData3.liveRecommendReason;
            bli.LJ = enterRoomConfig.mRoomsData.actionType;
            bli.LJII = logData3.requestId;
            long j2 = enterRoomConfig2.mRoomsData.smallPictureOrder;
            if (j2 != -1) {
                bli.LJIIIIZZ = Long.valueOf(j2);
            }
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            EnterRoomConfig.GuestUser guestUser = roomsData.guestUser;
            if (guestUser.isGuestEnter == 1) {
                bli.LJIIIZ = "1";
                bli.LJIIJJI = guestUser.distributionType;
            } else {
                bli.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
            }
            EnterRoomConfig.LogData logData4 = enterRoomConfig.mLogData;
            bli.LJIL = logData4.recContentId;
            bli.LJJ = logData4.recContentType;
            bli.LJJI = Long.valueOf(roomsData.firstLabelId);
            bli.LJJIFFI = Long.valueOf(enterRoomConfig.mRoomsData.secondLabelId);
            bli.LJJII = Long.valueOf(enterRoomConfig.mRoomsData.bottomLabelId);
            bli.LJJIII = Long.valueOf(enterRoomConfig.mRoomsData.bottomSubLabelId);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            bli.LJJIIJZLJL = roomsData2.isFromBubble;
            bli.LJJIIZ = roomsData2.isFromCache;
            bli.LJJIIZI = roomsData2.anchorGiftId;
            bli.LJJIJ = enterRoomConfig.mLogData.enterGiftPanelSource;
            HashMap hashMap = new HashMap();
            java.util.Map<String, String> map = enterRoomConfig.mLogData.logMap;
            if (map != null) {
                hashMap.putAll(map);
            }
            EnterRoomConfig.LogData logData5 = enterRoomConfig.mLogData;
            o.LJIIIZ(logData5, "logData");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num = logData5.balanceLiveLine;
            if (num != null) {
                linkedHashMap.put("balance_live_line", String.valueOf(num.intValue()));
            }
            Integer num2 = logData5.balanceLivePosition;
            if (num2 != null) {
                linkedHashMap.put("balance_live_position", String.valueOf(num2.intValue()));
            }
            linkedHashMap.put("card_position", String.valueOf(logData5.cardPosition));
            linkedHashMap.put("follow_status", String.valueOf(logData5.follow_status));
            linkedHashMap.put("inner_push_type", String.valueOf(logData5.innerPushType));
            linkedHashMap.put("isFromList", String.valueOf(logData5.isFromList));
            Integer num3 = logData5.isConsumeNewUser;
            if (num3 != null) {
                linkedHashMap.put("is_consume_new_user", String.valueOf(num3.intValue()));
            }
            Integer num4 = logData5.isFirstRecharge;
            if (num4 != null) {
                linkedHashMap.put("is_first_recharge", String.valueOf(num4.intValue()));
            }
            linkedHashMap.put("live_reason", String.valueOf(logData5.liveReason));
            linkedHashMap.put("log_pb", String.valueOf(logData5.logPb));
            linkedHashMap.put("magic3ActivityId", String.valueOf(logData5.magic3_activity_id));
            linkedHashMap.put("magic3Comptype", String.valueOf(logData5.magic3_comptype));
            linkedHashMap.put("magic3_source", String.valueOf(logData5.magic3_source));
            Integer num5 = logData5.rechargePackage;
            if (num5 != null) {
                linkedHashMap.put("recharge_package", String.valueOf(num5.intValue()));
            }
            String str = logData5.rechargeType;
            if (str != null) {
                linkedHashMap.put("recharge_type", str);
            }
            linkedHashMap.put("recommendType", String.valueOf(logData5.liveRecommendReason));
            linkedHashMap.put("search_id", String.valueOf(logData5.search_id));
            linkedHashMap.put("search_keyword", String.valueOf(logData5.search_keyword));
            linkedHashMap.put("search_result_id", String.valueOf(logData5.search_result_id));
            linkedHashMap.put("search_result_type", String.valueOf(logData5.search_result_type));
            linkedHashMap.put("search_type", String.valueOf(logData5.search_type));
            linkedHashMap.put("source", String.valueOf(logData5.enterLiveModule));
            String str2 = logData5.subGameRank;
            if (str2 != null) {
                linkedHashMap.put("sub_rank_game_name", str2);
            }
            linkedHashMap.put("superior_page_from", String.valueOf(logData5.superiorPageFrom));
            linkedHashMap.put("top_message_type", String.valueOf(logData5.logTopMessageType));
            linkedHashMap.put("toplive_position", String.valueOf(logData5.toplivePosition));
            linkedHashMap.put("video_id", String.valueOf(logData5.videoId));
            hashMap.putAll(linkedHashMap);
            bli.LJJIJIL = hashMap;
            if (C28835BTj.LJ(enterRoomConfig)) {
                bli.LJJIIJ = enterRoomConfig.mRoomsData.adLiveEnterRoomConfig;
            }
            if ("follow_widget".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                bli.LJJIJL = roomsData3.widgetType;
                bli.LJJIJLIJ = Integer.valueOf(roomsData3.widgetAnchorNum);
                bli.LJJIL = Integer.valueOf(enterRoomConfig.mRoomsData.anchorPosition);
            }
            if ("homepage_live".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
                bli.LJJIZ = Integer.valueOf(Boolean.TRUE.equals(enterRoomConfig.mLogData.isAutoEnter) ? 1 : 0);
            }
            String str3 = bli.LIZ;
            String str4 = bli.LIZIZ;
            Long l = bli.LIZJ;
            String str5 = bli.LIZLLL;
            String str6 = bli.LJ;
            String str7 = bli.LJFF;
            Boolean bool = bli.LJI;
            String str8 = bli.LJII;
            Long l2 = bli.LJIIIIZZ;
            String str9 = bli.LJIIJJI;
            String str10 = bli.LJIIIZ;
            Integer num6 = bli.LJJIJIIJI;
            String str11 = bli.LJJIJIIJIL;
            long j3 = bli.LJIIL;
            String str12 = bli.LJIILIIL;
            String str13 = bli.LJIILJJIL;
            int i = bli.LJIILL;
            int i2 = bli.LJIILLIIL;
            String str14 = bli.LJIIZILJ;
            String str15 = bli.LJIJ;
            String str16 = bli.LJIJI;
            String str17 = bli.LJIJJ;
            String str18 = bli.LJIJJLI;
            String str19 = bli.LJIL;
            String str20 = bli.LJJ;
            Long l3 = bli.LJJI;
            Long l4 = bli.LJJIFFI;
            Long l5 = bli.LJJII;
            Long l6 = bli.LJJIII;
            AdLiveEnterRoomConfig adLiveEnterRoomConfig = bli.LJJIIJ;
            ((C32537Cpp) dataChannelGlobal.gv0(C29054Bak.class)).LIZ = new BJL(str3, str4, l, str5, str6, str7, bool, str8, l2, str10, str9, str19, str20, l3, l4, l5, l6, bli.LJIIJ, j3, str12, str13, Integer.valueOf(i2), str14, str15, str16, str17, str18, i, adLiveEnterRoomConfig, bli.LJJIIJZLJL, bli.LJJIIZ, num6, str11, bli.LJJIIZI, bli.LJJIJ, bli.LJJIJIL, bli.LJJIJL, bli.LJJIJLIJ, bli.LJJIZ, bli.LJJIL, 1048576, 0);
        }
    }

    public static void LIZJ(EnterRoomConfig enterRoomConfig, String str) {
        String str2;
        Object obj;
        Object obj2;
        String str3;
        BJL bjl;
        BJE bje;
        BJE bje2;
        String str4 = enterRoomConfig.mLogData.requestId;
        if (TextUtils.isEmpty(str4)) {
            str4 = enterRoomConfig.mLogData.requestId;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str5 = logData.logPb;
        long j = enterRoomConfig.mRoomsData.roomId;
        String str6 = logData.anchorId;
        String LJIIZILJ = BJM.LJIIZILJ();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str7 = roomsData.sourceType;
        String str8 = roomsData.sceneId;
        HashMap hashMap = new HashMap();
        C43881HKb.LIZJ(j, hashMap, "room_id", "anchor_id", str6);
        Long valueOf = Long.valueOf(j);
        C28246B6s LIZIZ = BJN.LIZIZ();
        if (LIZIZ != null && (bje2 = LIZIZ.LJ) != null) {
            bje2.LJ = valueOf;
        }
        Long valueOf2 = Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        C28246B6s LIZIZ2 = BJN.LIZIZ();
        if (LIZIZ2 != null && (bje = LIZIZ2.LJ) != null) {
            bje.LJFF = valueOf2;
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        String str9 = roomsData2.enterFromMerge;
        String str10 = roomsData2.enterMethod;
        hashMap.put("request_id", str4);
        hashMap.put("log_pb", str5);
        hashMap.put("action_type", str);
        hashMap.put("enter_from_merge", str9);
        hashMap.put("enter_method", str10);
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("moment_room_source", str7);
        }
        if (!TextUtils.isEmpty(str8) && "draw".equals(str)) {
            hashMap.put("scene_id", str8);
        }
        boolean equals = "draw".equals(str);
        String str11 = CardStruct.IStatusCode.DEFAULT;
        if (equals) {
            hashMap.put("orientation", CardStruct.IStatusCode.DEFAULT);
        }
        if (!C38354F3m.LJ(enterRoomConfig.mRoomsData.windowMode)) {
            hashMap.put("live_window_mode", enterRoomConfig.mRoomsData.windowMode);
        }
        String LJIIIZ = BJM.LJIIIZ();
        if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        long j2 = enterRoomConfig.mRoomsData.smallPictureOrder;
        if (j2 != -1) {
            hashMap.put("small_picture_order", String.valueOf(j2));
        }
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s == null || (bjl = c28246B6s.LJFF) == null || (str2 = bjl.LJFF) == null) {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("list_item_id", String.valueOf(j));
        }
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            hashMap.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
        }
        if (!C38354F3m.LJ(enterRoomConfig.mRoomsData.followStatus)) {
            hashMap.put("follow_status", enterRoomConfig.mRoomsData.followStatus);
            hashMap.put("initial_follow_status", enterRoomConfig.mRoomsData.followStatus);
        }
        if (enterRoomConfig.mRoomsData.isBackPreRoom) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_return", obj);
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        if (roomsData3.isShowFlare) {
            hashMap.put("task_id", roomsData3.flareTaskId);
        }
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        if (eCWrapData != null) {
            HashMap<String, String> hashMap2 = eCWrapData.ecCommonExtraParam;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            String str12 = enterRoomConfig.mECData.ecRecommendInfo;
            if (str12 != null) {
                hashMap.put("ecom_live_rcmd_info", str12);
            }
        }
        java.util.Map<String, String> map = enterRoomConfig.mRoomsData.gameLiveExtra;
        if (map != null && map.get("tag_name") != null) {
            hashMap.put("live_game_name", enterRoomConfig.mRoomsData.gameLiveExtra.get("tag_name"));
        }
        long j3 = enterRoomConfig.mLogData.cardRoomId;
        if (j3 > 0) {
            hashMap.put("card_room_id", String.valueOf(j3));
        }
        if (enterRoomConfig.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
            hashMap.put("from_room_id", String.valueOf(enterRoomConfig.mLogData.fromRoomId));
        }
        if (!"-1".equals(enterRoomConfig.mLogData.drawAction) || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
            hashMap.put("draw_action", enterRoomConfig.mLogData.drawAction);
        }
        hashMap.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
        hashMap.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
        boolean LIZ = C28533BHt.LIZ(enterRoomConfig.mLogData.toggleStatus);
        Boolean bool = enterRoomConfig.mRoomsData.hasCommerceGoods;
        if (bool != null) {
            if (bool.booleanValue()) {
                hashMap.put("is_ecom", "1");
            } else {
                hashMap.put("is_ecom", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (enterRoomConfig.mRoomsData.isFresh) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_fresh", obj2);
        if (C15380j0.LJIILLIIL()) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        hashMap.put("room_orientation", str3);
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap.putAll(BJB.LIZ());
        C28837BTl LJIIIIZZ = C28835BTj.LJIIIIZZ(enterRoomConfig);
        BZI LIZ2 = C28787BRn.LIZ("live_show");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(LJIIIIZZ);
        LIZ2.LJIIJJI("");
        LIZ2.LJIIIZ("live_view");
        LIZ2.LJIIL("core");
        LIZ2.LJIIJ(LJIIZILJ);
        if (LIZ) {
            str11 = "1";
        }
        LIZ2.LJIJJ(str11, "is_gaming_toggle");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(EnterRoomConfig enterRoomConfig, String str, long j, String str2) {
        if (enterRoomConfig == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = enterRoomConfig.mRoomsData.userId;
        }
        if (j == 0) {
            j = enterRoomConfig.mRoomsData.roomId;
        }
        if (TextUtils.equals(BJM.LJIIIIZZ(), "push")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_push_error");
            BAK bak = new BAK();
            bak.LIZ("anchor_id", str);
            bak.LIZ("anchor_status", str2);
            bak.LIZ("room_id", String.valueOf(j));
            LIZ.LJJIFFI((java.util.Map) bak.LIZ);
            LIZ.LJJIIJZLJL();
        }
    }
}

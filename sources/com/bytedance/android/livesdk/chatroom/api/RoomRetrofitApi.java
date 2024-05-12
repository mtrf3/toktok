package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73672Svk;
import X.BOH;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EKC;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC36332ENs;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.base.model.roomcomponents.RoomComponentsResponse;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.model.DecorationTextAuditResult;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CheckDetectPermissionResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.debug.GetQuestionnaireContentResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.SubmitResponse;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webcast.api.room.RoomComponentsV2Response;

/* loaded from: classes6.dex */
public interface RoomRetrofitApi {
    @E8M("/webcast/eco/detect/check_permission/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<CheckDetectPermissionResponse>> checkDetectPermission(@InterfaceC64985Pev("user_id") long j);

    @E8L("/webcast/room/collect_unread/")
    AbstractC73672Svk<C28467BFf<Object>> collectUnreadRequest(@InterfaceC64986Pew("unread_extra") String str, @InterfaceC64986Pew("room_ids") String str2);

    @E8L("/webcast/room/continue/")
    AbstractC73672Svk<C28467BFf<ContinueRoomResponse>> continuePreviousRoom();

    @E8M("/webcast/room/create/")
    @InterfaceC195757mF
    AbstractC73672Svk<StartLiveResponse<Room>> createRoom(@InterfaceC36229EJt HashMap<String, String> hashMap);

    @E8L("/hotsoon/room/{roomId}/_deblock_mosaic/")
    AbstractC73672Svk<C28467BFf<Object>> deblockMosaic(@InterfaceC36332ENs("roomId") long j);

    @E8M("/webcast/room/digg/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> digg(@InterfaceC36229EJt HashMap<String, String> hashMap);

    @E8M("/webcast/room/enter/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<Room, EnterRoomExtra>> enterRoom(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("hold_living_room") long j2, @InterfaceC64985Pev("is_login") long j3, @InterfaceC36229EJt HashMap<String, String> hashMap);

    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/info/")
    AbstractC73672Svk<C28467BFf<Room>> fetchRoom(@InterfaceC36228EJs HashMap<String, String> hashMap);

    @E8L("/webcast/room/finish_abnormal/")
    AbstractC73672Svk<C28467BFf<Object>> finishRoomAbnormal(@InterfaceC64986Pew("source") String str);

    @E8L("/webcast/feed/get_live_bubble/")
    AbstractC73672Svk<BaseResponse<LiveBubbleData, LiveBubbleExtra>> getLiveBubble();

    @E8L("/hotsoon/room/follow/ids/")
    InterfaceC37276Ek4<BOH<Long>> getLivingRoomIds();

    @E8M("/webcast/room/mget_info/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Map<String, Room>>> getMultipleRoomInfo(@InterfaceC64985Pev("room_ids") String str);

    @E8M("/webcast/eco/detect/get_questionnaire/")
    AbstractC73672Svk<C28467BFf<GetQuestionnaireContentResponse>> getQuestionnaireContent();

    @E8L("/webcast/room/janus_multi/components/")
    AbstractC73672Svk<C28467BFf<RoomComponentsResponse>> getRoomComponentsNew(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("source") long j3, @InterfaceC64986Pew("need_online_audience") long j4, @InterfaceC64986Pew("need_rankings") long j5, @InterfaceC64986Pew("need_room_pcu") long j6);

    @E8L("/webcast/room/janus_multi/components/v2/")
    AbstractC73672Svk<C28467BFf<RoomComponentsV2Response>> getRoomComponentsV2(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("source") long j3, @InterfaceC64986Pew("need_online_audience") long j4, @InterfaceC64986Pew("need_rankings") long j5, @InterfaceC64986Pew("need_components") long j6, @InterfaceC64986Pew("room_tag") String str, @InterfaceC64986Pew("need_room_pcu") long j7);

    @E8L("/webcast/room/debug_item/")
    AbstractC73672Svk<C28467BFf<List<DebugRoomItem>>> getRoomDebugInfo(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/room/debug_permission/")
    AbstractC73672Svk<C28467BFf<DebugToolState>> getRoomDebugInfoPermission();

    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/info/")
    InterfaceC37276Ek4<C28467BFf<Room>> getRoomStats(@InterfaceC64986Pew("is_anchor") boolean z, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("pack_level") int i);

    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/info/")
    InterfaceC37276Ek4<C28467BFf<Room>> getRoomStats(@InterfaceC64986Pew("is_anchor") boolean z, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("pack_level") int i, @InterfaceC64986Pew("need_health_score_info") boolean z2, @InterfaceC64986Pew("from_type") int i2);

    @E8M("/webcast/room/leave/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> leaveRoom(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("reason") int i);

    @E8L("/webcast/feed/press_live_bubble/")
    AbstractC73672Svk<C28467BFf<Object>> pressLiveBubble(@InterfaceC64986Pew("bubble_room_id") long j, @InterfaceC64986Pew("bubble_owner_id") long j2);

    @E8L("/webcast/room/background_img/delete/")
    AbstractC73672Svk<C28467BFf<Void>> removeRoomBackgroundImg(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2);

    @E8M("/webcast/eco/detect/report/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<SubmitResponse>> reportDetect(@InterfaceC64985Pev("detector_user_id") long j, @InterfaceC64985Pev("action_type") int i, @InterfaceC64985Pev("detect_room_count") int i2);

    @E8M("/webcast/room/decoration/audit_text/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<DecorationTextAuditResult>> sendDecorationText(@InterfaceC36229EJt HashMap<String, String> hashMap);

    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/ping/audience/")
    AbstractC73672Svk<C28467BFf<PingResult>> sendPlayingPing(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("only_status") int i);

    @E8M("/webcast/eco/detect/submit/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<SubmitResponse>> submitDetect(@InterfaceC195727mC m mVar);

    @E8L("/webcast/feed/push/")
    AbstractC73672Svk<C28467BFf<Object>> triggerFeedPush(@InterfaceC64986Pew("scene") String str);

    @E8L("/webcast/room/auditing/apply/")
    AbstractC73672Svk<C28467BFf<Object>> unblockRoom(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/anchor/memorial/memorial_reported/")
    AbstractC73672Svk<C28467BFf<Void>> updateAnchorMemorial(@InterfaceC64986Pew("anchor_id") long j);

    @E8M("/webcast/room/upload/image/")
    AbstractC73672Svk<C28467BFf<CoverImageModel>> uploadImage(@InterfaceC195727mC TypedOutput typedOutput);
}

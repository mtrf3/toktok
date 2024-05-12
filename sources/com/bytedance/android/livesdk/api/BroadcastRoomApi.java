package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.api.model.RoomUpdateInfoResult;
import com.bytedance.android.livesdk.api.model.WaitingReviewInfo;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import com.bytedance.retrofit2.mime.TypedOutput;
import tikcast.api.anchor.GetNewAnchorGuideFeedbackConfigResponse;
import tikcast.api.anchor.GuideFeedbackReportResponse;
import tikcast.api.eco.RulesAndGuidanceResponse;
import tikcast.api.perception.ViolationStatusResponse;
import webcast.api.creator.PreScheduleStream;
import webcast.api.creator.PushStreamInfo;
import webcast.api.room.CppAgeVerifyResponse;
import webcast.api.room.CppSafetyEducationResponse;
import webcast.api.room.MockResponse;

/* loaded from: classes6.dex */
public interface BroadcastRoomApi {
    @E8L("/webcast/eco/rules_and_guidance/")
    AbstractC73672Svk<C28467BFf<RulesAndGuidanceResponse.ResponseData>> checkLiveCenterBubble(@InterfaceC64986Pew("scene") int i);

    @E8L("/webcast/room/anchor_pre_finish/")
    AbstractC73672Svk<C28467BFf<AnchorPreFinishData>> getAnchorPreFinish(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/room/live_permission/apply_info/")
    AbstractC73672Svk<C28467BFf<LivePermissionApplyResponse>> getLivePermissionApply(@InterfaceC64986Pew("permission_names") String str);

    @E8L("/webcast/room/create_info/")
    AbstractC73672Svk<C28467BFf<RoomCreateInfo>> getPreviewRoomCreateInfo(@InterfaceC64986Pew("last_time_hashtag_id") long j);

    @E8L("/webcast/room/auditing/info/")
    AbstractC73672Svk<C28467BFf<WaitingReviewInfo>> getReviewInfo(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/room/push_stream_info/")
    AbstractC73672Svk<C28467BFf<PushStreamInfo>> getStreamInfo();

    @E8M("/webcast/room/mock/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<MockResponse.Data>> mockTryModeRoom(@InterfaceC64985Pev("need_guide_videos") boolean z);

    @E8M("/webcast/room/auto_brighten/")
    AbstractC73672Svk<C28467BFf<Object>> noticeAutoBrighten(@InterfaceC64986Pew("room_id") long j);

    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/live_permission/permission_level_task_finish/")
    AbstractC73672Svk<C28467BFf<Object>> notifyLevelUpTaskFinish(@InterfaceC64986Pew("task_type") int i);

    @E8L("/webcast/room/pre_schedule_stream/")
    AbstractC73672Svk<C28467BFf<PreScheduleStream>> preScheduleStream();

    @E8L("/webcast/live_center/new_anchor/guide_feedback/config/")
    AbstractC73672Svk<GetNewAnchorGuideFeedbackConfigResponse> queryFeedbackConfig();

    @E8M("/webcast/live_center/new_anchor/guide_feedback/report/")
    @InterfaceC195757mF
    AbstractC73672Svk<GuideFeedbackReportResponse> reportGuidanceOrFeedbackShow(@InterfaceC64985Pev("report_type") int i, @InterfaceC64985Pev("message_key") String str, @InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("show_status") int i2);

    @E8L("/webcast/room/cpp/age/verify/")
    AbstractC73672Svk<C28467BFf<CppAgeVerifyResponse.Data>> requestAgeVerify();

    @E8L("/webcast/room/cpp/safety/education/")
    AbstractC73672Svk<C28467BFf<CppSafetyEducationResponse.Data>> requestSafetyEducation();

    @E8L("/webcast/perception/violation/status/")
    AbstractC73672Svk<C28467BFf<ViolationStatusResponse.ResponseData>> requestViolation(@InterfaceC64986Pew("scene") int i);

    @E8M("/webcast/room/video/capture/")
    AbstractC73672Svk<C28467BFf<Object>> updateCaptureVideo(@InterfaceC195727mC TypedOutput typedOutput);

    @E8M("/webcast/room/update_room_info/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<RoomUpdateInfoResult>> updateRoomInfo(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("cover_uri") String str);

    @E8M("/webcast/review/upload_original_frame")
    AbstractC73672Svk<C28467BFf<CoverImageModel>> uploadOriginScreen(@InterfaceC195727mC TypedOutput typedOutput, @InterfaceC64986Pew("room_id") Long l, @InterfaceC64986Pew("event_scene") int i);
}

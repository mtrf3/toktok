package com.bytedance.android.livesdk.game.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC30951CCt;
import X.InterfaceC30952CCu;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.game.model.AnchorPartnershipInfoResponse;
import com.bytedance.android.livesdk.game.model.AnchorTasksResponse;
import com.bytedance.android.livesdk.game.model.PartnershipDownloadResponse;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.m;
import java.util.Map;
import webcast.api.partnership.AnchorEventsResponse;
import webcast.api.partnership.AnchorInfoResponse;
import webcast.api.partnership.AnchorRoomInfoResponse;
import webcast.api.partnership.AnchorToggleInfoResponse;
import webcast.api.partnership.ChangeBusinessStatusResponse;
import webcast.api.partnership.DropsDetailResponse;
import webcast.api.partnership.DropsListResponse;
import webcast.api.partnership.DropsReportResponse;
import webcast.api.partnership.GetDropsStatusResponse;
import webcast.api.partnership.UserInfoResponse;

/* loaded from: classes6.dex */
public interface GameLivePartnershipRetrofitApi {
    @E8M("/webcast/partnership/change_business_status/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<ChangeBusinessStatusResponse>> addGamePartnershipBusinessStatus(@InterfaceC64985Pev("action") int i);

    @E8M("/webcast/partnership/drops_report/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<DropsReportResponse>> dropsTaskReport(@InterfaceC64985Pev("drops_id") String str, @InterfaceC64985Pev("round") int i, @InterfaceC64985Pev("anchor_id") String str2, @InterfaceC64985Pev("room_id") String str3, @InterfaceC64985Pev("status") int i2);

    @E8L("/webcast/partnership/anchor_info/")
    AbstractC73672Svk<C28467BFf<AnchorInfoResponse.ResponseData>> fetchPartnershipAnchorInfo(@InterfaceC64986Pew("game_tag_id") long j);

    @E8M("/game_station/ttcm/download/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<PartnershipDownloadResponse>> gameTtcmDownload(@InterfaceC64985Pev("scene") String str, @InterfaceC64985Pev("src_id") String str2, @InterfaceC64985Pev("site_id") String str3, @InterfaceC64985Pev("game_id") String str4, @InterfaceC64985Pev("ad_id") String str5, @InterfaceC64985Pev("ua") String str6);

    @E8L
    InterfaceC37276Ek4<TypedInput> performGet(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC30952CCu Map<String, String> map2, @InterfaceC30951CCt boolean z);

    @E8M("/webcast/partnership/change_business_status/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<C28467BFf<ChangeBusinessStatusResponse>> removeGamePartnershipBusinessStatus(@InterfaceC64985Pev("action") int i);

    @E8L("webcast/partnership/anchor_room_info")
    AbstractC73672Svk<C28467BFf<AnchorRoomInfoResponse.ResponseData>> requestAnchorRoomInfo(@InterfaceC64986Pew("room_id") String str);

    @E8L("/webcast/partnership/anchor_toggle_info")
    AbstractC73672Svk<C28467BFf<AnchorToggleInfoResponse.ResponseData>> requestAnchorToggleInfo(@InterfaceC64986Pew("game_tag_id") long j, @InterfaceC64986Pew("live_mode") int i);

    @E8L("/webcast/partnership/audience_room_info")
    AbstractC73672Svk<C28467BFf<m>> requestAudienceRoomInfo(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("anchor_uid") String str2, @InterfaceC64986Pew("ad_id") String str3, @InterfaceC64986Pew("ua") String str4);

    @E8L("/webcast/partnership/drops_detail/")
    AbstractC73672Svk<C28467BFf<DropsDetailResponse.ResponseData>> requestDropsDetail(@InterfaceC64986Pew("drops_id") String str);

    @E8L("/webcast/partnership/drops_list/")
    AbstractC73672Svk<C28467BFf<DropsListResponse.ResponseData>> requestDropsList(@InterfaceC64986Pew("drop_mode") int i);

    @E8L("/webcast/partnership/get_drops_status/")
    AbstractC73672Svk<C28467BFf<GetDropsStatusResponse.ResponseData>> requestDropsStartStatus(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("anchor_id") String str2);

    @E8L("/webcast/partnership/anchor_events/")
    AbstractC73672Svk<C28467BFf<AnchorEventsResponse.ResponseData>> requestEventInfo(@InterfaceC64986Pew("event_mode") int i);

    @E8L("/webcast/partnership/partnership_info/")
    AbstractC73672Svk<C28467BFf<AnchorPartnershipInfoResponse>> requestGetAnchorPartnershipInfo();

    @E8L("/webcast/partnership/anchor_tasks/")
    AbstractC73638SvC<C28467BFf<AnchorTasksResponse>> requestGetAnchorTasks(@InterfaceC64986Pew("status_filter") long j);

    @E8L("/webcast/partnership/audience_room_tasks/")
    AbstractC73638SvC<C28467BFf<m>> requestGetAudienceTasks(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/partnership/task_detail/")
    AbstractC73672Svk<C28467BFf<m>> requestTaskDetail(@InterfaceC64986Pew("task_id") String str, @InterfaceC64986Pew("user_type") int i, @InterfaceC64986Pew("anchor_id") String str2, @InterfaceC64986Pew("room_id") String str3, @InterfaceC64986Pew("ad_id") String str4);

    @E8L("/webcast/partnership/user_info/")
    AbstractC73672Svk<C28467BFf<UserInfoResponse.ResponseData>> requestUserInfo();

    @E8M("/webcast/partnership/download/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<PartnershipDownloadResponse>> sendClickDownloadEvent(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("audience_uid") long j2, @InterfaceC64985Pev("game_id") long j3, @InterfaceC64985Pev("task_id") String str, @InterfaceC64985Pev("ad_id") String str2, @InterfaceC64985Pev("did") String str3, @InterfaceC64985Pev("anchor_id") String str4, @InterfaceC64985Pev("platform") String str5, @InterfaceC64985Pev("scene") String str6);
}

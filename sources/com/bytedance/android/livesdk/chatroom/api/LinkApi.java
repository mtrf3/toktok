package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC30952CCu;
import X.InterfaceC36228EJs;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.liveinteract.multilive.model.ActivityBannerResponse;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.MultiGuestAnchorPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.LinkmicSettingResult;
import java.util.Map;

/* loaded from: classes14.dex */
public interface LinkApi {
    @E8L("/webcast/linkmic_multi_guest/host_permission/")
    AbstractC73638SvC<BaseResponse<MultiGuestAnchorPermissionResponse, CheckPermissionExtra>> checkAnchorSelfPermission(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("app_id") long j2, @InterfaceC64986Pew("live_id") long j3);

    @E8L("/webcast/linkmic_multi_guest/audience_permission/")
    AbstractC73638SvC<BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra>> checkAudienceSelfPermission(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("app_id") long j2, @InterfaceC64986Pew("live_id") long j3);

    @E8L("/webcast/linkmic_multi_guest/host_check_other_audience_permission/")
    AbstractC73638SvC<HostCheckOtherAudienceMultiGuestPermissionResponse> checkOthersPermission(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("app_id") long j2, @InterfaceC64986Pew("live_id") long j3, @InterfaceC64986Pew("check_user_id") long j4, @InterfaceC64986Pew("scene") int i);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/check_permission/")
    AbstractC73672Svk<C28467BFf<CheckPermissionResponse>> checkPermissionV3(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("record_multi_type_room") boolean z, @InterfaceC30952CCu Map<String, String> map);

    @E8M("/webcast/linkmic_multi_guest/fan_ticket_ranklist/")
    AbstractC73638SvC<FanTicketRanklistResponse> getFanTicketRankList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("guest_user_id") long j2, @InterfaceC64986Pew("anchor_id") long j3, @InterfaceC64986Pew("channel_id") long j4, @InterfaceC64986Pew("linkmic_id") String str, @InterfaceC64986Pew("show_id") String str2);

    @E8L("/webcast/linkmic_multi_guest/get_guest_setting/")
    AbstractC73638SvC<GetGuestSettingResponse> getGuestSetting();

    @E8L("/webcast/linkmic_multi_guest/activity_banner/")
    AbstractC73638SvC<C28467BFf<ActivityBannerResponse.ResponseData>> getMultiGuestActivityInfo(@InterfaceC64986Pew("activity_name") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic_multi_guest/get_settings/")
    AbstractC73672Svk<C28467BFf<LinkmicSettingResult>> isShowGuestLinkHint(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("owner_id") long j2, @InterfaceC64986Pew("sec_owner_id") String str, @InterfaceC64986Pew("get_ab_params") boolean z);

    @E8M("/webcast/linkmic_multi_guest/reserve/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73638SvC<C28467BFf<MultiGuestReserveResponse.ResponseData>> reserve(@InterfaceC64985Pev("scene") int i, @InterfaceC64985Pev("app_id") long j, @InterfaceC64985Pev("live_id") long j2, @InterfaceC64985Pev("from_user_id") long j3, @InterfaceC64985Pev("to_user_id") long j4, @InterfaceC64985Pev("room_id") long j5, @InterfaceC64985Pev("type") int i2, @InterfaceC64985Pev("auto_follow") boolean z);

    @E8L("/webcast/linkmic_multi_guest/update_guest_setting/")
    AbstractC73638SvC<UpdateGuestSettingResponse> updateGuestSetting(@InterfaceC36228EJs Map<String, String> map);
}

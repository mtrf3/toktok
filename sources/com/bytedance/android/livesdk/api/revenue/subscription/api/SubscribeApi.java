package com.bytedance.android.livesdk.api.revenue.subscription.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC30949CCr;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.wallet.base.subscribe.CreateGiftSubContractResult;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.GetSubTimerDetailResponse;
import com.bytedance.android.livesdk.subscribe.model.UpdateTimerResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.GetInvitationStatusResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationListData;
import com.bytedance.android.livesdk.subscribe.model.paypal.PaypalBindingUrl;
import com.google.gson.m;
import emotes.model.SubEmoteDetailResult;
import java.util.Map;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.sub.GetAnchorSubscriptionResponse;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.GiftSubTemplateListData;
import webcast.api.sub.ImageConvertResponse;
import webcast.api.sub.SpotlightResponse;
import webcast.api.sub.SubManagementResponse;

/* loaded from: classes6.dex */
public interface SubscribeApi {
    @E8L("/webcast/sub/privilege/polling_timer_align/")
    AbstractC73672Svk<C28467BFf<m>> alignSubathonTimer(@InterfaceC64986Pew("room_id") Long l);

    @E8M("/webcast/sub/gift/contract_create/")
    AbstractC73672Svk<C28467BFf<CreateGiftSubContractResult>> createSubGiftContract(@InterfaceC64986Pew("to_uid") String str, @InterfaceC64986Pew("tpl_id") String str2, @InterfaceC64986Pew("device_tz") String str3, @InterfaceC64986Pew("room_id") String str4, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("order_source") int i2);

    @E8L("/webcast/sub/anchor/subscription/management")
    AbstractC73672Svk<C28467BFf<GetAnchorSubscriptionResponse.Data>> getAnchorSubscriptionInfo(@InterfaceC64986Pew("room_id") String str);

    @E8L("/webcast/sub/anchor/tools/management/")
    AbstractC73672Svk<C28467BFf<SubManagementResponse.Data>> getAnchorSubscriptionManagement(@InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/sub/privilege/get_sub_emote_detail/")
    AbstractC73672Svk<C28467BFf<SubEmoteDetailResult>> getEmotesDetail(@InterfaceC64986Pew("for_anchor") boolean z, @InterfaceC64986Pew("sec_anchor_id") String str);

    @E8L("webcast/sub/invitation/get_invitation_status/")
    AbstractC73672Svk<C28467BFf<GetInvitationStatusResponse>> getInvitationState(@InterfaceC64986Pew("invitation_code") String str);

    @E8L("/webcast/sub/invitation/get_invitation_list/")
    AbstractC73672Svk<C28467BFf<SubInvitationListData>> getInviterList(@InterfaceC64986Pew("count") int i);

    @E8L("/webcast/sub/pay/binding_url")
    AbstractC73672Svk<C28467BFf<PaypalBindingUrl>> getPaypalBindingUrl(@InterfaceC64986Pew("return_url") String str);

    @E8L("/webcast/wallet_api_tiktok/periodic_payout_onboarding/")
    AbstractC73672Svk<C28467BFf<PayoutOnboardingDetailResult.Data>> getPeriodicPayoutOnboarding(@InterfaceC64986Pew("source") int i);

    @E8L("/webcast/api/money/payout_onboarding/v2/onboarding_detail/")
    AbstractC73672Svk<C28467BFf<PayoutOnboardingDetailResult.Data>> getPeriodicPayoutOnboardingNew(@InterfaceC64986Pew("business_line") String str);

    @E8L("/webcast/sub/privilege/spotlight/")
    AbstractC73672Svk<C28467BFf<SpotlightResponse.ResponseData>> getSpotlightInfo(@InterfaceC64986Pew("anchor_id") Long l);

    @E8L("/webcast/sub/gift/tpl_list/")
    AbstractC73672Svk<C28467BFf<GiftSubTemplateListData>> getSubGiftTemplateInfo(@InterfaceC64986Pew("to_uid") String str);

    @E8L("/webcast/sub/privilege/get_sub_privilege_detail")
    AbstractC73672Svk<C28467BFf<m>> getSubPrivilegeDetail(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("sec_anchor_id") String str2, @InterfaceC64986Pew("benefit_scene") int i);

    @E8L("/webcast/sub/privilege/get_sub_privilege_detail")
    AbstractC73672Svk<C28467BFf<GetSubPrivilegeDetailResponse.Data>> getSubPrivilegeDetailSpecific(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("sec_anchor_id") String str2, @InterfaceC64986Pew("benefit_scene") int i);

    @E8L("/webcast/sub/contract/tpl_list/")
    AbstractC73672Svk<C28467BFf<m>> getSubTemplateList(@InterfaceC64986Pew("to_uid") String str);

    @E8L("/webcast/sub/privilege/get_sub_timer_detail/")
    AbstractC73672Svk<C28467BFf<GetSubTimerDetailResponse.Data>> getSubathonTimer(@InterfaceC64986Pew("for_anchor") boolean z, @InterfaceC64986Pew("sec_anchor_id") String str);

    @E8L("/webcast/sub/privilege/get_sub_info/")
    AbstractC73672Svk<C28467BFf<GetSubInfoResponse>> getSubscribeInfo(@InterfaceC64986Pew("need_current_state") boolean z, @InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("need_entrance_data") boolean z2, @InterfaceC64986Pew("source") String str2);

    @E8L("/webcast/sub/user/info/")
    AbstractC73672Svk<C28467BFf<SubscribeUserInfoResponse>> getUserInfo(@InterfaceC64986Pew("anchor_id") String str);

    @E8M("/webcast/room/preview_time/report/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("preview_time_ms") long j2);

    @E8L("/webcast/sub/image/convert/")
    InterfaceC37276Ek4<C28467BFf<ImageConvertResponse.Data>> subImageConvert(@InterfaceC64986Pew("uris") String str);

    @E8M("/webcast/sub/anchor/unpin/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> unpinExplainCard(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("unpin_id") long j2, @InterfaceC64985Pev("type") int i, @InterfaceC64985Pev("sec_anchor_id") String str);

    @E8M("/webcast/sub/invitation/update_invitee_status/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> updateInviteeState(@InterfaceC64985Pev("op_type") int i, @InterfaceC64985Pev("invitation_code") String str);

    @E8M("/webcast/sub/privilege/spotlight/update/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<SpotlightResponse.ResponseData>> updateSpotlight(@InterfaceC195727mC Map<String, Object> map);

    @E8M("/webcast/sub/privilege/update_timer/")
    AbstractC73672Svk<C28467BFf<UpdateTimerResponse.Data>> updateSubathonTimer(@InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("timer_id") long j, @InterfaceC64986Pew("title") String str, @InterfaceC64986Pew("op_type") InterfaceC30949CCr interfaceC30949CCr, @InterfaceC64986Pew("sticker_x") long j2, @InterfaceC64986Pew("sticker_y") long j3, @InterfaceC64986Pew("screen_w") long j4, @InterfaceC64986Pew("screen_h") long j5, @InterfaceC64986Pew("room_id") Long l);

    @E8M("/webcast/sub/privilege/update_timer/")
    AbstractC73672Svk<C28467BFf<UpdateTimerResponse.Data>> updateSubathonTimerPosition(@InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("timer_id") long j, @InterfaceC64986Pew("sticker_x") long j2, @InterfaceC64986Pew("sticker_y") long j3, @InterfaceC64986Pew("screen_w") long j4, @InterfaceC64986Pew("screen_h") long j5, @InterfaceC64986Pew("room_id") Long l);

    @E8M("/webcast/sub/privilege/update_timer/")
    AbstractC73672Svk<C28467BFf<UpdateTimerResponse.Data>> updateSubathonTimerStatus(@InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("timer_id") long j, @InterfaceC64986Pew("op_type") @InterfaceC30949CCr int i2, @InterfaceC64986Pew("room_id") Long l);
}

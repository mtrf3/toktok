package com.ss.android.ugc.aweme.im.sdk.common.data.api;

import X.AbstractC73635Sv9;
import X.AbstractC73672Svk;
import X.E4T;
import X.E8L;
import X.InterfaceC195787mI;
import X.InterfaceC27211Am7;
import X.InterfaceC36226EJq;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CallbackLinkResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatusResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteAcceptResponse;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ConversationContentResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.PublicResourceRequest;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.PublicResourceResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetRequest;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetResponse;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.WelcomeMsgEnabledResponse;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInviteInfoModel;

/* loaded from: classes2.dex */
public interface TikTokImApi {
    @InterfaceC195787mI
    @E4T("im/chat_invite/accept/")
    Object acceptChatInvite(@InterfaceC64987Pex("long_url") String str, @InterfaceC64987Pex("user_id") long j, InterfaceC67352kd<? super ChatInviteAcceptResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/group/invite/accept/")
    Object acceptInviteCard(@InterfaceC64987Pex("invite_id") String str, InterfaceC67352kd<? super AcceptInviteCardResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/group/invite/accept/")
    AbstractC73672Svk<AcceptInviteCardResponse> acceptInviteCardLegacy(@InterfaceC64987Pex("invite_id") String str);

    @InterfaceC195787mI
    @E4T("im/chat/notice/ack/")
    Object acknowledgeNoticeRead(@InterfaceC64987Pex("notice_code") String str, @InterfaceC64987Pex("source_type") String str2, @InterfaceC64987Pex("operation_code") int i, @InterfaceC64987Pex("conversation_id") String str3, @InterfaceC64987Pex("payload") String str4, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/im/chat/ba_open/")
    Object baChatOpen(@InterfaceC64987Pex("ba_uid") String str, @InterfaceC64989Pez("has_welcome_msg") boolean z, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/comment/status/batch_get/v1")
    AbstractC73635Sv9<CommentStatusResponse> getCommentStatusBatch(@InterfaceC64989Pez("cids") String str);

    @E8L("im/group/get_content_by_action/")
    Object getConversationContent(@InterfaceC64989Pez("action") String str, @InterfaceC64989Pez("inbox_type") int i, @InterfaceC64989Pez("conversation_type") int i2, @InterfaceC64989Pez("conversation_short_id") long j, InterfaceC67352kd<? super ConversationContentResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/group/invite/share/")
    Object getGroupInviteInfo(@InterfaceC64987Pex("conversation_short_id") String str, InterfaceC67352kd<? super GroupInviteInfoModel> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/group/invite/verify/")
    Object getInviteCardDetailInner(@InterfaceC64987Pex("invite_id") String str, InterfaceC67352kd<? super InviteCardDetailInnerResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/group/invite/verify/")
    AbstractC73672Svk<InviteCardDetailInnerResponse> getInviteCardDetailInnerLegacy(@InterfaceC64987Pex("invite_id") String str);

    @E8L("/tiktok/v1/ba/welcome_message/enabled/")
    Object getIsWelcomeMessageEnabled(@InterfaceC64989Pez("to_user_id") String str, @InterfaceC64989Pez("sec_to_user_id") String str2, InterfaceC67352kd<? super WelcomeMsgEnabledResponse> interfaceC67352kd);

    @E8L("im/spotlight/multi_relation/")
    Object getSharePermissionForTTNContent(@InterfaceC64989Pez("sec_to_user_id") String str, @InterfaceC64989Pez("scene") String str2, InterfaceC67352kd<? super ShareStateResponse> interfaceC67352kd);

    @E8L("im/chat/notice")
    Object getTopChatNotice(@InterfaceC64989Pez("to_user_id") String str, @InterfaceC64989Pez("sec_to_user_id") String str2, @InterfaceC64989Pez("conversation_id") String str3, @InterfaceC64989Pez("source_type") String str4, @InterfaceC64989Pez("unread_count") int i, @InterfaceC64989Pez("push_status") int i2, @InterfaceC64989Pez("has_chat_history") boolean z, @InterfaceC64989Pez("app_status") int i3, @InterfaceC64989Pez("has_ack_activity_status") boolean z2, @InterfaceC64989Pez("is_recommended_chat") boolean z3, InterfaceC67352kd<? super ImChatTopTipModel> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/inbox/entrance_update")
    Object inboxEntranceUpdate(@InterfaceC64987Pex("scene") int i, @InterfaceC64987Pex("operation") int i2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("/tiktok/v1/im/chat/msg_template/callback")
    Object performMsgTemplateCallback(@InterfaceC64987Pex("params") String str, @InterfaceC64987Pex("template_msg_id") long j, @InterfaceC64987Pex("conversation_id") String str2, InterfaceC67352kd<? super CallbackLinkResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/chat/stranger/unlimit")
    AbstractC73672Svk<BaseResponse> postChatStrangeUnLimit(@InterfaceC64987Pex("to_user_id") String str, @InterfaceC64987Pex("sec_to_user_id") String str2, @InterfaceC64987Pex("conversation_id") String str3, @InterfaceC64987Pex("request_type") int i, @InterfaceC64987Pex("set_category") Integer num);

    @InterfaceC195787mI
    @E4T("videos/detail/")
    Object queryAwemeList(@InterfaceC64987Pex("aweme_ids") String str, @InterfaceC64987Pex("origin_type") String str2, @InterfaceC64987Pex("request_source") int i, InterfaceC67352kd<? super AwemeDetailList> interfaceC67352kd);

    @E4T("im/public/resource/refresh")
    AbstractC73672Svk<PublicResourceResponse> refreshPublicResources(@InterfaceC27211Am7 PublicResourceRequest publicResourceRequest);

    @InterfaceC195787mI
    @E4T("im/chat/open_on_bizscene")
    Object reportOpenOnBusinessScene(@InterfaceC64987Pex("to_uid") long j, @InterfaceC64987Pex("scene") String str, @InterfaceC64987Pex("business_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("im/chat_invite/share/")
    Object shareChatInvite(@InterfaceC64987Pex("user_id") long j, @InterfaceC64987Pex("extra") String str, InterfaceC67352kd<? super ChatInviteShareResponse> interfaceC67352kd);

    @InterfaceC36226EJq({"Content-Type: application/json"})
    @E4T("im/inbox_data/get/")
    Object updateConversationProperties(@InterfaceC27211Am7 TiktokV1ImInboxDataGetRequest tiktokV1ImInboxDataGetRequest, InterfaceC67352kd<? super TiktokV1ImInboxDataGetResponse> interfaceC67352kd);
}

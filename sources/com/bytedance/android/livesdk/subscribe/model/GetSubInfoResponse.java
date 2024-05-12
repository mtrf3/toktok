package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.AnchorEmailInfo;
import com.bytedance.android.livesdk.chatroom.api.C2CTransformationPageInfo;
import com.bytedance.android.livesdk.chatroom.api.CommunityIDInfo;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.PriceTierInfo;
import com.bytedance.android.livesdk.chatroom.api.ShareInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api.ToolsInfo;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import com.bytedance.android.livesdk.subscribe.model.goal.SubGoalInfo;
import com.bytedance.android.livesdk.subscribe.model.invite.SubAvailable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEntrance;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationEntrance;

/* loaded from: classes6.dex */
public final class GetSubInfoResponse {

    @InterfaceC65349Pkn("anchor_email_info")
    public AnchorEmailInfo anchorEmailInfo;

    @InterfaceC65349Pkn("anchor_gift_sub_auth")
    public boolean anchorGiftSubAuth;

    @InterfaceC65349Pkn("banner")
    public SubLiveBanner banner;

    @InterfaceC65349Pkn("bubble_info")
    public BubbleInfo bubbleInfo;

    @InterfaceC65349Pkn("c2c_period")
    public int c2cPeriod;

    @InterfaceC65349Pkn("c2c_trans_available")
    public boolean c2cTransAvailable;

    @InterfaceC65349Pkn("c2c_trans_page_info")
    public C2CTransformationPageInfo c2cTransPageInfo;

    @InterfaceC65349Pkn("c2c_trans_status")
    public long c2cTransStatus;

    @InterfaceC65349Pkn("community_id_info")
    public CommunityIDInfo communityIdInfo;

    @InterfaceC65349Pkn("congrats_figures")
    public long congratsFigures;

    @InterfaceC65349Pkn("customized_benefit_entrance")
    public CustomBenefitEntrance customBenefitEntrance;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("enable_wave_status")
    public boolean enableWaveStatus;

    @InterfaceC65349Pkn("has_optin")
    public boolean hasOptIn;

    @InterfaceC65349Pkn("initialized")
    public boolean initialized;

    @InterfaceC65349Pkn("invitation_entrance")
    public SubInvitationEntrance invitationEntrance;

    @InterfaceC65349Pkn("is_revoked")
    public boolean isRevoked;

    @InterfaceC65349Pkn("live_sub_only_config")
    public LiveSubOnlyConfig liveSubOnlyConfig;

    @InterfaceC65349Pkn("paypal_bind_info")
    public PayPalBindInfo payPalBindInfo;

    @InterfaceC65349Pkn("price_tier_info")
    public PriceTierInfo priceTierInfo;

    @InterfaceC65349Pkn("qualification")
    public boolean qualification;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("show_preview_sub_bubble")
    public boolean showPreviewSubBubble;

    @InterfaceC65349Pkn("show_sub_only_live_banner")
    public boolean showSubOnlyLiveBanner;

    @InterfaceC65349Pkn("spotlight_info")
    public SpotlightInfo spotlightInfo;

    @InterfaceC65349Pkn("sub_available")
    public SubAvailable subAvailable;

    @InterfaceC65349Pkn("sub_enable")
    public SubEnable subEnable;

    @InterfaceC65349Pkn("sub_entrance")
    public SubEntrance subEntrance;

    @InterfaceC65349Pkn("gift_info")
    public SubGifInfo subGiftInfo;

    @InterfaceC65349Pkn("goal_info")
    public SubGoalInfo subGoalInfo;

    @InterfaceC65349Pkn("sub_only_videos_brief_info")
    public SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;

    @InterfaceC65349Pkn("sub_opt_in_scenario")
    public int subOptInScenario;

    @InterfaceC65349Pkn("sub_overview")
    public SubDataOverview subOverview;

    @InterfaceC65349Pkn("timer_detail")
    public TimerDetail timerDetail;

    @InterfaceC65349Pkn("tools_info")
    public ToolsInfo toolsInfo;

    @InterfaceC65349Pkn("badge_info")
    public SubSettingStatus badgeInfo = new SubSettingStatus();

    @InterfaceC65349Pkn("emote_info")
    public SubSettingStatus emotesInfo = new SubSettingStatus();

    @InterfaceC65349Pkn("note_info")
    public SubSettingStatus noteInfo = new SubSettingStatus();

    @InterfaceC65349Pkn("community_info")
    public SubSettingStatus communityInfo = new SubSettingStatus();
}

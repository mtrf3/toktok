package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import java.util.List;

/* loaded from: classes6.dex */
public class GiftsInfo {

    @InterfaceC65349Pkn("panel_gift_box_icon")
    public ImageModel bannerGiftBoxIcon;

    @InterfaceC65349Pkn("color_gift_icon_animation")
    public ImageModel colorGiftIconAnimation;

    @InterfaceC65349Pkn("compensation_gift_info")
    public LiveLimitedTimeDiscountGiftInfo compensationGiftInfo;

    @InterfaceC65349Pkn("default_loc_color_gift_id")
    public Long defaultLocColorGiftId;

    @InterfaceC65349Pkn("enable_first_recharge_dynamic_effect")
    public Boolean enableFirstRechargeDynamicEffect;

    @InterfaceC65349Pkn("first_recharge_gift_info")
    public LiveLimitedTimeDiscountGiftInfo firstRechargeGiftInfo;

    @InterfaceC65349Pkn("freq_limit_gift_info")
    public FreqLimitGiftInfo freqLimitGiftInfo;

    @InterfaceC65349Pkn("gift_box_scheme_url")
    public String giftBoxSchemeUrl;

    @InterfaceC65349Pkn("gift_combo_infos")
    public List<GiftComboInfo> giftComboInfos;

    @InterfaceC65349Pkn("gift_entrance_icon")
    public ImageModel giftEntranceIcon;

    @InterfaceC65349Pkn("gift_group_infos")
    public List<GiftGroupCount> giftGroupInfos;

    @InterfaceC65349Pkn("gift_icon_info")
    public GiftIconInfo giftIconInfo;

    @InterfaceC65349Pkn("gift_poll_info")
    public GiftPollInfo giftPollInfo;

    @InterfaceC65349Pkn("gift_words")
    public String giftWords;

    @InterfaceC65349Pkn("hide_recharge_entry")
    public boolean hideRecharge;

    @InterfaceC65349Pkn("is_display_gift_box_icon")
    public boolean isDisplayGiftBox;

    @InterfaceC65349Pkn("is_universal")
    public boolean isUniversal;

    @InterfaceC65349Pkn("live_goal_banner")
    public GiftPanelBanner liveGoalBanner;

    @InterfaceC65349Pkn("live_goal_label_icon")
    public ImageModel liveGoalLabelIcon;

    @InterfaceC65349Pkn("speedy_gift_id")
    public long mFastGiftId;

    @InterfaceC65349Pkn("new_gift_id")
    public Long newGiftId;

    @InterfaceC65349Pkn("recently_sent_color_gift_id")
    public Long recentlySentColorGiftId;

    @InterfaceC65349Pkn("recommended_random_gift_id")
    public Long recommendRandomGiftId;

    @InterfaceC65349Pkn("risk_ctl_strategies")
    public RiskCtl riskCtl;

    @InterfaceC65349Pkn("show_first_recharge_entrance")
    public Boolean showFirstRechargeEntrance;
}

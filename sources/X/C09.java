package X;

/* loaded from: classes6.dex */
public enum C09 {
    ANCHOR_INTERACTIVE_MIC("AnchorInteractiveMic", "cohost", 1),
    ANCHOR_MODIFICATION("AnchorModification", "enhance", 3),
    ANCHOR_QA("AnchorQA", "q_a", 4),
    ANCHOR_QUICK_QA("AnchorQuickQA", "q_a", 4),
    ANCHOR_PREVIEW("AnchorPreview", "audio_video_edit", 5),
    ANCHOR_BATTLE("AnchorBattle", "pk", 5),
    ANCHOR_INTERACTIVE_PANEL("AnchorInteractivePanel", "match_setting_icon", 5),
    ANCHOR_INTERACTIVE_DIALOG("AnchorInteractiveNewPanel", "match_setting_icon", 0),
    ANCHOR_DRAW_GUESS("AnchorDrawGuess", "interaction", 6),
    ANCHOR_INVITE_HOST("AnchorInviteHost", "anchor_invite_host", 6),
    ANCHOR_COHOST_EFFECT_HINT("AnchorCohostEffectHint", "enhance", 8),
    ANCHOR_COMMERCE_ADD_PRODUCT("AnchorCommerceAddProduct", "shop", 7),
    ANCHOR_WEEKLY_RANKING_GIFT("AnchorWeeklyRankingTop99Gift", "more", 8),
    ANCHOR_POLL("AnchorPoll", "vote", 3),
    ANCHOR_LIVING_NOTICE("AnchorLivingNotice", "invite_list_setting_icon", 6),
    ANCHOR_BG_MUSIC("AnchorBGMusic", "effect", 0),
    GUIDE_PRACTICE_MODE("GuidePracticeMode", "preview_setting_icon", 0),
    GUIDE_ANCHOR_POLL("GuideCustomPoll", "vote", 8),
    GUIDE_SWITCH_MODE("GuideSwitchMode", "live_mode_switch", 1),
    GUIDE_SUBSCRIPTION("GuideSubscriptionPreview", "subscription_icon", 0),
    GUIDE_SUBSCRIPTION_PREVIEW_ON_BOARDING("GuideSubscriptionPreviewOnBoarding", "subscription_icon", 1),
    GUIDE_REWARD("GuideReward", "live_center", 3),
    GUIDE_ENHANCE("GuideEnhanceReward", "preview_enhance", 1),
    GUIDE_LIVE_ACADEMY("GuideLiveAcademy", "preview_live_center_icon", 5),
    GUIDE_SELL_SERIES("GuideSellSeries", "business", 7),
    GUIDE_ANCHOR_SETTING("LiveSimplifiedSetting", "setting", 8),
    GUIDE_LIVEGOAL("GuideLiveGoal", "live_goal_icon", 2),
    CHANGE_COLOR_GIFT("ChangeColorGift", "gift_icon", 1),
    RANDOM_EFFECT_GIFT("RandomEffectGift", "gift_icon", 1),
    GIFT_GUIDE("GiftGuide", "gift_icon", 1),
    MATCH_ITEM("MatchItem", "gift_icon", 1),
    GIFT_UNLOCK("GiftUnlock", "gift_icon", 1),
    USER_LEVEL("UserUpgrade", "gift_icon", 0),
    FANS_START_GIFT("FansClubStartGift", "gift_icon", 0),
    FANS_LEVEL_GIFT("FansClubLevelGift", "gift_icon", 0),
    RANDOM_FIREWORKS("Fireworks", "gift_icon", 0),
    GUIDE_SUBSCRIPTION_ROOM_ENTRANCE("GuideSubscriptionRoomEntrance", "subscription_icon", 0),
    GIFTSUB_FUNCTION_ONLINE_NOTIFY("NotifyGiftSubFunctionOnline", "subscription_icon", 0),
    GIFTSUB_RECEIVE_NOTIFY("NotifyUserReceivedGiftSub", "subscription_icon", 0),
    BOOSTER_CARD("BoosterCard", "interaction_icon", 5),
    AUTO_TRANSLATE("AutoTranslate", "ttlive_share", 5),
    GUIDE_CAPTION("GuideCaption", "setting_icon", 0),
    CAPTION("ReopenCaption", "share_icon", 1),
    BOTTOM_LEFT_ICON_CLICK_GUIDE("ShopBagNewUserBubble", "shop", 0),
    GUIDE_SUBSCRIPTION_ON_BOARDING_SCREEN_SHOT("GuideSubscriptionPreviewOnBoardingScreenShot", "subscription_icon", 4),
    SHAREPANEL("HideShareButton", "shareandmore_icon", 0),
    GIFT_PANEL_SORT("GiftPanelSort", "gift_panel", 0);

    public String key;
    public String position;
    public int priority;

    public static C09 valueOf(String str) {
        return (C09) V0N.LJJJ(C09.class, str);
    }

    C09(String str, String str2, int i) {
        this.key = str;
        this.position = str2;
        this.priority = i;
    }
}

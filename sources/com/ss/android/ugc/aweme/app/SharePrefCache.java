package com.ss.android.ugc.aweme.app;

import X.C03880Dg;
import X.C16880lQ;
import X.C36821Ecj;
import X.C39519Ff9;
import X.C54291LSl;
import X.C61651OHn;
import X.C65300Pk0;
import X.EF7;
import X.F9J;
import X.FII;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes10.dex */
public class SharePrefCache {
    public C36821Ecj<String> adIntroUrl;
    public C36821Ecj<String> adLandingPageConfig;
    public C36821Ecj<String> adSouthNorthFirstSupportTeam;
    public C36821Ecj<Long> adSouthNorthFirstSupportTime;
    public C36821Ecj<String> allContentLanguages;
    public C36821Ecj<Integer> arStickerFliterTimes;
    public C36821Ecj<Integer> atFriendsShowType;
    public C36821Ecj<Boolean> autoSaveVideo;
    public C36821Ecj<Boolean> autoSendTwitter;
    public volatile List<C36821Ecj> cacheItems;
    public C36821Ecj<Boolean> canCreateInsights;
    public C36821Ecj<Integer> canIm;
    public C36821Ecj<Boolean> canLive;
    public boolean collectAllItems;
    public C36821Ecj<Integer> completeProfilePolicyInterval;
    public C36821Ecj<Integer> completeProfilePolicyTimes;
    public C36821Ecj<Boolean> debugWebBar;
    public C36821Ecj<Set<String>> defaultAvatarUrl;
    public C36821Ecj<String> downloadForbiddenToast;
    public C36821Ecj<Integer> downloadMicroApp;
    public C36821Ecj<String> downloadSdkConfig;
    public C36821Ecj<Boolean> downloadStatusWhenPublish;
    public C36821Ecj<Boolean> enableAntiAliasing;
    public C36821Ecj<Integer> enableBindItemCallOMSDK;
    public C36821Ecj<Boolean> enableMessagePb2Json;
    public C36821Ecj<Boolean> enableProfileActivityLink;
    public C36821Ecj<Boolean> enableUltraResolution;
    public C36821Ecj<String> facebookAccessToken;
    public C36821Ecj<Long> festivalShareDonationTime;
    public C36821Ecj<Integer> flashStatus;
    public C36821Ecj<Boolean> followGuideShown;
    public C36821Ecj<Long> followNoticeCloseTime;
    public C36821Ecj<Integer> followUserThreshold;
    public C36821Ecj<Boolean> geckoLocalTestUseOnline;
    public C36821Ecj<String> googleServerAuthCode;
    public C36821Ecj<Boolean> hasAlreadyShowBubble;
    public C36821Ecj<Boolean> hasEnterBindPhone;
    public C36821Ecj<Boolean> hasLongPressDislike;
    public C36821Ecj<Boolean> hasShowFilterGuide;
    public C36821Ecj<Boolean> hasShowHighQualityVideoTips;
    public C36821Ecj<String> hitRankActivityProfileBackgroud;
    public C36821Ecj<String> hitRankActivityStarBackground;
    public C36821Ecj<Integer> hitRankActivityStatus;
    public C36821Ecj<Integer> hotSearchWordsShowInterval;
    public C36821Ecj<Boolean> iesOffline;
    public C36821Ecj<Boolean> imCommentForwardEnabled;
    public C36821Ecj<String> imCurrentLocaleLanguage;
    public C36821Ecj<String> imUrlTemplate;
    public C36821Ecj<Boolean> inUltraResBlackList;
    public C36821Ecj<String> invitedContacts;
    public C36821Ecj<Boolean> isAwemePrivate;
    public C36821Ecj<Boolean> isClickMoreRedPoint;
    public C36821Ecj<Boolean> isContactDialogShown;
    public C36821Ecj<Boolean> isContactsUploaded;
    public C36821Ecj<Boolean> isEuropeCountry;
    public C36821Ecj<Boolean> isFirstLaunch;
    public C36821Ecj<Boolean> isFirstPublishAweme;
    public C36821Ecj<Boolean> isFirstPublishComment;
    public C36821Ecj<Boolean> isFirstPublishSync;
    public C36821Ecj<Boolean> isFirstReportVideo;
    public C36821Ecj<Boolean> isHighQualityVideo;
    public C36821Ecj<Boolean> isHotSearchAwemeBillboardEnable;
    public C36821Ecj<Boolean> isHotSearchBillboardEnable;
    public C36821Ecj<Boolean> isHotSearchMusicalBillboardEnable;
    public C36821Ecj<Boolean> isHotSearchPositiveEnergyBillboardEnable;
    public C36821Ecj<Integer> isNewInstall;
    public C36821Ecj<Boolean> isNpthEnable;
    public C36821Ecj<Boolean> isOb;
    public C36821Ecj<Boolean> isOldUser;
    public C36821Ecj<Boolean> isPrivateAvailable;
    public C36821Ecj<Boolean> isProfileBubbleShown;
    public C36821Ecj<Boolean> isPublishSyncToHuoshan;
    public C36821Ecj<Boolean> isShowFavouriteIcon;
    public C36821Ecj<Boolean> isShowNearBy;
    public C36821Ecj<Boolean> isShowRankingIndicator;
    public C36821Ecj<Boolean> isShowUserFeedBackPoint;
    public C36821Ecj<Boolean> isSyncToHuoshan;
    public C36821Ecj<Boolean> isUseBackRefresh;
    public C36821Ecj<Boolean> ischangeFollowTab;
    public C36821Ecj<String> jsActlogUrl;
    public C36821Ecj<String> judgementClauseScheme;
    public C36821Ecj<Long> lastCloseFeedUpdateUserDialog;
    public C36821Ecj<Long> lastCloseUpdateUserDialog;
    public C36821Ecj<Long> lastFeedCount;
    public C36821Ecj<Long> lastFeedTime;
    public C36821Ecj<Long> lastFilterTime;
    public C36821Ecj<Long> lastGetRelieveAwemeTime;
    public C36821Ecj<Long> lastHintToastTime;
    public C36821Ecj<Long> lastLockedTime;
    public C36821Ecj<Boolean> lastPublishFailed;
    public C36821Ecj<Long> lastShowBindHintTime;
    public C36821Ecj<Long> lastShowProfileBindHintTime;
    public C36821Ecj<Long> lastUnlockTime;
    public C36821Ecj<Integer> lastUsableNetworkSpeed;
    public C36821Ecj<Boolean> liveAgreement;
    public C36821Ecj<Boolean> liveAnswer;
    public C36821Ecj<Boolean> liveContactsVerify;
    public C36821Ecj<Boolean> longVideoPermitted;
    public final Object mAddLanguageLock;
    public C36821Ecj<Set<String>> mGeckoChannels;
    public C36821Ecj<Set<String>> mGeckoInitialHighPriorityChannels;
    public SharedPreferences mSharedPreferences;
    public final Object mUseHttpsLock;
    public C36821Ecj<Boolean> mUseNewPackageNow;
    public C36821Ecj<String> miniAppLabTitle;
    public C36821Ecj<Boolean> mockLiveMoney;
    public C36821Ecj<Boolean> mockLiveResolution;
    public C36821Ecj<Boolean> mockLiveSend;
    public C36821Ecj<String> mpTab;
    public C36821Ecj<Integer> multiSelectLimit;
    public C36821Ecj<Integer> openImLink;
    public C36821Ecj<Integer> privacyAccountFollowCount;
    public C36821Ecj<String> privacyReminderH5Url;
    public C36821Ecj<Integer> promoteDialogPopupClickType;
    public C36821Ecj<String> promoteDialogPopupPopupContent;
    public C36821Ecj<Integer> promoteDialogPopupPopupInterval;
    public C36821Ecj<String> promoteDialogPopupPopupLinkText;
    public C36821Ecj<String> promoteDialogPopupPopupMsg;
    public C36821Ecj<String> promoteDialogPopupPopupTitle;
    public C36821Ecj<String> promoteDialogPopupPopupUrl;
    public C36821Ecj<Integer> promoteDialogPopupTimesLimit;
    public C36821Ecj<Boolean> promoteDialogShouldShow;
    public C36821Ecj<String> reactAddShopUrl;
    public List<String> recentList;
    public C36821Ecj<String> referralEntrance;
    public C36821Ecj<Boolean> removeFollowerSwitch;
    public C36821Ecj<String> requestNotificationText;
    public C36821Ecj<String> requestNotificationTitle;
    public C36821Ecj<Boolean> rnFallback;
    public C36821Ecj<String> searchTabIndex;
    public C36821Ecj<String> selectedContentLanguages;
    public C36821Ecj<String> selectedDoNotTransLanguages;
    public C36821Ecj<String> selectedTranslationLanguage;
    public C36821Ecj<Boolean> shouldShowCreatorFundAccountUpgradeInProfile;
    public C36821Ecj<Boolean> shouldShowFavouriteTip;
    public C36821Ecj<Boolean> shouldShowPrivateAccountTipInProfile;
    public C36821Ecj<Boolean> showAdIntroFlag;
    public C36821Ecj<Boolean> showAddBusinessGoodsDot;
    public C36821Ecj<Integer> showBindHintCount;
    public C36821Ecj<Integer> showCreatorRewards;
    public C36821Ecj<Integer> showHashTagBg;
    public C36821Ecj<Boolean> showInvitedContactsFriends;
    public C36821Ecj<Integer> showLiveRewards;
    public C36821Ecj<Boolean> showMiniAppFreshGuideBubble;
    public C36821Ecj<Boolean> showMiniAppFreshGuideDialog;
    public C36821Ecj<Boolean> showMiniAppFreshGuideNotify;
    public C36821Ecj<Boolean> showPlayerInfoUI;
    public C36821Ecj<Integer> showProfileBindHintCount;
    public C36821Ecj<Integer> showPromoteLicense;
    public C36821Ecj<Boolean> showTimeLineTab;
    public C36821Ecj<Boolean> showVideoBitrateInfo;
    public C36821Ecj<Boolean> stickerArtEntry;
    public C36821Ecj<String> stickerArtlistUrl;
    public C36821Ecj<Integer> storyInfoStickerMaxCount;
    public C36821Ecj<Boolean> storyPublishFriendsDuoshanBanner;
    public C36821Ecj<Boolean> storyPublishSaveLocal;
    public C36821Ecj<Boolean> storyRecordGuideShow;
    public C36821Ecj<String> storyRegisterPublishSyncHintContent;
    public C36821Ecj<String> storyRegisterPublishSyncHintH5Str;
    public C36821Ecj<String> storyRegisterPublishSyncHintH5Url;
    public C36821Ecj<String> storyRegisterPublishSyncHintTitle;
    public C36821Ecj<Boolean> storySettingDoudouPhoto;
    public C36821Ecj<Boolean> storySettingManualOpenDoudou;
    public C36821Ecj<Integer> storySettingReplyPermission;
    public C36821Ecj<Boolean> storySettingSyncDuoshan;
    public C36821Ecj<Integer> storySettingSyncToast;
    public C36821Ecj<Integer> storySettingViewPermission;
    public C36821Ecj<Integer> storyTextStickerMaxCount;
    public C36821Ecj<String> storyUnRegisterPublishSyncHintContent;
    public C36821Ecj<String> storyUnRegisterPublishSyncHintH5Str;
    public C36821Ecj<String> storyUnRegisterPublishSyncHintH5Url;
    public C36821Ecj<String> storyUnRegisterPublishSyncHintTitle;
    public C36821Ecj<Long> todayVideoPlayTime;
    public C36821Ecj<Boolean> ttRegion;
    public C36821Ecj<Boolean> ttRoute;
    public C36821Ecj<String> twitterAccessToken;
    public C36821Ecj<String> twitterSecret;
    public C36821Ecj<Integer> ultraResolutionLevel;
    public C36821Ecj<Integer> upGuideNum;
    public C36821Ecj<Integer> updateUserFrequency;
    public C36821Ecj<Integer> updateUserPosition;
    public C36821Ecj<String> updateUserTipContent;
    public C36821Ecj<Boolean> useCronet;
    public C36821Ecj<Boolean> useDefaultHost;
    public C36821Ecj<Boolean> useHttps;
    public C36821Ecj<String> userCurrentRegion;
    public C36821Ecj<Boolean> userHasPassword;
    public C36821Ecj<String> userResidence;
    public C36821Ecj<Integer> verifyExceed;
    public C36821Ecj<Boolean> videoPreload;
    public C36821Ecj<Integer> weakNetPreLoadSwitch;

    public static Object com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-4418811490481838667"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public boolean isOpenForward() {
        return false;
    }

    private void collectAllItemsIfNeed() {
        if (this.collectAllItems) {
            return;
        }
        this.collectAllItems = true;
        for (Method method : SharePrefCache.class.getDeclaredMethods()) {
            if (method.getReturnType() == C36821Ecj.class) {
                try {
                    com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(method, this, new Object[0]);
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                } catch (InvocationTargetException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
    }

    private C36821Ecj<Integer> getArStickerFliterTimesItem() {
        if (this.arStickerFliterTimes == null) {
            this.arStickerFliterTimes = new C36821Ecj<>("ar_sticker_filter_guide_times", 0);
            this.cacheItems.add(this.arStickerFliterTimes);
        }
        return this.arStickerFliterTimes;
    }

    private C36821Ecj<Boolean> getCanLive() {
        if (this.canLive == null) {
            this.canLive = new C36821Ecj<>("live_can_live", Boolean.FALSE);
            this.cacheItems.add(this.canLive);
        }
        return this.canLive;
    }

    private C36821Ecj<Boolean> getClickMoreRedPoint() {
        if (this.isClickMoreRedPoint == null) {
            this.isClickMoreRedPoint = new C36821Ecj<>("is_click_more_red_point", Boolean.FALSE);
            this.cacheItems.add(this.isClickMoreRedPoint);
        }
        return this.isClickMoreRedPoint;
    }

    private C36821Ecj<Boolean> getFirstPublishAwemeItem() {
        if (this.isFirstPublishAweme == null) {
            this.isFirstPublishAweme = new C36821Ecj<>("first_publish_aweme", Boolean.TRUE);
            this.cacheItems.add(this.isFirstPublishAweme);
        }
        return this.isFirstPublishAweme;
    }

    private C36821Ecj<Boolean> getFirstPublishCommentItem() {
        if (this.isFirstPublishComment == null) {
            this.isFirstPublishComment = new C36821Ecj<>("first_publish_comment", Boolean.TRUE);
            this.cacheItems.add(this.isFirstPublishComment);
        }
        return this.isFirstPublishComment;
    }

    private C36821Ecj<Boolean> getHasShowFilterGuideItem() {
        if (this.hasShowFilterGuide == null) {
            this.hasShowFilterGuide = new C36821Ecj<>("live_show_filter_guide", Boolean.FALSE);
            this.cacheItems.add(this.hasShowFilterGuide);
        }
        return this.hasShowFilterGuide;
    }

    private C36821Ecj<Integer> getShowCreatorRewards() {
        if (this.showCreatorRewards == null) {
            this.showCreatorRewards = new C36821Ecj<>("show_creator_rewards", 0);
            this.cacheItems.add(this.showCreatorRewards);
        }
        return this.showCreatorRewards;
    }

    private C36821Ecj<Integer> getShowLiveRewards() {
        if (this.showLiveRewards == null) {
            this.showLiveRewards = new C36821Ecj<>("show_live_rewards", 0);
            this.cacheItems.add(this.showLiveRewards);
        }
        return this.showLiveRewards;
    }

    public C36821Ecj<String> getAdIntroUrlItem() {
        if (this.adIntroUrl == null) {
            this.adIntroUrl = new C36821Ecj<>("ad_intro_url", "");
            this.cacheItems.add(this.adIntroUrl);
        }
        return this.adIntroUrl;
    }

    public C36821Ecj<String> getAdLandingPageConfig() {
        if (this.adLandingPageConfig == null) {
            this.adLandingPageConfig = new C36821Ecj<>("ad_landing_page_config", "");
            this.cacheItems.add(this.adLandingPageConfig);
        }
        return this.adLandingPageConfig;
    }

    public C36821Ecj<String> getAdSouthNorthFirstSupportTeam() {
        if (this.adSouthNorthFirstSupportTeam == null) {
            this.adSouthNorthFirstSupportTeam = new C36821Ecj<>("ad_south_north_support_team", "");
        }
        return this.adSouthNorthFirstSupportTeam;
    }

    public C36821Ecj<Long> getAdSouthNorthFirstSupportTime() {
        if (this.adSouthNorthFirstSupportTime == null) {
            this.adSouthNorthFirstSupportTime = new C36821Ecj<>("ad_south_north_support_time", 0L);
        }
        return this.adSouthNorthFirstSupportTime;
    }

    public C36821Ecj<String> getAllContentLanguages() {
        if (this.allContentLanguages == null) {
            this.allContentLanguages = new C36821Ecj<>("user_all_content_languages", "");
            this.cacheItems.add(this.allContentLanguages);
        }
        return this.allContentLanguages;
    }

    public C36821Ecj<Integer> getAtFriendsShowType() {
        if (this.atFriendsShowType == null) {
            this.atFriendsShowType = new C36821Ecj<>("at_friends_show_type", 0);
            this.cacheItems.add(this.atFriendsShowType);
        }
        return this.atFriendsShowType;
    }

    public C36821Ecj<Boolean> getAutoSaveVideo() {
        if (this.autoSaveVideo == null) {
            this.autoSaveVideo = new C36821Ecj<>("auto_save_video", Boolean.TRUE);
            this.cacheItems.add(this.autoSaveVideo);
        }
        return this.autoSaveVideo;
    }

    public C36821Ecj<Boolean> getAutoSendTwitter() {
        if (this.autoSendTwitter == null) {
            this.autoSendTwitter = new C36821Ecj<>("auto_send_twitter", Boolean.FALSE);
            this.cacheItems.add(this.autoSendTwitter);
        }
        return this.autoSendTwitter;
    }

    public C36821Ecj<Boolean> getCanCreateInsights() {
        if (this.canCreateInsights == null) {
            this.canCreateInsights = new C36821Ecj<>("can_create_insights", Boolean.FALSE);
            this.cacheItems.add(this.canCreateInsights);
        }
        return this.canCreateInsights;
    }

    public C36821Ecj<Integer> getCompleteProfilePolicyInterval() {
        if (this.completeProfilePolicyInterval == null) {
            this.completeProfilePolicyInterval = new C36821Ecj<>("completeprofilepolicy_interval", 0);
            this.cacheItems.add(this.completeProfilePolicyInterval);
        }
        return this.completeProfilePolicyInterval;
    }

    public C36821Ecj<Integer> getCompleteProfilePolicyTimes() {
        if (this.completeProfilePolicyTimes == null) {
            this.completeProfilePolicyTimes = new C36821Ecj<>("completeprofilepolicy_times", 0);
            this.cacheItems.add(this.completeProfilePolicyTimes);
        }
        return this.completeProfilePolicyTimes;
    }

    public C36821Ecj<String> getCurrentLocaleLanguage() {
        if (this.imCurrentLocaleLanguage == null) {
            this.imCurrentLocaleLanguage = new C36821Ecj<>("im_current_locale", Locale.CHINESE.getLanguage());
            this.cacheItems.add(this.imCurrentLocaleLanguage);
        }
        return this.imCurrentLocaleLanguage;
    }

    public C36821Ecj<Boolean> getDebugWebBar() {
        if (this.debugWebBar == null) {
            this.debugWebBar = new C36821Ecj<>("debug_web_bar", Boolean.TRUE);
            this.cacheItems.add(this.debugWebBar);
        }
        return this.debugWebBar;
    }

    public C36821Ecj<Set<String>> getDefaultAvatarUrl() {
        if (this.defaultAvatarUrl == null) {
            this.defaultAvatarUrl = new C36821Ecj<>("default_avatarurl", new HashSet());
            this.cacheItems.add(this.defaultAvatarUrl);
        }
        return this.defaultAvatarUrl;
    }

    public C36821Ecj<String> getDownloadForbiddenToast() {
        if (this.downloadForbiddenToast == null) {
            this.downloadForbiddenToast = new C36821Ecj<>("download_forbidden_toast", "");
            this.cacheItems.add(this.downloadForbiddenToast);
        }
        return this.downloadForbiddenToast;
    }

    public C36821Ecj<Integer> getDownloadMicroApp() {
        if (this.downloadMicroApp == null) {
            this.downloadMicroApp = new C36821Ecj<>("download_micro_app", 1);
            this.cacheItems.add(this.downloadMicroApp);
        }
        return this.downloadMicroApp;
    }

    public C36821Ecj<String> getDownloadSdkConfig() {
        if (this.downloadSdkConfig == null) {
            this.downloadSdkConfig = new C36821Ecj<>("download_sdk_config", "");
            this.cacheItems.add(this.downloadSdkConfig);
        }
        return this.downloadSdkConfig;
    }

    public C36821Ecj<Boolean> getDownloadStatusWhenPublish() {
        if (this.downloadStatusWhenPublish == null) {
            this.downloadStatusWhenPublish = new C36821Ecj<>("download_status_when_publish", Boolean.TRUE);
        }
        return this.downloadStatusWhenPublish;
    }

    public C36821Ecj<Boolean> getEableUltraResolution() {
        if (this.enableUltraResolution == null) {
            this.enableUltraResolution = new C36821Ecj<>("enable_ultra_resolution", Boolean.FALSE);
            this.cacheItems.add(this.enableUltraResolution);
        }
        return this.enableUltraResolution;
    }

    public C36821Ecj<Boolean> getEnableAntiAliasing() {
        if (this.enableAntiAliasing == null) {
            this.enableAntiAliasing = new C36821Ecj<>("enable_anti_aliasing", Boolean.FALSE);
            this.cacheItems.add(this.enableAntiAliasing);
        }
        return this.enableAntiAliasing;
    }

    public C36821Ecj<Integer> getEnableBindItemCallOMSDK() {
        if (this.enableBindItemCallOMSDK == null) {
            this.enableBindItemCallOMSDK = new C36821Ecj<>("enableBindItemCallOMSDK", 0);
            this.cacheItems.add(this.enableBindItemCallOMSDK);
        }
        return this.enableBindItemCallOMSDK;
    }

    public C36821Ecj<Boolean> getEnableProfileActivityLink() {
        if (this.enableProfileActivityLink == null) {
            this.enableProfileActivityLink = new C36821Ecj<>("enable_profile_link", Boolean.FALSE);
            this.cacheItems.add(this.enableProfileActivityLink);
        }
        return this.enableProfileActivityLink;
    }

    public C36821Ecj<String> getFacebookAccessToken() {
        if (this.facebookAccessToken == null) {
            this.facebookAccessToken = new C36821Ecj<>("facebook_access_token", "");
            this.cacheItems.add(this.facebookAccessToken);
        }
        return this.facebookAccessToken;
    }

    public C36821Ecj<Long> getFestivalShareDonationTime() {
        if (this.festivalShareDonationTime == null) {
            this.festivalShareDonationTime = new C36821Ecj<>("festival_share_donation_time", 0L);
            this.cacheItems.add(this.festivalShareDonationTime);
        }
        return this.festivalShareDonationTime;
    }

    public C36821Ecj<Integer> getFlashStatus() {
        if (this.flashStatus == null) {
            this.flashStatus = new C36821Ecj<>("flash_status", 0);
            this.cacheItems.add(this.flashStatus);
        }
        return this.flashStatus;
    }

    public C36821Ecj<Boolean> getFollowGuideShown() {
        if (this.followGuideShown == null) {
            this.followGuideShown = new C36821Ecj<>("follow_guide_shown", Boolean.FALSE);
            this.cacheItems.add(this.followGuideShown);
        }
        return this.followGuideShown;
    }

    public C36821Ecj<Long> getFollowNoticeCloseTime() {
        if (this.followNoticeCloseTime == null) {
            this.followNoticeCloseTime = new C36821Ecj<>("follow_notice_close_time", 0L);
            this.cacheItems.add(this.followNoticeCloseTime);
        }
        return this.followNoticeCloseTime;
    }

    public C36821Ecj<Integer> getFollowUserThreshold() {
        if (this.followUserThreshold == null) {
            this.followUserThreshold = new C36821Ecj<>("show_follow_tab_following_limit", 1);
            this.cacheItems.add(this.followUserThreshold);
        }
        return this.followUserThreshold;
    }

    public C36821Ecj<Set<String>> getGeckoChannels() {
        if (this.mGeckoChannels == null) {
            this.mGeckoChannels = new C36821Ecj<>("gecko_init_channels", new HashSet());
            this.cacheItems.add(this.mGeckoChannels);
        }
        return this.mGeckoChannels;
    }

    public C36821Ecj<Set<String>> getGeckoInitialHighPriorityChannels() {
        if (this.mGeckoInitialHighPriorityChannels == null) {
            this.mGeckoInitialHighPriorityChannels = new C36821Ecj<>("initial_high_priority_channel", new HashSet());
            this.cacheItems.add(this.mGeckoInitialHighPriorityChannels);
        }
        return this.mGeckoInitialHighPriorityChannels;
    }

    public C36821Ecj<Boolean> getGeckoLocalTestUseOnline() {
        if (this.geckoLocalTestUseOnline == null) {
            this.geckoLocalTestUseOnline = new C36821Ecj<>("gecko_local_test_use_online", Boolean.FALSE);
            this.cacheItems.add(this.geckoLocalTestUseOnline);
        }
        return this.geckoLocalTestUseOnline;
    }

    public C36821Ecj<String> getGoogleServerAuthCode() {
        if (this.googleServerAuthCode == null) {
            this.googleServerAuthCode = new C36821Ecj<>("google_server_auth_code", "");
            this.cacheItems.add(this.googleServerAuthCode);
        }
        return this.googleServerAuthCode;
    }

    public C36821Ecj<Boolean> getHasAlreadyShowBubble() {
        if (this.hasAlreadyShowBubble == null) {
            this.hasAlreadyShowBubble = new C36821Ecj<>("has_already_show_bubble", Boolean.FALSE);
            this.cacheItems.add(this.hasAlreadyShowBubble);
        }
        return this.hasAlreadyShowBubble;
    }

    public C36821Ecj<Boolean> getHasEnterBindPhone() {
        if (this.hasEnterBindPhone == null) {
            this.hasEnterBindPhone = new C36821Ecj<>("has_enter_bind_phone", Boolean.FALSE);
            this.cacheItems.add(this.hasEnterBindPhone);
        }
        return this.hasEnterBindPhone;
    }

    public C36821Ecj<Boolean> getHasLongPressDislike() {
        if (this.hasLongPressDislike == null) {
            this.hasLongPressDislike = new C36821Ecj<>("has_long_pressed_dislike", Boolean.FALSE);
            this.cacheItems.add(this.hasLongPressDislike);
        }
        return this.hasLongPressDislike;
    }

    public C36821Ecj<String> getHitRankActivityProfileBackground() {
        if (this.hitRankActivityProfileBackgroud == null) {
            this.hitRankActivityProfileBackgroud = new C36821Ecj<>("HIT_RANK_ACTIVITY_PROFILE_BACKGROUND", "");
            this.cacheItems.add(this.hitRankActivityProfileBackgroud);
        }
        return this.hitRankActivityProfileBackgroud;
    }

    public C36821Ecj<String> getHitRankActivityStarBackground() {
        if (this.hitRankActivityStarBackground == null) {
            this.hitRankActivityStarBackground = new C36821Ecj<>("hit_rank_activity_star_background", "");
            this.cacheItems.add(this.hitRankActivityStarBackground);
        }
        return this.hitRankActivityStarBackground;
    }

    public C36821Ecj<Integer> getHitRankActivityStatus() {
        if (this.hitRankActivityStatus == null) {
            this.hitRankActivityStatus = new C36821Ecj<>("hit_rank_activity_status", 0);
            this.cacheItems.add(this.hitRankActivityStatus);
        }
        return this.hitRankActivityStatus;
    }

    public C36821Ecj<Integer> getHotSearchWordsShowInterval() {
        if (this.hotSearchWordsShowInterval == null) {
            this.hotSearchWordsShowInterval = new C36821Ecj<>("hot_search_words_show_interval", 2);
            this.cacheItems.add(this.hotSearchWordsShowInterval);
        }
        return this.hotSearchWordsShowInterval;
    }

    public C36821Ecj<Boolean> getIesOffline() {
        if (this.iesOffline == null) {
            this.iesOffline = new C36821Ecj<>("iesoffline", Boolean.TRUE);
            this.cacheItems.add(this.iesOffline);
        }
        return this.iesOffline;
    }

    public C36821Ecj<Boolean> getImCommentForwardEnabledItem() {
        if (this.imCommentForwardEnabled == null) {
            this.imCommentForwardEnabled = new C36821Ecj<>("im_comment_forward_enabled", Boolean.TRUE);
            this.cacheItems.add(this.imCommentForwardEnabled);
        }
        return this.imCommentForwardEnabled;
    }

    public C36821Ecj<String> getInvitedContacts() {
        if (this.invitedContacts == null) {
            this.invitedContacts = new C36821Ecj<>("invite_friends", "");
            this.cacheItems.add(this.invitedContacts);
        }
        return this.invitedContacts;
    }

    public C36821Ecj<Boolean> getIsAwemePrivate() {
        if (this.isAwemePrivate == null) {
            this.isAwemePrivate = new C36821Ecj<>("is_aweme_private", Boolean.FALSE);
            this.cacheItems.add(this.isAwemePrivate);
        }
        return this.isAwemePrivate;
    }

    public C36821Ecj<Boolean> getIsChangeFollowTab() {
        if (this.ischangeFollowTab == null) {
            this.ischangeFollowTab = new C36821Ecj<>("is_change_follow_tab", Boolean.FALSE);
            this.cacheItems.add(this.ischangeFollowTab);
        }
        return this.ischangeFollowTab;
    }

    public C36821Ecj<Boolean> getIsContactDialogShown() {
        if (this.isContactDialogShown == null) {
            this.isContactDialogShown = new C36821Ecj<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.cacheItems.add(this.isContactDialogShown);
        }
        return this.isContactDialogShown;
    }

    public C36821Ecj<Boolean> getIsContactsUploaded() {
        if (this.isContactsUploaded == null) {
            this.isContactsUploaded = new C36821Ecj<>("contacts_uploaded", Boolean.FALSE);
            this.cacheItems.add(this.isContactsUploaded);
        }
        return this.isContactsUploaded;
    }

    public C36821Ecj<Boolean> getIsEuropeCountry() {
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(C61651OHn.LIZIZ())) {
                this.isEuropeCountry = new C36821Ecj<>("is_europe_country", Boolean.valueOf(C61651OHn.LIZJ(C61651OHn.LIZIZ())));
            } else if (!TextUtils.isEmpty(C61651OHn.LIZ())) {
                this.isEuropeCountry = new C36821Ecj<>("is_europe_country", Boolean.valueOf(C61651OHn.LIZJ(C61651OHn.LIZ())));
            } else {
                this.isEuropeCountry = new C36821Ecj<>("is_europe_country", Boolean.FALSE);
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    public C36821Ecj<Boolean> getIsFirstLaunch() {
        if (this.isFirstLaunch == null) {
            this.isFirstLaunch = new C36821Ecj<>("is_first_lauch", Boolean.TRUE);
            this.cacheItems.add(this.isFirstLaunch);
        }
        return this.isFirstLaunch;
    }

    public C36821Ecj<Boolean> getIsFirstReportVideo() {
        if (this.isFirstReportVideo == null) {
            this.isFirstReportVideo = new C36821Ecj<>("is_first_report_video", Boolean.TRUE);
            this.cacheItems.add(this.isFirstReportVideo);
        }
        return this.isFirstReportVideo;
    }

    public C36821Ecj<Boolean> getIsHotSearchAwemeBillboardEnable() {
        if (this.isHotSearchAwemeBillboardEnable == null) {
            this.isHotSearchAwemeBillboardEnable = new C36821Ecj<>("is_hot_search_aweme_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchAwemeBillboardEnable);
        }
        return this.isHotSearchAwemeBillboardEnable;
    }

    public C36821Ecj<Boolean> getIsHotSearchBillboardEnable() {
        if (this.isHotSearchBillboardEnable == null) {
            this.isHotSearchBillboardEnable = new C36821Ecj<>("is_hot_search_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchBillboardEnable);
        }
        return this.isHotSearchBillboardEnable;
    }

    public C36821Ecj<Boolean> getIsHotSearchMusicalBillboardEnable() {
        if (this.isHotSearchMusicalBillboardEnable == null) {
            this.isHotSearchMusicalBillboardEnable = new C36821Ecj<>("is_hot_search_music_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchMusicalBillboardEnable);
        }
        return this.isHotSearchMusicalBillboardEnable;
    }

    public C36821Ecj<Boolean> getIsHotSearchPositiveEnergyBillboardEnable() {
        if (this.isHotSearchPositiveEnergyBillboardEnable == null) {
            this.isHotSearchPositiveEnergyBillboardEnable = new C36821Ecj<>("is_hot_search_positive_energy_billboard_enable", Boolean.FALSE);
            this.cacheItems.add(this.isHotSearchPositiveEnergyBillboardEnable);
        }
        return this.isHotSearchPositiveEnergyBillboardEnable;
    }

    public C36821Ecj<Integer> getIsNewInstall() {
        if (this.isNewInstall == null) {
            this.isNewInstall = new C36821Ecj<>("is_new_install", -1);
            this.cacheItems.add(this.isNewInstall);
        }
        return this.isNewInstall;
    }

    public C36821Ecj<Boolean> getIsOldUser() {
        if (this.isOldUser == null) {
            this.isOldUser = new C36821Ecj<>("old_user", Boolean.FALSE);
            this.cacheItems.add(this.isOldUser);
        }
        return this.isOldUser;
    }

    public C36821Ecj<Boolean> getIsPrivateAvailable() {
        if (this.isPrivateAvailable == null) {
            this.isPrivateAvailable = new C36821Ecj<>("private_aweme_available", Boolean.TRUE);
            this.cacheItems.add(this.isPrivateAvailable);
        }
        return this.isPrivateAvailable;
    }

    public C36821Ecj<Boolean> getIsProfileBubbleShown() {
        if (this.isProfileBubbleShown == null) {
            this.isProfileBubbleShown = new C36821Ecj<>("profile_bubble_shown", Boolean.TRUE);
            this.cacheItems.add(this.isProfileBubbleShown);
        }
        return this.isProfileBubbleShown;
    }

    public C36821Ecj<Boolean> getIsShowFavouriteIcon() {
        if (this.isShowFavouriteIcon == null) {
            this.isShowFavouriteIcon = new C36821Ecj<>("show_favourite_icon", Boolean.FALSE);
            this.cacheItems.add(this.isShowFavouriteIcon);
        }
        return this.isShowFavouriteIcon;
    }

    public C36821Ecj<Boolean> getIsShowNearBy() {
        if (this.isShowNearBy == null) {
            this.isShowNearBy = new C36821Ecj<>("is_show_near_by", Boolean.FALSE);
            this.cacheItems.add(this.isShowNearBy);
        }
        return this.isShowNearBy;
    }

    public C36821Ecj<Boolean> getIsShowRankingIndicator() {
        if (this.isShowRankingIndicator == null) {
            this.isShowRankingIndicator = new C36821Ecj<>("is_show_ranking_indicator", Boolean.TRUE);
            this.cacheItems.add(this.isShowRankingIndicator);
        }
        return this.isShowRankingIndicator;
    }

    public C36821Ecj<Boolean> getIsShowUserFeedBackPoint() {
        if (this.isShowUserFeedBackPoint == null) {
            this.isShowUserFeedBackPoint = new C36821Ecj<>("si_show_user_feed_back_point", Boolean.FALSE);
            this.cacheItems.add(this.isShowUserFeedBackPoint);
        }
        return this.isShowUserFeedBackPoint;
    }

    public C36821Ecj<Boolean> getIsUseBackRefresh() {
        if (this.isUseBackRefresh == null) {
            this.isUseBackRefresh = new C36821Ecj<>("is_use_back_refresh", Boolean.TRUE);
            this.cacheItems.add(this.isUseBackRefresh);
        }
        return this.isUseBackRefresh;
    }

    public C36821Ecj<String> getJsActlogUrl() {
        if (this.jsActlogUrl == null) {
            this.jsActlogUrl = new C36821Ecj<>("js_actlog_url", "");
            this.cacheItems.add(this.jsActlogUrl);
        }
        return this.jsActlogUrl;
    }

    public C36821Ecj<Long> getLastCloseFeedUpdateDialogTime() {
        if (this.lastCloseFeedUpdateUserDialog == null) {
            this.lastCloseFeedUpdateUserDialog = new C36821Ecj<>("last_close_feed_update_user_dialog", 0L);
            this.cacheItems.add(this.lastCloseFeedUpdateUserDialog);
        }
        return this.lastCloseFeedUpdateUserDialog;
    }

    public C36821Ecj<Long> getLastCloseUpdateDialogTime() {
        if (this.lastCloseUpdateUserDialog == null) {
            this.lastCloseUpdateUserDialog = new C36821Ecj<>("last_close_update_user_dialog", 0L);
            this.cacheItems.add(this.lastCloseUpdateUserDialog);
        }
        return this.lastCloseUpdateUserDialog;
    }

    public C36821Ecj<Long> getLastFeedCount() {
        if (this.lastFeedCount == null) {
            this.lastFeedCount = new C36821Ecj<>("last_feed_count", 0L);
            this.cacheItems.add(this.lastFeedCount);
        }
        return this.lastFeedCount;
    }

    public C36821Ecj<Long> getLastFeedTime() {
        if (this.lastFeedTime == null) {
            this.lastFeedTime = new C36821Ecj<>("last_feed_time", 0L);
            this.cacheItems.add(this.lastFeedTime);
        }
        return this.lastFeedTime;
    }

    public C36821Ecj<Long> getLastFilterTime() {
        if (this.lastFilterTime == null) {
            this.lastFilterTime = new C36821Ecj<>("last_filter_time", 0L);
            this.cacheItems.add(this.lastFilterTime);
        }
        return this.lastFilterTime;
    }

    public C36821Ecj<Long> getLastGetRelieveAwemeTime() {
        if (this.lastGetRelieveAwemeTime == null) {
            this.lastGetRelieveAwemeTime = new C36821Ecj<>("has_relieve_aweme", 0L);
            this.cacheItems.add(this.lastGetRelieveAwemeTime);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public C36821Ecj<Long> getLastHintToastTime() {
        if (this.lastHintToastTime == null) {
            this.lastHintToastTime = new C36821Ecj<>("last_hint_toast_time", 0L);
            this.cacheItems.add(this.lastHintToastTime);
        }
        return this.lastHintToastTime;
    }

    public C36821Ecj<Long> getLastLockedTime() {
        if (this.lastLockedTime == null) {
            this.lastLockedTime = new C36821Ecj<>("last_append_video_time", 0L);
            this.cacheItems.add(this.lastLockedTime);
        }
        return this.lastLockedTime;
    }

    public C36821Ecj<Boolean> getLastPublishFailed() {
        if (this.lastPublishFailed == null) {
            this.lastPublishFailed = new C36821Ecj<>("last_publish_failed", Boolean.FALSE);
            this.cacheItems.add(this.lastPublishFailed);
        }
        return this.lastPublishFailed;
    }

    public C36821Ecj<Long> getLastShowBindHintTime() {
        if (this.lastShowBindHintTime == null) {
            this.lastShowBindHintTime = new C36821Ecj<>("lastShowBindHintTime", 0L);
            this.cacheItems.add(this.lastShowBindHintTime);
        }
        return this.lastShowBindHintTime;
    }

    public C36821Ecj<Long> getLastShowProfileBindHintTime() {
        if (this.lastShowProfileBindHintTime == null) {
            this.lastShowProfileBindHintTime = new C36821Ecj<>("lastShowProfileBindHintTime", 0L);
            this.cacheItems.add(this.lastShowProfileBindHintTime);
        }
        return this.lastShowProfileBindHintTime;
    }

    public C36821Ecj<Long> getLastUnlockTime() {
        if (this.lastUnlockTime == null) {
            this.lastUnlockTime = new C36821Ecj<>("last_unlock_time", 0L);
            this.cacheItems.add(this.lastUnlockTime);
        }
        return this.lastUnlockTime;
    }

    public C36821Ecj<Integer> getLastUsableNetworkSpeed() {
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new C36821Ecj<>("last_usable_network_speed", -1);
        }
        return this.lastUsableNetworkSpeed;
    }

    public C36821Ecj<Boolean> getLongVideoPermitted() {
        if (this.longVideoPermitted == null) {
            this.longVideoPermitted = new C36821Ecj<>("long_video_permitted", Boolean.FALSE);
            this.cacheItems.add(this.longVideoPermitted);
        }
        return this.longVideoPermitted;
    }

    public C36821Ecj<String> getMiniAppLabelTitle() {
        if (this.miniAppLabTitle == null) {
            this.miniAppLabTitle = new C36821Ecj<>("lab_title", "");
            this.cacheItems.add(this.miniAppLabTitle);
        }
        return this.miniAppLabTitle;
    }

    public C36821Ecj<String> getMpTab() {
        if (this.mpTab == null) {
            this.mpTab = new C36821Ecj<>("mp_tab", "");
            this.cacheItems.add(this.mpTab);
        }
        return this.mpTab;
    }

    public C36821Ecj<Integer> getMultiSelectLimitItem() {
        if (this.multiSelectLimit == null) {
            this.multiSelectLimit = new C36821Ecj<>("multi_select_limit", 10);
            this.cacheItems.add(this.multiSelectLimit);
        }
        return this.multiSelectLimit;
    }

    public C36821Ecj<Integer> getPrivacyAccountFollowCount() {
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new C36821Ecj<>("privacy_account_follow_count", 0);
        }
        return this.privacyAccountFollowCount;
    }

    public C36821Ecj<String> getPrivacyReminderH5Url() {
        if (this.privacyReminderH5Url == null) {
            this.privacyReminderH5Url = new C36821Ecj<>("privacy_reminder", "");
            this.cacheItems.add(this.privacyReminderH5Url);
        }
        return this.privacyReminderH5Url;
    }

    public C36821Ecj<Integer> getPromoteDialogPopupClickType() {
        if (this.promoteDialogPopupClickType == null) {
            this.promoteDialogPopupClickType = new C36821Ecj<>("promote_dialog_popup_click_type", 0);
            this.cacheItems.add(this.promoteDialogPopupClickType);
        }
        return this.promoteDialogPopupClickType;
    }

    public C36821Ecj<String> getPromoteDialogPopupPopupContent() {
        if (this.promoteDialogPopupPopupContent == null) {
            this.promoteDialogPopupPopupContent = new C36821Ecj<>("promote_dialog_popup_content", "");
            this.cacheItems.add(this.promoteDialogPopupPopupContent);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public C36821Ecj<Integer> getPromoteDialogPopupPopupInterval() {
        if (this.promoteDialogPopupPopupInterval == null) {
            this.promoteDialogPopupPopupInterval = new C36821Ecj<>("promote_dialog_popup_interval", 7);
            this.cacheItems.add(this.promoteDialogPopupPopupInterval);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public C36821Ecj<String> getPromoteDialogPopupPopupLinkText() {
        if (this.promoteDialogPopupPopupLinkText == null) {
            this.promoteDialogPopupPopupLinkText = new C36821Ecj<>("promote_dialog_popup_linkText", "");
            this.cacheItems.add(this.promoteDialogPopupPopupLinkText);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public C36821Ecj<String> getPromoteDialogPopupPopupMsg() {
        if (this.promoteDialogPopupPopupMsg == null) {
            this.promoteDialogPopupPopupMsg = new C36821Ecj<>("promote_dialog_popup_msg", "");
            this.cacheItems.add(this.promoteDialogPopupPopupMsg);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public C36821Ecj<String> getPromoteDialogPopupPopupTitle() {
        if (this.promoteDialogPopupPopupTitle == null) {
            this.promoteDialogPopupPopupTitle = new C36821Ecj<>("promote_dialog_popup_title", "");
            this.cacheItems.add(this.promoteDialogPopupPopupTitle);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public C36821Ecj<String> getPromoteDialogPopupPopupUrl() {
        if (this.promoteDialogPopupPopupUrl == null) {
            this.promoteDialogPopupPopupUrl = new C36821Ecj<>("promote_dialog_popup_url", "");
            this.cacheItems.add(this.promoteDialogPopupPopupUrl);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public C36821Ecj<Integer> getPromoteDialogPopupTimesLimit() {
        if (this.promoteDialogPopupTimesLimit == null) {
            this.promoteDialogPopupTimesLimit = new C36821Ecj<>("promote_dialog_popup_times_limit", 3);
            this.cacheItems.add(this.promoteDialogPopupTimesLimit);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public C36821Ecj<Boolean> getPromoteDialogShouldShow() {
        if (this.promoteDialogShouldShow == null) {
            this.promoteDialogShouldShow = new C36821Ecj<>("promote_dialog_show", Boolean.FALSE);
            this.cacheItems.add(this.promoteDialogShouldShow);
        }
        return this.promoteDialogShouldShow;
    }

    public C36821Ecj<String> getReferralEntrance() {
        if (this.referralEntrance == null) {
            this.referralEntrance = new C36821Ecj<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public C36821Ecj<Boolean> getRemoveFollowerSwitch() {
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new C36821Ecj<>("remove_follower_switch", Boolean.FALSE);
        }
        return this.removeFollowerSwitch;
    }

    public C36821Ecj<String> getRequestNotificationText() {
        if (this.requestNotificationText == null) {
            this.requestNotificationText = new C36821Ecj<>("request_notification_text", "");
            this.cacheItems.add(this.requestNotificationText);
        }
        return this.requestNotificationText;
    }

    public C36821Ecj<String> getRequestNotificationTitle() {
        if (this.requestNotificationTitle == null) {
            this.requestNotificationTitle = new C36821Ecj<>("request_notification_title", "");
            this.cacheItems.add(this.requestNotificationTitle);
        }
        return this.requestNotificationTitle;
    }

    public C36821Ecj<Boolean> getRnFallback() {
        if (this.rnFallback == null) {
            this.rnFallback = new C36821Ecj<>("rn_fallback", Boolean.FALSE);
            this.cacheItems.add(this.rnFallback);
        }
        return this.rnFallback;
    }

    public C36821Ecj<String> getSearchTabIndex() {
        if (this.searchTabIndex == null) {
            this.searchTabIndex = new C36821Ecj<>("search_tab_index", "");
            this.cacheItems.add(this.searchTabIndex);
        }
        return this.searchTabIndex;
    }

    public C36821Ecj<String> getSelectedDoNotTranslateLanguages() {
        if (this.selectedDoNotTransLanguages == null) {
            this.selectedDoNotTransLanguages = new C36821Ecj<>("user_all_do_not_trans_languages", "");
            this.cacheItems.add(this.selectedDoNotTransLanguages);
        }
        return this.selectedDoNotTransLanguages;
    }

    public C36821Ecj<String> getSelectedTranslationLanguage() {
        if (this.selectedTranslationLanguage == null) {
            this.selectedTranslationLanguage = new C36821Ecj<>("selected_translation_language", "");
            this.cacheItems.add(this.selectedTranslationLanguage);
        }
        return this.selectedTranslationLanguage;
    }

    public C36821Ecj<Boolean> getShouldShowCreatorFundAccountUpgradeInProfile() {
        if (this.shouldShowCreatorFundAccountUpgradeInProfile == null) {
            this.shouldShowCreatorFundAccountUpgradeInProfile = new C36821Ecj<>("show_creator_fund_account_upgrade_in_profile", Boolean.FALSE);
            this.cacheItems.add(this.shouldShowCreatorFundAccountUpgradeInProfile);
        }
        return this.shouldShowCreatorFundAccountUpgradeInProfile;
    }

    public C36821Ecj<Boolean> getShouldShowFavouriteTip() {
        if (this.shouldShowFavouriteTip == null) {
            this.shouldShowFavouriteTip = new C36821Ecj<>("should_show_favourite_tip", Boolean.TRUE);
            this.cacheItems.add(this.shouldShowFavouriteTip);
        }
        return this.shouldShowFavouriteTip;
    }

    public C36821Ecj<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            this.shouldShowPrivateAccountTipInProfile = new C36821Ecj<>("show_private_account_tip_in_profile", Boolean.FALSE);
            this.cacheItems.add(this.shouldShowPrivateAccountTipInProfile);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public C36821Ecj<Boolean> getShowAdIntroItem() {
        if (this.showAdIntroFlag == null) {
            this.showAdIntroFlag = new C36821Ecj<>("is_show_ad_intro", Boolean.FALSE);
            this.cacheItems.add(this.showAdIntroFlag);
        }
        return this.showAdIntroFlag;
    }

    public C36821Ecj<Boolean> getShowAddBusinessGoodsDot() {
        if (this.showAddBusinessGoodsDot == null) {
            this.showAddBusinessGoodsDot = new C36821Ecj<>("show_add_business_dot", Boolean.TRUE);
            this.cacheItems.add(this.showAddBusinessGoodsDot);
        }
        return this.showAddBusinessGoodsDot;
    }

    public C36821Ecj<Integer> getShowBindHintCount() {
        if (this.showBindHintCount == null) {
            this.showBindHintCount = new C36821Ecj<>("showBindHintCount", 0);
            this.cacheItems.add(this.showBindHintCount);
        }
        return this.showBindHintCount;
    }

    public C36821Ecj<Integer> getShowHashTagBg() {
        if (this.showHashTagBg == null) {
            this.showHashTagBg = new C36821Ecj<>("enable_hashtag_background", 0);
            this.cacheItems.add(this.showHashTagBg);
        }
        return this.showHashTagBg;
    }

    public C36821Ecj<Boolean> getShowPlayerInfoUI() {
        if (this.showPlayerInfoUI == null) {
            this.showPlayerInfoUI = new C36821Ecj<>("show_player_info_ui", Boolean.FALSE);
            this.cacheItems.add(this.showPlayerInfoUI);
        }
        return this.showPlayerInfoUI;
    }

    public C36821Ecj<Integer> getShowProfileBindHintCount() {
        if (this.showProfileBindHintCount == null) {
            this.showProfileBindHintCount = new C36821Ecj<>("showProfileBindHintCount", 0);
            this.cacheItems.add(this.showProfileBindHintCount);
        }
        return this.showProfileBindHintCount;
    }

    public C36821Ecj<Integer> getShowPromoteLicense() {
        if (this.showPromoteLicense == null) {
            this.showPromoteLicense = new C36821Ecj<>("show_creator_license_210", 0);
            this.cacheItems.add(this.showPromoteLicense);
        }
        return this.showPromoteLicense;
    }

    public C36821Ecj<Boolean> getShowTimeLineTab() {
        if (this.showTimeLineTab == null) {
            this.showTimeLineTab = new C36821Ecj<>("show_timeline_tab", Boolean.FALSE);
            this.cacheItems.add(this.showTimeLineTab);
        }
        return this.showTimeLineTab;
    }

    public C36821Ecj<Boolean> getShowVideoBitrateInfo() {
        if (this.showVideoBitrateInfo == null) {
            this.showVideoBitrateInfo = new C36821Ecj<>("showVideoBitrateInfo", Boolean.FALSE);
            this.cacheItems.add(this.showVideoBitrateInfo);
        }
        return this.showVideoBitrateInfo;
    }

    public C36821Ecj<Boolean> getStickerArtEntry() {
        if (this.stickerArtEntry == null) {
            this.stickerArtEntry = new C36821Ecj<>("sticker_artist_entry", Boolean.FALSE);
            this.cacheItems.add(this.stickerArtEntry);
        }
        return this.stickerArtEntry;
    }

    public C36821Ecj<String> getStickerArtlistUrl() {
        if (this.stickerArtlistUrl == null) {
            this.stickerArtlistUrl = new C36821Ecj<>("sticker_artlist_url", "");
            this.cacheItems.add(this.stickerArtlistUrl);
        }
        return this.stickerArtlistUrl;
    }

    public C36821Ecj<Integer> getStoryInfoStickerMaxCount() {
        if (this.storyInfoStickerMaxCount == null) {
            this.storyInfoStickerMaxCount = new C36821Ecj<>("story_info_sticker_max_count", 30);
            this.cacheItems.add(this.storyInfoStickerMaxCount);
        }
        return this.storyInfoStickerMaxCount;
    }

    public C36821Ecj<Boolean> getStoryPublishFriendsBanner() {
        if (this.storyPublishFriendsDuoshanBanner == null) {
            this.storyPublishFriendsDuoshanBanner = new C36821Ecj<>("story_publish_friend_banner", Boolean.FALSE);
        }
        return this.storyPublishFriendsDuoshanBanner;
    }

    public C36821Ecj<Boolean> getStoryPublishSaveLocal() {
        if (this.storyPublishSaveLocal == null) {
            this.storyPublishSaveLocal = new C36821Ecj<>("story_publish_save_local", Boolean.TRUE);
            this.cacheItems.add(this.storyPublishSaveLocal);
        }
        return this.storyPublishSaveLocal;
    }

    public C36821Ecj<Boolean> getStoryRecordGuideShow() {
        if (this.storyRecordGuideShow == null) {
            this.storyRecordGuideShow = new C36821Ecj<>("story_record_guide_show", Boolean.FALSE);
        }
        return this.storyRecordGuideShow;
    }

    public C36821Ecj<String> getStoryRegisterPublishSyncHintContent() {
        if (this.storyRegisterPublishSyncHintContent == null) {
            this.storyRegisterPublishSyncHintContent = new C36821Ecj<>("story_publish_register_sync_hint_content", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintContent);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public C36821Ecj<String> getStoryRegisterPublishSyncHintH5Str() {
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            this.storyRegisterPublishSyncHintH5Str = new C36821Ecj<>("story_publish_register_sync_hint_h5", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Str);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public C36821Ecj<String> getStoryRegisterPublishSyncHintH5Url() {
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            this.storyRegisterPublishSyncHintH5Url = new C36821Ecj<>("story_publish_register_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Url);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public C36821Ecj<String> getStoryRegisterPublishSyncHintTitle() {
        if (this.storyRegisterPublishSyncHintTitle == null) {
            this.storyRegisterPublishSyncHintTitle = new C36821Ecj<>("story_publish_register_sync_hint_title", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintTitle);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public C36821Ecj<Boolean> getStorySettingDoudouPhoto() {
        if (this.storySettingDoudouPhoto == null) {
            this.storySettingDoudouPhoto = new C36821Ecj<>("story_setting_duodou_photo", Boolean.TRUE);
        }
        return this.storySettingDoudouPhoto;
    }

    public C36821Ecj<Boolean> getStorySettingManualOpenDoudou() {
        if (this.storySettingManualOpenDoudou == null) {
            this.storySettingManualOpenDoudou = new C36821Ecj<>("story_setting_manual_open_doudou", Boolean.FALSE);
            this.cacheItems.add(this.storySettingManualOpenDoudou);
        }
        return this.storySettingManualOpenDoudou;
    }

    public C36821Ecj<Integer> getStorySettingReplyPermission() {
        if (this.storySettingReplyPermission == null) {
            this.storySettingReplyPermission = new C36821Ecj<>("story_setting_reply_permission", 0);
        }
        return this.storySettingReplyPermission;
    }

    public C36821Ecj<Boolean> getStorySettingSyncDuoshan() {
        if (this.storySettingSyncDuoshan == null) {
            this.storySettingSyncDuoshan = new C36821Ecj<>("story_setting_sync_duoshan", Boolean.FALSE);
        }
        return this.storySettingSyncDuoshan;
    }

    public C36821Ecj<Integer> getStorySettingSyncToast() {
        if (this.storySettingSyncToast == null) {
            this.storySettingSyncToast = new C36821Ecj<>("story_setting_sync_toast", 0);
            this.cacheItems.add(this.storySettingSyncToast);
        }
        return this.storySettingSyncToast;
    }

    public C36821Ecj<Integer> getStorySettingViewPermission() {
        if (this.storySettingViewPermission == null) {
            this.storySettingViewPermission = new C36821Ecj<>("story_setting_view_permission", 0);
        }
        return this.storySettingViewPermission;
    }

    public C36821Ecj<Integer> getStoryTextStickerMaxCount() {
        if (this.storyTextStickerMaxCount == null) {
            this.storyTextStickerMaxCount = new C36821Ecj<>("story_text_sticker_max_count", 30);
            this.cacheItems.add(this.storyTextStickerMaxCount);
        }
        return this.storyTextStickerMaxCount;
    }

    public C36821Ecj<String> getStoryUnRegisterPublishSyncHintContent() {
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            this.storyUnRegisterPublishSyncHintContent = new C36821Ecj<>("story_publish_unregister_sync_hint_content", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintContent);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public C36821Ecj<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            this.storyUnRegisterPublishSyncHintH5Str = new C36821Ecj<>("story_publish_unregister_sync_hint_h5", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Str);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public C36821Ecj<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            this.storyUnRegisterPublishSyncHintH5Url = new C36821Ecj<>("story_publish_unregister_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Url);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public C36821Ecj<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            this.storyUnRegisterPublishSyncHintTitle = new C36821Ecj<>("story_publish_unregister_sync_hint_title", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintTitle);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public C36821Ecj<Long> getTodayVideoPlayTime() {
        if (this.todayVideoPlayTime == null) {
            this.todayVideoPlayTime = new C36821Ecj<>("today_video_play_time", 0L);
            this.cacheItems.add(this.todayVideoPlayTime);
        }
        return this.todayVideoPlayTime;
    }

    public C36821Ecj<String> getTwitterAccessToken() {
        if (this.twitterAccessToken == null) {
            this.twitterAccessToken = new C36821Ecj<>("twitter_access_token", "");
            this.cacheItems.add(this.twitterAccessToken);
        }
        return this.twitterAccessToken;
    }

    public C36821Ecj<String> getTwitterSecret() {
        if (this.twitterSecret == null) {
            this.twitterSecret = new C36821Ecj<>("twitter_secret", "");
            this.cacheItems.add(this.twitterSecret);
        }
        return this.twitterSecret;
    }

    public C36821Ecj<Integer> getUltraResolutionLevel() {
        if (this.ultraResolutionLevel == null) {
            this.ultraResolutionLevel = new C36821Ecj<>("ultra_resolution_level", 0);
            this.cacheItems.add(this.ultraResolutionLevel);
        }
        return this.ultraResolutionLevel;
    }

    public C36821Ecj<Integer> getUpGuideNum() {
        if (this.upGuideNum == null) {
            this.upGuideNum = new C36821Ecj<>("up_guide_num", -1);
            this.cacheItems.add(this.upGuideNum);
        }
        return this.upGuideNum;
    }

    public C36821Ecj<Integer> getUpdateUserFrequency() {
        if (this.updateUserFrequency == null) {
            this.updateUserFrequency = new C36821Ecj<>("update_user_frequency", 0);
            this.cacheItems.add(this.updateUserFrequency);
        }
        return this.updateUserFrequency;
    }

    public C36821Ecj<Integer> getUpdateUserPosition() {
        if (this.updateUserPosition == null) {
            this.updateUserPosition = new C36821Ecj<>("update_user_position", -1);
            this.cacheItems.add(this.updateUserPosition);
        }
        return this.updateUserPosition;
    }

    public C36821Ecj<String> getUpdateUserTipContent() {
        if (this.updateUserTipContent == null) {
            this.updateUserTipContent = new C36821Ecj<>("update_user_tip_content", "");
            this.cacheItems.add(this.updateUserTipContent);
        }
        return this.updateUserTipContent;
    }

    public C36821Ecj<Boolean> getUseCronet() {
        if (this.useCronet == null) {
            this.useCronet = new C36821Ecj<>("use_cronet", Boolean.TRUE);
            this.cacheItems.add(this.useCronet);
        }
        return this.useCronet;
    }

    public C36821Ecj<Boolean> getUseDefaultHost() {
        if (this.useDefaultHost == null) {
            this.useDefaultHost = new C36821Ecj<>("use_default_host", true);
            this.cacheItems.add(this.useDefaultHost);
        }
        return this.useDefaultHost;
    }

    public C36821Ecj<Boolean> getUseHttps() {
        C36821Ecj<Boolean> c36821Ecj;
        synchronized (this.mUseHttpsLock) {
            if (this.useHttps == null) {
                this.useHttps = new C36821Ecj<>("use_https", Boolean.TRUE);
                this.cacheItems.add(this.useHttps);
            }
            c36821Ecj = this.useHttps;
        }
        return c36821Ecj;
    }

    public C36821Ecj<Boolean> getUseNewPackageNow() {
        if (this.mUseNewPackageNow == null) {
            this.mUseNewPackageNow = new C36821Ecj<>("use_new_package_now", Boolean.FALSE);
            this.cacheItems.add(this.mUseNewPackageNow);
        }
        return this.mUseNewPackageNow;
    }

    public C36821Ecj<String> getUserAddLanguages() {
        synchronized (this.mAddLanguageLock) {
            if (this.selectedContentLanguages == null) {
                this.selectedContentLanguages = new C36821Ecj<>("user_add_languages", "");
                this.cacheItems.add(this.selectedContentLanguages);
            }
        }
        return this.selectedContentLanguages;
    }

    public C36821Ecj<String> getUserCurrentRegion() {
        if (this.userCurrentRegion == null) {
            this.userCurrentRegion = new C36821Ecj<>("user_current_region", "");
            this.cacheItems.add(this.userCurrentRegion);
        }
        return this.userCurrentRegion;
    }

    public C36821Ecj<Boolean> getUserHasPassword() {
        if (this.userHasPassword == null) {
            this.userHasPassword = new C36821Ecj<>("user_has_password", Boolean.FALSE);
            this.cacheItems.add(this.userHasPassword);
        }
        return this.userHasPassword;
    }

    public C36821Ecj<String> getUserResidence() {
        if (this.userResidence == null) {
            this.userResidence = new C36821Ecj<>("user_residence", "");
            this.cacheItems.add(this.userResidence);
        }
        return this.userResidence;
    }

    public C36821Ecj<Integer> getVerifyExceed() {
        if (this.verifyExceed == null) {
            this.verifyExceed = new C36821Ecj<>("verify_exceed", 5);
            this.cacheItems.add(this.verifyExceed);
        }
        return this.verifyExceed;
    }

    public C36821Ecj<Boolean> getVideoPreload() {
        if (this.videoPreload == null) {
            this.videoPreload = new C36821Ecj<>("video_preload", Boolean.TRUE);
            this.cacheItems.add(this.videoPreload);
        }
        return this.videoPreload;
    }

    public C36821Ecj<Integer> getWeakNetPreLoadSwitch() {
        if (this.weakNetPreLoadSwitch == null) {
            this.weakNetPreLoadSwitch = new C36821Ecj<>("weak_net_pre_load_switch", 1);
            this.cacheItems.add(this.weakNetPreLoadSwitch);
        }
        return this.weakNetPreLoadSwitch;
    }

    public C36821Ecj<Boolean> hasShowHighQualityVideoTips() {
        if (this.hasShowHighQualityVideoTips == null) {
            this.hasShowHighQualityVideoTips = new C36821Ecj<>("has_show_high_quality_video_tips", Boolean.FALSE);
            this.cacheItems.add(this.hasShowHighQualityVideoTips);
        }
        return this.hasShowHighQualityVideoTips;
    }

    public C36821Ecj<Boolean> isEnableMessagePb2Json() {
        if (this.enableMessagePb2Json == null) {
            this.enableMessagePb2Json = new C36821Ecj<>("live_enanble_message_pb2json", Boolean.FALSE);
            this.cacheItems.add(this.enableMessagePb2Json);
        }
        return this.enableMessagePb2Json;
    }

    public C36821Ecj<Boolean> isFirstPublishSync() {
        if (this.isFirstPublishSync == null) {
            this.isFirstPublishSync = new C36821Ecj<>("is_first_publish", Boolean.TRUE);
            this.cacheItems.add(this.isFirstPublishSync);
        }
        return this.isFirstPublishSync;
    }

    public C36821Ecj<Boolean> isHighQualityVideo() {
        if (this.isHighQualityVideo == null) {
            this.isHighQualityVideo = new C36821Ecj<>("is_high_quality_video", Boolean.FALSE);
            this.cacheItems.add(this.isHighQualityVideo);
        }
        return this.isHighQualityVideo;
    }

    public C36821Ecj<Boolean> isInUltraResBlackList() {
        if (this.inUltraResBlackList == null) {
            this.inUltraResBlackList = new C36821Ecj<>("in_ultra_resolution_black_list", Boolean.FALSE);
            this.cacheItems.add(this.inUltraResBlackList);
        }
        return this.inUltraResBlackList;
    }

    public C36821Ecj<Boolean> isNpthEnable() {
        if (this.isNpthEnable == null) {
            this.isNpthEnable = new C36821Ecj<>("is_npth_enable", Boolean.FALSE);
            this.cacheItems.add(this.isNpthEnable);
        }
        return this.isNpthEnable;
    }

    public C36821Ecj<Boolean> isOb() {
        if (this.isOb == null) {
            this.isOb = new C36821Ecj<>("is_ob", Boolean.FALSE);
            this.cacheItems.add(this.isOb);
        }
        return this.isOb;
    }

    public C36821Ecj<Boolean> isPublishSyncToHuoshan() {
        if (this.isPublishSyncToHuoshan == null) {
            this.isPublishSyncToHuoshan = new C36821Ecj<>("is_publish_sync_huoshan", Boolean.TRUE);
            this.cacheItems.add(this.isPublishSyncToHuoshan);
        }
        return this.isPublishSyncToHuoshan;
    }

    public C36821Ecj<Boolean> isShowInviteContactsFriends() {
        if (this.showInvitedContactsFriends == null) {
            this.showInvitedContactsFriends = new C36821Ecj<>("invite_friends_settings", Boolean.FALSE);
            this.cacheItems.add(this.showInvitedContactsFriends);
        }
        return this.showInvitedContactsFriends;
    }

    public C36821Ecj<Boolean> isSyncToHuoshan() {
        if (this.isSyncToHuoshan == null) {
            this.isSyncToHuoshan = new C36821Ecj<>("is_sync_to_huoshan", Boolean.FALSE);
            this.cacheItems.add(this.isSyncToHuoshan);
        }
        return this.isSyncToHuoshan;
    }

    public C36821Ecj<Boolean> liveAgreement() {
        if (this.liveAgreement == null) {
            this.liveAgreement = new C36821Ecj<>("live_agreement", Boolean.FALSE);
            this.cacheItems.add(this.liveAgreement);
        }
        return this.liveAgreement;
    }

    public C36821Ecj<Boolean> liveAnswer() {
        if (this.liveAnswer == null) {
            this.liveAnswer = new C36821Ecj<>("live_answer", Boolean.FALSE);
            this.cacheItems.add(this.liveAnswer);
        }
        return this.liveAnswer;
    }

    public C36821Ecj<Boolean> liveContactsVerify() {
        if (this.liveContactsVerify == null) {
            this.liveContactsVerify = new C36821Ecj<>("live_contacts_verify", Boolean.FALSE);
            this.cacheItems.add(this.liveContactsVerify);
        }
        return this.liveContactsVerify;
    }

    public C36821Ecj<Boolean> mockLiveMoney() {
        if (this.mockLiveMoney == null) {
            this.mockLiveMoney = new C36821Ecj<>("mock_live_money", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveMoney);
        }
        return this.mockLiveMoney;
    }

    public C36821Ecj<Boolean> mockLiveResolution() {
        if (this.mockLiveResolution == null) {
            this.mockLiveResolution = new C36821Ecj<>("mock_live_resolution", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveResolution);
        }
        return this.mockLiveResolution;
    }

    public C36821Ecj<Boolean> mockLiveSend() {
        if (this.mockLiveSend == null) {
            this.mockLiveSend = new C36821Ecj<>("mock_live_send", Boolean.FALSE);
            this.cacheItems.add(this.mockLiveSend);
        }
        return this.mockLiveSend;
    }

    public SharePrefCache() {
        this.recentList = Arrays.asList("IN", "NP", "PK", "LK");
        this.cacheItems = FII.LIZ();
        this.mUseHttpsLock = new Object();
        this.mAddLanguageLock = new Object();
        this.mSharedPreferences = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme-app");
    }

    public void clearCache() {
        collectAllItemsIfNeed();
        for (C36821Ecj c36821Ecj : this.cacheItems) {
            c36821Ecj.LIZJ(c36821Ecj.LIZ);
        }
    }

    public boolean getImCommentForwardEnabled() {
        return getImCommentForwardEnabledItem().LIZ().booleanValue();
    }

    public boolean getIsFirstPublishAweme() {
        return getFirstPublishAwemeItem().LIZ().booleanValue();
    }

    public boolean getIsFirstPublishComment() {
        return getFirstPublishCommentItem().LIZ().booleanValue();
    }

    public int getMultiSelectLimit() {
        return getMultiSelectLimitItem().LIZ().intValue();
    }

    public static SharePrefCache inst() {
        return C54291LSl.LIZ;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    public void setCurrentLocaleLanguage(String str) {
        getCurrentLocaleLanguage().LIZLLL(str);
    }

    public void setImCommentForwardEnabled(boolean z) {
        getImCommentForwardEnabledItem().LIZLLL(Boolean.valueOf(z));
    }

    public void setInvitedContacts(String str) {
        getInvitedContacts().LIZLLL(str);
    }

    public void setIsFirstPublishAweme(boolean z) {
        getFirstPublishAwemeItem().LIZLLL(Boolean.valueOf(z));
    }

    public void setIsFirstPublishComment(boolean z) {
        getFirstPublishCommentItem().LIZLLL(Boolean.valueOf(z));
    }

    public void setMultiSelectLimit(int i) {
        getMultiSelectLimitItem().LIZLLL(Integer.valueOf(i));
    }

    public void setShowAddBusinessGoodsDot(boolean z) {
        getShowAddBusinessGoodsDot().LIZLLL(Boolean.valueOf(z));
    }

    public void setShowInvitedContactsFriends(Boolean bool) {
        isShowInviteContactsFriends().LIZLLL(bool);
    }
}

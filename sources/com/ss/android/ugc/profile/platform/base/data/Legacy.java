package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.AGSWarning;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.CreatorFundBannerSetting;
import com.ss.android.ugc.aweme.profile.model.DspProfile;
import com.ss.android.ugc.aweme.profile.model.ShieldEditFieldInfo;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import com.ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.ss.android.ugc.profile.platform.business.popup.PaidContentBannerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class Legacy {

    @InterfaceC65349Pkn("accept_private_policy")
    public Boolean acceptPrivatePolicy;

    @InterfaceC65349Pkn("age_gate_action")
    public Integer ageGateAction;

    @InterfaceC65349Pkn("age_gate_info")
    public AgeGateInfo ageGateInfo;

    @InterfaceC65349Pkn("age_gate_post_action")
    public Integer ageGatePostAction;

    @InterfaceC65349Pkn("age_gate_time")
    public long ageGateTime;

    @InterfaceC65349Pkn("ags_warning")
    public AGSWarning agsWarning;

    @InterfaceC65349Pkn("avatar_update_reminder")
    public Boolean avatarUpdateReminder;

    @InterfaceC65349Pkn("bind_phone")
    public String bindPhone;

    @InterfaceC65349Pkn("bio_permission")
    public UserBioPermission bioPermission;

    @InterfaceC65349Pkn("can_set_geofencing")
    public Boolean canSetGeoFencing;

    @InterfaceC65349Pkn("cancel_type")
    public Integer cancelType;

    @InterfaceC65349Pkn("comment_setting")
    public Integer commentSetting;

    @InterfaceC65349Pkn("commerce_permissions")
    public CommercePermissionStruct commercePermission;

    @InterfaceC65349Pkn("commerce_user_info")
    public CommerceUserInfo commerceUserInfo;

    @InterfaceC65349Pkn("creator_fund_info_struct")
    public CreatorFundBannerSetting creatorFundBannerSetting;

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("display_qna_on_profile")
    public Integer displayQnaOnProfile;

    @InterfaceC65349Pkn("download_setting")
    public Integer downloadSetting;

    @InterfaceC65349Pkn("dsp_profile")
    public DspProfile dspProfile;

    @InterfaceC65349Pkn("email")
    public String email;

    @InterfaceC65349Pkn("enable_subscription")
    public Boolean enableSubscription;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @InterfaceC65349Pkn("force_private_account")
    public Boolean forcePrivateAccount;

    @InterfaceC65349Pkn("gift_bag_status")
    public Integer giftBagStatus;

    @InterfaceC65349Pkn("analytics_status")
    public Boolean hasAnalyticsMetrics;

    @InterfaceC65349Pkn("has_email")
    public Boolean hasEmail;

    @InterfaceC65349Pkn("content_language_already_popup")
    public Boolean isContentLanguageDialogShown;

    @InterfaceC65349Pkn("has_insights")
    public Boolean isCreater;

    @InterfaceC65349Pkn("is_email_verified")
    public Boolean isEmailVerified;

    @InterfaceC65349Pkn("is_phone_binded")
    public Boolean isPhoneBinded;

    @InterfaceC65349Pkn("is_pro_account")
    public Boolean isProAccount;

    @InterfaceC65349Pkn("tt_mall_tab_related_user_info")
    public TTMallTabRelatedUserInfo mallTabUserInfo;

    @InterfaceC65349Pkn("music_compliance_account")
    public Integer musicComplianceAccount;

    @InterfaceC65349Pkn("nickname_modify_time")
    public Integer nickNameModifyTs;

    @InterfaceC65349Pkn("notify_minor_private_policy")
    public Boolean notifyPrivatePolicy;

    @InterfaceC65349Pkn("paid_content_banner_info")
    public PaidContentBannerInfo paidContentBannerInfo;

    @InterfaceC65349Pkn("post_default_download_setting")
    public Boolean postDefaultDownloadSetting;

    @InterfaceC65349Pkn("predicted_age_group")
    public String predictedAgeGroup;

    @InterfaceC65349Pkn("pro_account_tcm_red_dot")
    public Boolean proAccountTcmRedDot;

    @InterfaceC65349Pkn("shield_edit_field_info")
    public List<ShieldEditFieldInfo> shieldEditFieldInfoList;

    @InterfaceC65349Pkn("show_effect_list")
    public Boolean showEffectList;

    @InterfaceC65349Pkn("show_tip_entry")
    public Boolean showTipEntry;

    @InterfaceC65349Pkn("social_data")
    public SocialDataStruct socialData;

    @InterfaceC65349Pkn("special_account")
    public SpecialAccount specialAccount;

    @InterfaceC65349Pkn("story_status")
    public Integer storyStatus;

    @InterfaceC65349Pkn("user_canceled")
    public Boolean userCancelled;

    @InterfaceC65349Pkn("user_inactive")
    public Boolean userInactive;

    @InterfaceC65349Pkn("user_mode")
    public int userMode;

    @InterfaceC65349Pkn("verification_badge_type")
    public Integer verificationBadgeType;

    @InterfaceC65349Pkn("video_gift_status")
    public Integer videoGiftStatus;

    @InterfaceC65349Pkn("youtube_last_refresh_time")
    public long youTubeLastRefreshTime;

    @InterfaceC65349Pkn("youtube_refresh_token")
    public String youTubeRefreshToken;

    @InterfaceC65349Pkn("yt_raw_token")
    public String youtubeRawRefreshToken;

    @InterfaceC65349Pkn("shield_follow_notice")
    public Integer shieldFollowNotice = 0;

    @InterfaceC65349Pkn("shield_digg_notice")
    public Integer shieldDiggNotice = 0;

    @InterfaceC65349Pkn("shield_comment_notice")
    public Integer shieldCommentNotice = 0;

    @InterfaceC65349Pkn("verification_type")
    public Integer verificationType = 0;

    @InterfaceC65349Pkn("commerce_user_level")
    public Integer commerceUserLevel = 0;

    @InterfaceC65349Pkn("unique_id_modify_time")
    public Long uniqueIdModifyTime = 0L;

    public static /* synthetic */ void getYouTubeRefreshToken$annotations() {
    }

    public Legacy() {
        Boolean bool = Boolean.FALSE;
        this.isPhoneBinded = bool;
        this.acceptPrivatePolicy = bool;
        this.userCancelled = bool;
        this.hasEmail = bool;
        this.commentSetting = 0;
        this.downloadSetting = 0;
        this.isCreater = bool;
        this.userMode = -1;
        this.forcePrivateAccount = bool;
        this.isProAccount = bool;
        this.isEmailVerified = bool;
        this.avatarUpdateReminder = bool;
        this.isContentLanguageDialogShown = bool;
        this.verificationBadgeType = 0;
        this.postDefaultDownloadSetting = bool;
        this.proAccountTcmRedDot = bool;
        this.canSetGeoFencing = bool;
        this.cancelType = 0;
        this.musicComplianceAccount = 0;
        this.showEffectList = bool;
        this.ageGateAction = 0;
        this.ageGatePostAction = 0;
        this.notifyPrivatePolicy = bool;
        this.videoGiftStatus = 0;
        this.hasAnalyticsMetrics = bool;
        this.showTipEntry = bool;
        this.storyStatus = -1;
        this.enableSubscription = bool;
        this.predictedAgeGroup = "";
        this.giftBagStatus = 0;
        this.userInactive = bool;
        this.nickNameModifyTs = 0;
    }

    public final Boolean getAcceptPrivatePolicy() {
        return this.acceptPrivatePolicy;
    }

    public final Integer getAgeGateAction() {
        return this.ageGateAction;
    }

    public final AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public final Integer getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final long getAgeGateTime() {
        return this.ageGateTime;
    }

    public final AGSWarning getAgsWarning() {
        return this.agsWarning;
    }

    public final Boolean getAvatarUpdateReminder() {
        return this.avatarUpdateReminder;
    }

    public final String getBindPhone() {
        return this.bindPhone;
    }

    public final UserBioPermission getBioPermission() {
        return this.bioPermission;
    }

    public final Boolean getCanSetGeoFencing() {
        return this.canSetGeoFencing;
    }

    public final Integer getCancelType() {
        return this.cancelType;
    }

    public final Integer getCommentSetting() {
        return this.commentSetting;
    }

    public final CommercePermissionStruct getCommercePermission() {
        return this.commercePermission;
    }

    public final CommerceUserInfo getCommerceUserInfo() {
        return this.commerceUserInfo;
    }

    public final Integer getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public final CreatorFundBannerSetting getCreatorFundBannerSetting() {
        return this.creatorFundBannerSetting;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final Integer getDisplayQnaOnProfile() {
        return this.displayQnaOnProfile;
    }

    public final Integer getDownloadSetting() {
        return this.downloadSetting;
    }

    public final DspProfile getDspProfile() {
        return this.dspProfile;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getEnableSubscription() {
        return this.enableSubscription;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Boolean getForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public final Integer getGiftBagStatus() {
        return this.giftBagStatus;
    }

    public final Boolean getHasAnalyticsMetrics() {
        return this.hasAnalyticsMetrics;
    }

    public final Boolean getHasEmail() {
        return this.hasEmail;
    }

    public final TTMallTabRelatedUserInfo getMallTabUserInfo() {
        return this.mallTabUserInfo;
    }

    public final Integer getMusicComplianceAccount() {
        return this.musicComplianceAccount;
    }

    public final Integer getNickNameModifyTs() {
        return this.nickNameModifyTs;
    }

    public final Boolean getNotifyPrivatePolicy() {
        return this.notifyPrivatePolicy;
    }

    public final PaidContentBannerInfo getPaidContentBannerInfo() {
        return this.paidContentBannerInfo;
    }

    public final Boolean getPostDefaultDownloadSetting() {
        return this.postDefaultDownloadSetting;
    }

    public final String getPredictedAgeGroup() {
        return this.predictedAgeGroup;
    }

    public final Boolean getProAccountTcmRedDot() {
        return this.proAccountTcmRedDot;
    }

    public final Integer getShieldCommentNotice() {
        return this.shieldCommentNotice;
    }

    public final Integer getShieldDiggNotice() {
        return this.shieldDiggNotice;
    }

    public final List<ShieldEditFieldInfo> getShieldEditFieldInfoList() {
        return this.shieldEditFieldInfoList;
    }

    public final Integer getShieldFollowNotice() {
        return this.shieldFollowNotice;
    }

    public final Boolean getShowEffectList() {
        return this.showEffectList;
    }

    public final Boolean getShowTipEntry() {
        return this.showTipEntry;
    }

    public final SocialDataStruct getSocialData() {
        return this.socialData;
    }

    public final SpecialAccount getSpecialAccount() {
        return this.specialAccount;
    }

    public final Integer getStoryStatus() {
        return this.storyStatus;
    }

    public final Long getUniqueIdModifyTime() {
        return this.uniqueIdModifyTime;
    }

    public final Boolean getUserCancelled() {
        return this.userCancelled;
    }

    public final Boolean getUserInactive() {
        return this.userInactive;
    }

    public final int getUserMode() {
        return this.userMode;
    }

    public final Integer getVerificationBadgeType() {
        return this.verificationBadgeType;
    }

    public final Integer getVerificationType() {
        return this.verificationType;
    }

    public final Integer getVideoGiftStatus() {
        return this.videoGiftStatus;
    }

    public final long getYouTubeLastRefreshTime() {
        return this.youTubeLastRefreshTime;
    }

    public final String getYouTubeRefreshToken() {
        return this.youTubeRefreshToken;
    }

    public final String getYoutubeRawRefreshToken() {
        return this.youtubeRawRefreshToken;
    }

    public final Boolean isContentLanguageDialogShown() {
        return this.isContentLanguageDialogShown;
    }

    public final Boolean isCreater() {
        return this.isCreater;
    }

    public final Boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public final Boolean isPhoneBinded() {
        return this.isPhoneBinded;
    }

    public final Boolean isProAccount() {
        return this.isProAccount;
    }

    public final void setAcceptPrivatePolicy(Boolean bool) {
        this.acceptPrivatePolicy = bool;
    }

    public final void setAgeGateAction(Integer num) {
        this.ageGateAction = num;
    }

    public final void setAgeGateInfo(AgeGateInfo ageGateInfo) {
        this.ageGateInfo = ageGateInfo;
    }

    public final void setAgeGatePostAction(Integer num) {
        this.ageGatePostAction = num;
    }

    public final void setAgeGateTime(long j) {
        this.ageGateTime = j;
    }

    public final void setAgsWarning(AGSWarning aGSWarning) {
        this.agsWarning = aGSWarning;
    }

    public final void setAvatarUpdateReminder(Boolean bool) {
        this.avatarUpdateReminder = bool;
    }

    public final void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public final void setBioPermission(UserBioPermission userBioPermission) {
        this.bioPermission = userBioPermission;
    }

    public final void setCanSetGeoFencing(Boolean bool) {
        this.canSetGeoFencing = bool;
    }

    public final void setCancelType(Integer num) {
        this.cancelType = num;
    }

    public final void setCommentSetting(Integer num) {
        this.commentSetting = num;
    }

    public final void setCommercePermission(CommercePermissionStruct commercePermissionStruct) {
        this.commercePermission = commercePermissionStruct;
    }

    public final void setCommerceUserInfo(CommerceUserInfo commerceUserInfo) {
        this.commerceUserInfo = commerceUserInfo;
    }

    public final void setCommerceUserLevel(Integer num) {
        this.commerceUserLevel = num;
    }

    public final void setContentLanguageDialogShown(Boolean bool) {
        this.isContentLanguageDialogShown = bool;
    }

    public final void setCreater(Boolean bool) {
        this.isCreater = bool;
    }

    public final void setCreatorFundBannerSetting(CreatorFundBannerSetting creatorFundBannerSetting) {
        this.creatorFundBannerSetting = creatorFundBannerSetting;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setDisplayQnaOnProfile(Integer num) {
        this.displayQnaOnProfile = num;
    }

    public final void setDownloadSetting(Integer num) {
        this.downloadSetting = num;
    }

    public final void setDspProfile(DspProfile dspProfile) {
        this.dspProfile = dspProfile;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setEmailVerified(Boolean bool) {
        this.isEmailVerified = bool;
    }

    public final void setEnableSubscription(Boolean bool) {
        this.enableSubscription = bool;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setForcePrivateAccount(Boolean bool) {
        this.forcePrivateAccount = bool;
    }

    public final void setGiftBagStatus(Integer num) {
        this.giftBagStatus = num;
    }

    public final void setHasAnalyticsMetrics(Boolean bool) {
        this.hasAnalyticsMetrics = bool;
    }

    public final void setHasEmail(Boolean bool) {
        this.hasEmail = bool;
    }

    public final void setMallTabUserInfo(TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo) {
        this.mallTabUserInfo = tTMallTabRelatedUserInfo;
    }

    public final void setMusicComplianceAccount(Integer num) {
        this.musicComplianceAccount = num;
    }

    public final void setNickNameModifyTs(Integer num) {
        this.nickNameModifyTs = num;
    }

    public final void setNotifyPrivatePolicy(Boolean bool) {
        this.notifyPrivatePolicy = bool;
    }

    public final void setPaidContentBannerInfo(PaidContentBannerInfo paidContentBannerInfo) {
        this.paidContentBannerInfo = paidContentBannerInfo;
    }

    public final void setPhoneBinded(Boolean bool) {
        this.isPhoneBinded = bool;
    }

    public final void setPostDefaultDownloadSetting(Boolean bool) {
        this.postDefaultDownloadSetting = bool;
    }

    public final void setPredictedAgeGroup(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.predictedAgeGroup = str;
    }

    public final void setProAccount(Boolean bool) {
        this.isProAccount = bool;
    }

    public final void setProAccountTcmRedDot(Boolean bool) {
        this.proAccountTcmRedDot = bool;
    }

    public final void setShieldCommentNotice(Integer num) {
        this.shieldCommentNotice = num;
    }

    public final void setShieldDiggNotice(Integer num) {
        this.shieldDiggNotice = num;
    }

    public final void setShieldEditFieldInfoList(List<ShieldEditFieldInfo> list) {
        this.shieldEditFieldInfoList = list;
    }

    public final void setShieldFollowNotice(Integer num) {
        this.shieldFollowNotice = num;
    }

    public final void setShowEffectList(Boolean bool) {
        this.showEffectList = bool;
    }

    public final void setShowTipEntry(Boolean bool) {
        this.showTipEntry = bool;
    }

    public final void setSocialData(SocialDataStruct socialDataStruct) {
        this.socialData = socialDataStruct;
    }

    public final void setSpecialAccount(SpecialAccount specialAccount) {
        this.specialAccount = specialAccount;
    }

    public final void setStoryStatus(Integer num) {
        this.storyStatus = num;
    }

    public final void setUniqueIdModifyTime(Long l) {
        this.uniqueIdModifyTime = l;
    }

    public final void setUserCancelled(Boolean bool) {
        this.userCancelled = bool;
    }

    public final void setUserInactive(Boolean bool) {
        this.userInactive = bool;
    }

    public final void setUserMode(int i) {
        this.userMode = i;
    }

    public final void setVerificationBadgeType(Integer num) {
        this.verificationBadgeType = num;
    }

    public final void setVerificationType(Integer num) {
        this.verificationType = num;
    }

    public final void setVideoGiftStatus(Integer num) {
        this.videoGiftStatus = num;
    }

    public final void setYouTubeLastRefreshTime(long j) {
        this.youTubeLastRefreshTime = j;
    }

    public final void setYouTubeRefreshToken(String str) {
        this.youTubeRefreshToken = str;
    }

    public final void setYoutubeRawRefreshToken(String str) {
        this.youtubeRawRefreshToken = str;
    }
}

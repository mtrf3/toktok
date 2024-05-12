package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.commercialize.model.DouplusToastStructV3;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class AwemeCommerceStruct implements Serializable, Cloneable {

    @InterfaceC65349Pkn("ad_event_type")
    public int adEventType;

    @InterfaceC65349Pkn("entrance")
    public String adFeedBackEntrance;

    @InterfaceC65349Pkn("ad_id")
    public String adId;

    @InterfaceC65349Pkn("ad_auth_status")
    public int ad_auth_status;

    @InterfaceC65349Pkn("ad_source")
    public int ad_source;

    @InterfaceC65349Pkn("advertiser_id")
    public String advId;

    @InterfaceC65349Pkn("adv_promotable")
    public boolean adv_promotable;

    @InterfaceC65349Pkn("auction_ad_invited")
    public boolean auction_ad_invited;

    @InterfaceC65349Pkn("avoid_global_pendant")
    public boolean avoid_global_pendant;

    @InterfaceC65349Pkn("bc_label_test_text")
    public String bcHashtagText;

    @InterfaceC65349Pkn("biz_account")
    public BizAccountInfo bizAccountInfo;

    @InterfaceC65349Pkn("branded_content_type")
    public long brandedContentType;

    @InterfaceC65349Pkn("card_infos")
    public CardStruct cardStruct;

    @InterfaceC65349Pkn("creative_id")
    public String creativeId;

    @InterfaceC65349Pkn("dark_post_source")
    public int darkPostSource;

    @InterfaceC65349Pkn("dark_post_status")
    public int darkPostStatus;

    @InterfaceC65349Pkn("digg_show_scene")
    public int diggShowScene;

    @InterfaceC65349Pkn("disable_mid_roll_status_code")
    public int disableMidRollStatusCode;

    @InterfaceC65349Pkn("douplus_toast")
    public DouplusToastStructV3 douplus_toast;

    @InterfaceC65349Pkn("enable_mid_roll")
    public boolean enableMidRoll;

    @InterfaceC65349Pkn("feedback_submitted")
    public boolean hasUserSubmittedFeedback;

    @InterfaceC65349Pkn("mid_roll_replace_time")
    public long insertAdTime;

    @InterfaceC65349Pkn("is_music_not_clickable")
    public boolean isMusicNotClickable;

    @InterfaceC65349Pkn("is_personal_page_forbidden")
    public boolean isPersonalPageForbidden;

    @InterfaceC65349Pkn("is_pseudo_ad")
    public boolean isPseudoAd;

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("last_view_time")
    public long lastViewTime;

    @InterfaceC65349Pkn("mission_id")
    public long missionId;

    @InterfaceC65349Pkn("mission_item_status")
    public MissionItemStatus missionItemStatus;

    @InterfaceC65349Pkn("prevent_delete")
    public boolean preventDelete;

    @InterfaceC65349Pkn("prevent_friend_see")
    public boolean preventFriendSee;

    @InterfaceC65349Pkn("prevent_privacy_reason")
    public String preventPrivacyReason;

    @InterfaceC65349Pkn("prevent_self_see")
    public boolean preventSelfSee;

    @InterfaceC65349Pkn("prevent_share")
    public boolean preventShare;

    @InterfaceC65349Pkn("pseudo_ad_data")
    public AwemeRawAd pseudoAdData;

    @InterfaceC65349Pkn("mid_roll_request_time")
    public long requestMidAdTime;

    @InterfaceC65349Pkn("send_notice_time")
    public int sendNoticeTime;

    @InterfaceC65349Pkn("show_share_link")
    public boolean show_share_link;

    @InterfaceC65349Pkn("study_id")
    public String studyId;

    @InterfaceC65349Pkn("with_comment_filter_words")
    public boolean withCommentFilterWords;

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AwemeCommerceStruct m104clone() {
        AwemeCommerceStruct awemeCommerceStruct = new AwemeCommerceStruct();
        awemeCommerceStruct.ad_auth_status = this.ad_auth_status;
        awemeCommerceStruct.ad_source = this.ad_source;
        awemeCommerceStruct.avoid_global_pendant = this.avoid_global_pendant;
        awemeCommerceStruct.show_share_link = this.show_share_link;
        awemeCommerceStruct.douplus_toast = this.douplus_toast;
        awemeCommerceStruct.auction_ad_invited = this.auction_ad_invited;
        awemeCommerceStruct.withCommentFilterWords = this.withCommentFilterWords;
        awemeCommerceStruct.adv_promotable = this.adv_promotable;
        awemeCommerceStruct.preventDelete = this.preventDelete;
        awemeCommerceStruct.preventSelfSee = this.preventSelfSee;
        awemeCommerceStruct.preventFriendSee = this.preventFriendSee;
        awemeCommerceStruct.preventPrivacyReason = this.preventPrivacyReason;
        awemeCommerceStruct.preventShare = this.preventShare;
        awemeCommerceStruct.cardStruct = this.cardStruct;
        awemeCommerceStruct.hasUserSubmittedFeedback = this.hasUserSubmittedFeedback;
        awemeCommerceStruct.lastViewTime = this.lastViewTime;
        awemeCommerceStruct.isMusicNotClickable = this.isMusicNotClickable;
        awemeCommerceStruct.isPersonalPageForbidden = this.isPersonalPageForbidden;
        awemeCommerceStruct.darkPostSource = this.darkPostSource;
        awemeCommerceStruct.darkPostStatus = this.darkPostStatus;
        awemeCommerceStruct.missionId = this.missionId;
        awemeCommerceStruct.missionItemStatus = this.missionItemStatus;
        awemeCommerceStruct.itemId = this.itemId;
        awemeCommerceStruct.advId = this.advId;
        awemeCommerceStruct.adId = this.adId;
        awemeCommerceStruct.creativeId = this.creativeId;
        awemeCommerceStruct.studyId = this.studyId;
        awemeCommerceStruct.bizAccountInfo = this.bizAccountInfo;
        awemeCommerceStruct.adEventType = this.adEventType;
        awemeCommerceStruct.bcHashtagText = this.bcHashtagText;
        awemeCommerceStruct.adFeedBackEntrance = this.adFeedBackEntrance;
        awemeCommerceStruct.sendNoticeTime = this.sendNoticeTime;
        awemeCommerceStruct.diggShowScene = this.diggShowScene;
        awemeCommerceStruct.enableMidRoll = this.enableMidRoll;
        awemeCommerceStruct.insertAdTime = this.insertAdTime;
        awemeCommerceStruct.requestMidAdTime = this.requestMidAdTime;
        awemeCommerceStruct.disableMidRollStatusCode = this.disableMidRollStatusCode;
        awemeCommerceStruct.isPseudoAd = this.isPseudoAd;
        awemeCommerceStruct.pseudoAdData = this.pseudoAdData;
        return awemeCommerceStruct;
    }

    public Integer getMissionItemStatus() {
        MissionItemStatus missionItemStatus = this.missionItemStatus;
        if (missionItemStatus == null) {
            return null;
        }
        return Integer.valueOf(missionItemStatus.getStatus());
    }

    public boolean isBrandedContent() {
        if (this.brandedContentType > 0) {
            return true;
        }
        return false;
    }

    public int getAdEventType() {
        return this.adEventType;
    }

    public String getAdFeedBackEntrance() {
        return this.adFeedBackEntrance;
    }

    public String getAdId() {
        return this.adId;
    }

    public int getAdSource() {
        return this.ad_source;
    }

    public String getAdvId() {
        return this.advId;
    }

    public int getAuthStatus() {
        return this.ad_auth_status;
    }

    public String getBCHashtag() {
        return this.bcHashtagText;
    }

    public BizAccountInfo getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public CardStruct getCardStruct() {
        return this.cardStruct;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public int getDarkPostSource() {
        return this.darkPostSource;
    }

    public int getDarkPostStatus() {
        return this.darkPostStatus;
    }

    public int getDiggShowScene() {
        return this.diggShowScene;
    }

    public int getDisableMidRollStatusCode() {
        return this.disableMidRollStatusCode;
    }

    public DouplusToastStructV3 getDouplusToast() {
        return this.douplus_toast;
    }

    public long getInsertAdTime() {
        return this.insertAdTime;
    }

    public String getItemId() {
        return this.itemId;
    }

    public long getLastViewTime() {
        return this.lastViewTime;
    }

    public long getMissionId() {
        return this.missionId;
    }

    public MissionItemStatus getMissionItemStatusEnum() {
        return this.missionItemStatus;
    }

    public String getPreventPrivacyReason() {
        return this.preventPrivacyReason;
    }

    public AwemeRawAd getPseudoAdData() {
        return this.pseudoAdData;
    }

    public long getRequestMidAdTime() {
        return this.requestMidAdTime;
    }

    public int getSendNoticeTime() {
        return this.sendNoticeTime;
    }

    public String getStudyId() {
        return this.studyId;
    }

    public boolean isAdvPromotable() {
        return this.adv_promotable;
    }

    public boolean isAuctionAdInvited() {
        return this.auction_ad_invited;
    }

    public boolean isAvoidGlobalPendant() {
        return this.avoid_global_pendant;
    }

    public boolean isEnableMidRoll() {
        return this.enableMidRoll;
    }

    public boolean isHasUserSubmittedFeedback() {
        return this.hasUserSubmittedFeedback;
    }

    public boolean isMusicNotClickable() {
        return this.isMusicNotClickable;
    }

    public boolean isPersonalPageForbidden() {
        return this.isPersonalPageForbidden;
    }

    public boolean isPreventDelete() {
        return this.preventDelete;
    }

    public boolean isPreventFriendSee() {
        return this.preventFriendSee;
    }

    public boolean isPreventSelfSee() {
        return this.preventSelfSee;
    }

    public boolean isPreventShare() {
        return this.preventShare;
    }

    public boolean isPseudoAd() {
        return this.isPseudoAd;
    }

    public boolean isShowShareLink() {
        return this.show_share_link;
    }

    public boolean isWithCommentFilterWords() {
        return this.withCommentFilterWords;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAdvPromotable(boolean z) {
        this.adv_promotable = z;
    }

    public void setBrandedContentType(long j) {
        this.brandedContentType = j;
    }

    public void setCardStruct(CardStruct cardStruct) {
        this.cardStruct = cardStruct;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDarkPostSource(int i) {
        this.darkPostSource = i;
    }

    public void setDarkPostStatus(int i) {
        this.darkPostStatus = i;
    }

    public void setDiggShowScene(int i) {
        this.diggShowScene = i;
    }

    public void setHasUserSubmittedFeedback(boolean z) {
        this.hasUserSubmittedFeedback = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setLastViewTime(long j) {
        this.lastViewTime = j;
    }

    public void setMissionId(long j) {
        this.missionId = j;
    }

    public void setMissionItemStatus(MissionItemStatus missionItemStatus) {
        this.missionItemStatus = missionItemStatus;
    }

    public void setMusicNotClickable(boolean z) {
        this.isMusicNotClickable = z;
    }

    public void setPersonalPageForbidden(boolean z) {
        this.isPersonalPageForbidden = z;
    }

    public void setPreventDelete(boolean z) {
        this.preventDelete = z;
    }

    public void setPreventFriendSee(boolean z) {
        this.preventFriendSee = z;
    }

    public void setPreventPrivacyReason(String str) {
        this.preventPrivacyReason = str;
    }

    public void setPreventSelfSee(boolean z) {
        this.preventSelfSee = z;
    }

    public void setPreventShare(boolean z) {
        this.preventShare = z;
    }

    public void setSendNoticeTime(int i) {
        this.sendNoticeTime = i;
    }

    public void setWithCommentFilterWords(boolean z) {
        this.withCommentFilterWords = z;
    }
}

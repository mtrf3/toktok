package com.ss.android.ugc.aweme.discover.model;

import X.AbstractC36908Ee8;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import com.ss.android.ugc.aweme.utils.ReplaceLineEndAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class Challenge extends AbstractC36908Ee8 implements Serializable {

    @InterfaceC65349Pkn("activity_type")
    public int activityType;

    @InterfaceC65349Pkn("allow_upload_cover")
    public int allowUploadCover;

    @InterfaceC65349Pkn("cha_attrs")
    public List<String> attrs;

    @InterfaceC65349Pkn("author")
    public User author;

    @InterfaceC65349Pkn("background_image_url")
    public UrlModel backgroundImageUrl;

    @InterfaceC65349Pkn("announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;

    @InterfaceC65349Pkn("cover_photo")
    public String challengeBgUrl;

    @InterfaceC65349Pkn("challenge_billboard")
    public ChallengeBillboard challengeBillboard;

    @InterfaceC65349Pkn("disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;

    @InterfaceC65349Pkn("cha_name")
    public String challengeName;

    @InterfaceC65349Pkn("hashtag_profile")
    public String challengeProfileUrl;

    @InterfaceC65349Pkn("sticker_detail")
    @InterfaceC65404Plg(JsonToStringAdapter.class)
    public String challengeStickerDetail;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("collect_stat")
    public int collectStatus;

    @InterfaceC65349Pkn("banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;

    @InterfaceC65349Pkn("connect_music")
    public List<Music> connectMusics;

    @InterfaceC65349Pkn("content_type")
    public int contentType;

    @InterfaceC65349Pkn("cover_item")
    public UrlModel coverItem;

    @InterfaceC65349Pkn("desc")
    @InterfaceC65404Plg(ReplaceLineEndAdapter.class)
    public String desc;

    @InterfaceC65349Pkn("dynamic_list")
    public List<DynamicPatch> dynamicPatchList;

    @InterfaceC65349Pkn("end_color")
    public String endColor;

    @InterfaceC65349Pkn("extra_attr")
    public ChallengeExtraAttrStruct extraAttrStruct;

    @InterfaceC65349Pkn("mission_module")
    public HTCMissionModule htcMissionModule;

    @InterfaceC65349Pkn("inquiry")
    public InquiryStruct inquiryStruct;

    @InterfaceC65349Pkn("is_challenge")
    public int isChallenge;

    @InterfaceC65349Pkn("is_commerce")
    public boolean isCommerceAndValid;

    @InterfaceC65349Pkn("is_hot_search")
    public int isHotSearch;

    @InterfaceC65349Pkn("is_strong_music")
    public int isStrongMusic;

    @InterfaceC65349Pkn("link_action")
    public String linkAction;

    @InterfaceC65349Pkn("link_text")
    public String linkText;

    @InterfaceC65349Pkn("link_title")
    public String linkTitle;

    @InterfaceC65349Pkn("link_type")
    public int linkType;

    @InterfaceC65349Pkn("background_gradient")
    public BackGroundGradient mBackGroundGradient;

    @InterfaceC65349Pkn("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @InterfaceC65349Pkn("search_cha_name")
    public String mSearchChaName;

    @InterfaceC65349Pkn("is_status")
    public int mStatus;

    @InterfaceC65349Pkn("related_media_source")
    public RelatedMediaSourceStruct mediaSource;

    @InterfaceC65349Pkn("module_type")
    public int moduleType;

    @InterfaceC65349Pkn("mv_id")
    public String mvId;

    @InterfaceC65349Pkn("label_origin_author")
    public String originAuthor;

    @InterfaceC65349Pkn("is_pgcshow")
    public boolean pgcshow;

    @InterfaceC65349Pkn("profile_tag")
    public String profileTagUrl;
    public String requestId;

    @InterfaceC65349Pkn("rule_detail_desc")
    public String ruleDetailDesc;

    @InterfaceC65349Pkn("rule_detail_url")
    public String ruleDetailUrl;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("show_items")
    public List<ShowItemsStruct> showItems;

    @InterfaceC65349Pkn("sponsor_ad_label")
    public String sponsorAdLabel;

    @InterfaceC65349Pkn("sponsor_label_text")
    public String sponsorLabelText;

    @InterfaceC65349Pkn("start_color")
    public String starColor;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    @InterfaceC65349Pkn("tag")
    public int tag;

    @InterfaceC65349Pkn("button")
    public ChallengeTransform transfrom;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    @InterfaceC65349Pkn("view_count")
    public long viewCount = -1;

    @InterfaceC65349Pkn("related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();

    @InterfaceC65349Pkn("commerce_sub_type")
    public int commerceSubType = 0;

    /* loaded from: classes13.dex */
    public interface ChallengeSubType {
    }

    public boolean allowUploadCover() {
        if (this.allowUploadCover == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isChallenge() {
        if (this.isChallenge == 1) {
            return true;
        }
        return false;
    }

    public boolean isCommerce() {
        if (this.subType == 1) {
            return true;
        }
        return false;
    }

    public boolean isLinkActionAsOpenUrl() {
        if (this.linkType == 7) {
            return true;
        }
        return false;
    }

    public boolean isStrongMusic() {
        if (this.isStrongMusic == 1) {
            return true;
        }
        return false;
    }

    public boolean isTrending() {
        if (this.isHotSearch == 1) {
            return true;
        }
        return false;
    }

    public boolean isVsChallenge() {
        if (this.activityType == 1) {
            return true;
        }
        return false;
    }

    public long getDisplayCount() {
        long viewCount = getViewCount();
        if (viewCount >= 0) {
            return viewCount;
        }
        return getUserCount();
    }

    public int getActivityType() {
        return this.activityType;
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public BackGroundGradient getBackGroundGradient() {
        return this.mBackGroundGradient;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<DynamicPatch> getDynamicPatchList() {
        return this.dynamicPatchList;
    }

    public String getEndColor() {
        return this.endColor;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public RelatedMediaSourceStruct getMediaSource() {
        return this.mediaSource;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRuleDetailDesc() {
        return this.ruleDetailDesc;
    }

    public String getRuleDetailUrl() {
        return this.ruleDetailUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSearchChaName() {
        return this.mSearchChaName;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getSponsorAdLabel() {
        return this.sponsorAdLabel;
    }

    public String getSponsorLabelText() {
        return this.sponsorLabelText;
    }

    public String getStarColor() {
        return this.starColor;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getTag() {
        return this.tag;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Challenge) obj).cid);
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setBackGroundGradient(BackGroundGradient backGroundGradient) {
        this.mBackGroundGradient = backGroundGradient;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement) {
        this.challengeAnnouncement = challengeAnnouncement;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setConnectMusics(List<Music> list) {
        this.connectMusics = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public Challenge setDynamicPatchList(List<DynamicPatch> list) {
        this.dynamicPatchList = list;
        return this;
    }

    public void setEndColor(String str) {
        this.endColor = str;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setMediaSource(RelatedMediaSourceStruct relatedMediaSourceStruct) {
        this.mediaSource = relatedMediaSourceStruct;
    }

    public void setMvId(String str) {
        this.mvId = str;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchChaName(String str) {
        this.mSearchChaName = str;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setSponsorAdLabel(String str) {
        this.sponsorAdLabel = str;
    }

    public void setStarColor(String str) {
        this.starColor = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}

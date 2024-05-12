package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public class CommerceUserInfo implements Serializable {

    @InterfaceC65349Pkn("account_promote_related")
    public int accountPromoteRelated;

    @InterfaceC65349Pkn("ad_authorization")
    public boolean adAuthorization;

    @InterfaceC65349Pkn("ad_experience_entry")
    public boolean adExperienceEntry;

    @InterfaceC65349Pkn("ad_experience_text")
    public String adExperienceText;

    @InterfaceC65349Pkn("ads_feedback_entry")
    public boolean adFeedbackEntry;

    @InterfaceC65349Pkn("ad_influencer_type")
    public int adInfluencerType;

    @InterfaceC65349Pkn("ad_revenue_rits")
    public List<Integer> adRevenueRits;

    @InterfaceC65349Pkn("ad_revenue_sharing")
    public boolean adRevenueSharing;

    @InterfaceC65349Pkn("clf_type")
    public int clfType;

    @InterfaceC65349Pkn("has_ads_entry")
    public boolean hasAdEntry;

    @InterfaceC65349Pkn("has_promote")
    public boolean hasPromote;

    @InterfaceC65349Pkn("has_tcm_entry")
    public boolean hasTcmEntry;

    @InterfaceC65349Pkn("is_ad_partner")
    public boolean isAdPartner;

    @InterfaceC65349Pkn("is_auction_ad_influencer")
    public boolean isAuctionAdInfluencer;

    @InterfaceC65349Pkn("link_user_info")
    public LinkUserInfoStruct linkUserInfo;

    @InterfaceC65349Pkn("notification_config")
    public int notificationConfig;

    @InterfaceC65349Pkn("promote_pay_type")
    public int promotePayType;

    @InterfaceC65349Pkn("show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;

    @InterfaceC65349Pkn("star_atlas")
    public int starAtlas;

    public String getAdExperienceText() {
        return this.adExperienceText;
    }

    public int getAdInfluencerType() {
        return this.adInfluencerType;
    }

    public List<Integer> getAdRevenueRits() {
        return this.adRevenueRits;
    }

    public int getClfType() {
        return this.clfType;
    }

    public LinkUserInfoStruct getLinkUserInfo() {
        return this.linkUserInfo;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public int getPromotePayType() {
        return this.promotePayType;
    }

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isAdPartner() {
        return this.isAdPartner;
    }

    public boolean isAdRevenueSharing() {
        return this.adRevenueSharing;
    }

    public boolean isAuctionAdInfluencer() {
        return this.isAuctionAdInfluencer;
    }

    public boolean isHasAdExperienceEntry() {
        return this.adExperienceEntry;
    }

    public boolean isHasAdFeedbackEntry() {
        return this.adFeedbackEntry;
    }

    public boolean isHasTcmEntry() {
        return this.hasTcmEntry;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }

    public void setAdExperienceText(String str) {
        this.adExperienceText = str;
    }

    public void setNotificationConfig(int i) {
        this.notificationConfig = i;
    }
}

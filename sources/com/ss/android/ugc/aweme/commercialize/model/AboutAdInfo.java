package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AboutAdInfo implements Serializable {

    @InterfaceC65349Pkn("advertiser_items")
    public final List<AboutAdInfoItem> advertiserItem;

    @InterfaceC65349Pkn("match_audience_tags")
    public final String audienceTags;

    @InterfaceC65349Pkn("about_this_ad_items")
    public final List<AboutAdInfoItem> contentItem;

    @InterfaceC65349Pkn("about_this_ad_content_type")
    public Integer contentType;

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("about_this_ad_feedback_response")
    public String feedbackResponseText;

    @InterfaceC65349Pkn("about_this_ad_feedback")
    public String feedbackText;

    @InterfaceC65349Pkn("about_this_ad_feedback_btn_no")
    public String feedbackValueNo;

    @InterfaceC65349Pkn("about_this_ad_feedback_btn_yes")
    public String feedbackValueYes;

    @InterfaceC65349Pkn("geo_id")
    public final String geoId;

    @InterfaceC65349Pkn("about_this_ad_adjust_settings")
    public String linkText;

    @InterfaceC65349Pkn("business_en_name_used")
    public final Boolean showQuestionMark;

    @InterfaceC65349Pkn("about_this_ad_title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public AboutAdInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public final List<AboutAdInfoItem> getAdvertiserItem() {
        return this.advertiserItem;
    }

    public final String getAudienceTags() {
        return this.audienceTags;
    }

    public final List<AboutAdInfoItem> getContentItem() {
        return this.contentItem;
    }

    public final Integer getContentType() {
        return this.contentType;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getFeedbackResponseText() {
        return this.feedbackResponseText;
    }

    public final String getFeedbackText() {
        return this.feedbackText;
    }

    public final String getFeedbackValueNo() {
        return this.feedbackValueNo;
    }

    public final String getFeedbackValueYes() {
        return this.feedbackValueYes;
    }

    public final String getGeoId() {
        return this.geoId;
    }

    public final String getLinkText() {
        return this.linkText;
    }

    public final Boolean getShowQuestionMark() {
        return this.showQuestionMark;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContentType(Integer num) {
        this.contentType = num;
    }

    public final void setFeedbackResponseText(String str) {
        this.feedbackResponseText = str;
    }

    public final void setFeedbackText(String str) {
        this.feedbackText = str;
    }

    public final void setFeedbackValueNo(String str) {
        this.feedbackValueNo = str;
    }

    public final void setFeedbackValueYes(String str) {
        this.feedbackValueYes = str;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public AboutAdInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List<AboutAdInfoItem> list, List<AboutAdInfoItem> list2, String str7, String str8, String str9, Boolean bool) {
        this.contentType = num;
        this.title = str;
        this.linkText = str2;
        this.feedbackText = str3;
        this.feedbackValueYes = str4;
        this.feedbackValueNo = str5;
        this.feedbackResponseText = str6;
        this.contentItem = list;
        this.advertiserItem = list2;
        this.geoId = str7;
        this.countryCode = str8;
        this.audienceTags = str9;
        this.showQuestionMark = bool;
    }

    public /* synthetic */ AboutAdInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, String str8, String str9, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : list, (i & 256) == 0 ? list2 : null, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) == 0 ? str9 : "", (i & 4096) != 0 ? Boolean.FALSE : bool);
    }
}

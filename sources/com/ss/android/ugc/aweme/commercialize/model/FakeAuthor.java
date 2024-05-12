package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class FakeAuthor implements Serializable {

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("category_label")
    public String categoryLabel;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("jump_data")
    public JumpData jumpData;

    @InterfaceC65349Pkn("rank_label")
    public String rankLabel;

    @InterfaceC65349Pkn("rating")
    public Float rating;

    @InterfaceC65349Pkn("show_banner")
    public boolean shouldShowBanner;

    @InterfaceC65349Pkn("total_ratings_reviews")
    public String totalRatingsReviews;

    @InterfaceC65349Pkn("fake_author_version")
    public Integer fakeAuthorVersion = 0;

    @InterfaceC65349Pkn("auto_show_webview")
    public Boolean autoShowWebview = Boolean.FALSE;

    public final Boolean getAutoShowWebview() {
        return this.autoShowWebview;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getCategoryLabel() {
        return this.categoryLabel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getFakeAuthorVersion() {
        return this.fakeAuthorVersion;
    }

    public final JumpData getJumpData() {
        return this.jumpData;
    }

    public final String getRankLabel() {
        return this.rankLabel;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final boolean getShouldShowBanner() {
        return this.shouldShowBanner;
    }

    public final String getTotalRatingsReviews() {
        return this.totalRatingsReviews;
    }

    public final void setAutoShowWebview(Boolean bool) {
        this.autoShowWebview = bool;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setCategoryLabel(String str) {
        this.categoryLabel = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setFakeAuthorVersion(Integer num) {
        this.fakeAuthorVersion = num;
    }

    public final void setJumpData(JumpData jumpData) {
        this.jumpData = jumpData;
    }

    public final void setRankLabel(String str) {
        this.rankLabel = str;
    }

    public final void setRating(Float f) {
        this.rating = f;
    }

    public final void setShouldShowBanner(boolean z) {
        this.shouldShowBanner = z;
    }

    public final void setTotalRatingsReviews(String str) {
        this.totalRatingsReviews = str;
    }
}

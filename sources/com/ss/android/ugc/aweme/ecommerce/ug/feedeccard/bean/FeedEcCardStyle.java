package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedEcCardStyle {

    @InterfaceC65349Pkn("card_bg_center_color")
    public final String cardBgCenterColor;

    @InterfaceC65349Pkn("card_bg_end_color")
    public final String cardBgEndColor;

    @InterfaceC65349Pkn("card_bg_img")
    public final Image cardBgImg;

    @InterfaceC65349Pkn("card_bg_pendant_img")
    public final Image cardBgPendantImg;

    @InterfaceC65349Pkn("card_bg_start_color")
    public final String cardBgStartColor;

    @InterfaceC65349Pkn("card_btn_no_interest_bg_color")
    public final String cardBtnNoInterestBgColor;

    @InterfaceC65349Pkn("card_btn_no_interest_text")
    public final String cardBtnNoInterestText;

    @InterfaceC65349Pkn("card_btn_no_interest_text_color")
    public final String cardBtnNoInterestTextColor;

    @InterfaceC65349Pkn("card_btn_see_more_bg_color")
    public final String cardBtnSeeMoreBgColor;

    @InterfaceC65349Pkn("card_btn_see_more_schema")
    public final String cardBtnSeeMoreSchema;

    @InterfaceC65349Pkn("card_btn_see_more_text")
    public final String cardBtnSeeMoreText;

    @InterfaceC65349Pkn("card_btn_see_more_text_color")
    public final String cardBtnSeeMoreTextColor;

    @InterfaceC65349Pkn("card_content_bg_end_color")
    public final String cardContentBgEndColor;

    @InterfaceC65349Pkn("card_content_bg_img")
    public final Image cardContentBgImg;

    @InterfaceC65349Pkn("card_content_bg_start_color")
    public final String cardContentBgStartColor;

    @InterfaceC65349Pkn("card_content_countdown_seconds")
    public final Long cardContentCountdownSeconds;

    @InterfaceC65349Pkn("card_subtitle_text")
    public final String cardSubtitleText;

    @InterfaceC65349Pkn("card_subtitle_text_color")
    public final String cardSubtitleTextColor;

    @InterfaceC65349Pkn("card_swipe_up_color")
    public final String cardSwipeUpColor;

    @InterfaceC65349Pkn("card_swipe_up_text")
    public final String cardSwipeUpText;

    @InterfaceC65349Pkn("card_title_text")
    public final String cardTitleText;

    @InterfaceC65349Pkn("card_title_text_color")
    public final String cardTitleTextColor;

    @InterfaceC65349Pkn("card_title_text_size")
    public final Float cardTitleTextSize;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedEcCardStyle() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8388607, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedEcCardStyle copy$default(FeedEcCardStyle feedEcCardStyle, Image image, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, Image image2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Image image3, String str17, String str18, Long l, int i, Object obj) {
        String str19 = str3;
        String str20 = str2;
        Image image4 = image;
        String str21 = str;
        String str22 = str11;
        String str23 = str10;
        String str24 = str9;
        String str25 = str8;
        String str26 = str5;
        String str27 = str4;
        Float f2 = f;
        String str28 = str6;
        String str29 = str7;
        Image image5 = image2;
        Long l2 = l;
        String str30 = str17;
        String str31 = str13;
        String str32 = str18;
        String str33 = str12;
        String str34 = str14;
        String str35 = str15;
        String str36 = str16;
        Image image6 = image3;
        if ((i & 1) != 0) {
            image4 = feedEcCardStyle.cardBgImg;
        }
        if ((i & 2) != 0) {
            str21 = feedEcCardStyle.cardBgStartColor;
        }
        if ((i & 4) != 0) {
            str20 = feedEcCardStyle.cardBgCenterColor;
        }
        if ((i & 8) != 0) {
            str19 = feedEcCardStyle.cardBgEndColor;
        }
        if ((i & 16) != 0) {
            str27 = feedEcCardStyle.cardTitleText;
        }
        if ((i & 32) != 0) {
            str26 = feedEcCardStyle.cardTitleTextColor;
        }
        if ((i & 64) != 0) {
            f2 = feedEcCardStyle.cardTitleTextSize;
        }
        if ((i & 128) != 0) {
            str28 = feedEcCardStyle.cardSubtitleText;
        }
        if ((i & 256) != 0) {
            str29 = feedEcCardStyle.cardSubtitleTextColor;
        }
        if ((i & 512) != 0) {
            image5 = feedEcCardStyle.cardBgPendantImg;
        }
        if ((i & 1024) != 0) {
            str25 = feedEcCardStyle.cardBtnNoInterestBgColor;
        }
        if ((i & 2048) != 0) {
            str24 = feedEcCardStyle.cardBtnNoInterestText;
        }
        if ((i & 4096) != 0) {
            str23 = feedEcCardStyle.cardBtnNoInterestTextColor;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str22 = feedEcCardStyle.cardBtnSeeMoreBgColor;
        }
        if ((i & 16384) != 0) {
            str33 = feedEcCardStyle.cardBtnSeeMoreText;
        }
        if ((32768 & i) != 0) {
            str31 = feedEcCardStyle.cardBtnSeeMoreTextColor;
        }
        if ((65536 & i) != 0) {
            str34 = feedEcCardStyle.cardBtnSeeMoreSchema;
        }
        if ((131072 & i) != 0) {
            str35 = feedEcCardStyle.cardSwipeUpText;
        }
        if ((262144 & i) != 0) {
            str36 = feedEcCardStyle.cardSwipeUpColor;
        }
        if ((524288 & i) != 0) {
            image6 = feedEcCardStyle.cardContentBgImg;
        }
        if ((1048576 & i) != 0) {
            str30 = feedEcCardStyle.cardContentBgStartColor;
        }
        if ((2097152 & i) != 0) {
            str32 = feedEcCardStyle.cardContentBgEndColor;
        }
        if ((i & 4194304) != 0) {
            l2 = feedEcCardStyle.cardContentCountdownSeconds;
        }
        String str37 = str25;
        String str38 = str24;
        String str39 = str23;
        return feedEcCardStyle.copy(image4, str21, str20, str19, str27, str26, f2, str28, str29, image5, str37, str38, str39, str22, str33, str31, str34, str35, str36, image6, str30, str32, l2);
    }

    public final FeedEcCardStyle copy(Image image, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, Image image2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Image image3, String str17, String str18, Long l) {
        return new FeedEcCardStyle(image, str, str2, str3, str4, str5, f, str6, str7, image2, str8, str9, str10, str11, str12, str13, str14, str15, str16, image3, str17, str18, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardStyle)) {
            return false;
        }
        FeedEcCardStyle feedEcCardStyle = (FeedEcCardStyle) obj;
        return o.LJ(this.cardBgImg, feedEcCardStyle.cardBgImg) && o.LJ(this.cardBgStartColor, feedEcCardStyle.cardBgStartColor) && o.LJ(this.cardBgCenterColor, feedEcCardStyle.cardBgCenterColor) && o.LJ(this.cardBgEndColor, feedEcCardStyle.cardBgEndColor) && o.LJ(this.cardTitleText, feedEcCardStyle.cardTitleText) && o.LJ(this.cardTitleTextColor, feedEcCardStyle.cardTitleTextColor) && o.LJ(this.cardTitleTextSize, feedEcCardStyle.cardTitleTextSize) && o.LJ(this.cardSubtitleText, feedEcCardStyle.cardSubtitleText) && o.LJ(this.cardSubtitleTextColor, feedEcCardStyle.cardSubtitleTextColor) && o.LJ(this.cardBgPendantImg, feedEcCardStyle.cardBgPendantImg) && o.LJ(this.cardBtnNoInterestBgColor, feedEcCardStyle.cardBtnNoInterestBgColor) && o.LJ(this.cardBtnNoInterestText, feedEcCardStyle.cardBtnNoInterestText) && o.LJ(this.cardBtnNoInterestTextColor, feedEcCardStyle.cardBtnNoInterestTextColor) && o.LJ(this.cardBtnSeeMoreBgColor, feedEcCardStyle.cardBtnSeeMoreBgColor) && o.LJ(this.cardBtnSeeMoreText, feedEcCardStyle.cardBtnSeeMoreText) && o.LJ(this.cardBtnSeeMoreTextColor, feedEcCardStyle.cardBtnSeeMoreTextColor) && o.LJ(this.cardBtnSeeMoreSchema, feedEcCardStyle.cardBtnSeeMoreSchema) && o.LJ(this.cardSwipeUpText, feedEcCardStyle.cardSwipeUpText) && o.LJ(this.cardSwipeUpColor, feedEcCardStyle.cardSwipeUpColor) && o.LJ(this.cardContentBgImg, feedEcCardStyle.cardContentBgImg) && o.LJ(this.cardContentBgStartColor, feedEcCardStyle.cardContentBgStartColor) && o.LJ(this.cardContentBgEndColor, feedEcCardStyle.cardContentBgEndColor) && o.LJ(this.cardContentCountdownSeconds, feedEcCardStyle.cardContentCountdownSeconds);
    }

    public int hashCode() {
        Image image = this.cardBgImg;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.cardBgStartColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardBgCenterColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardBgEndColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardTitleText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardTitleTextColor;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.cardTitleTextSize;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.cardSubtitleText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardSubtitleTextColor;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Image image2 = this.cardBgPendantImg;
        int hashCode10 = (hashCode9 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str8 = this.cardBtnNoInterestBgColor;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardBtnNoInterestText;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardBtnNoInterestTextColor;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cardBtnSeeMoreBgColor;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cardBtnSeeMoreText;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cardBtnSeeMoreTextColor;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cardBtnSeeMoreSchema;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cardSwipeUpText;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cardSwipeUpColor;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Image image3 = this.cardContentBgImg;
        int hashCode20 = (hashCode19 + (image3 == null ? 0 : image3.hashCode())) * 31;
        String str17 = this.cardContentBgStartColor;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.cardContentBgEndColor;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Long l = this.cardContentCountdownSeconds;
        return hashCode22 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "FeedEcCardStyle(cardBgImg=" + this.cardBgImg + ", cardBgStartColor=" + this.cardBgStartColor + ", cardBgCenterColor=" + this.cardBgCenterColor + ", cardBgEndColor=" + this.cardBgEndColor + ", cardTitleText=" + this.cardTitleText + ", cardTitleTextColor=" + this.cardTitleTextColor + ", cardTitleTextSize=" + this.cardTitleTextSize + ", cardSubtitleText=" + this.cardSubtitleText + ", cardSubtitleTextColor=" + this.cardSubtitleTextColor + ", cardBgPendantImg=" + this.cardBgPendantImg + ", cardBtnNoInterestBgColor=" + this.cardBtnNoInterestBgColor + ", cardBtnNoInterestText=" + this.cardBtnNoInterestText + ", cardBtnNoInterestTextColor=" + this.cardBtnNoInterestTextColor + ", cardBtnSeeMoreBgColor=" + this.cardBtnSeeMoreBgColor + ", cardBtnSeeMoreText=" + this.cardBtnSeeMoreText + ", cardBtnSeeMoreTextColor=" + this.cardBtnSeeMoreTextColor + ", cardBtnSeeMoreSchema=" + this.cardBtnSeeMoreSchema + ", cardSwipeUpText=" + this.cardSwipeUpText + ", cardSwipeUpColor=" + this.cardSwipeUpColor + ", cardContentBgImg=" + this.cardContentBgImg + ", cardContentBgStartColor=" + this.cardContentBgStartColor + ", cardContentBgEndColor=" + this.cardContentBgEndColor + ", cardContentCountdownSeconds=" + this.cardContentCountdownSeconds + ')';
    }

    public final String getCardBgCenterColor() {
        return this.cardBgCenterColor;
    }

    public final String getCardBgEndColor() {
        return this.cardBgEndColor;
    }

    public final Image getCardBgImg() {
        return this.cardBgImg;
    }

    public final Image getCardBgPendantImg() {
        return this.cardBgPendantImg;
    }

    public final String getCardBgStartColor() {
        return this.cardBgStartColor;
    }

    public final String getCardBtnNoInterestBgColor() {
        return this.cardBtnNoInterestBgColor;
    }

    public final String getCardBtnNoInterestText() {
        return this.cardBtnNoInterestText;
    }

    public final String getCardBtnNoInterestTextColor() {
        return this.cardBtnNoInterestTextColor;
    }

    public final String getCardBtnSeeMoreBgColor() {
        return this.cardBtnSeeMoreBgColor;
    }

    public final String getCardBtnSeeMoreSchema() {
        return this.cardBtnSeeMoreSchema;
    }

    public final String getCardBtnSeeMoreText() {
        return this.cardBtnSeeMoreText;
    }

    public final String getCardBtnSeeMoreTextColor() {
        return this.cardBtnSeeMoreTextColor;
    }

    public final String getCardContentBgEndColor() {
        return this.cardContentBgEndColor;
    }

    public final Image getCardContentBgImg() {
        return this.cardContentBgImg;
    }

    public final String getCardContentBgStartColor() {
        return this.cardContentBgStartColor;
    }

    public final Long getCardContentCountdownSeconds() {
        return this.cardContentCountdownSeconds;
    }

    public final String getCardSubtitleText() {
        return this.cardSubtitleText;
    }

    public final String getCardSubtitleTextColor() {
        return this.cardSubtitleTextColor;
    }

    public final String getCardSwipeUpColor() {
        return this.cardSwipeUpColor;
    }

    public final String getCardSwipeUpText() {
        return this.cardSwipeUpText;
    }

    public final String getCardTitleText() {
        return this.cardTitleText;
    }

    public final String getCardTitleTextColor() {
        return this.cardTitleTextColor;
    }

    public final Float getCardTitleTextSize() {
        return this.cardTitleTextSize;
    }

    public FeedEcCardStyle(Image image, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, Image image2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Image image3, String str17, String str18, Long l) {
        this.cardBgImg = image;
        this.cardBgStartColor = str;
        this.cardBgCenterColor = str2;
        this.cardBgEndColor = str3;
        this.cardTitleText = str4;
        this.cardTitleTextColor = str5;
        this.cardTitleTextSize = f;
        this.cardSubtitleText = str6;
        this.cardSubtitleTextColor = str7;
        this.cardBgPendantImg = image2;
        this.cardBtnNoInterestBgColor = str8;
        this.cardBtnNoInterestText = str9;
        this.cardBtnNoInterestTextColor = str10;
        this.cardBtnSeeMoreBgColor = str11;
        this.cardBtnSeeMoreText = str12;
        this.cardBtnSeeMoreTextColor = str13;
        this.cardBtnSeeMoreSchema = str14;
        this.cardSwipeUpText = str15;
        this.cardSwipeUpColor = str16;
        this.cardContentBgImg = image3;
        this.cardContentBgStartColor = str17;
        this.cardContentBgEndColor = str18;
        this.cardContentCountdownSeconds = l;
    }

    public /* synthetic */ FeedEcCardStyle(Image image, String str, String str2, String str3, String str4, String str5, Float f, String str6, String str7, Image image2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Image image3, String str17, String str18, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? Float.valueOf(24.0f) : f, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : image2, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : str13, (65536 & i) != 0 ? null : str14, (131072 & i) != 0 ? null : str15, (262144 & i) != 0 ? null : str16, (524288 & i) != 0 ? null : image3, (1048576 & i) != 0 ? null : str17, (2097152 & i) != 0 ? null : str18, (i & 4194304) != 0 ? -1L : l);
    }
}

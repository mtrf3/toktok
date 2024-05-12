package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class FeedCardLynxConfig {

    @InterfaceC65349Pkn("button_padding_bottom")
    public final Integer buttonPaddingBottom;

    @InterfaceC65349Pkn("content_padding_lr")
    public final Integer contentPaddingLr;

    @InterfaceC65349Pkn("dynamic_url")
    public final String dynamicUrl;

    @InterfaceC65349Pkn("action_button")
    public final FeedCardActionButtonInfo feedCardActionButtonInfo;

    @InterfaceC65349Pkn("background")
    public final FeedCardBackgroundInfo feedCardBackgroundInfo;

    @InterfaceC65349Pkn("dislike_button")
    public final FeedCardDislikeButtonInfo feedCardDislikeButtonInfo;

    @InterfaceC65349Pkn("margin_top")
    public final Integer marginTop;

    @InterfaceC65349Pkn("slide_color")
    public final String slideColor;

    public FeedCardLynxConfig(String str, FeedCardBackgroundInfo feedCardBackgroundInfo, FeedCardActionButtonInfo feedCardActionButtonInfo, FeedCardDislikeButtonInfo feedCardDislikeButtonInfo, Integer num, Integer num2, Integer num3, String str2) {
        this.dynamicUrl = str;
        this.feedCardBackgroundInfo = feedCardBackgroundInfo;
        this.feedCardActionButtonInfo = feedCardActionButtonInfo;
        this.feedCardDislikeButtonInfo = feedCardDislikeButtonInfo;
        this.contentPaddingLr = num;
        this.buttonPaddingBottom = num2;
        this.marginTop = num3;
        this.slideColor = str2;
    }
}

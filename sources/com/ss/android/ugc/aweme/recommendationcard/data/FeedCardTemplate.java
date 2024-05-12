package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;
import X.KNT;

/* loaded from: classes9.dex */
public final class FeedCardTemplate {

    @InterfaceC65349Pkn("dynamic_url")
    public final String dynamicUrl;

    @InterfaceC65349Pkn("action_button")
    public final FeedCardActionButtonInfo feedCardActionButtonInfo;

    @InterfaceC65349Pkn("background")
    public final FeedCardBackgroundInfo feedCardBackgroundInfo;

    @InterfaceC65349Pkn("dislike_button")
    public final FeedCardDislikeButtonInfo feedCardDislikeButtonInfo;

    @InterfaceC65349Pkn("event_track")
    public final FeedCardEventTrackInfo feedCardEventTrackInfo;

    @InterfaceC65349Pkn("lynx_config")
    public final FeedCardLynxConfig feedCardLynxConfig;

    @InterfaceC65349Pkn("native_config")
    public final KNT feedCardNativeConfig;

    @InterfaceC65349Pkn("is_lynx_template")
    public final Boolean isLynxTemplate;

    @InterfaceC65349Pkn("left_slide_schema")
    public final String leftSlideSchema;

    @InterfaceC65349Pkn("left_slide_type")
    public final Integer leftSlideType;

    @InterfaceC65349Pkn("margin_top")
    public final Integer marginTop;

    @InterfaceC65349Pkn("server_data")
    public final String serverData;

    @InterfaceC65349Pkn("should_precreate_lynx")
    public final Boolean shouldPrecreateLynx;

    @InterfaceC65349Pkn("slide_color")
    public final String slideColor;

    @InterfaceC65349Pkn("trans_info")
    public final String transInfo;

    public FeedCardTemplate(FeedCardBackgroundInfo feedCardBackgroundInfo, FeedCardActionButtonInfo feedCardActionButtonInfo, FeedCardDislikeButtonInfo feedCardDislikeButtonInfo, Integer num, String str, String str2, String str3, String str4, FeedCardEventTrackInfo feedCardEventTrackInfo, Boolean bool, String str5, Integer num2, KNT knt, FeedCardLynxConfig feedCardLynxConfig, Boolean bool2) {
        this.feedCardBackgroundInfo = feedCardBackgroundInfo;
        this.feedCardActionButtonInfo = feedCardActionButtonInfo;
        this.feedCardDislikeButtonInfo = feedCardDislikeButtonInfo;
        this.marginTop = num;
        this.slideColor = str;
        this.serverData = str2;
        this.dynamicUrl = str3;
        this.transInfo = str4;
        this.feedCardEventTrackInfo = feedCardEventTrackInfo;
        this.isLynxTemplate = bool;
        this.leftSlideSchema = str5;
        this.leftSlideType = num2;
        this.feedCardLynxConfig = feedCardLynxConfig;
        this.shouldPrecreateLynx = bool2;
    }
}

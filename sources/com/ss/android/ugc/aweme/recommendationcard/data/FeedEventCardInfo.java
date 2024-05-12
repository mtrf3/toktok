package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class FeedEventCardInfo {

    @InterfaceC65349Pkn("business_id")
    public final String businessId;

    @InterfaceC65349Pkn("client_data")
    public final String clientData;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("fe_data")
    public final String feData;

    @InterfaceC65349Pkn("feed_card_template")
    public final FeedCardTemplate feedCardTemplate;

    @InterfaceC65349Pkn("is_feed_card_template")
    public final Boolean isFeedCardTemplate;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("setting_key")
    public final String settingKey;

    public FeedEventCardInfo(String str, String str2, String str3, String str4, String str5, FeedCardTemplate feedCardTemplate, Boolean bool, String str6) {
        this.settingKey = str;
        this.schema = str2;
        this.feData = str3;
        this.clientData = str4;
        this.extra = str5;
        this.feedCardTemplate = feedCardTemplate;
        this.isFeedCardTemplate = bool;
        this.businessId = str6;
    }
}

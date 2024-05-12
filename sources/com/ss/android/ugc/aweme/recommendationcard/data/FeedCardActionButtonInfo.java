package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class FeedCardActionButtonInfo {

    @InterfaceC65349Pkn("bg_color")
    public final String bgColor;

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("need_show")
    public final Boolean needShow;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("text")
    public final String text;

    public FeedCardActionButtonInfo(Boolean bool, String str, String str2, String str3, String str4) {
        this.needShow = bool;
        this.text = str;
        this.bgColor = str2;
        this.color = str3;
        this.schema = str4;
    }
}

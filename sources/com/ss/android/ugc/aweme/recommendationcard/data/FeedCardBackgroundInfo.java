package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class FeedCardBackgroundInfo {

    @InterfaceC65349Pkn("bg_music_url")
    public final String bgMusicUrl;

    @InterfaceC65349Pkn("bg_picture_url")
    public final String bgPictureUrl;

    @InterfaceC65349Pkn("bg_video")
    public final FeedCardBackgroundVideoInfo feedCardBackgroundVideoInfo;

    @InterfaceC65349Pkn("need_show")
    public final Boolean needShow;

    @InterfaceC65349Pkn("title_text")
    public final String titleText;

    @InterfaceC65349Pkn("type")
    public final String type;

    public FeedCardBackgroundInfo(Boolean bool, String str, FeedCardBackgroundVideoInfo feedCardBackgroundVideoInfo, String str2, String str3, String str4) {
        this.needShow = bool;
        this.type = str;
        this.feedCardBackgroundVideoInfo = feedCardBackgroundVideoInfo;
        this.bgPictureUrl = str2;
        this.bgMusicUrl = str3;
        this.titleText = str4;
    }
}

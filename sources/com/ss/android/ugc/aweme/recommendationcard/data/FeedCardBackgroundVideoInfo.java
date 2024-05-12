package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeedCardBackgroundVideoInfo {

    @InterfaceC65349Pkn("default_pic_url")
    public final String defaultPicUrl;

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("poster")
    public final String poster;

    @InterfaceC65349Pkn("src")
    public final String src;

    @InterfaceC65349Pkn("video_id")
    public final String videoId;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    public FeedCardBackgroundVideoInfo(String str, Integer num, Integer num2, String str2, String poster, String str3) {
        o.LJIIIZ(poster, "poster");
        this.src = str;
        this.height = num;
        this.width = num2;
        this.videoId = str2;
        this.poster = poster;
        this.defaultPicUrl = str3;
    }
}

package com.ss.android.ugc.aweme.commercialize.topview;

import X.InterfaceC65349Pkn;
import X.NPX;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class TopViewAweme implements NPX {

    @InterfaceC65349Pkn("aweme_id")
    public final String aid;

    @InterfaceC65349Pkn("raw_ad_data")
    public final TopViewAwemeRawAd awemeRawAd;

    @InterfaceC65349Pkn("is_ads")
    public final boolean isAd;

    @InterfaceC65349Pkn("video")
    public final Video video;

    @Override // X.NPX
    public final TopViewAwemeRawAd LIZ() {
        return this.awemeRawAd;
    }

    @Override // X.NPX
    public final boolean LJZ() {
        return this.isAd;
    }

    @Override // X.NPX
    public final String getAid() {
        return this.aid;
    }

    @Override // X.NPX
    public final Video getVideo() {
        return this.video;
    }

    public TopViewAweme(String str, boolean z, TopViewAwemeRawAd topViewAwemeRawAd, Video video) {
        this.aid = str;
        this.isAd = z;
        this.awemeRawAd = topViewAwemeRawAd;
        this.video = video;
    }

    public /* synthetic */ TopViewAweme(String str, boolean z, TopViewAwemeRawAd topViewAwemeRawAd, Video video, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : topViewAwemeRawAd, (i & 8) != 0 ? null : video);
    }
}

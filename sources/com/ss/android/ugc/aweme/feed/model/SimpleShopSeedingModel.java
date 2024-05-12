package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class SimpleShopSeedingModel implements Serializable {

    @InterfaceC65349Pkn("cover")
    public final String cover;

    @InterfaceC65349Pkn("seed_id")
    public final String seedId;

    @InterfaceC65349Pkn("seed_tag")
    public final String seedTag;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("views")
    public final String views;

    public final String getCover() {
        return this.cover;
    }

    public final String getSeedId() {
        return this.seedId;
    }

    public final String getSeedTag() {
        return this.seedTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViews() {
        return this.views;
    }
}

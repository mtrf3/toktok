package com.ss.android.ugc.aweme.feed.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class PodcastUrlModel implements Serializable {

    @InterfaceC65349Pkn("uri")
    public String uri = "";

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList = C61878OQg.INSTANCE;

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }
}

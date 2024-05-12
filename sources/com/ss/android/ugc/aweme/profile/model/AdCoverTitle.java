package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class AdCoverTitle implements Serializable, Cloneable {

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    public String getTitle() {
        return this.title;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}

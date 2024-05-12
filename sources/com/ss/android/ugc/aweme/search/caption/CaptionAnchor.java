package com.ss.android.ugc.aweme.search.caption;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class CaptionAnchor implements Serializable {

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("keyword")
    public String keyword = "";

    @InterfaceC65349Pkn("link")
    public String link = "";

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}

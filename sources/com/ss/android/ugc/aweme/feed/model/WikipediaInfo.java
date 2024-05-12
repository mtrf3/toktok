package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WikipediaInfo implements Serializable {
    public String anchorId = "";
    public WikipediaExtra extra;

    @InterfaceC65349Pkn("keyword")
    public String keyword;

    @InterfaceC65349Pkn("lang")
    public String lang;

    public int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final WikipediaExtra getExtra() {
        return this.extra;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLang() {
        return this.lang;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WikipediaInfo)) {
            return false;
        }
        WikipediaInfo wikipediaInfo = (WikipediaInfo) obj;
        if (o.LJ(wikipediaInfo.keyword, this.keyword) && o.LJ(wikipediaInfo.lang, this.lang)) {
            return true;
        }
        return false;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setExtra(WikipediaExtra wikipediaExtra) {
        this.extra = wikipediaExtra;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }
}

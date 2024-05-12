package com.ss.android.ugc.aweme.search.caption;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class MatchInfo implements Serializable {

    @InterfaceC65349Pkn("begin")
    public int begin;

    @InterfaceC65349Pkn("end")
    public int end;

    @InterfaceC65349Pkn("link")
    public String link;

    @InterfaceC65349Pkn("query")
    public String query;

    public final int getBegin() {
        return this.begin;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setBegin(int i) {
        this.begin = i;
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setQuery(String str) {
        this.query = str;
    }
}

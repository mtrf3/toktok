package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class RecommendWordMob implements Serializable {

    @InterfaceC65349Pkn("info")
    public String info;

    @InterfaceC65349Pkn("query_id")
    public String queryId;

    @InterfaceC65349Pkn("words_source")
    public String wordsSource;

    public final String getInfo() {
        return this.info;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final String getWordsSource() {
        return this.wordsSource;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setWordsSource(String str) {
        this.wordsSource = str;
    }
}

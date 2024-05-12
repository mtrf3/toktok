package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class WordStruct implements Serializable {

    @InterfaceC65349Pkn("word")
    public String word = "";

    @InterfaceC65349Pkn("word_id")
    public String wordId = "";

    @InterfaceC65349Pkn("info")
    public String info = "";

    public final String getInfo() {
        return this.info;
    }

    public final String getWord() {
        return this.word;
    }

    public final String getWordId() {
        return this.wordId;
    }

    public final void setInfo(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.info = str;
    }

    public final void setWord(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.word = str;
    }

    public final void setWordId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.wordId = str;
    }
}

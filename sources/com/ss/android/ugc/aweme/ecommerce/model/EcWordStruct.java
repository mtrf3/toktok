package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class EcWordStruct implements Serializable {

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
        this.info = str;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordId(String str) {
        this.wordId = str;
    }
}

package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class EcFeedSuggestWordList implements Serializable {

    @InterfaceC65349Pkn("ttec_suggest_words")
    public List<EcSuggestWordStruct> suggestWords;

    public final List<EcSuggestWordStruct> getSuggestWords() {
        return this.suggestWords;
    }

    public final void setSuggestWords(List<EcSuggestWordStruct> list) {
        this.suggestWords = list;
    }
}

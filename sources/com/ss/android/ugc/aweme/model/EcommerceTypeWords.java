package com.ss.android.ugc.aweme.model;

import X.C69342nq;
import X.InterfaceC65349Pkn;
import java.util.List;
import ujb.o;

/* loaded from: classes2.dex */
public final class EcommerceTypeWords {
    public static final C69342nq Companion = new Object() { // from class: X.2nq
    };
    public boolean fromCache;
    public String imprId = "";
    public String logId;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("params")
    public final EcommerceTypeWordsParams typeWordsParams;

    @InterfaceC65349Pkn("words")
    public List<EcommerceSuggestWord> words;

    public final boolean getFromCache() {
        return this.fromCache;
    }

    public final String getImprId() {
        return this.imprId;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public final EcommerceTypeWordsParams getTypeWordsParams() {
        return this.typeWordsParams;
    }

    public final List<EcommerceSuggestWord> getWords() {
        return this.words;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EcommerceTypeWords)) {
            return false;
        }
        if (o.LJJJJIZL(this.source, "inbox", false)) {
            EcommerceTypeWords ecommerceTypeWords = (EcommerceTypeWords) obj;
            if (o.LJJJJIZL(ecommerceTypeWords.source, "inbox", false)) {
                return kotlin.jvm.internal.o.LJ(this.words, ecommerceTypeWords.words);
            }
        }
        return super.equals(obj);
    }

    public final void setFromCache(boolean z) {
        this.fromCache = z;
    }

    public final void setImprId(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.imprId = str;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setWords(List<EcommerceSuggestWord> list) {
        this.words = list;
    }
}

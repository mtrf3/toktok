package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RelatedWord {

    @InterfaceC65349Pkn("related_word_bg_img")
    public final String backgroundImageUrl;

    @InterfaceC65349Pkn("related_word")
    public final String text;

    @InterfaceC65349Pkn("word_record")
    public final Word wordRecord;

    @InterfaceC65349Pkn("word_type")
    public final String wordType;

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedWord() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelatedWord(text=");
        LIZ.append(this.text);
        LIZ.append(", wordRecord=");
        LIZ.append(this.wordRecord);
        LIZ.append(", backgroundImageUrl=");
        LIZ.append(this.backgroundImageUrl);
        LIZ.append(", wordType=");
        return q.LIZIZ(LIZ, this.wordType, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public RelatedWord(String str, Word word, String str2, String str3) {
        HH1.LIZ(str, "text", str2, "backgroundImageUrl", str3, "wordType");
        this.text = str;
        this.wordRecord = word;
        this.backgroundImageUrl = str2;
        this.wordType = str3;
    }

    public /* synthetic */ RelatedWord(String str, Word word, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : word, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}

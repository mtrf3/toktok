package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ClickSearchWord {
    public boolean LIZ;

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("sug_word")
    public final String word;

    @InterfaceC65349Pkn("word_record")
    public final Word wordRecord;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickSearchWord() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClickSearchWord(word=");
        LIZ.append(this.word);
        LIZ.append(", groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", wordRecord=");
        LIZ.append(this.wordRecord);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ClickSearchWord(String str, String str2, Word word) {
        this.word = str;
        this.groupId = str2;
        this.wordRecord = word;
    }

    public /* synthetic */ ClickSearchWord(String str, String str2, Word word, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : word);
    }
}

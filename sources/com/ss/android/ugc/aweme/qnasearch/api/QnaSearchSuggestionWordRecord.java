package com.ss.android.ugc.aweme.qnasearch.api;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class QnaSearchSuggestionWordRecord extends F9E {

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("words_content")
    public final String wordsContent;

    @InterfaceC65349Pkn("words_position")
    public final int wordsPosition;

    @InterfaceC65349Pkn("words_source")
    public final String wordsSource;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.groupId, Integer.valueOf(this.wordsPosition), this.wordsContent, this.wordsSource};
    }

    public QnaSearchSuggestionWordRecord(String str, int i, String str2, String str3) {
        HH1.LIZ(str, "groupId", str2, "wordsContent", str3, "wordsSource");
        this.groupId = str;
        this.wordsPosition = i;
        this.wordsContent = str2;
        this.wordsSource = str3;
    }
}

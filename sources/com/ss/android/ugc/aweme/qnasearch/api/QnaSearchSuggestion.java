package com.ss.android.ugc.aweme.qnasearch.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class QnaSearchSuggestion {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("extra_info")
    public final QnaSearchSuggestionExtraInfo extraInfo;

    @InterfaceC65349Pkn("highlight_pos")
    public final List<QnaSearchSuggestionHighlightPositions> highlightPos;

    @InterfaceC65349Pkn("pos")
    public final List<QnaSearchSuggestionHighlightPositions> pos;

    @InterfaceC65349Pkn("rich_sug_sec_pos")
    public final Integer richSugSecPos;

    @InterfaceC65349Pkn("word_record")
    public final QnaSearchSuggestionWordRecord wordRecord;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QnaSearchSuggestion)) {
            return false;
        }
        QnaSearchSuggestion qnaSearchSuggestion = (QnaSearchSuggestion) obj;
        return o.LJ(this.pos, qnaSearchSuggestion.pos) && o.LJ(this.content, qnaSearchSuggestion.content) && o.LJ(this.wordRecord, qnaSearchSuggestion.wordRecord) && o.LJ(this.extraInfo, qnaSearchSuggestion.extraInfo) && o.LJ(this.richSugSecPos, qnaSearchSuggestion.richSugSecPos) && o.LJ(this.highlightPos, qnaSearchSuggestion.highlightPos);
    }

    public final int hashCode() {
        List<QnaSearchSuggestionHighlightPositions> list = this.pos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.content;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        QnaSearchSuggestionWordRecord qnaSearchSuggestionWordRecord = this.wordRecord;
        int hashCode3 = (hashCode2 + (qnaSearchSuggestionWordRecord == null ? 0 : qnaSearchSuggestionWordRecord.hashCode())) * 31;
        QnaSearchSuggestionExtraInfo qnaSearchSuggestionExtraInfo = this.extraInfo;
        int hashCode4 = (hashCode3 + (qnaSearchSuggestionExtraInfo == null ? 0 : qnaSearchSuggestionExtraInfo.hashCode())) * 31;
        Integer num = this.richSugSecPos;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<QnaSearchSuggestionHighlightPositions> list2 = this.highlightPos;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaSearchSuggestion(pos=");
        LIZ.append(this.pos);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", wordRecord=");
        LIZ.append(this.wordRecord);
        LIZ.append(", extraInfo=");
        LIZ.append(this.extraInfo);
        LIZ.append(", richSugSecPos=");
        LIZ.append(this.richSugSecPos);
        LIZ.append(", highlightPos=");
        return C1NE.LIZIZ(LIZ, this.highlightPos, ')', LIZ);
    }

    public QnaSearchSuggestion(List<QnaSearchSuggestionHighlightPositions> list, String str, QnaSearchSuggestionWordRecord qnaSearchSuggestionWordRecord, QnaSearchSuggestionExtraInfo qnaSearchSuggestionExtraInfo, Integer num, List<QnaSearchSuggestionHighlightPositions> list2) {
        this.pos = list;
        this.content = str;
        this.wordRecord = qnaSearchSuggestionWordRecord;
        this.extraInfo = qnaSearchSuggestionExtraInfo;
        this.richSugSecPos = num;
        this.highlightPos = list2;
    }

    public /* synthetic */ QnaSearchSuggestion(List list, String str, QnaSearchSuggestionWordRecord qnaSearchSuggestionWordRecord, QnaSearchSuggestionExtraInfo qnaSearchSuggestionExtraInfo, Integer num, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : qnaSearchSuggestionWordRecord, (i & 8) != 0 ? null : qnaSearchSuggestionExtraInfo, (i & 16) != 0 ? null : num, (i & 32) == 0 ? list2 : null);
    }
}

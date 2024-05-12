package com.ss.android.ugc.aweme.qnasearch.api;

import X.AnonymousClass391;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QnaSearchSuggestionResponse {

    @InterfaceC65349Pkn("sug_list")
    public final List<QnaSearchSuggestion> qnaSearchSuggestion;

    @InterfaceC65349Pkn("log_pb")
    public final QnaSearchSuggestionLogPb qnaSearchSuggestionLogPb;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QnaSearchSuggestionResponse)) {
            return false;
        }
        QnaSearchSuggestionResponse qnaSearchSuggestionResponse = (QnaSearchSuggestionResponse) obj;
        return this.statusCode == qnaSearchSuggestionResponse.statusCode && o.LJ(this.qnaSearchSuggestion, qnaSearchSuggestionResponse.qnaSearchSuggestion) && o.LJ(this.qnaSearchSuggestionLogPb, qnaSearchSuggestionResponse.qnaSearchSuggestionLogPb);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaSearchSuggestionResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", qnaSearchSuggestion=");
        LIZ.append(this.qnaSearchSuggestion);
        LIZ.append(", qnaSearchSuggestionLogPb=");
        LIZ.append(this.qnaSearchSuggestionLogPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.qnaSearchSuggestion, this.statusCode * 31, 31);
        QnaSearchSuggestionLogPb qnaSearchSuggestionLogPb = this.qnaSearchSuggestionLogPb;
        if (qnaSearchSuggestionLogPb == null) {
            hashCode = 0;
        } else {
            hashCode = qnaSearchSuggestionLogPb.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public QnaSearchSuggestionResponse(int i, List<QnaSearchSuggestion> qnaSearchSuggestion, QnaSearchSuggestionLogPb qnaSearchSuggestionLogPb) {
        o.LJIIIZ(qnaSearchSuggestion, "qnaSearchSuggestion");
        this.statusCode = i;
        this.qnaSearchSuggestion = qnaSearchSuggestion;
        this.qnaSearchSuggestionLogPb = qnaSearchSuggestionLogPb;
    }
}

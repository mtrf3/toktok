package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class QueryCorrectComponentInfo {

    @InterfaceC65349Pkn("correct_highlight_position")
    public final HighlightPosition correctHighlightPosition;

    @InterfaceC65349Pkn("correct_level")
    public final int correctLevel;

    @InterfaceC65349Pkn("corrected_query")
    public final String correctedQuery;

    @InterfaceC65349Pkn("original_query")
    public final String originalQuery;

    @InterfaceC65349Pkn("query_descs")
    public final List<QueryDesc> queryDescList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryCorrectComponentInfo)) {
            return false;
        }
        QueryCorrectComponentInfo queryCorrectComponentInfo = (QueryCorrectComponentInfo) obj;
        return o.LJ(this.queryDescList, queryCorrectComponentInfo.queryDescList) && o.LJ(this.correctedQuery, queryCorrectComponentInfo.correctedQuery) && o.LJ(this.originalQuery, queryCorrectComponentInfo.originalQuery) && o.LJ(this.correctHighlightPosition, queryCorrectComponentInfo.correctHighlightPosition) && this.correctLevel == queryCorrectComponentInfo.correctLevel;
    }

    public final int hashCode() {
        List<QueryDesc> list = this.queryDescList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.correctedQuery;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalQuery;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HighlightPosition highlightPosition = this.correctHighlightPosition;
        return ((hashCode3 + (highlightPosition != null ? highlightPosition.hashCode() : 0)) * 31) + this.correctLevel;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryCorrectComponentInfo(queryDescList=");
        LIZ.append(this.queryDescList);
        LIZ.append(", correctedQuery=");
        LIZ.append(this.correctedQuery);
        LIZ.append(", originalQuery=");
        LIZ.append(this.originalQuery);
        LIZ.append(", correctHighlightPosition=");
        LIZ.append(this.correctHighlightPosition);
        LIZ.append(", correctLevel=");
        return b0.LIZJ(LIZ, this.correctLevel, ')', LIZ);
    }

    public QueryCorrectComponentInfo(List<QueryDesc> list, String str, String str2, HighlightPosition highlightPosition, int i) {
        this.queryDescList = list;
        this.correctedQuery = str;
        this.originalQuery = str2;
        this.correctHighlightPosition = highlightPosition;
        this.correctLevel = i;
    }
}

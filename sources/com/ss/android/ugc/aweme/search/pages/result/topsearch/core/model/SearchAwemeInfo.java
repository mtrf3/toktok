package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchAwemeInfo {

    @InterfaceC65349Pkn("has_creation_intention")
    public final Boolean hasCreationIntention;

    @InterfaceC65349Pkn("relevant_clip")
    public final RelevantClip relevantClip;

    @InterfaceC65349Pkn("translate_search_descs")
    public final List<TranslateSearchDesc> translateSearchList;

    @InterfaceC65349Pkn("with_search_survey")
    public final Boolean withSearchSurvey;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchAwemeInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAwemeInfo)) {
            return false;
        }
        SearchAwemeInfo searchAwemeInfo = (SearchAwemeInfo) obj;
        return o.LJ(this.withSearchSurvey, searchAwemeInfo.withSearchSurvey) && o.LJ(this.hasCreationIntention, searchAwemeInfo.hasCreationIntention) && o.LJ(this.translateSearchList, searchAwemeInfo.translateSearchList) && o.LJ(this.relevantClip, searchAwemeInfo.relevantClip);
    }

    public final int hashCode() {
        Boolean bool = this.withSearchSurvey;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasCreationIntention;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<TranslateSearchDesc> list = this.translateSearchList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RelevantClip relevantClip = this.relevantClip;
        return hashCode3 + (relevantClip != null ? relevantClip.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAwemeInfo(withSearchSurvey=");
        LIZ.append(this.withSearchSurvey);
        LIZ.append(", hasCreationIntention=");
        LIZ.append(this.hasCreationIntention);
        LIZ.append(", translateSearchList=");
        LIZ.append(this.translateSearchList);
        LIZ.append(", relevantClip=");
        LIZ.append(this.relevantClip);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SearchAwemeInfo(Boolean bool, Boolean bool2, List<TranslateSearchDesc> list, RelevantClip relevantClip) {
        this.withSearchSurvey = bool;
        this.hasCreationIntention = bool2;
        this.translateSearchList = list;
        this.relevantClip = relevantClip;
    }

    public /* synthetic */ SearchAwemeInfo(Boolean bool, Boolean bool2, List list, RelevantClip relevantClip, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : relevantClip);
    }
}

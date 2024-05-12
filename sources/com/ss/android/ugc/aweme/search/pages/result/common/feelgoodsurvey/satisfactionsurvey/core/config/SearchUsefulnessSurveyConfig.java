package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchUsefulnessSurveyConfig implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("inner_feed_config")
    public final SearchInnerFeedConfig innerFeedConfig;

    @InterfaceC65349Pkn("survey_id")
    public final List<String> surveyId;

    public SearchUsefulnessSurveyConfig() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchUsefulnessSurveyConfig copy$default(SearchUsefulnessSurveyConfig searchUsefulnessSurveyConfig, SearchInnerFeedConfig searchInnerFeedConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            searchInnerFeedConfig = searchUsefulnessSurveyConfig.innerFeedConfig;
        }
        if ((i & 2) != 0) {
            list = searchUsefulnessSurveyConfig.surveyId;
        }
        return searchUsefulnessSurveyConfig.copy(searchInnerFeedConfig, list);
    }

    public final SearchUsefulnessSurveyConfig copy(SearchInnerFeedConfig searchInnerFeedConfig, List<String> list) {
        return new SearchUsefulnessSurveyConfig(searchInnerFeedConfig, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUsefulnessSurveyConfig)) {
            return false;
        }
        SearchUsefulnessSurveyConfig searchUsefulnessSurveyConfig = (SearchUsefulnessSurveyConfig) obj;
        return o.LJ(this.innerFeedConfig, searchUsefulnessSurveyConfig.innerFeedConfig) && o.LJ(this.surveyId, searchUsefulnessSurveyConfig.surveyId);
    }

    public int hashCode() {
        SearchInnerFeedConfig searchInnerFeedConfig = this.innerFeedConfig;
        int hashCode = (searchInnerFeedConfig == null ? 0 : searchInnerFeedConfig.hashCode()) * 31;
        List<String> list = this.surveyId;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchUsefulnessSurveyConfig(innerFeedConfig=");
        LIZ.append(this.innerFeedConfig);
        LIZ.append(", surveyId=");
        return C1NE.LIZIZ(LIZ, this.surveyId, ')', LIZ);
    }

    public final SearchInnerFeedConfig getInnerFeedConfig() {
        return this.innerFeedConfig;
    }

    public final List<String> getSurveyId() {
        return this.surveyId;
    }

    public SearchUsefulnessSurveyConfig(SearchInnerFeedConfig searchInnerFeedConfig, List<String> list) {
        this.innerFeedConfig = searchInnerFeedConfig;
        this.surveyId = list;
    }

    public SearchUsefulnessSurveyConfig(SearchInnerFeedConfig searchInnerFeedConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchInnerFeedConfig, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}

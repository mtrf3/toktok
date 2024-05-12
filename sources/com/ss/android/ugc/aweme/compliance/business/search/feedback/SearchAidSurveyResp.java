package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchAidSurveyResp extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("survey_data")
    public final UserSurveyConfigDetail surveyData;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchAidSurveyResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchAidSurveyResp copy$default(SearchAidSurveyResp searchAidSurveyResp, UserSurveyConfigDetail userSurveyConfigDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            userSurveyConfigDetail = searchAidSurveyResp.surveyData;
        }
        return searchAidSurveyResp.copy(userSurveyConfigDetail);
    }

    public final SearchAidSurveyResp copy(UserSurveyConfigDetail surveyData) {
        o.LJIIIZ(surveyData, "surveyData");
        return new SearchAidSurveyResp(surveyData);
    }

    public int hashCode() {
        return Objects.hash(this.surveyData);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("SearchAidSurveyResp:%s", this.surveyData);
    }

    public final UserSurveyConfigDetail getSurveyData() {
        return this.surveyData;
    }

    public SearchAidSurveyResp(UserSurveyConfigDetail surveyData) {
        o.LJIIIZ(surveyData, "surveyData");
        this.surveyData = surveyData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAidSurveyResp)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((SearchAidSurveyResp) obj).surveyData}, new Object[]{this.surveyData});
    }

    public /* synthetic */ SearchAidSurveyResp(UserSurveyConfigDetail userSurveyConfigDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UserSurveyConfigDetail(0, null, 3, null) : userSurveyConfigDetail);
    }
}

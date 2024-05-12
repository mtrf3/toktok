package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.npssurvey.core.config;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NPSSurveyIdConfig {

    @InterfaceC65349Pkn("survey_id")
    public final List<String> surveyId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NPSSurveyIdConfig) && o.LJ(this.surveyId, ((NPSSurveyIdConfig) obj).surveyId);
    }

    public final int hashCode() {
        List<String> list = this.surveyId;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NPSSurveyIdConfig(surveyId=");
        return C1NE.LIZIZ(LIZ, this.surveyId, ')', LIZ);
    }

    public NPSSurveyIdConfig(List<String> list) {
        this.surveyId = list;
    }
}

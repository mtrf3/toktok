package com.ss.android.ugc.aweme.feed.survey.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FypSurveyParams {

    @InterfaceC65349Pkn("survey_keys")
    public final List<String> surveyKeys;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FypSurveyParams) && o.LJ(this.surveyKeys, ((FypSurveyParams) obj).surveyKeys);
    }

    public final int hashCode() {
        List<String> list = this.surveyKeys;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FypSurveyParams(surveyKeys=");
        return C1NE.LIZIZ(LIZ, this.surveyKeys, ')', LIZ);
    }

    public FypSurveyParams(List<String> list) {
        this.surveyKeys = list;
    }
}

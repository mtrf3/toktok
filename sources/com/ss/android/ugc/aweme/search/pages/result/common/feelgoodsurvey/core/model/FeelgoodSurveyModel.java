package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeelgoodSurveyModel implements Serializable {

    @InterfaceC65349Pkn("questionnaire")
    public final FeelgoodSurveyQuestionnaire questionnaire;

    public static /* synthetic */ FeelgoodSurveyModel copy$default(FeelgoodSurveyModel feelgoodSurveyModel, FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire, int i, Object obj) {
        if ((i & 1) != 0) {
            feelgoodSurveyQuestionnaire = feelgoodSurveyModel.questionnaire;
        }
        return feelgoodSurveyModel.copy(feelgoodSurveyQuestionnaire);
    }

    public final FeelgoodSurveyModel copy(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        return new FeelgoodSurveyModel(feelgoodSurveyQuestionnaire);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeelgoodSurveyModel) && o.LJ(this.questionnaire, ((FeelgoodSurveyModel) obj).questionnaire);
    }

    public int hashCode() {
        FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire = this.questionnaire;
        if (feelgoodSurveyQuestionnaire == null) {
            return 0;
        }
        return feelgoodSurveyQuestionnaire.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodSurveyModel(questionnaire=");
        LIZ.append(this.questionnaire);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final FeelgoodSurveyQuestionnaire getQuestionnaire() {
        return this.questionnaire;
    }

    public FeelgoodSurveyModel(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        this.questionnaire = feelgoodSurveyQuestionnaire;
    }
}

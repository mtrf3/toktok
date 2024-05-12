package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeelgoodSurveyQuestion implements Serializable {

    @InterfaceC65349Pkn("questionKey")
    public final String questionKey;

    @InterfaceC65349Pkn("questionType")
    public final Integer questionType;

    @InterfaceC65349Pkn("ratingData")
    public final RatingData ratingData;

    @InterfaceC65349Pkn("singleChoiceData")
    public final FeelgoodSingleChoiceData singleChoiceData;

    public static /* synthetic */ FeelgoodSurveyQuestion copy$default(FeelgoodSurveyQuestion feelgoodSurveyQuestion, Integer num, String str, FeelgoodSingleChoiceData feelgoodSingleChoiceData, RatingData ratingData, int i, Object obj) {
        if ((i & 1) != 0) {
            num = feelgoodSurveyQuestion.questionType;
        }
        if ((i & 2) != 0) {
            str = feelgoodSurveyQuestion.questionKey;
        }
        if ((i & 4) != 0) {
            feelgoodSingleChoiceData = feelgoodSurveyQuestion.singleChoiceData;
        }
        if ((i & 8) != 0) {
            ratingData = feelgoodSurveyQuestion.ratingData;
        }
        return feelgoodSurveyQuestion.copy(num, str, feelgoodSingleChoiceData, ratingData);
    }

    public final FeelgoodSurveyQuestion copy(Integer num, String str, FeelgoodSingleChoiceData feelgoodSingleChoiceData, RatingData ratingData) {
        return new FeelgoodSurveyQuestion(num, str, feelgoodSingleChoiceData, ratingData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeelgoodSurveyQuestion)) {
            return false;
        }
        FeelgoodSurveyQuestion feelgoodSurveyQuestion = (FeelgoodSurveyQuestion) obj;
        return o.LJ(this.questionType, feelgoodSurveyQuestion.questionType) && o.LJ(this.questionKey, feelgoodSurveyQuestion.questionKey) && o.LJ(this.singleChoiceData, feelgoodSurveyQuestion.singleChoiceData) && o.LJ(this.ratingData, feelgoodSurveyQuestion.ratingData);
    }

    public int hashCode() {
        Integer num = this.questionType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.questionKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FeelgoodSingleChoiceData feelgoodSingleChoiceData = this.singleChoiceData;
        int hashCode3 = (hashCode2 + (feelgoodSingleChoiceData == null ? 0 : feelgoodSingleChoiceData.hashCode())) * 31;
        RatingData ratingData = this.ratingData;
        return hashCode3 + (ratingData != null ? ratingData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodSurveyQuestion(questionType=");
        LIZ.append(this.questionType);
        LIZ.append(", questionKey=");
        LIZ.append(this.questionKey);
        LIZ.append(", singleChoiceData=");
        LIZ.append(this.singleChoiceData);
        LIZ.append(", ratingData=");
        LIZ.append(this.ratingData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getQuestionKey() {
        return this.questionKey;
    }

    public final Integer getQuestionType() {
        return this.questionType;
    }

    public final RatingData getRatingData() {
        return this.ratingData;
    }

    public final FeelgoodSingleChoiceData getSingleChoiceData() {
        return this.singleChoiceData;
    }

    public FeelgoodSurveyQuestion(Integer num, String str, FeelgoodSingleChoiceData feelgoodSingleChoiceData, RatingData ratingData) {
        this.questionType = num;
        this.questionKey = str;
        this.singleChoiceData = feelgoodSingleChoiceData;
        this.ratingData = ratingData;
    }
}

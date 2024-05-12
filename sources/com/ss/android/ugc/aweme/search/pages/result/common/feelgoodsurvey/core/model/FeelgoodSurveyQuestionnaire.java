package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeelgoodSurveyQuestionnaire implements Serializable {

    @InterfaceC65349Pkn("customText")
    public final String customText;

    @InterfaceC65349Pkn("questionnaireID")
    public final String questionnaireID;

    @InterfaceC65349Pkn("showConfig")
    public final FeelgoodShowConfig showConfig;

    @InterfaceC65349Pkn("submitID")
    public final String submitID;

    @InterfaceC65349Pkn("surveyID")
    public final String surveyID;

    public static /* synthetic */ FeelgoodSurveyQuestionnaire copy$default(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire, String str, String str2, String str3, FeelgoodShowConfig feelgoodShowConfig, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feelgoodSurveyQuestionnaire.questionnaireID;
        }
        if ((i & 2) != 0) {
            str2 = feelgoodSurveyQuestionnaire.submitID;
        }
        if ((i & 4) != 0) {
            str3 = feelgoodSurveyQuestionnaire.surveyID;
        }
        if ((i & 8) != 0) {
            feelgoodShowConfig = feelgoodSurveyQuestionnaire.showConfig;
        }
        if ((i & 16) != 0) {
            str4 = feelgoodSurveyQuestionnaire.customText;
        }
        return feelgoodSurveyQuestionnaire.copy(str, str2, str3, feelgoodShowConfig, str4);
    }

    public final FeelgoodSurveyQuestionnaire copy(String str, String str2, String str3, FeelgoodShowConfig feelgoodShowConfig, String str4) {
        return new FeelgoodSurveyQuestionnaire(str, str2, str3, feelgoodShowConfig, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeelgoodSurveyQuestionnaire)) {
            return false;
        }
        FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire = (FeelgoodSurveyQuestionnaire) obj;
        return o.LJ(this.questionnaireID, feelgoodSurveyQuestionnaire.questionnaireID) && o.LJ(this.submitID, feelgoodSurveyQuestionnaire.submitID) && o.LJ(this.surveyID, feelgoodSurveyQuestionnaire.surveyID) && o.LJ(this.showConfig, feelgoodSurveyQuestionnaire.showConfig) && o.LJ(this.customText, feelgoodSurveyQuestionnaire.customText);
    }

    public int hashCode() {
        String str = this.questionnaireID;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.submitID;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surveyID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FeelgoodShowConfig feelgoodShowConfig = this.showConfig;
        int hashCode4 = (hashCode3 + (feelgoodShowConfig == null ? 0 : feelgoodShowConfig.hashCode())) * 31;
        String str4 = this.customText;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodSurveyQuestionnaire(questionnaireID=");
        LIZ.append(this.questionnaireID);
        LIZ.append(", submitID=");
        LIZ.append(this.submitID);
        LIZ.append(", surveyID=");
        LIZ.append(this.surveyID);
        LIZ.append(", showConfig=");
        LIZ.append(this.showConfig);
        LIZ.append(", customText=");
        return q.LIZIZ(LIZ, this.customText, ')', LIZ);
    }

    public final String getCustomText() {
        return this.customText;
    }

    public final String getQuestionnaireID() {
        return this.questionnaireID;
    }

    public final FeelgoodShowConfig getShowConfig() {
        return this.showConfig;
    }

    public final String getSubmitID() {
        return this.submitID;
    }

    public final String getSurveyID() {
        return this.surveyID;
    }

    public FeelgoodSurveyQuestionnaire(String str, String str2, String str3, FeelgoodShowConfig feelgoodShowConfig, String str4) {
        this.questionnaireID = str;
        this.submitID = str2;
        this.surveyID = str3;
        this.showConfig = feelgoodShowConfig;
        this.customText = str4;
    }
}

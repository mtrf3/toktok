package X;

import Y.AgS122S0100000_4;
import com.ss.android.ugc.aweme.profile.survey.SurveyAnswer;
import com.ss.android.ugc.aweme.profile.survey.SurveyApi;
import com.ss.android.ugc.aweme.survey.SurveyData;

/* loaded from: classes5.dex */
public final class AOV {
    public static volatile AOV LIZIZ;
    public AOJ LIZ;

    public static AOV LIZ() {
        if (LIZIZ == null) {
            synchronized (AOV.class) {
                if (LIZIZ == null) {
                    LIZIZ = new AOV();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZJ() {
        try {
            C10K<SurveyData> surveyData = SurveyApi.LIZ.getSurveyData();
            if (surveyData != null) {
                surveyData.LIZLLL(new AgS122S0100000_4(this, 1));
            }
        } catch (Throwable unused) {
        }
    }

    public AOV() {
        if (LIZIZ == null) {
        } else {
            throw new RuntimeException("Illegal access.");
        }
    }

    public static void LIZIZ(SurveyAnswer surveyAnswer) {
        try {
            C10K<Object> recordAnswer = SurveyApi.LIZ.recordAnswer(surveyAnswer.actionType, surveyAnswer.dialogId, surveyAnswer.originalId);
            if (recordAnswer != null) {
                recordAnswer.LIZLLL(new AOY(1));
            }
        } catch (Throwable unused) {
        }
    }
}

package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.survey.SurveyData;

/* loaded from: classes5.dex */
public final class AOW implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ SurveyData LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public AOW(int i, SurveyData surveyData, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = surveyData;
        this.LJLJI = str;
    }

    public final void LIZ() {
        String str;
        String str2;
        int i = this.LJLIL;
        if (i == 3) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("pop_survey_id", String.valueOf(this.LJLILLLLZI.dialogId));
            if (!TextUtils.isEmpty(this.LJLILLLLZI.originalQuestion)) {
                str2 = this.LJLILLLLZI.originalQuestion;
            } else {
                str2 = this.LJLILLLLZI.question;
            }
            c188727au.LJIIIZ("pop_survey_question", str2);
            c188727au.LIZLLL(this.LJLILLLLZI.originId, "original_id");
            FMX.LJIIL("pop_survey_close", c188727au.LIZ);
            return;
        }
        if (i != 1 && i != 2) {
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("pop_survey_id", String.valueOf(this.LJLILLLLZI.dialogId));
        if (!TextUtils.isEmpty(this.LJLILLLLZI.originalQuestion)) {
            str = this.LJLILLLLZI.originalQuestion;
        } else {
            str = this.LJLILLLLZI.question;
        }
        c188727au2.LJIIIZ("pop_survey_question", str);
        c188727au2.LIZLLL(this.LJLILLLLZI.originId, "original_id");
        c188727au2.LJIIIZ("pop_survey_answer", this.LJLJI);
        FMX.LJIIL("pop_survey_answer", c188727au2.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

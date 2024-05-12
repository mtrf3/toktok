package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.survey.SurveyAnswer;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.survey.SurveyData;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AOU {
    public final /* synthetic */ AOX LIZ;
    public final /* synthetic */ BaseMyProfileGuideWidget LIZIZ;

    public AOU(AOZ aoz, MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
        this.LIZ = aoz;
        this.LIZIZ = myProfileGuideWidgetV2;
    }

    public final void LIZ(int i, SurveyData surveyData, String answerText) {
        o.LJIIIZ(surveyData, "surveyData");
        o.LJIIIZ(answerText, "answerText");
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AOX aox = this.LIZ;
                    View view = aox.LJLILLLLZI;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    aox.LIZ();
                    aox.LJLLLL = false;
                }
            } else {
                this.LIZ.LIZIZ();
            }
        } else {
            this.LIZ.LIZIZ();
        }
        AOV LIZ = AOV.LIZ();
        SurveyAnswer surveyAnswer = new SurveyAnswer(i, surveyData.dialogId, surveyData.originId);
        LIZ.getClass();
        AOV.LIZIZ(surveyAnswer);
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.LIZIZ;
        baseMyProfileGuideWidget.getClass();
        C82544WaS.LIZIZ(new AOW(i, surveyData, answerText), baseMyProfileGuideWidget.LJLJI);
    }
}

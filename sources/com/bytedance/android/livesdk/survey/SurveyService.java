package com.bytedance.android.livesdk.survey;

import X.C78135UlX;
import X.C87856Ydw;
import X.EnumC78138Ula;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget;
import com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class SurveyService implements ISurveyService {
    public SurveyCardWidget LJLIL;
    public SurveyControlWidget LJLILLLLZI;

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.survey.ISurveyService
    public final void release() {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    @Override // com.bytedance.android.livesdk.survey.ISurveyService
    public final boolean Qj() {
        C78135UlX c78135UlX;
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        C87856Ydw c87856Ydw;
        SurveyControlWidget surveyControlWidget = this.LJLILLLLZI;
        if (surveyControlWidget == null || (c78135UlX = surveyControlWidget.LJLILLLLZI) == null || (surveyData = c78135UlX.LJLILLLLZI) == null || (surveyShowMode = surveyData.showMode) == null || surveyShowMode.triggerType != 2 || (c87856Ydw = c78135UlX.LJLJI) == null) {
            return false;
        }
        return c87856Ydw.LJIIIZ();
    }

    @Override // com.bytedance.android.livesdk.survey.ISurveyService
    public final void gn0() {
        C78135UlX c78135UlX;
        SurveyControlWidget surveyControlWidget = this.LJLILLLLZI;
        if (surveyControlWidget != null && (c78135UlX = surveyControlWidget.LJLILLLLZI) != null) {
            c78135UlX.LJJJJI(c78135UlX.LJJJJ(), EnumC78138Ula.CANCEL, 0L);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ISurveyService
    public final SurveyControlWidget rc0() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new SurveyControlWidget();
        }
        SurveyControlWidget surveyControlWidget = this.LJLILLLLZI;
        o.LJI(surveyControlWidget);
        return surveyControlWidget;
    }

    @Override // com.bytedance.android.livesdk.survey.ISurveyService
    public final SurveyCardWidget vh0() {
        if (this.LJLIL == null) {
            this.LJLIL = new SurveyCardWidget();
        }
        SurveyCardWidget surveyCardWidget = this.LJLIL;
        o.LJI(surveyCardWidget);
        return surveyCardWidget;
    }
}

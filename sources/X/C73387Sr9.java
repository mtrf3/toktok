package X;

import android.content.Context;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Sr9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73387Sr9 implements InterfaceC71797SFt {
    public final /* synthetic */ C78137UlZ LIZ;

    public C73387Sr9(C78137UlZ c78137UlZ) {
        this.LIZ = c78137UlZ;
    }

    @Override // X.InterfaceC71797SFt
    public final void LIZ(C71796SFs vh) {
        int i;
        HashSet<SurveySecondQuestion> hashSet;
        HashSet<SurveySecondQuestion> hashSet2;
        HashSet<SurveySecondQuestion> hashSet3;
        String str;
        o.LJIIIZ(vh, "vh");
        C78137UlZ c78137UlZ = this.LIZ;
        SurveyViewModel surveyViewModel = c78137UlZ.LJLLL;
        if (surveyViewModel != null && (hashSet3 = surveyViewModel.LJLJJI) != null) {
            if (ORZ.LJLJJI(vh.LJLIL, hashSet3)) {
                C65777Prh.LIZ(hashSet3).remove(vh.LJLIL);
                vh.L(false);
            } else {
                SurveySecondQuestion surveySecondQuestion = vh.LJLIL;
                if (surveySecondQuestion != null) {
                    hashSet3.add(surveySecondQuestion);
                }
                vh.L(true);
                SurveySecondQuestion surveySecondQuestion2 = vh.LJLIL;
                if (surveySecondQuestion2 != null && surveySecondQuestion2.isOther) {
                    LiveEditText surveySecondOtherInputText = c78137UlZ.getSurveySecondOtherInputText();
                    SurveyViewModel surveyViewModel2 = c78137UlZ.LJLLL;
                    if (surveyViewModel2 != null) {
                        str = surveyViewModel2.LJLJJL;
                    } else {
                        str = null;
                    }
                    surveySecondOtherInputText.setText(str);
                }
            }
        }
        SurveySecondQuestion surveySecondQuestion3 = vh.LJLIL;
        if (surveySecondQuestion3 != null && surveySecondQuestion3.isOther) {
            SurveyViewModel surveyViewModel3 = this.LIZ.LJLLL;
            if (surveyViewModel3 != null && (hashSet2 = surveyViewModel3.LJLJJI) != null && ORZ.LJLJJI(surveySecondQuestion3, hashSet2)) {
                this.LIZ.getSurveySecondOtherInput().setVisibility(0);
            } else {
                this.LIZ.getSurveySecondOtherInput().setVisibility(8);
            }
        }
        SurveyViewModel surveyViewModel4 = this.LIZ.LJLLL;
        if (surveyViewModel4 != null && (hashSet = surveyViewModel4.LJLJJI) != null) {
            i = hashSet.size();
        } else {
            i = -1;
        }
        if (i > 0) {
            this.LIZ.getSubmitBtn().setEnabled(true);
            C2A7 submitBtn = this.LIZ.getSubmitBtn();
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "context");
            submitBtn.setBackgroundColor(C78137UlZ.LIZIZ(R.attr.eb, context));
            return;
        }
        this.LIZ.getSubmitBtn().setEnabled(false);
        C2A7 submitBtn2 = this.LIZ.getSubmitBtn();
        Context context2 = this.LIZ.getContext();
        o.LJIIIIZZ(context2, "context");
        submitBtn2.setBackgroundColor(C78137UlZ.LIZIZ(R.attr.db, context2));
    }
}

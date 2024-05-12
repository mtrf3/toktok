package X;

import Y.ACListenerS38S0300000_13;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UlY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78136UlY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LinearLayoutCompat linearLayoutCompat, SurveyQuestion surveyQuestion, int i, int i2, float f, InterfaceC88471Ynr onChooseClick) {
        int LIZ2;
        o.LJIIIZ(onChooseClick, "onChooseClick");
        linearLayoutCompat.removeAllViews();
        LayoutInflater LLZIL = C16880lQ.LLZIL(linearLayoutCompat.getContext());
        List<SurveyOption> list = surveyQuestion.optionList;
        o.LJIIIIZZ(list, "question.optionList");
        int i3 = 0;
        for (SurveyOption surveyOption : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                SurveyOption surveyOption2 = surveyOption;
                View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i, null, false);
                o.LJII(LLLLIILL, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveButton");
                C2A7 c2a7 = (C2A7) LLLLIILL;
                if (i2 == 0) {
                    LIZ2 = -2;
                } else {
                    LIZ2 = C15380j0.LIZ(i2);
                }
                C010402i c010402i = new C010402i(-1, LIZ2);
                if (i3 != 0) {
                    ((LinearLayout.LayoutParams) c010402i).topMargin = C15380j0.LIZ(f);
                }
                C16880lQ.LJJIII(c2a7, new ACListenerS38S0300000_13(onChooseClick, surveyQuestion, surveyOption2, 3));
                c2a7.setText(surveyOption2.content);
                linearLayoutCompat.addView(c2a7, c010402i);
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}

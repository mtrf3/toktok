package X;

import android.text.TextUtils;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;

/* renamed from: X.Sr8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73386Sr8 implements InterfaceC73385Sr7 {
    public final /* synthetic */ C78137UlZ LIZ;

    public C73386Sr8(C78137UlZ c78137UlZ) {
        this.LIZ = c78137UlZ;
    }

    @Override // X.InterfaceC73385Sr7
    public final void LIZ(String str) {
        String str2;
        SurveyViewModel surveyViewModel;
        if (!TextUtils.isEmpty(str) && str != null && (surveyViewModel = this.LIZ.LJLLL) != null) {
            surveyViewModel.LJLJJL = str;
        }
        SurveyViewModel surveyViewModel2 = this.LIZ.LJLLL;
        String str3 = null;
        if (surveyViewModel2 != null) {
            str2 = surveyViewModel2.LJLJJL;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            LiveEditText surveySecondOtherInputText = this.LIZ.getSurveySecondOtherInputText();
            SurveyViewModel surveyViewModel3 = this.LIZ.LJLLL;
            if (surveyViewModel3 != null) {
                str3 = surveyViewModel3.LJLJJL;
            }
            surveySecondOtherInputText.setText(str3);
            this.LIZ.getClearInputIcon().setVisibility(0);
        }
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;

/* loaded from: classes11.dex */
public final class OMT extends AbstractC65781Prl implements InterfaceC88472Yns<FeedSurveyConfig, Boolean> {
    public static final OMT LJLIL = new OMT();

    public OMT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FeedSurveyConfig feedSurveyConfig) {
        String str;
        boolean z;
        Integer num;
        boolean z2;
        boolean z3;
        FeedSurvey fixedSurvey;
        FeedSurvey fixedSurvey2;
        FeedSurveyConfig feedSurveyConfig2 = feedSurveyConfig;
        ((ISurveyDebuggerService) OMS.LIZLLL.getValue()).isOpen();
        long currentTimeMillis = System.currentTimeMillis();
        if (feedSurveyConfig2 == null || (fixedSurvey2 = feedSurveyConfig2.getFixedSurvey()) == null || (str = fixedSurvey2.getSurveyKey()) == null) {
            str = "";
        }
        boolean z4 = false;
        if (OMS.LIZ(str) > currentTimeMillis) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (feedSurveyConfig2 != null) {
            num = Integer.valueOf(feedSurveyConfig2.getMultiSurveyType());
        } else {
            num = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("short_internal_");
        LIZ.append(num);
        if (OMS.LIZ(X1D.LIZIZ(LIZ)) > currentTimeMillis) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        ONJ onj = OMS.LJ;
        StringBuilder LIZLLL = C00F.LIZLLL("[inFrequencyControl]: ", z3, ", long:", z, ", short:");
        LIZLLL.append(z2);
        onj.LJIIIIZZ(X1D.LIZIZ(LIZLLL));
        if (!z3) {
            if (feedSurveyConfig2 != null && (fixedSurvey = feedSurveyConfig2.getFixedSurvey()) != null) {
                str2 = fixedSurvey.getSurveyKey();
            }
            if (C78685UuP.LJJJZ(str2)) {
                z4 = true;
            }
        }
        return Boolean.valueOf(z4);
    }
}

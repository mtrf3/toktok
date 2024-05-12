package X;

import Y.ALAdapterS6S0100000_8;
import Y.AUListenerS96S0100000_8;
import Y.AgS119S0100000_1;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyApi;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K30 extends Handler {
    public final WeakReference<SurveyViewController> LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K30(SurveyViewController controller) {
        super(C16880lQ.LLJJJJ());
        o.LJIIIZ(controller, "controller");
        this.LIZ = new WeakReference<>(controller);
    }

    public final void LIZ(int i) {
        SearchSurveyConfig searchSurveyConfig;
        SurveyViewController surveyViewController = this.LIZ.get();
        if (surveyViewController != null && (searchSurveyConfig = surveyViewController.LJLLI) != null) {
            long submitResultDelay = searchSurveyConfig.getSubmitResultDelay();
            removeMessages(2);
            removeMessages(3);
            sendMessageDelayed(obtainMessage(3, Integer.valueOf(i)), TimeUnit.SECONDS.toMillis(submitResultDelay));
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        SurveyViewController surveyViewController;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        Integer num = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (surveyViewController = this.LIZ.get()) == null) {
                        return;
                    }
                    Object obj = msg.obj;
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj).intValue();
                    ActivityC45651qj activityC45651qj = surveyViewController.LJLILLLLZI;
                    if (activityC45651qj != null) {
                        if (C50656JuO.LIZ(activityC45651qj, null, "survey", null, true)) {
                            return;
                        }
                        surveyViewController.LIZ().LIZ(intValue);
                        return;
                    }
                    o.LJIJI("activity");
                    throw null;
                }
                Object obj2 = msg.obj;
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                SurveyViewController surveyViewController2 = this.LIZ.get();
                if (surveyViewController2 == null) {
                    return;
                }
                surveyViewController2.LJ(num);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(C18950ol.LIZIZ(0.25f, 1.0f, 0.25f, 1.0f));
                ofFloat.addUpdateListener(new AUListenerS96S0100000_8(surveyViewController2, 16));
                ofFloat.addListener(new ALAdapterS6S0100000_8(surveyViewController2, 14));
                ofFloat.start();
                return;
            }
            SurveyViewController surveyViewController3 = this.LIZ.get();
            if (surveyViewController3 == null) {
                return;
            }
            surveyViewController3.LIZJ(0L);
            return;
        }
        SurveyViewController surveyViewController4 = this.LIZ.get();
        if (surveyViewController4 == null) {
            return;
        }
        String surveyId = surveyViewController4.LJLLI.getSurveyId();
        if (surveyId == null) {
            surveyId = "";
        }
        ((SurveyApi.Api) SurveyApi.LIZ.getValue()).fetch(surveyId).LJ(new AgS119S0100000_1(surveyViewController4, 2), C10K.LJIIIIZZ, null);
    }
}

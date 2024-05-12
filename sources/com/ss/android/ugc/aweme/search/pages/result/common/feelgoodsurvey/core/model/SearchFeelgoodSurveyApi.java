package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C10K;
import X.C40084FoG;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC65002PfC;
import com.google.gson.m;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes9.dex */
public final class SearchFeelgoodSurveyApi {
    public static final RealApi LIZ = (RealApi) C40084FoG.LIZIZ("https://www.tiktok.com").LIZ.LIZ(RealApi.class);

    /* loaded from: classes9.dex */
    public interface RealApi {
        @E4T("/survey/api/feelgood/open/v1/answer/")
        C10K<m> submitSurveyAnswers(@InterfaceC65002PfC("Content-Type") String str, @InterfaceC65002PfC("Authorization") String str2, @InterfaceC27211Am7 FeelgoodSurveySubmitRequestBody feelgoodSurveySubmitRequestBody);

        @E4T("/survey/api/feelgood/open/v1/event/")
        C10K<m> triggerSurveyEvent(@InterfaceC65002PfC("Content-Type") String str, @InterfaceC65002PfC("Authorization") String str2, @InterfaceC27211Am7 FeelgoodSurveyRequestBody feelgoodSurveyRequestBody);
    }

    public static C10K LIZ(String authorization, FeelgoodSurveyRequestBody feelgoodSurveyRequestBody) {
        o.LJIIIZ(authorization, "authorization");
        try {
            return LIZ.triggerSurveyEvent("application/json", authorization, feelgoodSurveyRequestBody);
        } catch (ExecutionException e) {
            n nVar = new n();
            nVar.LIZIZ(e);
            C10K<TResult> c10k = nVar.LIZ;
            o.LJIIIIZZ(c10k, "{\n            TaskComple…         }.task\n        }");
            return c10k;
        }
    }
}

package com.ss.android.ugc.aweme.question.impl;

import X.C10K;
import X.C16880lQ;
import X.C58096Mr6;
import android.app.Activity;
import com.ss.android.ugc.aweme.question.QuestionDetailActivity;
import com.ss.android.ugc.aweme.question.api.QuestionApi;
import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import com.ss.android.ugc.aweme.question.service.IQuestionDetailService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class QuestionDetailServiceImpl implements IQuestionDetailService {
    @Override // com.ss.android.ugc.aweme.question.service.IQuestionDetailService
    public final Class<? extends Activity> LIZ() {
        return QuestionDetailActivity.class;
    }

    public static IQuestionDetailService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IQuestionDetailService.class, false);
        if (LIZ != null) {
            return (IQuestionDetailService) LIZ;
        }
        if (C58096Mr6.o4 == null) {
            synchronized (IQuestionDetailService.class) {
                if (C58096Mr6.o4 == null) {
                    C58096Mr6.o4 = new QuestionDetailServiceImpl();
                }
            }
        }
        return C58096Mr6.o4;
    }

    @Override // com.ss.android.ugc.aweme.question.service.IQuestionDetailService
    public final QuestionDetailResponse LIZIZ(long j) {
        C10K<QuestionDetailResponse> queryQuestionValidation = QuestionApi.LIZ.queryQuestionValidation(j);
        try {
            queryQuestionValidation.LJIJI();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (queryQuestionValidation.LJIILJJIL()) {
            try {
                Exception LJIIJ = queryQuestionValidation.LJIIJ();
                o.LJIIIIZZ(LJIIJ, "task.error");
                throw LJIIJ;
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        QuestionDetailResponse LJIIJJI = queryQuestionValidation.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        return LJIIJJI;
    }
}

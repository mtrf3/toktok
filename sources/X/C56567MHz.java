package X;

import com.ss.android.ugc.aweme.question.api.QuestionApi;
import com.ss.android.ugc.aweme.question.model.QuestionDetailResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.MHz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56567MHz<T> implements InterfaceC66992k3 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C56567MHz(boolean z, long j) {
        this.LJLIL = z;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<QuestionDetailResponse> interfaceC65052gv) {
        QuestionDetailResponse questionDetailResponse;
        try {
            if (!this.LJLIL) {
                MI0 LIZIZ = C56564MHw.LIZ.LIZIZ(String.valueOf(this.LJLILLLLZI));
                if (LIZIZ != null && System.currentTimeMillis() - LIZIZ.LIZIZ < 15000 && (questionDetailResponse = LIZIZ.LIZ) != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(questionDetailResponse);
                    return;
                }
            }
            C10K<QuestionDetailResponse> queryQuestionDetail = QuestionApi.LIZ.queryQuestionDetail(this.LJLILLLLZI);
            try {
                queryQuestionDetail.LJIJI();
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (queryQuestionDetail.LJIILJJIL()) {
                try {
                    Exception LJIIJ = queryQuestionDetail.LJIIJ();
                    o.LJIIIIZZ(LJIIJ, "task.error");
                    throw LJIIJ;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            QuestionDetailResponse LJIIJJI = queryQuestionDetail.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            QuestionDetailResponse questionDetailResponse2 = LJIIJJI;
            ((C73578SuE) interfaceC65052gv).onSuccess(questionDetailResponse2);
            C56564MHw.LIZ.LIZJ(String.valueOf(this.LJLILLLLZI), new MI0(System.currentTimeMillis(), questionDetailResponse2));
        } catch (Throwable th) {
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            if (!c73578SuE.isDisposed()) {
                c73578SuE.onError(th);
            }
        }
    }
}

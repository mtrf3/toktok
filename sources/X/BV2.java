package X;

import com.bytedance.android.livesdk.qa.CurrentQuestionResponse;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionList;
import com.bytedance.android.livesdk.qa.QuestionListResponse;
import com.bytedance.android.livesdk.qa.QuestionResponse;
import com.bytedance.android.livesdk.qa.StartAnswerResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BV2 implements QAApi {
    public final DataChannel LIZ;

    public BV2(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<Object>> deleteQuestion(long j) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = "";
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.livesdk.qa.CurrentQuestionResponse, T] */
    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<CurrentQuestionResponse>> queryCurrentQuestion(long j) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new CurrentQuestionResponse(null, 1, null);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<Object>> switchOn(long j) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = "";
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<Object>> endAnswer(long j, long j2) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = "";
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<QuestionList>> getRecommendQuestion(long j, int i, int i2) {
        if (C29306Beo.LJJII(this.LIZ)) {
            return getTryModeRecommendQuestion(C29306Beo.LJJIJ(this.LIZ), j, i, i2);
        }
        AbstractC73672Svk<C28467BFf<QuestionList>> recommendQuestion = ((QAApi) Q7L.LIZIZ(QAApi.class)).getRecommendQuestion(j, i, i2);
        o.LJIIIIZZ(recommendQuestion, "{\n            LiveClient… recommendFrom)\n        }");
        return recommendQuestion;
    }

    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<Object>> likeQuestion(long j, int i, int i2) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = "";
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.bytedance.android.livesdk.qa.StartAnswerResponse, T] */
    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<StartAnswerResponse>> startAnswer(long j, long j2, int i) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new StartAnswerResponse(0L, 1, null);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<QuestionList>> getTryModeRecommendQuestion(long j, long j2, int i, int i2) {
        AbstractC73672Svk<C28467BFf<QuestionList>> tryModeRecommendQuestion = ((QAApi) Q7L.LIZIZ(QAApi.class)).getTryModeRecommendQuestion(j, j2, i, i2);
        o.LJIIIIZZ(tryModeRecommendQuestion, "get().getService(QAApi::…, pageNum, recommendFrom)");
        return tryModeRecommendQuestion;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdk.qa.QuestionListResponse, T] */
    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<QuestionListResponse>> queryQuestion(long j, long j2, long j3, long j4, int i) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new QuestionListResponse(null, null, null, null, 15, null);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.bytedance.android.livesdk.qa.QuestionResponse] */
    @Override // com.bytedance.android.livesdk.qa.QAApi
    public final AbstractC73672Svk<C28467BFf<QuestionResponse>> submitQuestion(long j, String str, int i, int i2, long j2) {
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = new QuestionResponse(0L, 1, null);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }
}

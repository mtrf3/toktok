package X;

import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJR implements XDR<RecommendSearchWordsResponse> {
    public final /* synthetic */ TJK LIZ;

    public TJR(TJK tjk) {
        this.LIZ = tjk;
    }

    @Override // X.XDR
    public final void onSuccess(RecommendSearchWordsResponse response) {
        o.LJIIIZ(response, "response");
        this.LIZ.LIZIZ.onNext(new TJS(response));
    }

    @Override // X.XDR
    public final void preProcess(RecommendSearchWordsResponse recommendSearchWordsResponse) {
    }

    @Override // X.XDR
    public final void onFail(RecommendSearchWordsResponse recommendSearchWordsResponse, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        C73849Syb<TJU<?>> c73849Syb = this.LIZ.LIZIZ;
        Exception exc = exception.LIZJ;
        if (exc == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("search sticker error ,msg :");
            LIZ.append(exception.LIZIZ);
            exc = new Exception(X1D.LIZIZ(LIZ));
        }
        c73849Syb.onNext(new TJQ(0, exc));
    }
}

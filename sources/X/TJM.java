package X;

import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJM implements ISearchEffectListenerV2 {
    public final /* synthetic */ TJK LIZ;

    public TJM(TJK tjk) {
        this.LIZ = tjk;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2
    public final void onFail(ExceptionResult e) {
        Exception exception;
        o.LJIIIZ(e, "e");
        if (e.getException() != null) {
            exception = e.getException();
        } else {
            exception = new StatusCodeException(e.getErrorCode(), "search stickers failed");
        }
        C73849Syb<TJU<?>> c73849Syb = this.LIZ.LIZ;
        o.LJIIIIZZ(exception, "exception");
        c73849Syb.onNext(new TJQ(0, exception));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(SearchEffectResponseV2 response) {
        o.LJIIIZ(response, "response");
        this.LIZ.LIZ.onNext(new TJS(response));
    }
}

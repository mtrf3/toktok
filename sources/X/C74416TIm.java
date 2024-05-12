package X;

import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TIm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74416TIm<T, R> implements InterfaceC48038ItG<TJU<?>, C74413TIj<RecommendSearchWordsResponse>> {
    public static final C74416TIm LJLIL = new C74416TIm();

    @Override // X.InterfaceC48038ItG
    public final C74413TIj<RecommendSearchWordsResponse> apply(TJU<?> tju) {
        TJU<?> state = tju;
        o.LJIIIZ(state, "state");
        if (state instanceof TJW) {
            return C74413TIj.LIZIZ();
        }
        if (state instanceof TJS) {
            T t = state.LIZ;
            if (t != null) {
                return C74413TIj.LIZJ(t);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse");
        }
        if (state instanceof TJQ) {
            return C74413TIj.LIZ((Throwable) state.LIZ);
        }
        throw new C162476Zf();
    }
}

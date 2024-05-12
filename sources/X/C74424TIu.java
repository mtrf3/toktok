package X;

import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TIu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74424TIu<T, R> implements InterfaceC48038ItG<TJU<?>, C74413TIj<FetchHotEffectResponse>> {
    public static final C74424TIu LJLIL = new C74424TIu();

    @Override // X.InterfaceC48038ItG
    public final C74413TIj<FetchHotEffectResponse> apply(TJU<?> tju) {
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
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse");
        }
        if (state instanceof TJQ) {
            return C74413TIj.LIZ((Throwable) state.LIZ);
        }
        throw new C162476Zf();
    }
}

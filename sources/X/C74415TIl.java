package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TIl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74415TIl<T, R> implements InterfaceC48038ItG<OSZ<? extends String, ? extends TJU<?>>, OSZ<? extends String, ? extends C74413TIj<CategoryEffectModel>>> {
    public static final C74415TIl LJLIL = new C74415TIl();

    @Override // X.InterfaceC48038ItG
    public final OSZ<? extends String, ? extends C74413TIj<CategoryEffectModel>> apply(OSZ<? extends String, ? extends TJU<?>> osz) {
        OSZ<? extends String, ? extends TJU<?>> pair = osz;
        o.LJIIIZ(pair, "pair");
        TJU<?> second = pair.getSecond();
        if (second instanceof TJW) {
            return new OSZ<>(pair.getFirst(), C74413TIj.LIZIZ());
        }
        if (second instanceof TJS) {
            String first = pair.getFirst();
            T t = pair.getSecond().LIZ;
            if (t != null) {
                return new OSZ<>(first, C74413TIj.LIZJ(t));
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel");
        }
        if (second instanceof TJQ) {
            String first2 = pair.getFirst();
            T t2 = pair.getSecond().LIZ;
            if (t2 != null) {
                return new OSZ<>(first2, C74413TIj.LIZ((Throwable) t2));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
        throw new C162476Zf();
    }
}

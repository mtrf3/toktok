package X;

import X.MBD;
import kotlin.jvm.internal.o;

/* renamed from: X.XKw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84670XKw<B extends MBD, E extends B> implements InterfaceC48698J9i<E> {
    public final InterfaceC88472Yns<MBD, E> LJLIL;
    public final InterfaceC48698J9i<?> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.J9i<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Yns<? super X.MBD, ? extends E extends B>, X.Yns<X.MBD, E extends B>, java.lang.Object] */
    public AbstractC84670XKw(InterfaceC48698J9i<B> baseKey, InterfaceC88472Yns<? super MBD, ? extends E> safeCast) {
        o.LJIIIZ(baseKey, "baseKey");
        o.LJIIIZ(safeCast, "safeCast");
        this.LJLIL = safeCast;
        this.LJLILLLLZI = baseKey instanceof AbstractC84670XKw ? (InterfaceC48698J9i<B>) ((AbstractC84670XKw) baseKey).LJLILLLLZI : baseKey;
    }
}

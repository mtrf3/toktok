package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Szk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73920Szk<K, V, K1, V1> extends AbstractC73922Szm<K, V, K1, V1> {
    public InterfaceC88472Yns<? super V, ? extends List<? extends OSZ<? extends K1, ? extends V1>>> LIZIZ;
    public final InterfaceC88471Ynr<? super V1, ? super V1, ? extends V1> LIZJ;

    public C73920Szk() {
        this(null);
    }

    public C73920Szk(Object obj) {
        C58912Sx batch = C58912Sx.LJLIL;
        IHL merge = IHL.LJLIL;
        o.LJIIJ(batch, "batch");
        o.LJIIJ(merge, "merge");
        this.LIZIZ = batch;
        this.LIZJ = merge;
    }
}

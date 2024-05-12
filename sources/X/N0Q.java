package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0Q extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N0Q LJLIL = new N0Q();

    public N0Q() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 m952 = m95;
        o.LJIIIZ(m952, "$this$int");
        Object LIZ = m952.LIZ(N0R.class);
        if (LIZ != null) {
            return Integer.valueOf(((N0R) LIZ).LIZIZ());
        }
        throw new C58623Mzb(N0R.class);
    }
}

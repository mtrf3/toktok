package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0M extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N0M LJLIL = new N0M();

    public N0M() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 m952 = m95;
        o.LJIIIZ(m952, "$this$int");
        Object LIZ = m952.LIZ(ETC.class);
        if (LIZ != null) {
            return Integer.valueOf(((ETC) LIZ).LIZ);
        }
        throw new C58623Mzb(ETC.class);
    }
}

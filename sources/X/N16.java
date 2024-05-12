package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N16 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N16 LJLIL = new N16();

    public N16() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(C59222NMc.class);
        if (LIZ != null) {
            return Integer.valueOf(((C59222NMc) LIZ).LJIILLIIL);
        }
        throw new C58623Mzb(C59222NMc.class);
    }
}

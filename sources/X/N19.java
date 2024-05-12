package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N19 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N19 LJLIL = new N19();

    public N19() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(NOV.class);
        if (LIZ != null) {
            return ((NOV) LIZ).LJLJL.getValue();
        }
        throw new C58623Mzb(NOV.class);
    }
}

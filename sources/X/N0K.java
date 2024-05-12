package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0K extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Boolean> {
    public static final N0K LJLIL = new N0K();

    public N0K() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(M95 m95) {
        M95 m952 = m95;
        o.LJIIIZ(m952, "$this$boolean");
        Object LIZ = m952.LIZ(ETC.class);
        if (LIZ != null) {
            return Boolean.valueOf(((ETC) LIZ).LJ);
        }
        throw new C58623Mzb(ETC.class);
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0I extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N0I LJLIL = new N0I();

    public N0I() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 intOptional = m95;
        o.LJIIIZ(intOptional, "$this$intOptional");
        Object LIZ = intOptional.LIZ(ETC.class);
        if (LIZ != null) {
            return ((ETC) LIZ).LIZJ;
        }
        throw new C58623Mzb(ETC.class);
    }
}

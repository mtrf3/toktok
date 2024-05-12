package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0F extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N0F LJLIL = new N0F();

    public N0F() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 intOptional = m95;
        o.LJIIIZ(intOptional, "$this$intOptional");
        Object LIZ = intOptional.LIZ(InterfaceC58799N5v.class);
        if (LIZ != null) {
            return Integer.valueOf(((InterfaceC58799N5v) LIZ).d0());
        }
        throw new C58623Mzb(InterfaceC58799N5v.class);
    }
}

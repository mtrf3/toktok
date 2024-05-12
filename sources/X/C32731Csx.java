package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Csx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32731Csx extends AbstractC65781Prl implements InterfaceC88472Yns<ZCF, C76800UCe> {
    public C32731Csx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ZCF zcf) {
        ZCF result = zcf;
        o.LJIIIZ(result, "result");
        if (result instanceof C32744CtA) {
            C32744CtA c32744CtA = (C32744CtA) result;
            C32783Ctn.LIZ.LJ.put(c32744CtA.LIZIZ, Integer.valueOf(c32744CtA.LIZ ? 1 : 0));
            if (C88137YiT.LIZ.LIZ && c32744CtA.LIZ) {
                C32694CsM.LJJII++;
            }
        }
        return C76800UCe.LIZ;
    }
}

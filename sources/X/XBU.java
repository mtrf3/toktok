package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBU implements InterfaceC84427XBn {
    public final XCG LIZ;

    public XBU(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LIZ = effectConfig;
    }

    @Override // X.InterfaceC84427XBn
    public final XBW<C84430XBq> LIZ(C84415XBb c84415XBb) {
        XB0 xb0 = new XB0();
        Object obj = this.LIZ.LJIJI.LIZ;
        if (obj != null) {
            xb0.LIZIZ = (X62) obj;
            xb0.LIZLLL = new XBN(c84415XBb, this.LIZ);
            xb0.LIZ = new XBP(c84415XBb.LJLIL);
            xb0.LIZJ = EnumC124214u9.EFFECT;
            return new XBG(c84415XBb, xb0.LIZ(), this.LIZ);
        }
        o.LJIIZILJ();
        throw null;
    }
}

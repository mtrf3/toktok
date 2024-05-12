package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NG6 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, NG5> {
    public static final NG6 LJLIL = new NG6();

    public NG6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final NG5 invoke(M95 m95) {
        M95 stringEnum = m95;
        o.LJIIIZ(stringEnum, "$this$stringEnum");
        Object LIZ = stringEnum.LIZ(NGR.class);
        if (LIZ != null) {
            NGR ngr = (NGR) LIZ;
            if (ngr.LJ) {
                if (ngr.LJFF) {
                    return NG5.DESCRIPTIVE_CARD;
                }
                return NG5.TOP_CARD;
            }
            if (ngr.LJFF) {
                return NG5.BOTTOM_CARD;
            }
            return NG5.EMPTY;
        }
        throw new C58623Mzb(NGR.class);
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGE extends AbstractC65781Prl implements InterfaceC88472Yns<M95, NGH> {
    public static final NGE LJLIL = new NGE();

    public NGE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final NGH invoke(M95 m95) {
        M95 stringEnum = m95;
        o.LJIIIZ(stringEnum, "$this$stringEnum");
        Object LIZ = stringEnum.LIZ(NGR.class);
        if (LIZ != null) {
            if (((NGR) LIZ).LIZJ) {
                return NGH.MANUAL;
            }
            return NGH.AUTO;
        }
        throw new C58623Mzb(NGR.class);
    }
}

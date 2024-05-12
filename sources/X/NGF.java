package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGF extends AbstractC65781Prl implements InterfaceC88472Yns<M95, NGG> {
    public static final NGF LJLIL = new NGF();

    public NGF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final NGG invoke(M95 m95) {
        M95 stringEnum = m95;
        o.LJIIIZ(stringEnum, "$this$stringEnum");
        Object LIZ = stringEnum.LIZ(NGR.class);
        if (LIZ != null) {
            NGR ngr = (NGR) LIZ;
            int i = NGN.LIZ[ngr.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return NGG.DATA_LOAD_FAIL;
                    }
                    throw new C162476Zf();
                }
                return NGG.LOAD_TIME_OUT;
            }
            if (ngr.LJI) {
                return NGG.COMMENT_BLOCK;
            }
            return NGG.SHARE_BLOCK;
        }
        throw new C58623Mzb(NGR.class);
    }
}

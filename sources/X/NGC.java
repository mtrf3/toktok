package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGC extends AbstractC65781Prl implements InterfaceC88472Yns<M95, NGB> {
    public static final NGC LJLIL = new NGC();

    public NGC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final NGB invoke(M95 m95) {
        M95 stringEnumOptional = m95;
        o.LJIIIZ(stringEnumOptional, "$this$stringEnumOptional");
        Object LIZ = stringEnumOptional.LIZ(NGR.class);
        if (LIZ != null) {
            if (((NGR) LIZ).LJFF) {
                return NGB.TOP_BOTTOM_CARD;
            }
            return NGB.TOP_CARD;
        }
        throw new C58623Mzb(NGR.class);
    }
}

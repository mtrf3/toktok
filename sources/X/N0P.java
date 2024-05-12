package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0P extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N0P LJLIL = new N0P();

    public N0P() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        String str;
        M95 stringOptional = m95;
        o.LJIIIZ(stringOptional, "$this$stringOptional");
        ETC etc = (ETC) stringOptional.LIZ(ETC.class);
        if (etc == null || (str = etc.LIZLLL) == null) {
            Object LIZ = stringOptional.LIZ(N0R.class);
            if (LIZ != null) {
                return ((N0R) LIZ).getEventType();
            }
            throw new C58623Mzb(N0R.class);
        }
        return str;
    }
}

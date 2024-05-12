package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EfM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36984EfM extends AbstractC36770Ebu<C36985EfN> {
    @Override // X.AbstractC36770Ebu
    public final AbstractC36987EfP LIZIZ(String business, C36769Ebt c36769Ebt, C36735EbL c36735EbL) {
        o.LJIIJ(business, "business");
        C36985EfN c36985EfN = new C36985EfN(business, c36769Ebt, c36735EbL);
        if (o.LJ(c36985EfN.LIZIZ, "default_business")) {
            C36985EfN.LIZLLL = c36985EfN;
        }
        return c36985EfN;
    }
}

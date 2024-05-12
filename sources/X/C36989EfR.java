package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EfR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36989EfR extends AbstractC36770Ebu<C36991EfT> {
    public final String LJIIJJI = "__prefetch";

    @Override // X.AbstractC36770Ebu
    public final AbstractC36987EfP LIZIZ(String business, C36769Ebt c36769Ebt, C36735EbL c36735EbL) {
        o.LJIIJ(business, "business");
        C36991EfT c36991EfT = new C36991EfT(business, c36769Ebt, c36735EbL, this.LJIIJJI);
        if (o.LJ(c36991EfT.LIZIZ, "default_business")) {
            C36991EfT.LJ = c36991EfT;
        }
        return c36991EfT;
    }
}

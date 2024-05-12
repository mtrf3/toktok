package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hvc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45636Hvc implements GHB {
    public final /* synthetic */ C45628HvU LJLIL;

    @Override // X.GHB
    public final boolean onBackPressed() {
        C45628HvU c45628HvU = this.LJLIL;
        C45635Hvb c45635Hvb = c45628HvU.LJLJJLL;
        if (c45635Hvb != null) {
            C45644Hvk c45644Hvk = c45628HvU.LJLJJL;
            if (c45644Hvk != null) {
                InterfaceC45640Hvg LJJIIJ = c45635Hvb.LJJIIJ(c45644Hvk.getCurrentItem());
                if (LJJIIJ != null) {
                    LJJIIJ.LJIIJ();
                    return true;
                }
                return true;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPagerAdapter");
        throw null;
    }

    public C45636Hvc(C45628HvU c45628HvU) {
        this.LJLIL = c45628HvU;
    }
}

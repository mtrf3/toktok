package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jgp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49815Jgp extends C49917JiT<C49824Jgy> implements KGV {
    @Override // X.KGV
    public final /* bridge */ /* synthetic */ AbstractC51036K1g LIZLLL() {
        return (AbstractC51036K1g) this.LJLIL;
    }

    @Override // X.KGV
    public final boolean LJIILLIIL() {
        T t = this.LJLIL;
        if (t != 0 && ((AbstractC51036K1g) t).isHasMore()) {
            return true;
        }
        return false;
    }

    public C49815Jgp() {
        LJJ(new C49824Jgy());
    }

    @Override // X.C49917JiT, X.KGV
    public final void LJIJ(String str) {
        T t = this.LJLIL;
        if (t != 0) {
            AbstractC49793JgT abstractC49793JgT = (AbstractC49793JgT) t;
            abstractC49793JgT.getClass();
            o.LJIIIZ(str, "<set-?>");
            abstractC49793JgT.LJLLILLLL = str;
        }
    }
}

package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CM6 implements InterfaceC30263BuF {
    public final Integer LJLIL;
    public final Integer LJLILLLLZI;
    public final Integer LJLJI;
    public final C30233Btl LJLJJI;

    @Override // X.InterfaceC30263BuF
    public final Integer icon(EnumC30259BuB theme) {
        o.LJIIIZ(theme, "theme");
        return this.LJLJI;
    }

    @Override // X.InterfaceC30263BuF
    public final C30233Btl iconConfig(EnumC30259BuB theme) {
        o.LJIIIZ(theme, "theme");
        return this.LJLJJI;
    }

    @Override // X.InterfaceC30263BuF
    public final Integer text(EnumC30259BuB theme) {
        o.LJIIIZ(theme, "theme");
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC30263BuF
    public final Integer title(EnumC30259BuB theme) {
        o.LJIIIZ(theme, "theme");
        return this.LJLIL;
    }

    public CM6(Integer num, Integer num2, Integer num3, C30233Btl c30233Btl) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
        this.LJLJI = num3;
        this.LJLJJI = c30233Btl;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lkl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55155Lkl extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55155Lkl LJLIL = new C55155Lkl();

    public C55155Lkl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        if (it.LIZ.getAwemeType() == 4004) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lks, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55162Lks extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55162Lks LJLIL = new C55162Lks();

    public C55162Lks() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        if (C54838Lfe.LJJ(it.LIZ) && C54838Lfe.LJIL(it.LIZ, it.LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

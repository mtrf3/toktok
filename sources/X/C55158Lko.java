package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lko, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55158Lko extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55158Lko LJLIL = new C55158Lko();

    public C55158Lko() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        if (it.LIZ.getAwemeType() == 4003) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

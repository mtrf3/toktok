package X;

/* renamed from: X.TjY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75464TjY extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C75464TjY LJLIL = new C75464TjY();

    public C75464TjY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C0NB.LIZIZ("LinkMicStallHelper", "onStallStart");
            if (C75489Tjx.LJFF) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("illegal onStallStart , seiBefore = ");
                LIZ.append(C75489Tjx.LJIIIIZZ);
                C0NB.LIZIZ("LinkMicStallHelper", X1D.LIZIZ(LIZ));
            } else {
                C75489Tjx.LJFF = true;
                C75489Tjx.LIZIZ();
            }
        } else {
            C0NB.LIZIZ("LinkMicStallHelper", "onStallEnd");
            if (C75489Tjx.LIZJ) {
                C75489Tjx.LIZIZ = true;
                C75489Tjx.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}

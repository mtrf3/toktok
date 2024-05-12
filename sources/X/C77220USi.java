package X;

/* renamed from: X.USi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77220USi extends UTI {
    @Override // X.UTD
    public final Object LIZ(C77211URz c77211URz, InterfaceC67352kd<? super C77216USe> interfaceC67352kd) {
        C77216USe c77216USe;
        boolean isLogin = HG3.LJIILL().isLogin();
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        boolean LJ = c77266UUc.LJIIJ().LJ();
        boolean LIZIZ = c77266UUc.LJIIJ().LIZIZ();
        boolean z = true;
        if (c77211URz.LJLIL.LIZLLL.LIZIZ) {
            if (!isLogin || (LJ && LIZIZ)) {
                z = false;
            }
            c77216USe = new C77216USe(new C77217USf(LJ, LIZIZ, z), UQ0.CHECK);
        } else {
            if (!isLogin || !LIZIZ) {
                z = false;
            }
            c77216USe = new C77216USe(new C77217USf(LJ, LIZIZ, z), UQ0.CHECK);
        }
        return c77216USe;
    }
}

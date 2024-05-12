package X;

/* renamed from: X.USh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77219USh extends UTI {
    @Override // X.UTD
    public final Object LIZ(C77211URz c77211URz, InterfaceC67352kd<? super C77216USe> interfaceC67352kd) {
        C77216USe c77216USe;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        C77136UPc c77136UPc = C77136UPc.LIZ;
        boolean isUidContactPermisioned = ((RBY) HG3.LJIILL()).isUidContactPermisioned();
        boolean LIZIZ = c77136UPc.LIZIZ();
        boolean LIZJ = C77266UUc.LIZIZ.LJIILLIIL().LIZJ();
        boolean z = false;
        if (c77211URz.LJLIL.LIZLLL.LIZIZ) {
            if (isLogin && ((!isUidContactPermisioned || !LIZIZ) && LIZJ)) {
                z = true;
            }
            c77216USe = new C77216USe(new C77217USf(isUidContactPermisioned, LIZIZ, z), UQ0.CHECK);
        } else {
            if (isLogin && LIZIZ) {
                z = true;
            }
            c77216USe = new C77216USe(new C77217USf(isUidContactPermisioned, LIZIZ, z), UQ0.CHECK);
        }
        return c77216USe;
    }
}

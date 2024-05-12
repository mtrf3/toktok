package X;

import android.os.Bundle;

/* renamed from: X.USg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77218USg extends UTI {
    @Override // X.UTD
    public final Object LIZ(C77211URz c77211URz, InterfaceC67352kd<? super C77216USe> interfaceC67352kd) {
        boolean z;
        C77216USe c77216USe;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        boolean LJ = c77266UUc.LJIILLIIL().LJ();
        boolean LIZIZ = c77266UUc.LJIILLIIL().LIZIZ();
        Bundle bundle = c77211URz.LJLIL.LJFF;
        boolean z2 = false;
        if (bundle != null) {
            z = bundle.getBoolean("is_manual");
        } else {
            z = false;
        }
        if (c77211URz.LJLIL.LIZLLL.LIZIZ) {
            if (isLogin && (!LJ || !LIZIZ)) {
                z2 = true;
            }
            c77216USe = new C77216USe(new C77217USf(LJ, LIZIZ, z2), UQ0.CHECK);
        } else {
            if (isLogin && (LIZIZ || (L10.LIZ() && !z && C77136UPc.LIZ.LIZIZ()))) {
                z2 = true;
            }
            c77216USe = new C77216USe(new C77217USf(LJ, LIZIZ, z2), UQ0.CHECK);
        }
        return c77216USe;
    }
}

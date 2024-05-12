package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UU0 implements InterfaceC64672gJ<C77216USe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ UUC LJLILLLLZI;

    public UU0(boolean z, UUC uuc) {
        this.LJLIL = z;
        this.LJLILLLLZI = uuc;
    }

    @Override // X.InterfaceC64672gJ
    public final Object emit(C77216USe c77216USe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C77216USe c77216USe2 = c77216USe;
        if (UU7.LIZ[c77216USe2.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe2.LJLIL.LJLJI) {
                this.LJLILLLLZI.LJIILJJIL().gv0(new C77259UTv(null, "facebook", this.LJLIL, 1));
                if (this.LJLIL) {
                    C77266UUc.LIZIZ.LIZLLL().LIZ(2);
                } else {
                    C77266UUc.LIZIZ.LIZLLL().LIZJ(2, System.currentTimeMillis());
                }
            } else {
                C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI.LJLJJL);
                c26045AKb.LJIIIIZZ(R.string.g5r);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }
}

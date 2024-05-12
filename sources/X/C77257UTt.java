package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.UTt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77257UTt implements InterfaceC64672gJ<C77216USe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ UUD LJLILLLLZI;

    public C77257UTt(boolean z, UUD uud) {
        this.LJLIL = z;
        this.LJLILLLLZI = uud;
    }

    @Override // X.InterfaceC64672gJ
    public final Object emit(C77216USe c77216USe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C77216USe c77216USe2 = c77216USe;
        if (C77256UTs.LIZ[c77216USe2.LJLILLLLZI.ordinal()] == 1) {
            if (c77216USe2.LJLIL.LJLJI) {
                this.LJLILLLLZI.LJIILL().gv0(new C77259UTv(null, "contact", this.LJLIL, 1));
                if (this.LJLIL) {
                    C77266UUc.LIZIZ.LIZLLL().LIZ(1);
                } else {
                    C77266UUc.LIZIZ.LIZLLL().LIZJ(1, System.currentTimeMillis());
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

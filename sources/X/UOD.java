package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0200000_13;

/* loaded from: classes14.dex */
public final class UOD extends AbstractC792639e {
    public final C47121t6 LJ;
    public final C135365Sy LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;

    @Override // X.AbstractC792639e
    public final void LIZ() {
        KL2.LJIILLIIL(4, this.LJ);
        KL2.LJIILLIIL(0, this.LJFF);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public UOD(C47121t6 c47121t6, C2A4 c2a4, C135365Sy c135365Sy, AqS160S0200000_13 aqS160S0200000_13) {
        this.LJ = c47121t6;
        this.LJFF = c135365Sy;
        this.LJI = aqS160S0200000_13;
        this.LIZJ = 5000L;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.mf7));
        }
        KL2.LJIILLIIL(4, c135365Sy);
        KL2.LJIILLIIL(0, c47121t6);
        if (c2a4 != null) {
            if (c2a4.LJFF()) {
                c2a4.LJ();
            }
            KL2.LJIILLIIL(4, c2a4);
        }
    }
}

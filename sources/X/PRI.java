package X;

import Y.AObjectS22S0001000_6;
import Y.AObjectS23S0000000_6;

/* loaded from: classes12.dex */
public final class PRI extends C1CZ {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ AbstractC55114Lk6 LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ PRD LJLJJL;

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            if (i != 1) {
                if (this.LJLIL.invoke().booleanValue()) {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                        return;
                    }
                    return;
                }
                this.LJLJI.LJII(this);
                return;
            }
            if (this.LJLIL.invoke().booleanValue()) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJJI;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
            } else {
                this.LJLJI.LJII(this);
            }
            IOH.LIZIZ(this.LJLJJL.LIZ);
            return;
        }
        if (this.LJLIL.invoke().booleanValue()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLILLLLZI;
            if (interfaceC65784Pro3 != null) {
                interfaceC65784Pro3.invoke();
            }
        } else {
            this.LJLJI.LJII(this);
        }
        IOH.LIZ();
    }

    public PRI(AObjectS22S0001000_6 aObjectS22S0001000_6, AObjectS22S0001000_6 aObjectS22S0001000_62, C80796VnM c80796VnM, AObjectS23S0000000_6 aObjectS23S0000000_6, PRD prd) {
        this.LJLIL = aObjectS22S0001000_6;
        this.LJLILLLLZI = aObjectS22S0001000_62;
        this.LJLJI = c80796VnM;
        this.LJLJJI = aObjectS23S0000000_6;
        this.LJLJJL = prd;
    }
}

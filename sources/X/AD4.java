package X;

import kotlin.jvm.internal.AqS135S0200000_4;

/* loaded from: classes5.dex */
public final class AD4 extends AG6<AD3> implements InterfaceC25852ACq {
    public final AD3 LJLJJI;

    @Override // X.AG6
    public final AD3 LJIIIIZZ() {
        AD3 ad3 = this.LJLJJI;
        if (ad3 != null) {
            return ad3;
        }
        throw new RuntimeException("pls pass labelItem or extends the LabelUnit");
    }

    public AD4(AD3 ad3) {
        this.LJLJJI = ad3;
    }

    @Override // X.InterfaceC25852ACq
    public final void LIZJ(Boolean bool, Boolean bool2) {
        LJIIJ(new AqS135S0200000_4(bool, bool2, 165));
    }
}

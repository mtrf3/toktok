package X;

import android.os.Bundle;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes13.dex */
public final class TE8 extends F9E {
    public final Object LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final Bundle LJLJL;
    public final InterfaceC43949HMr LJLJLJ;
    public final InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final InterfaceC65784Pro<C76800UCe> LJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL};
    }

    public TE8(Object obj, int i, int i2, boolean z, boolean z2, Bundle bundle, InterfaceC43949HMr interfaceC43949HMr, AqS162S0100000_12 aqS162S0100000_12, AqS162S0100000_12 aqS162S0100000_122, int i3) {
        boolean z3;
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z = (i3 & 16) != 0 ? false : z;
        z2 = (i3 & 32) != 0 ? false : z2;
        bundle = (i3 & 64) != 0 ? null : bundle;
        interfaceC43949HMr = (i3 & 128) != 0 ? null : interfaceC43949HMr;
        aqS162S0100000_12 = (i3 & 256) != 0 ? null : aqS162S0100000_12;
        aqS162S0100000_122 = (i3 & 512) != 0 ? null : aqS162S0100000_122;
        this.LJLIL = obj;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z3;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = bundle;
        this.LJLJLJ = interfaceC43949HMr;
        this.LJLJLLL = aqS162S0100000_12;
        this.LJLL = aqS162S0100000_122;
    }
}

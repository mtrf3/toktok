package X;

import kotlin.jvm.internal.IDqS430S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.UEg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76854UEg extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final int LJLJJL;
    public final InterfaceC88473Ynt<String, Long, Boolean, String> LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public C76854UEg(String rechargeType, int i, long j, long j2, int i2, IDqS430S0100000_5 iDqS430S0100000_5) {
        o.LJIIIZ(rechargeType, "rechargeType");
        this.LJLIL = rechargeType;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = i2;
        this.LJLJJLL = iDqS430S0100000_5;
    }
}

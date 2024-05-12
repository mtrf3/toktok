package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SgE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72710SgE extends F9E {
    public final int LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C72710SgE(int i, long j, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = 0L;
        this.LJLJJI = arg3;
    }
}

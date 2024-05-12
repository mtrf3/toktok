package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2A extends F9E {
    public TBB LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;
    public Long LJLJJI;

    public Y2A() {
        this(null, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public Y2A(String enterFrom, int i) {
        TBB status;
        long j;
        if ((i & 1) != 0) {
            status = TBB.CLA_REALTIME_STATUS_REQUESTED;
        } else {
            status = null;
        }
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        enterFrom = (i & 4) != 0 ? "" : enterFrom;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = status;
        this.LJLILLLLZI = j;
        this.LJLJI = enterFrom;
    }
}

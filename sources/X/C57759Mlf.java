package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mlf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57759Mlf extends F9E {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final AbstractC72932td<?> LJLJJI;
    public final boolean LJLJJL;

    public C57759Mlf() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), this.LJLJJI};
    }

    public /* synthetic */ C57759Mlf(int i) {
        this(false, 0, -1L, C33X.LIZ);
    }

    public C57759Mlf(boolean z, int i, long j, AbstractC72932td<?> lastRefreshState) {
        boolean z2;
        o.LJIIIZ(lastRefreshState, "lastRefreshState");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = lastRefreshState;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJL = z2;
    }

    public static C57759Mlf L(C57759Mlf c57759Mlf, boolean z, int i, long j, AbstractC72932td abstractC72932td, int i2) {
        AbstractC72932td lastRefreshState = abstractC72932td;
        long j2 = j;
        boolean z2 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            z2 = c57759Mlf.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = c57759Mlf.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            j2 = c57759Mlf.LJLJI;
        }
        if ((i2 & 8) != 0) {
            lastRefreshState = c57759Mlf.LJLJJI;
        }
        c57759Mlf.getClass();
        o.LJIIIZ(lastRefreshState, "lastRefreshState");
        return new C57759Mlf(z2, i3, j2, lastRefreshState);
    }
}

package X;

/* renamed from: X.4sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123004sC extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final int LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    public C123004sC(long j, long j2, long j3, long j4, int i) {
        long j5;
        if ((i & 1) != 0) {
            j5 = -1;
        } else {
            j5 = 0;
        }
        j = (i & 2) != 0 ? -1L : j;
        j2 = (i & 4) != 0 ? -1L : j2;
        j3 = (i & 8) != 0 ? -1L : j3;
        j4 = (i & 16) != 0 ? -1L : j4;
        this.LJLIL = j5;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = j4;
        this.LJLJJLL = 0;
    }
}

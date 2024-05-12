package X;

/* renamed from: X.1Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35201Zs extends F9E {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public int LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL)};
    }

    public C35201Zs(int i, boolean z, int i2, long j, long j2, long j3, int i3) {
        i = (i3 & 1) != 0 ? 1 : i;
        z = (i3 & 2) != 0 ? false : z;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        j = (i3 & 8) != 0 ? 10000L : j;
        j2 = (i3 & 16) != 0 ? 0L : j2;
        j3 = (i3 & 32) != 0 ? 1000L : j3;
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = i2;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLJL = i2;
    }
}

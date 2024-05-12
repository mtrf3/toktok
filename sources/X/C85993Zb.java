package X;

/* renamed from: X.3Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85993Zb extends F9E {
    public final C86033Zf LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public C85993Zb(C86033Zf c86033Zf, boolean z, long j, int i, boolean z2, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        j = (i2 & 4) != 0 ? 0L : j;
        i = (i2 & 8) != 0 ? C3ZE.UNKNOWN.getStatus() : i;
        z2 = (i2 & 16) != 0 ? false : z2;
        this.LJLIL = c86033Zf;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = z2;
    }
}

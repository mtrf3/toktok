package X;

/* loaded from: classes9.dex */
public final class K2M extends F9E implements C33Q {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final long LJLJJI;
    public final boolean LJLJJL;

    public K2M() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public /* synthetic */ K2M(int i) {
        this(0L, 1, -1, -1, false);
    }

    public K2M(long j, int i, int i2, int i3, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = j;
        this.LJLJJL = z;
    }

    public static K2M L(K2M k2m, int i, int i2, int i3, long j, boolean z, int i4) {
        boolean z2 = z;
        long j2 = j;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if ((i4 & 1) != 0) {
            i6 = k2m.LJLIL;
        }
        if ((i4 & 2) != 0) {
            i7 = k2m.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            i5 = k2m.LJLJI;
        }
        if ((i4 & 8) != 0) {
            j2 = k2m.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            z2 = k2m.LJLJJL;
        }
        k2m.getClass();
        return new K2M(j2, i6, i7, i5, z2);
    }
}

package X;

/* renamed from: X.2ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65652ht extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C65652ht() {
        this.LJLIL = 0;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
        this.LJLJJI = 0;
    }

    public C65652ht(long j) {
        this();
        long j2 = 1000;
        long j3 = j / j2;
        if ((j ^ j2) < 0 && j2 * j3 != j) {
            j3--;
        }
        long j4 = 60;
        int i = (int) (j3 % j4);
        this.LJLJJI = i;
        long j5 = j3 - i;
        long j6 = j5 / j4;
        if ((j5 ^ j4) < 0 && j6 * j4 != j5) {
            j6--;
        }
        int i2 = (int) (j6 % j4);
        this.LJLJI = i2;
        long j7 = j6 - i2;
        long j8 = j7 / j4;
        if ((j7 ^ j4) < 0 && j4 * j8 != j7) {
            j8--;
        }
        long j9 = 24;
        int i3 = (int) (j8 % j9);
        this.LJLILLLLZI = i3;
        long j10 = j8 - i3;
        long j11 = j10 / j9;
        if ((j10 ^ j9) < 0 && j9 * j11 != j10) {
            j11--;
        }
        this.LJLIL = (int) j11;
    }
}

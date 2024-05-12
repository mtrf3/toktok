package X;

import java.util.NoSuchElementException;

/* renamed from: X.Ef1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36963Ef1 extends EGU {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;

    @Override // X.EGU
    public final long nextLong() {
        long j = this.LJLJJI;
        if (j == this.LJLILLLLZI) {
            if (this.LJLJI) {
                this.LJLJI = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.LJLJJI = this.LJLIL + j;
        }
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLJI;
    }

    public C36963Ef1(long j, long j2, long j3) {
        this.LJLIL = j3;
        this.LJLILLLLZI = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.LJLJI = z;
        this.LJLJJI = z ? j : j2;
    }
}

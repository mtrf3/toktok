package X;

import java.util.NoSuchElementException;

/* renamed from: X.4kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118234kV extends AbstractC118224kU {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;

    @Override // X.AbstractC118224kU
    public final int nextInt() {
        int i = this.LJLJJI;
        if (i == this.LJLILLLLZI) {
            if (this.LJLJI) {
                this.LJLJI = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.LJLJJI = this.LJLIL + i;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLJI;
    }

    public C118234kV(int i, int i2, int i3) {
        this.LJLIL = i3;
        this.LJLILLLLZI = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.LJLJI = z;
        this.LJLJJI = z ? i : i2;
    }
}

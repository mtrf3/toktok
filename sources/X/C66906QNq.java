package X;

import java.io.Serializable;

/* renamed from: X.QNq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66906QNq extends V0Q implements Serializable {
    public static final long serialVersionUID = 0;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // X.V0Q
    public int nextInt() {
        int i = this.LJLIL;
        int i2 = i ^ (i >>> 2);
        this.LJLIL = this.LJLILLLLZI;
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = this.LJLJJI;
        int i3 = this.LJLJJL;
        this.LJLJJI = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.LJLJJL = i4;
        int i5 = this.LJLJJLL + 362437;
        this.LJLJJLL = i5;
        return i4 + i5;
    }

    @Override // X.V0Q
    public int nextBits(int i) {
        return ((-i) >> 31) & (nextInt() >>> (32 - i));
    }

    public C66906QNq(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }

    public C66906QNq(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = i6;
        int i7 = 0;
        if ((i | i2 | i3 | i4 | i5) == 0) {
            "Initial state must have at least one non-zero element.".toString();
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        do {
            nextInt();
            i7++;
        } while (i7 < 64);
    }
}

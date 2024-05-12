package X;

import java.util.Arrays;

/* renamed from: X.TYt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74839TYt implements Cloneable {
    public long[] LJLIL;
    public long[] LJLILLLLZI;
    public int LJLJI;

    public final String toString() {
        long j;
        int i = this.LJLJI;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.LJLJI; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            long[] jArr = this.LJLIL;
            long j2 = -1;
            if (jArr != null) {
                j = jArr[i2];
            } else {
                j = -1;
            }
            sb.append(j);
            sb.append('=');
            long[] jArr2 = this.LJLILLLLZI;
            if (jArr2 != null) {
                j2 = jArr2[i2];
            }
            sb.append(j2);
        }
        sb.append('}');
        return sb.toString();
    }

    public C74839TYt() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.LJLIL = new long[i4];
        this.LJLILLLLZI = new long[i4];
        this.LJLJI = 0;
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2;
        try {
            C74839TYt c74839TYt = (C74839TYt) super.clone();
            try {
                long[] jArr3 = this.LJLIL;
                if (jArr3 != null) {
                    jArr = (long[]) jArr3.clone();
                } else {
                    jArr = new long[0];
                }
                c74839TYt.LJLIL = jArr;
                long[] jArr4 = this.LJLILLLLZI;
                if (jArr4 != null) {
                    jArr2 = (long[]) jArr4.clone();
                } else {
                    jArr2 = new long[0];
                }
                c74839TYt.LJLILLLLZI = jArr2;
                return c74839TYt;
            } catch (CloneNotSupportedException unused) {
                return c74839TYt;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final void LIZ(int i) {
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            } else {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            }
        }
        int i5 = i2 / 8;
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        long[] jArr3 = this.LJLIL;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.LJLILLLLZI;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.LJLIL = jArr;
        this.LJLILLLLZI = jArr2;
    }

    public final void LIZIZ(long j, long j2) {
        if (this.LJLILLLLZI == null) {
            return;
        }
        int binarySearch = Arrays.binarySearch(this.LJLIL, 0, this.LJLJI, j);
        if (binarySearch >= 0) {
            this.LJLILLLLZI[binarySearch] = j2;
            return;
        }
        int i = ~binarySearch;
        int i2 = this.LJLJI;
        if (i2 >= this.LJLIL.length) {
            LIZ(i2 + 1);
        }
        int i3 = this.LJLJI;
        if (i3 - i != 0) {
            long[] jArr = this.LJLIL;
            int i4 = i + 1;
            System.arraycopy(jArr, i, jArr, i4, i3 - i);
            long[] jArr2 = this.LJLILLLLZI;
            System.arraycopy(jArr2, i, jArr2, i4, this.LJLJI - i);
        }
        this.LJLIL[i] = j;
        this.LJLILLLLZI[i] = j2;
        this.LJLJI++;
    }
}

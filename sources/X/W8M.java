package X;

import android.util.SparseIntArray;

/* loaded from: classes15.dex */
public class W8M extends W8J<byte[]> implements WB4 {
    public final int[] LJLL;

    @Override // X.W8J
    public final int LJIIJ(int i) {
        return i;
    }

    @Override // X.W8J
    public final byte[] LIZIZ(int i) {
        return new byte[i];
    }

    @Override // X.W8J
    public final void LJFF(byte[] bArr) {
        bArr.getClass();
    }

    @Override // X.W8J
    public final int LJIIIIZZ(int i) {
        if (i > 0) {
            for (int i2 : this.LJLL) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new P3U(Integer.valueOf(i));
    }

    @Override // X.W8J
    public final int LJIIIZ(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        return bArr2.length;
    }

    public W8M(WB6 wb6, W9W w9w, C78937UyT c78937UyT) {
        super(wb6, w9w, c78937UyT);
        SparseIntArray sparseIntArray = w9w.LIZJ;
        this.LJLL = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.LJLL[i] = sparseIntArray.keyAt(i);
        }
        this.LJLILLLLZI.LIZ(this);
        this.LJLJLLL.LJFF();
    }
}

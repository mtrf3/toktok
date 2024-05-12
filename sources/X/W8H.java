package X;

import android.util.SparseIntArray;

/* loaded from: classes15.dex */
public abstract class W8H extends W8J<InterfaceC80631Vkh> {
    public final int[] LJLL;

    @Override // X.W8J
    public final int LJIIJ(int i) {
        return i;
    }

    @Override // X.W8J
    public final void LJFF(InterfaceC80631Vkh interfaceC80631Vkh) {
        InterfaceC80631Vkh interfaceC80631Vkh2 = interfaceC80631Vkh;
        interfaceC80631Vkh2.getClass();
        interfaceC80631Vkh2.close();
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
    public final int LJIIIZ(InterfaceC80631Vkh interfaceC80631Vkh) {
        InterfaceC80631Vkh interfaceC80631Vkh2 = interfaceC80631Vkh;
        interfaceC80631Vkh2.getClass();
        return interfaceC80631Vkh2.getSize();
    }

    @Override // X.W8J
    public final boolean LJIILIIL(InterfaceC80631Vkh interfaceC80631Vkh) {
        interfaceC80631Vkh.getClass();
        return !r2.isClosed();
    }

    public W8H(WB6 wb6, W9W w9w, C78937UyT c78937UyT) {
        super(wb6, w9w, c78937UyT);
        SparseIntArray sparseIntArray = w9w.LIZJ;
        this.LJLL = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.LJLL;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.LJLILLLLZI.LIZ(this);
                this.LJLJLLL.LJFF();
                return;
            }
        }
    }
}

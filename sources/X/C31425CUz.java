package X;

import android.util.SparseIntArray;

/* renamed from: X.CUz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31425CUz extends F9E {
    public final SparseIntArray LJLIL;
    public final SparseIntArray LJLILLLLZI;
    public final SparseIntArray LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C31425CUz() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        this.LJLIL = sparseIntArray;
        this.LJLILLLLZI = sparseIntArray2;
        this.LJLJI = sparseIntArray3;
        L(C7MY.LIZIZ(17), C7MY.LIZIZ(1), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), CQW.REPLY_STAYTYPE);
        L(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), C7MY.LIZIZ(3), CQW.PUBLICSCREEN_MESSAGE_TYPE);
        L(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), C7MY.LIZIZ(6), CQW.INPUT_PANNEL);
    }

    public final void L(int i, int i2, int i3, CQW cqw) {
        this.LJLIL.put(cqw.ordinal(), i);
        this.LJLILLLLZI.put(cqw.ordinal(), i2);
        this.LJLJI.put(cqw.ordinal(), i3);
    }
}

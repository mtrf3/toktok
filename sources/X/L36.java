package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L36 extends L39 {
    public final L34 LJIL;
    public final int LJJ;
    public final int LJJI;

    public L36() {
        L34 flashSaleType = L34.V4;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(13));
        o.LJIIIZ(flashSaleType, "flashSaleType");
        this.LJIL = flashSaleType;
        this.LJJ = LJJIIZ;
        this.LJJI = 92;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final L34 LIZLLL() {
        return this.LJIL;
    }

    @Override // X.L3A, X.S2E
    public final int getHeight() {
        return this.LJJ;
    }

    @Override // X.L3A, X.S2E
    public final int getTextFont() {
        return this.LJJI;
    }
}

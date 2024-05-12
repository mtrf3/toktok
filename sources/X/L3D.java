package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L3D extends L3A {
    public final int LJIILL;
    public final int LJIILLIIL;

    public L3D() {
        L33 promotionItemViewStyle = L33.V4;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(13));
        o.LJIIIZ(promotionItemViewStyle, "promotionItemViewStyle");
        this.LJIILL = 91;
        this.LJIILLIIL = LJJIIZ;
    }

    @Override // X.L3A, X.S2E
    public final int getHeight() {
        return this.LJIILLIIL;
    }

    @Override // X.L3A, X.S2E
    public final int getTextFont() {
        return this.LJIILL;
    }
}

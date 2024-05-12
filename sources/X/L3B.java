package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L3B extends L3A {
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;

    public L3B() {
        L33 promotionItemViewStyle = L33.V5;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        o.LJIIIZ(promotionItemViewStyle, "promotionItemViewStyle");
        this.LJIILL = 71;
        this.LJIILLIIL = LJJIIZ;
        this.LJIIZILJ = 0;
    }

    @Override // X.L3A, X.S2E
    public final int LJFF() {
        return this.LJIIZILJ;
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

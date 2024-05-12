package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class L39 extends L3A {
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public L3Y LJIJI;
    public final L34 LJIJJ;
    public final int LJIJJLI;

    public L39() {
        L3Y l3y = L3Y.FlashSaleViewWithCountDown;
        L34 flashSaleType = L34.OLD;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(52));
        o.LJIIIZ(flashSaleType, "flashSaleType");
        this.LJIILL = R.attr.j7;
        this.LJIILLIIL = R.attr.hq;
        this.LJIIZILJ = R.attr.j9;
        this.LJIJ = R.attr.j9;
        this.LJIJI = l3y;
        this.LJIJJ = flashSaleType;
        this.LJIJJLI = LJJIIZ;
    }

    @Override // X.L3A, X.S2E
    public Integer LJIIJ() {
        return Integer.valueOf(this.LJIJJLI);
    }

    @Override // X.L3A, X.S2E
    public int LIZ() {
        return this.LJIIZILJ;
    }

    @Override // X.L3A, X.S2E
    public final int LIZIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.L3A, X.S2E
    public int LIZJ() {
        return this.LJIJ;
    }

    @Override // X.L3A, X.S2E
    public L34 LIZLLL() {
        return this.LJIJJ;
    }

    @Override // X.L3A, X.S2E
    public final L3Y LJIIJJI() {
        return this.LJIJI;
    }

    @Override // X.L3A, X.S2E
    public int getBgColor() {
        return this.LJIILL;
    }

    @Override // X.L3A, X.S2E
    public final void LJIIIZ(L3Y l3y) {
        this.LJIJI = l3y;
    }
}

package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L35 extends L39 {
    public final L34 LJIL;
    public final int LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final int LJJIIJ;
    public final int LJJIIJZLJL;

    public L35() {
        L34 flashSaleType = L34.V5;
        int LIZIZ = C7MY.LIZIZ(18);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(58));
        o.LJIIIZ(flashSaleType, "flashSaleType");
        this.LJIL = flashSaleType;
        this.LJJ = LIZIZ;
        this.LJJI = 71;
        this.LJJIFFI = R.attr.jk;
        this.LJJII = R.attr.go;
        this.LJJIII = R.attr.j9;
        this.LJJIIJ = LJJIIZ;
        this.LJJIIJZLJL = 0;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final Integer LJIIJ() {
        return Integer.valueOf(this.LJJIIJ);
    }

    @Override // X.L39, X.L3A, X.S2E
    public final int LIZ() {
        return this.LJJII;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final int LIZJ() {
        return this.LJJIII;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final L34 LIZLLL() {
        return this.LJIL;
    }

    @Override // X.L3A, X.S2E
    public final int LJFF() {
        return this.LJJIIJZLJL;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final int getBgColor() {
        return this.LJJIFFI;
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

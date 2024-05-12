package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L38 extends L37 {
    public final L34 LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final int LJJIIJ;

    public L38() {
        L34 flashSaleType = L34.V2;
        int LIZIZ = C7MY.LIZIZ(16);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        o.LJIIIZ(flashSaleType, "flashSaleType");
        this.LJJ = flashSaleType;
        this.LJJI = 0;
        this.LJJIFFI = LIZIZ;
        this.LJJII = R.attr.go;
        this.LJJIII = LJJIIZ;
        this.LJJIIJ = R.attr.j6;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final int LIZ() {
        return this.LJJII;
    }

    @Override // X.L37, X.L39, X.L3A, X.S2E
    public final L34 LIZLLL() {
        return this.LJJ;
    }

    @Override // X.L3A, X.S2E
    public final int LJFF() {
        return this.LJJI;
    }

    @Override // X.L3A, X.S2E
    public final int LJII() {
        return this.LJJIII;
    }

    @Override // X.L39, X.L3A, X.S2E
    public final int getBgColor() {
        return this.LJJIIJ;
    }

    @Override // X.L3A, X.S2E
    public final int getHeight() {
        return this.LJJIFFI;
    }
}

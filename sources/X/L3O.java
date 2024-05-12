package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class L3O extends L3R {
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;

    public L3O() {
        L33 promotionItemViewStyle = L33.V1;
        int LIZIZ = C7MY.LIZIZ(16);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        o.LJIIIZ(promotionItemViewStyle, "promotionItemViewStyle");
        this.LJIILL = R.attr.jb;
        this.LJIILLIIL = LIZIZ;
        this.LJIIZILJ = 0;
        this.LJIJ = R.attr.go;
        this.LJIJI = LJJIIZ;
    }

    @Override // X.L3A, X.S2E
    public final int LIZ() {
        return this.LJIJ;
    }

    @Override // X.L3A, X.S2E
    public final int LJFF() {
        return this.LJIIZILJ;
    }

    @Override // X.L3A, X.S2E
    public final int LJII() {
        return this.LJIJI;
    }

    @Override // X.L3A, X.S2E
    public final int getBgColor() {
        return this.LJIILL;
    }

    @Override // X.L3A, X.S2E
    public final int getHeight() {
        return this.LJIILLIIL;
    }
}

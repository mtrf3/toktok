package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.L2z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53629L2z extends L30 {
    public final EnumC53624L2u LJI;
    public final int LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;

    public C53629L2z() {
        EnumC53624L2u discountPriceStyle = EnumC53624L2u.COLOR_BG_WITHOUT_BRACKETS;
        float LJIIZILJ = C32151Nz.LJIIZILJ(6);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        o.LJIIIZ(discountPriceStyle, "discountPriceStyle");
        this.LJI = discountPriceStyle;
        this.LJII = R.attr.d6;
        this.LJIIIIZZ = LJIIZILJ;
        this.LJIIIZ = LJJIIZ;
        this.LJIIJ = R.attr.dj;
        this.LJIIJJI = 92;
    }

    @Override // X.L30, X.InterfaceC54556Lb6
    public final Integer LIZ() {
        return Integer.valueOf(this.LJIIJ);
    }

    @Override // X.L30, X.InterfaceC54556Lb6
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LJII);
    }

    @Override // X.L30, X.InterfaceC54556Lb6
    public final Float LIZJ() {
        return Float.valueOf(this.LJIIIIZZ);
    }

    @Override // X.L30, X.InterfaceC54556Lb6
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LJIIIZ);
    }

    @Override // X.L30, X.InterfaceC54556Lb6
    public final Integer LJFF() {
        return Integer.valueOf(this.LJIIJJI);
    }

    @Override // X.L30, X.InterfaceC54556Lb6
    public final EnumC53624L2u LJ() {
        return this.LJI;
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6J extends AbstractC39455Fe7 {
    public D6J() {
        this.LIZJ.LJIIIIZZ(5.0f, 9.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        p.LJIILL(26.0f);
        p.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        C32856Cuy.LJJIIZI(this.LIZJ);
        C32856Cuy.zm(this.LIZJ);
        C32856Cuy.i9(this.LIZJ);
        C32856Cuy.xm(this.LIZJ);
        C32856Cuy.U6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(0.0f, 2.0f);
        C32856Cuy.LJJIIZI(this.LIZJ);
        C32856Cuy.LJLLJ(this.LIZJ);
        C32856Cuy.LLLLLLLZIL(this.LIZJ);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIILIIL(18.02f, 16.08f);
        C32856Cuy.LLIIIILZ(this.LIZJ);
        this.LIZJ.LJIILIIL(14.18f, 0.0f);
        C32856Cuy.LLIIIILZ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D60 extends AbstractC39455Fe7 {
    public D60() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 10.0f);
        C32856Cuy.Q4(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(28.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        p2.LJI(13.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        p2.LJIJ(10.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.Kn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(6.25f);
        C32856Cuy.LJIL(this.LIZJ);
        C32856Cuy.Uc(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.0f, 18.75f);
        C32856Cuy.LJIL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(12.0f);
        p5.LJIILL(7.5f);
        this.LIZJ.LIZLLL();
        C32856Cuy.J0(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(38.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(22.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-6.25f);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}

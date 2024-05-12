package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33141CzZ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33141CzZ() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 11.5f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 11.5f, 9.0f);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.gg(this.LIZJ);
        this.LIZJ.LJIIL(0.06f, 21.0f);
        C32856Cuy.eg(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(29.2f);
        this.LIZJ.LJIIL(-3.27f, 4.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -3.87f, 0.0f);
        this.LIZJ.LJIIL(-3.28f, -4.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-7.35f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.5f, 2.5f, false, true, -2.5f, -2.5f);
        this.LIZJ.LJIIL(0.06f, -21.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.0f, 0.5f);
        this.LIZJ.LJIIL(-0.06f, 20.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(8.27f);
        this.LIZJ.LJII(24.0f, 36.63f);
        this.LIZJ.LJII(27.79f, 32.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(8.27f);
        this.LIZJ.LJII(36.0f, 12.0f);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.0f, 22.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bl(dij);
        dij.LJI(19.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.c1(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}

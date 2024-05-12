package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32967Cwl extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32967Cwl() {
        this.LIZJ.LJIIIIZZ(21.0f, 11.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-6.0f);
        p.LJIILL(6.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(9.0f);
        p2.LJIILL(6.0f);
        p2.LJIIJJI(6.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(6.0f);
        p3.LJI(9.0f);
        p3.LJIILL(6.0f);
        p3.LJIIJJI(6.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-6.0f);
        p4.LJIIJJI(6.0f);
        this.LIZJ.LJIIL(-1.0f, -6.0f);
        C32856Cuy.LJI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-6.0f);
        p5.LJIIJJI(6.0f);
        p5.LJIILL(-6.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.0f, 11.0f);
        C32856Cuy.ia(this.LIZJ);
        this.LIZJ.LJIIIIZZ(33.0f, 23.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-6.0f);
        p6.LJIIJJI(6.0f);
        p6.LJIILL(6.0f);
        C32856Cuy.W(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIIZZ(33.0f, 29.0f);
        C32856Cuy.LJJZ(this.LIZJ);
        C32856Cuy.LJI(this.LIZJ);
        this.LIZJ.LJIIL(-1.0f, 6.0f);
        C40084FoG.LJ(this.LIZJ, "p", 6.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIIZZ(33.0f, 29.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(6.0f);
        p10.LJIIJJI(6.0f);
        p10.LJIILL(-6.0f);
        p10.LJIIJJI(-6.0f);
        p10.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-1);
        this.LIZIZ.setAlpha(86);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(12.0f, 7.0f);
        C32856Cuy.Oa(dij);
        dij.LJIIJJI(24.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        dij.LJIJ(12.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        dij.LJI(12.0f);
        dij.LIZLLL();
        dij.LJIILIIL(24.0f, 4.0f);
        C32856Cuy.J4(dij);
        C32856Cuy.LJLLI(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.43f, 0.82f);
        dij.LJIIIZ(14.03f, 14.03f, false, true, 9.49f, -7.48f);
        dij.LJIIIZ(7.5f, 7.5f, true, true, 6.16f, 0.0f);
        dij.LJIIJ(4.18f, 0.94f, 7.64f, 3.74f, 9.49f, 7.48f);
        dij.LIZJ(1.0f, 1.0f, false, false, 37.0f, 36.0f);
        dij.LJIJ(12.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
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

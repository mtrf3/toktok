package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33008CxQ extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33008CxQ() {
        this.LIZJ.LJIIIIZZ(36.9f, 27.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.6f, 0.0f, 1.1f, 0.5f, 1.1f, 1.1f);
        this.LIZJ.LJIILL(18.72f);
        this.LIZJ.LJIIL(5.27f, -4.34f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.13f);
        this.LIZJ.LJIIL(0.64f, 0.78f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.14f, 1.4f);
        this.LIZJ.LJIIL(-8.04f, 6.63f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.28f, 0.0f);
        this.LIZJ.LJIIL(-8.04f, -6.63f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -0.14f, -1.4f);
        this.LIZJ.LJIIL(0.64f, -0.78f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.4f, -0.13f);
        this.LIZJ.LJII(35.0f, 46.82f);
        this.LIZJ.LJIJ(28.1f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, -0.6f, 0.5f, -1.1f, 1.1f, -1.1f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(0.8f);
        p4.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.5f, 13.0f);
        dij.LIZJ(4.5f, 4.5f, false, true, 9.0f, 8.5f);
        dij.LJIIJJI(22.25f);
        dij.LJIIIZ(4.5f, 4.5f, false, true, 4.18f, 2.85f);
        dij.LJIIL(2.09f, 5.28f);
        dij.LJI(64.0f);
        C32856Cuy.d9(dij);
        dij.LJIJ(59.0f);
        C32856Cuy.e9(dij);
        C32856Cuy.LLLLLZIL(dij);
        dij.LIZJ(4.5f, 4.5f, false, true, 4.5f, 59.0f);
        C32856Cuy.LLZLLLL(dij);
        dij.LJIIIIZZ(9.0f, 11.5f);
        C32856Cuy.Xj(dij);
        dij.LJIILL(46.0f);
        C32856Cuy.Ej(dij);
        dij.LJIIJJI(55.0f);
        C32856Cuy.Bl(dij);
        dij.LJIJ(21.12f);
        dij.LJIIJ(0.0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f);
        dij.LJI(35.48f);
        dij.LJIIL(-2.84f, -7.17f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, -1.4f, -0.95f);
        C32856Cuy.Y6(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}

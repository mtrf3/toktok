package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33031Cxn extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33031Cxn() {
        this.LIZJ.LJIIIIZZ(25.0f, 20.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(5.0f);
        p.LJIIJJI(5.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJIIJJI(-5.0f);
        p.LJIILL(5.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLIIII(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-5.0f);
        p2.LJIIJJI(-5.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p3.LJIIJJI(5.0f);
        p3.LJIILL(-5.0f);
        C32856Cuy.sk(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.01f, 7.24f);
        dij.LJ(18.64f, 4.18f, 21.13f, 2.0f, 24.0f, 2.0f);
        dij.LJIILJJIL(5.36f, 2.18f, 5.99f, 5.24f, true);
        dij.LJIIL(0.76f, 3.76f);
        C32856Cuy.M6(dij);
        dij.LJIIJ(2.2f, 0.0f, 4.02f, 1.9f, 4.21f, 4.36f);
        dij.LJIIL(1.78f, 23.47f);
        dij.LJIIJ(0.22f, 2.78f, -1.73f, 5.17f, -4.2f, 5.17f);
        dij.LJI(11.22f);
        dij.LJIIJ(-2.48f, 0.0f, -4.43f, -2.4f, -4.21f, -5.17f);
        dij.LJII(8.8f, 15.36f);
        dij.LJ(8.99f, 12.89f, 10.82f, 11.0f, 13.0f, 11.0f);
        dij.LJIIJJI(4.24f);
        dij.LJII(18.0f, 7.24f);
        dij.LIZLLL();
        dij.LJIIIIZZ(24.0f, 5.66f);
        dij.LJIIJ(-1.3f, 0.0f, -2.43f, 0.98f, -2.72f, 2.37f);
        dij.LJIIL(-0.6f, 2.97f);
        dij.LJIIJJI(6.64f);
        dij.LJIIL(-0.6f, -2.97f);
        dij.LIZJ(2.85f, 2.85f, false, false, 24.0f, 5.66f);
        dij.LIZLLL();
        dij.LJIILIIL(-10.99f, 9.0f);
        dij.LJIIJ(-0.5f, 0.0f, -0.93f, 0.44f, -0.97f, 1.01f);
        dij.LJIIL(-1.78f, 23.47f);
        dij.LJIIJ(-0.05f, 0.64f, 0.4f, 1.2f, 0.97f, 1.2f);
        dij.LJIIJJI(25.54f);
        dij.LJIIJ(0.57f, 0.0f, 1.02f, -0.56f, 0.97f, -1.2f);
        dij.LJIIL(-1.78f, -23.47f);
        dij.LJIIJ(-0.04f, -0.57f, -0.46f, -1.0f, -0.97f, -1.0f);
        C32856Cuy.LLLLIILLL(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}

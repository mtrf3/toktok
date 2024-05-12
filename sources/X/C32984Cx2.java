package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32984Cx2 extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C32984Cx2() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(37.5f, 0.0f);
        this.LIZJ.LJIIJ(-1.02f, 0.0f, -0.85f, 3.43f, -2.46f, 5.04f);
        this.LIZJ.LJ(33.43f, 6.64f, 30.0f, 6.48f, 30.0f, 7.5f);
        this.LIZJ.LJIILJJIL(3.43f, 0.85f, 5.04f, 2.46f, true);
        this.LIZJ.LJIIJ(1.6f, 1.61f, 1.44f, 5.04f, 2.46f, 5.04f);
        this.LIZJ.LJIILJJIL(0.85f, -3.43f, 2.46f, -5.04f, true);
        this.LIZJ.LJ(41.57f, 8.36f, 45.0f, 8.52f, 45.0f, 7.5f);
        this.LIZJ.LJIILJJIL(-3.43f, -0.85f, -5.04f, -2.46f, true);
        this.LIZJ.LJ(38.36f, 3.43f, 38.52f, 0.0f, 37.5f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(45.68f, 11.9f);
        dij.LIZJ(7.0f, 7.0f, false, true, 46.0f, 14.0f);
        dij.LJIILL(20.0f);
        dij.LJIIIZ(7.0f, 7.0f, false, true, -7.0f, 7.0f);
        C32856Cuy.LLLLLZIL(dij);
        dij.LJIIIZ(7.0f, 7.0f, false, true, -7.0f, -7.0f);
        C32856Cuy.l9(dij);
        C32856Cuy.Hf(dij);
        dij.LJIIJJI(17.03f);
        dij.LJIIJ(-0.42f, 4.02f, 3.25f, 4.6f, 6.15f, 5.8f);
        C32856Cuy.a0(dij);
        C32856Cuy.j1(dij);
        dij.LJIIJ(1.13f, 2.72f, 1.26f, 6.18f, 5.3f, 6.18f);
        dij.LJIIJ(3.75f, 0.0f, 4.18f, -3.5f, 5.3f, -6.18f);
        dij.LJIILL(-0.02f);
        dij.LJIIJJI(0.02f);
        dij.LJIIJ(0.92f, -0.39f, 1.92f, -0.55f, 2.86f, -0.9f);
        dij.LIZLLL();
        dij.LJIIIIZZ(30.5f, 24.87f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.74f);
        dij.LJII(20.0f, 17.07f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.5f, 0.87f);
        dij.LJIILL(12.12f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.5f, 0.87f);
        dij.LJIIL(10.5f, -6.06f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}

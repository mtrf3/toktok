package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32911Cvr extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32911Cvr() {
        C32856Cuy.wd(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.71f, 0.03f, 1.41f, 0.06f, 2.13f);
        this.LIZJ.LJIIJ(0.07f, 1.46f, 0.13f, 2.98f, -0.05f, 4.77f);
        this.LIZJ.LJIIIZ(9.4f, 9.4f, false, true, -1.6f, 4.08f);
        C32856Cuy.bm(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, -0.1f, -0.7f);
        this.LIZJ.LJIIJ(-0.5f, -0.4f, -1.0f, -0.8f, -1.49f, -1.24f);
        this.LIZJ.LJIIJ(-0.62f, -0.57f, -1.3f, -1.25f, -1.68f, -1.83f);
        C32856Cuy.rc(this.LIZJ);
        this.LIZJ.LJIIIZ(5.57f, 5.57f, false, false, 0.85f, -4.74f);
        this.LIZJ.LJIIJ(-0.4f, -1.44f, -1.3f, -2.78f, -2.25f, -4.02f);
        C32856Cuy.i8(this.LIZJ);
        this.LIZJ.LJIIIZ(9.4f, 9.4f, false, true, -1.6f, -4.07f);
        C32856Cuy.Q2(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Yd(dij);
        dij.LJIIIIZZ(41.7f, 22.3f);
        C32856Cuy.Dc(dij);
        dij.LJIIJJI(-5.58f);
        dij.LJIIL(2.19f, -2.18f);
        C32856Cuy.Kb(dij);
        C32856Cuy.A5(dij);
        dij.LJIIL(-4.25f, 4.24f);
        C32856Cuy.x5(dij);
        dij.LJIIL(4.24f, 4.25f);
        C32856Cuy.P9(dij);
        C32856Cuy.lm(dij);
        dij.LJIIL(-2.17f, -2.19f);
        dij.LJIIJJI(5.57f);
        dij.LIZLLL();
        dij.LJIIIIZZ(6.3f, 20.3f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        dij.LJIILL(1.0f);
        C32856Cuy.a5(dij);
        dij.LJIIJJI(5.57f);
        dij.LJII(9.7f, 24.5f);
        C32856Cuy.x5(dij);
        dij.LJIIL(0.71f, 0.7f);
        C32856Cuy.LLIIZ(dij);
        dij.LJIIL(4.25f, -4.23f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, -0.71f);
        dij.LJIIL(-4.24f, -4.24f);
        C32856Cuy.LLJJIJIIJIL(dij);
        dij.LJIIL(-0.7f, 0.7f);
        C32856Cuy.LLJJIII(dij);
        dij.LJIIL(2.17f, 2.18f);
        dij.LJI(6.3f);
        dij.LIZLLL();
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

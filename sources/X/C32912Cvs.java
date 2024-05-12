package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32912Cvs extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32912Cvs() {
        this.LIZJ.LJIIIIZZ(15.64f, 12.04f);
        this.LIZJ.LIZJ(18.3f, 18.3f, false, true, 31.0f, 3.5f);
        this.LIZJ.LJIIJJI(24.39f);
        this.LIZJ.LJ(60.0f, 3.5f, 64.07f, 6.0f, 66.92f, 9.83f);
        this.LIZJ.LJIIJ(2.86f, 3.83f, 4.58f, 9.04f, 4.58f, 14.74f);
        this.LIZJ.LJIJ(50.0f);
        C32856Cuy.Mj(this.LIZJ);
        this.LIZJ.LJI(49.5f);
        C32856Cuy.LJLJJLL(this.LIZJ);
        this.LIZJ.LJI(58.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        C32856Cuy.E6(this.LIZJ);
        C32856Cuy.Nl(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(9.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-17.0f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        C32856Cuy.Nl(this.LIZJ);
        C32856Cuy.n0(this.LIZJ);
        this.LIZJ.LJIJ(36.4f);
        C32856Cuy.Ml(this.LIZJ);
        this.LIZJ.LJIILL(12.1f);
        C32856Cuy.LJJIIJ(this.LIZJ);
        this.LIZJ.LJIJ(22.8f);
        this.LIZJ.LJIIJ(0.0f, -9.07f, -7.0f, -16.3f, -15.5f, -16.3f);
        this.LIZJ.LJIIIZ(15.3f, 15.3f, false, false, -12.84f, 7.16f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, true, true, -2.52f, -1.62f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.5f, 68.5f);
        C32856Cuy.E0(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-17.0f);
        C32856Cuy.LJII(this.LIZJ);
        C32856Cuy.LJLJJLL(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.0f, -45.7f);
        this.LIZJ.LJIILL(25.7f);
        C32856Cuy.LJIJ(this.LIZJ);
        this.LIZJ.LJIJ(24.57f);
        this.LIZJ.LJIIJ(0.0f, -5.12f, -1.55f, -9.68f, -3.98f, -12.94f);
        this.LIZJ.LJIIJ(-2.43f, -3.26f, -5.68f, -5.13f, -9.13f, -5.13f);
        this.LIZJ.LJI(40.92f);
        this.LIZJ.LJIIIZ(19.5f, 19.5f, false, true, 8.58f, 16.3f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(0.56f, 17.57f);
        dij.LJIIJ(0.21f, -0.63f, 0.8f, -1.06f, 1.47f, -1.06f);
        C32856Cuy.R6(dij);
        dij.LJIIIZ(1.54f, 1.54f, false, true, 1.18f, 2.54f);
        dij.LJIIL(-18.99f, 22.5f);
        dij.LJIIIZ(1.54f, 1.54f, false, true, -2.58f, -0.35f);
        dij.LJII(14.01f, 29.0f);
        dij.LJII(1.1f, 19.28f);
        dij.LJIIJ(-0.53f, -0.4f, -0.75f, -1.1f, -0.54f, -1.72f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.41f, 29.0f);
        dij.LJIIL(4.0f, 8.7f);
        dij.LJII(36.67f, 19.6f);
        dij.LJI(6.65f);
        dij.LJIIL(9.02f, 6.79f);
        dij.LJIIL(11.15f, -4.48f);
        dij.LJIIIZ(1.54f, 1.54f, false, true, 1.15f, 2.86f);
        dij.LJII(17.4f, 29.01f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}

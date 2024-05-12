package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32935CwF extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32935CwF() {
        this.LIZJ.LJIIIIZZ(49.2f, 29.0f);
        C32856Cuy.g2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(53.7f, 23.5f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, true, 5.0f, 0.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -5.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.5f, 21.5f);
        C32856Cuy.R1(this.LIZJ);
        C32856Cuy.z9(this.LIZJ);
        C32856Cuy.D6(this.LIZJ);
        C32856Cuy.n8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-5.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(5.5f);
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-2.0f);
        p3.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        C32856Cuy.D9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(13.0f);
        p4.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-2.0f);
        p5.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        C32856Cuy.n0(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", -5.5f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.55f, 5.0f);
        dij.LIZJ(15.97f, 15.97f, false, false, 1.5f, 20.9f);
        dij.LJIJ(56.0f);
        dij.LJIIJ(0.0f, 6.4f, 5.24f, 11.61f, 11.72f, 11.61f);
        dij.LJIIJ(4.49f, 0.0f, 8.58f, -2.54f, 10.54f, -6.54f);
        dij.LJIIL(4.8f, -9.81f);
        dij.LJ(29.0f, 50.35f, 29.92f, 50.0f, 30.9f, 50.0f);
        dij.LJIIJJI(9.84f);
        dij.LJIIJ(1.0f, 0.0f, 1.9f, 0.36f, 2.33f, 1.25f);
        dij.LJIIL(4.8f, 9.8f);
        dij.LJIIJ(1.97f, 4.0f, 6.06f, 6.55f, 10.55f, 6.55f);
        dij.LJIIJ(6.48f, 0.0f, 12.08f, -5.2f, 12.08f, -11.61f);
        dij.LJIJ(20.9f);
        dij.LJ(70.5f, 12.12f, 62.96f, 5.0f, 54.1f, 5.0f);
        dij.LJI(17.54f);
        dij.LIZLLL();
        dij.LJIIIIZZ(4.5f, 20.9f);
        dij.LJ(4.5f, 14.0f, 10.7f, 8.0f, 17.55f, 8.0f);
        dij.LJIIJJI(36.54f);
        dij.LJIIJ(7.28f, 0.0f, 13.41f, 5.68f, 13.41f, 12.9f);
        dij.LJIJ(56.0f);
        dij.LJIIJ(0.0f, 4.86f, -4.1f, 8.7f, -9.0f, 8.7f);
        dij.LJIIIZ(8.92f, 8.92f, false, true, -8.05f, -4.86f);
        dij.LJII(45.65f, 50.0f);
        dij.LJIIIZ(5.45f, 5.45f, false, false, -4.91f, -3.04f);
        dij.LJI(30.9f);
        dij.LJIIIZ(5.45f, 5.45f, false, false, -4.9f, 3.04f);
        dij.LJIIL(-4.81f, 9.82f);
        dij.LJIIJ(-1.48f, 3.03f, -4.58f, 4.67f, -7.97f, 4.67f);
        dij.LJIIJ(-4.9f, 0.0f, -8.72f, -3.65f, -8.72f, -8.51f);
        dij.LJIJ(20.9f);
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

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33060CyG extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33060CyG() {
        this.LIZJ.LJIIIIZZ(51.65f, 42.05f);
        C32856Cuy.k3(this.LIZJ);
        this.LIZJ.LJIILL(-8.93f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, true, true, 3.0f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(8.93f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        p3.LIZLLL();
        this.LIZJ.LJIIIIZZ(50.07f, 46.69f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-0.56f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, true, false, -3.0f, 0.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(0.56f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.22f, 53.19f);
        dij.LJIILL(14.77f);
        dij.LJI(4.02f);
        dij.LJIJ(4.04f);
        dij.LJIIJJI(35.2f);
        dij.LJIILL(26.08f);
        dij.LJIIIZ(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        dij.LJIJ(2.54f);
        dij.LJIIJ(0.0f, -0.84f, -0.67f, -1.51f, -1.5f, -1.51f);
        dij.LJI(2.52f);
        dij.LJIIJ(-0.82f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        dij.LJIILL(66.93f);
        dij.LJIIJ(0.0f, 0.84f, 0.68f, 1.51f, 1.5f, 1.51f);
        dij.LJIIJJI(38.2f);
        C32856Cuy.Bl(dij);
        dij.LJIJ(53.18f);
        dij.LJIIJJI(27.25f);
        dij.LJIIIZ(1.51f, 1.51f, false, false, 1.3f, -2.26f);
        dij.LJII(52.9f, 19.85f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, -2.6f, 0.0f);
        dij.LJII(32.45f, 50.93f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 1.3f, 2.26f);
        dij.LJIIJJI(5.47f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.87f, -3.02f);
        dij.LJIIL(15.27f, -26.55f);
        dij.LJIIL(15.25f, 26.55f);
        dij.LJI(36.35f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(34.28f, 16.26f);
        dij2.LJI(8.96f);
        C32856Cuy.k3(dij2);
        dij2.LJIIJ(0.0f, -0.84f, 0.67f, -1.51f, 1.5f, -1.51f);
        C32856Cuy.f9(dij2);
        dij2.LJIIIIZZ(34.28f, 25.82f);
        dij2.LJI(8.96f);
        dij2.LJIIIZ(1.5f, 1.5f, false, true, -1.5f, -1.51f);
        dij2.LJIIJ(0.0f, -0.84f, 0.67f, -1.5f, 1.5f, -1.5f);
        C32856Cuy.f9(dij2);
        dij2.LJIIIIZZ(31.51f, 60.5f);
        dij2.LJIIJJI(2.77f);
        dij2.LJIIIZ(1.5f, 1.5f, false, false, 0.0f, -3.0f);
        dij2.LJIIJJI(-2.77f);
        dij2.LJIIIZ(1.5f, 1.5f, false, false, 0.0f, 3.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}

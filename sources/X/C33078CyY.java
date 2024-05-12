package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33078CyY extends AbstractC39455Fe7 {
    public C33078CyY() {
        this.LIZJ.LJIIIIZZ(17.5f, 32.0f);
        this.LIZJ.LJII(6.33f, 39.73f);
        this.LIZJ.LJIIJ(-1.0f, 0.69f, -2.33f, -0.06f, -2.33f, -1.3f);
        this.LIZJ.LJIJ(10.16f);
        this.LIZJ.LJ(4.0f, 7.86f, 5.8f, 6.0f, 8.0f, 6.0f);
        C32856Cuy.LJJI(this.LIZJ);
        this.LIZJ.LJIIJ(2.2f, 0.0f, 4.0f, 1.86f, 4.0f, 4.16f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(8.74f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(3.5f);
        this.LIZJ.LJIIJ(2.2f, 0.0f, 4.0f, 1.78f, 4.0f, 3.97f);
        this.LIZJ.LJIILL(18.64f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -2.07f, 1.38f);
        this.LIZJ.LJIIL(-7.34f, -4.01f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(22.5f);
        this.LIZJ.LJIIJ(-2.2f, 0.0f, -4.0f, -1.78f, -4.0f, -3.97f);
        C32856Cuy.F9(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -1.0f);
        this.LIZJ.LJIIIIZZ(33.0f, 27.83f);
        C32856Cuy.Dn(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(11.16f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p5.LJI(9.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LJIILL(21.47f);
        this.LIZJ.LJIIJ(0.0f, 0.4f, 0.45f, 0.64f, 0.78f, 0.4f);
        this.LIZJ.LJIIL(7.25f, -5.02f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.57f, -0.18f);
        DIL.LIZ(this.LIZJ, "p", 33.0f);
        this.LIZJ.LJIILIIL(1.0f, 4.15f);
        this.LIZJ.LJII(22.5f, 32.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(1.9f);
        C32856Cuy.En(this.LIZJ);
        this.LIZJ.LJIIJJI(13.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.52f, 0.16f);
        this.LIZJ.LJIIL(4.07f, 2.55f);
        this.LIZJ.LJIIIZ(0.2f, 0.2f, false, false, 0.31f, -0.17f);
        this.LIZJ.LJIJ(23.87f);
        C32856Cuy.Bn(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
        this.LIZJ.LJIILL(4.96f);
        this.LIZJ.LJIIJ(0.0f, 2.3f, -1.8f, 4.16f, -4.0f, 4.16f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}

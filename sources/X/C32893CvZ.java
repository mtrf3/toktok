package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32893CvZ extends AbstractC39455Fe7 {
    public C32893CvZ() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(14.0f, 7.0f);
        C32856Cuy.Cn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(11.48f);
        this.LIZJ.LJIIJ(0.0f, 0.23f, -0.16f, 0.42f, -0.38f, 0.49f);
        this.LIZJ.LJIIJ(-1.0f, 0.28f, -1.94f, 0.68f, -2.82f, 1.2f);
        this.LIZJ.LJIIJ(-0.35f, 0.2f, -0.8f, -0.05f, -0.8f, -0.45f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(8.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        C32856Cuy.LJIILL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.35f, 0.52f);
        this.LIZJ.LJIIL(12.0f, 11.0f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 43.0f, 16.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(24.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        this.LIZJ.LJI(19.4f);
        this.LIZJ.LJIIJ(-0.45f, 0.0f, -0.7f, -0.6f, -0.43f, -0.97f);
        this.LIZJ.LJIIJ(0.52f, -0.75f, 0.88f, -1.62f, 1.02f, -2.57f);
        this.LIZJ.LJIIIZ(0.53f, 0.53f, false, true, 0.52f, -0.46f);
        C32856Cuy.P6(this.LIZJ);
        C32856Cuy.Dn(this.LIZJ);
        C32856Cuy.p9(this.LIZJ);
        C32856Cuy.F6(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        p5.LJIJ(7.0f);
        C32856Cuy.LLLLIL(this.LIZJ);
        this.LIZJ.LJIILIIL(17.0f, 2.52f);
        C32856Cuy.l9(this.LIZJ);
        this.LIZJ.LJIIJJI(4.83f);
        this.LIZJ.LJII(31.0f, 9.52f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 25.0f);
        this.LIZJ.LJIIJ(3.73f, 0.0f, 6.9f, 2.62f, 7.78f, 6.22f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(8.22f);
        this.LIZJ.LIZJ(8.06f, 8.06f, false, true, 16.0f, 25.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.K0(this.LIZJ);
        this.LIZJ.LIZJ(12.1f, 12.1f, false, false, 4.0f, 32.54f);
        this.LIZJ.LJIIIZ(2.54f, 2.54f, false, false, 2.54f, 2.68f);
        this.LIZJ.LJIIJJI(7.52f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(0.27f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(4.87f);
        this.LIZJ.LJIIJ(0.0f, 0.82f, -0.64f, 1.41f, -1.34f, 1.41f);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.06f, -0.36f, -1.26f, -0.91f);
        this.LIZJ.LJIIJ(-0.09f, -0.27f, -0.3f, -0.5f, -0.58f, -0.5f);
        C32856Cuy.LJ(this.LIZJ);
        this.LIZJ.LJIIJ(-0.28f, 0.0f, -0.5f, 0.23f, -0.48f, 0.5f);
        this.LIZJ.LIZJ(5.36f, 5.36f, false, false, 13.22f, 46.0f);
        this.LIZJ.LJIIIZ(5.37f, 5.37f, false, false, 5.34f, -5.4f);
        this.LIZJ.LJIILL(-4.88f);
        C32856Cuy.J1(this.LIZJ);
        this.LIZJ.LJIIJJI(6.4f);
        this.LIZJ.LIZJ(2.54f, 2.54f, false, false, 28.0f, 32.54f);
        this.LIZJ.LIZJ(12.1f, 12.1f, false, false, 16.0f, 21.0f);
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

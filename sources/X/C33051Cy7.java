package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cy7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33051Cy7 extends AbstractC39455Fe7 {
    public C33051Cy7() {
        this.LIZJ.LJIIIIZZ(44.02f, 40.85f);
        C32856Cuy.Dk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.4f, -1.42f);
        C32856Cuy.Hk(this.LIZJ);
        this.LIZJ.LJIIL(-6.7f, -6.71f);
        this.LIZJ.LJIIIZ(16.95f, 16.95f, false, false, 1.84f, -6.86f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.02f, -0.45f, 0.02f, -0.96f, 0.02f, -1.82f);
        C32856Cuy.Gi(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(4.56f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, 0.95f, 0.0f, 1.35f, -0.02f, 1.68f);
        p4.LJIIIZ(12.98f, 12.98f, false, true, -0.87f, 4.04f);
        this.LIZJ.LJIIL(-4.36f, -4.36f);
        this.LIZJ.LJIIJ(0.03f, -0.3f, 0.05f, -0.61f, 0.05f, -0.92f);
        C32856Cuy.i9(this.LIZJ);
        this.LIZJ.LJIIIZ(8.8f, 8.8f, false, false, -16.75f, -3.78f);
        this.LIZJ.LJIIL(-5.79f, -5.79f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(7.44f, 2.85f);
        C32856Cuy.Jk(this.LIZJ);
        this.LIZJ.LJIIL(36.58f, 36.59f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-11.9f, -6.41f);
        this.LIZJ.LJIIL(2.87f, 2.87f);
        this.LIZJ.LIZJ(16.94f, 16.94f, false, true, 26.0f, 40.53f);
        C32856Cuy.Lm(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-4.47f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LIZJ(17.0f, 17.0f, false, true, 6.02f, 24.45f);
        p6.LJ(6.0f, 24.0f, 6.0f, 23.49f, 6.0f, 22.63f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIJ(18.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p7.LJIIJJI(2.0f);
        C32856Cuy.An(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(4.56f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJ(0.0f, 0.95f, 0.0f, 1.35f, 0.02f, 1.68f);
        p10.LJIIIZ(13.0f, 13.0f, false, false, 12.3f, 12.3f);
        p10.LJIIJ(0.33f, 0.02f, 0.73f, 0.02f, 1.68f, 0.02f);
        p10.LJIILJJIL(1.35f, 0.0f, 1.68f, -0.02f, true);
        this.LIZJ.LJIIJ(2.37f, -0.12f, 4.57f, -0.88f, 6.43f, -2.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-3.79f, -3.78f);
        this.LIZJ.LJII(15.2f, 17.52f);
        C32856Cuy.v9(this.LIZJ);
        this.LIZJ.LJIIIZ(8.8f, 8.8f, false, false, 13.13f, 7.66f);
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

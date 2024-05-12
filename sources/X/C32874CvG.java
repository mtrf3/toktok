package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32874CvG extends AbstractC39455Fe7 {
    public C32874CvG() {
        C32856Cuy.l5(this.LIZJ);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.Bo(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(-4.0f, 8.0f);
        C32856Cuy.oj(this.LIZJ);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.pj(this.LIZJ);
        C32856Cuy.LJLLI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        p2.LJI(12.0f);
        p2.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIILIIL(9.12f, 19.24f);
        this.LIZJ.LJIIJ(2.4f, 0.0f, 4.3f, -0.98f, 5.66f, -2.5f);
        this.LIZJ.LJIILL(-4.62f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.36f);
        C32856Cuy.z5(this.LIZJ);
        this.LIZJ.LJIILL(1.48f);
        C32856Cuy.Z4(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(3.02f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(1.6f);
        this.LIZJ.LJIIIZ(4.44f, 4.44f, false, true, -2.82f, 1.02f);
        this.LIZJ.LJIIJ(-2.44f, 0.0f, -4.2f, -1.86f, -4.2f, -4.38f);
        this.LIZJ.LJIIJ(0.0f, -2.52f, 1.76f, -4.38f, 4.2f, -4.38f);
        this.LIZJ.LJIIJ(1.21f, 0.0f, 2.23f, 0.6f, 2.88f, 1.37f);
        this.LIZJ.LJIIJ(0.17f, 0.2f, 0.46f, 0.27f, 0.68f, 0.15f);
        this.LIZJ.LJIIL(1.47f, -0.8f);
        this.LIZJ.LJIIIZ(0.47f, 0.47f, false, false, 0.17f, -0.7f);
        this.LIZJ.LJIIIZ(6.2f, 6.2f, false, false, -5.2f, -2.54f);
        this.LIZJ.LJIIJ(-3.92f, 0.0f, -7.12f, 2.68f, -7.12f, 6.9f);
        this.LIZJ.LJIIJ(0.0f, 4.2f, 3.2f, 6.9f, 7.12f, 6.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.85f, -0.24f);
        C32856Cuy.LLJJI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(18.16f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        this.LIZJ.LJIIJJI(-1.84f);
        C32856Cuy.z5(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(30.5f);
        C32856Cuy.a5(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(1.84f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.6f, -0.5f);
        C32856Cuy.C5(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(-1.85f);
        C32856Cuy.LLJJJ(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIJ(18.16f);
        C32856Cuy.K1(this.LIZJ);
        this.LIZJ.LJIIJJI(8.44f);
        C32856Cuy.Hi(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-6.1f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIILL(2.8f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJJI(5.96f);
        C32856Cuy.Hi(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.96f);
        this.LIZJ.LJIILL(5.04f);
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

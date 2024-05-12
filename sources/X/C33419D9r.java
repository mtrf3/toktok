package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33419D9r extends AbstractC39455Fe7 {
    public C33419D9r() {
        C32856Cuy.S5(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.8f, 30.02f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.7f, 0.7f, false, true, -0.69f, -0.69f);
        this.LIZJ.LJIILL(-8.25f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(13.7f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.7f, 0.7f, false, true, -0.69f, -0.69f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.72f);
        this.LIZJ.LJIIJ(0.0f, -0.38f, 0.3f, -0.7f, 0.7f, -0.7f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(7.07f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.38f, 0.0f, 0.7f, 0.32f, 0.7f, 0.7f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(0.72f);
        this.LIZJ.LJIIJ(0.0f, 0.39f, -0.32f, 0.7f, -0.7f, 0.7f);
        this.LIZJ.LJIIJJI(-2.41f);
        this.LIZJ.LJIILL(8.24f);
        this.LIZJ.LJIIJ(0.0f, 0.38f, -0.31f, 0.7f, -0.7f, 0.7f);
        C40084FoG.LJ(this.LIZJ, "p", -0.87f);
        this.LIZJ.LJIILIIL(16.64f, 0.0f);
        this.LIZJ.LJIIJ(-0.38f, 0.0f, -0.69f, -0.3f, -0.69f, -0.69f);
        this.LIZJ.LJIILL(-6.46f);
        this.LIZJ.LJIIL(-2.57f, 6.71f);
        this.LIZJ.LJIIIZ(0.69f, 0.69f, false, true, -0.65f, 0.44f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(-0.13f);
        this.LIZJ.LJIIIZ(0.69f, 0.69f, false, true, -0.64f, -0.44f);
        this.LIZJ.LJIIL(-2.6f, -6.72f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(6.47f);
        this.LIZJ.LJIIJ(0.0f, 0.38f, -0.3f, 0.7f, -0.69f, 0.7f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-0.87f);
        this.LIZJ.LJIIJ(-0.38f, 0.0f, -0.7f, -0.32f, -0.7f, -0.7f);
        this.LIZJ.LJIILL(-9.66f);
        this.LIZJ.LJIIJ(0.0f, -0.38f, 0.32f, -0.7f, 0.7f, -0.7f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJJI(1.75f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.65f, 0.45f);
        this.LIZJ.LJIIL(2.47f, 6.4f);
        this.LIZJ.LJIIL(2.45f, -6.4f);
        this.LIZJ.LJIIJ(0.1f, -0.27f, 0.36f, -0.44f, 0.64f, -0.44f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJJI(1.76f);
        this.LIZJ.LJIIJ(0.38f, 0.0f, 0.69f, 0.3f, 0.69f, 0.69f);
        this.LIZJ.LJIILL(9.66f);
        this.LIZJ.LJIIJ(0.0f, 0.38f, -0.3f, 0.7f, -0.7f, 0.7f);
        C40084FoG.LJ(this.LIZJ, "p", -0.87f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
